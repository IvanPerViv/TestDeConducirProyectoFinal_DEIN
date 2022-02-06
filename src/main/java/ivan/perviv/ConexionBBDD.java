package ivan.perviv;

import java.io.File;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Iván Pérez
 */
public class ConexionBBDD {

    protected String queryPreguntas = "SELECT * FROM respuestas";
    protected File archivoPreguntas;

    public ConexionBBDD(File archivoPreguntas) {
        this.archivoPreguntas = archivoPreguntas;
    }

    public ArrayList<Pregunta> ConexionBBDD() {
        ArrayList<Pregunta> preguntas = new ArrayList();
        ArrayList<Respuesta> respuestas = new ArrayList();

        try (var con = DriverManager.getConnection("jdbc:sqlite:" + archivoPreguntas.getAbsolutePath())) {
            System.out.println("Conexión con exito");
            try (PreparedStatement psPreguntas = con.prepareStatement(queryPreguntas);
                    ResultSet rs = psPreguntas.executeQuery()) {

                while (rs.next()) {
                    preguntas.add(new Pregunta(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
                }
                for (Pregunta pregunta : preguntas) {
                    if (rs.next()) {
                        respuestas.add(new Respuesta(rs.getString(3), false));
                        respuestas.add(new Respuesta(rs.getString(4), false));
                        respuestas.add(new Respuesta(rs.getString(5), false));
                        respuestas.add(new Respuesta(rs.getString(6), true));
                    }
                }
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preguntas;
    }
}
