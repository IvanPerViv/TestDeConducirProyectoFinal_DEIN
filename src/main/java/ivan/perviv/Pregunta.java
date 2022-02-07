package ivan.perviv;

import java.io.Serializable;

/**
 *
 * @author Iván Pérez
 */
public class Pregunta implements Serializable {

    protected int id;
    protected String pregunta;
    protected Respuesta respuestaUno, respuestaDos, respuestaTres, respuestaCuatro, respuestaCorrecta;

    public Pregunta(int id, String pregunta, Respuesta respuestaUno, Respuesta respuestaDos, Respuesta respuestaTres, Respuesta respuestaCuatro, Respuesta respuestaCorrecta) {
        this.id = id;
        this.pregunta = pregunta;
        this.respuestaUno = respuestaUno;
        this.respuestaDos = respuestaDos;
        this.respuestaTres = respuestaTres;
        this.respuestaCuatro = respuestaCuatro;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getId() {
        return id;
    }

    public String getPregunta() {
        return pregunta;
    }

    public Respuesta getRespuestaUno() {
        return respuestaUno;
    }

    public Respuesta getRespuestaDos() {
        return respuestaDos;
    }

    public Respuesta getRespuestaTres() {
        return respuestaTres;
    }

    public Respuesta getRespuestaCuatro() {
        return respuestaCuatro;
    }

    public Respuesta getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setRespuestaUno(Respuesta respuestaUno) {
        this.respuestaUno = respuestaUno;
    }

    public void setRespuestaDos(Respuesta respuestaDos) {
        this.respuestaDos = respuestaDos;
    }

    public void setRespuestaTres(Respuesta respuestaTres) {
        this.respuestaTres = respuestaTres;
    }

    public void setRespuestaCuatro(Respuesta respuestaCuatro) {
        this.respuestaCuatro = respuestaCuatro;
    }

    public void setRespuestaCorrecta(Respuesta respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    
    
    
}
