package ivan.perviv;

import java.io.File;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Iván Pérez
 */
public class ConexionBBDD {

    protected String queryP = "SELECT * FROM preguntas";
    protected String queryR = "SELECT respuesta_uno,respuesta_dos,respuesta_tres,respuesta_correcta FROM respuesta inner join preguntas on id_respuestas = ";
    protected File archivoPreguntas;

    public ConexionBBDD(File archivoPreguntas) {
        this.archivoPreguntas = archivoPreguntas;
    }

    public ArrayList<Pregunta> ConexionBBDD() {
        ArrayList<Pregunta> preguntas = new ArrayList();
        
        try ( var con = DriverManager.getConnection("jdbc:sqlite:" + archivoPreguntas.getAbsolutePath())) {
            System.out.println("¡Conexión con exito!");
            try ( var psPreguntas = con.createStatement()) {

                // 1º CONSULTA PARA OBTENER LA PREGUNTA //
                ResultSet rs = psPreguntas.executeQuery(queryP);
                while (rs.next()) {
                    preguntas.add(new Pregunta(rs.getInt(1), rs.getString(2), rs.getString(3),null, null, null, null, null));
                }
                for (Pregunta pr : preguntas) {
                    ArrayList<Respuesta> respuestas = new ArrayList();

                    // 2º CONSULTA PARA OBTENER LAS RESPUESTAS //
                    rs = psPreguntas.executeQuery(queryR + pr.getId());
                    if (rs.next()) {
                        respuestas.add(new Respuesta(rs.getString(1), false));
                        respuestas.add(new Respuesta(rs.getString(2), false));
                        respuestas.add(new Respuesta(rs.getString(3), false));
                        respuestas.add(new Respuesta(rs.getString(4), true));
                    }
                    // LLAMADA AL METODO RANDOM -> Cambia el orden de las preguntas. //
                    randomizadorDeRespuestas(respuestas);

                    pr.setRespuestaUno(respuestas.get(0));
                    pr.setRespuestaDos(respuestas.get(1));
                    pr.setRespuestaTres(respuestas.get(2));
                    pr.setRespuestaCuatro(respuestas.get(3));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (SQLException ex) {
            System.err.println("Error al establecer la conexión: " + ex.toString());
        }
        return preguntas;
    }

    public void randomizadorDeRespuestas(ArrayList<Respuesta> lista) {
        Collections.shuffle(lista);
    }
}
