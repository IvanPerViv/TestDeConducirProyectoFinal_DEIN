package ivan.perviv;

import java.io.Serializable;

/**
 *
 * @author Iván Pérez
 */
public class Pregunta {

    protected String pregunta, respuestaUno, respuestaDos, respuestaTres, respuestaCuatro, respuestaCorrecta;

    protected int id;

    public Pregunta(int id, String pregunta, String respuestaUno, String respuestaDos, String respuestaTres, String respuestaCuatro) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuestaUno = respuestaUno;
        this.respuestaDos = respuestaDos;
        this.respuestaTres = respuestaTres;
        this.respuestaCuatro = respuestaCuatro;
    }

    //<editor-fold defaultstate="collapsed" desc="METODOS Getters">
    public int getId() {
        return id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public String getRespuestaUno() {
        return respuestaUno;
    }

    public String getRespuestaDos() {
        return respuestaDos;
    }

    public String getRespuestaTres() {
        return respuestaTres;
    }

    public String getRespuestaCuatro() {
        return respuestaCuatro;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="METODOS Setters">
    public void setId(int id) {
        this.id = id;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestaUno(String respuestaUno) {
        this.respuestaUno = respuestaUno;
    }

    public void setRespuestaDos(String respuestaDos) {
        this.respuestaDos = respuestaDos;
    }

    public void setRespuestaTres(String respuestaTres) {
        this.respuestaTres = respuestaTres;
    }

    public void setRespuestaCuatro(String respuestaCuatro) {
        this.respuestaCuatro = respuestaCuatro;
    }
    //</editor-fold>
}
