package ivan.perviv;

import java.io.Serializable;

/**
 *
 * @author Iván Pérez
 */
public class Respuesta implements Serializable{

    private boolean preguntaVerdadera;
    String textoRespuesta;

    Respuesta() {

    }

    public Respuesta(String textoRespuesta, boolean verdadero) {
        this.preguntaVerdadera = verdadero;
        this.textoRespuesta = textoRespuesta;
    }

    //<editor-fold defaultstate="collapsed" desc="METODOS Getters">
    public boolean isVerdadero() {
        return preguntaVerdadera;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="METODOS Setters">

    public void setVerdadero(boolean verdadero) {
        this.preguntaVerdadera = verdadero;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }
    //</editor-fold>

}
