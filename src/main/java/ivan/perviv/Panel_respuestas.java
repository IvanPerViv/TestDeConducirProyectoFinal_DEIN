package ivan.perviv;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

/**
 * @author Iván Pérez
 */
public class Panel_respuestas extends JFrame {

    protected Image imagenIconito;
    protected File archivoPreguntas;
    protected ConexionBBDD objetoConexion;

    protected ArrayList<Pregunta> listaDePreguntas;
    protected int contadorPregunta = 0;
    protected Respuesta[] respuestaGuardada;
    Pregunta numeroPregunta;

    public Panel_respuestas(Image imagenIconito, File archivoPreguntas) {
        this.imagenIconito = imagenIconito;
        this.archivoPreguntas = archivoPreguntas;

        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        objetoConexion = new ConexionBBDD(archivoPreguntas);

        // DEVUELVE LAS PREGUNTAS - las guardamos en un lista //
        listaDePreguntas = objetoConexion.ConexionBBDD();
        respuestaGuardada = new Respuesta[listaDePreguntas.size()];

        // RANDOMIZAR LAS PREGUNTAS //
        randomizadorDeRespuestas(listaDePreguntas);
        escrituraPreguntasRespuestas();
        
    }

    /**
     * Metodo que randomiza una Lista
     *
     * @param lista
     */
    public void randomizadorDeRespuestas(ArrayList<Pregunta> lista) {
        Collections.shuffle(lista);
    }

    /**
     * Metodo que escribe las preguntas y respuestas en pantalla, ya
     * randomizadas,
     */
    public void escrituraPreguntasRespuestas() {
        Pregunta objPregunta = listaDePreguntas.get(contadorPregunta);
        numPregunta.setText(String.valueOf(contadorPregunta + 1));
        preguntaTest.setText(objPregunta.getPregunta());

        respUno.setText(objPregunta.getRespuestaUno().getTextoRespuesta());
        respDos.setText(objPregunta.getRespuestaDos().getTextoRespuesta());
        respTres.setText(objPregunta.getRespuestaTres().getTextoRespuesta());
        respCuatro.setText(objPregunta.getRespuestaCuatro().getTextoRespuesta());

        if (respuestaGuardada[contadorPregunta] != null) {
            Respuesta respuesta = respuestaGuardada[contadorPregunta];
            String valor = respuesta.getTextoRespuesta();

            if (respUno.getText().equals(valor)) {
                respUno.setSelected(true);
            } else if (respDos.getText().equals(valor)) {
                respDos.setSelected(true);
            } else if (respTres.getText().equals(valor)) {
                respTres.setSelected(true);
            } else if (respTres.getText().equals(valor)) {
                respTres.setSelected(true);
            }
        }

        if (contadorPregunta + 1 != listaDePreguntas.size()) {
            botonSiguiente.setText("SIGUIENTE");
        } else {
            botonSiguiente.setText("FINALIZAR");
        }
        
        //Actualizamos el numero de preguntas y que se vaya guardando.
        numeroPregunta = listaDePreguntas.get(contadorPregunta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRespuestas = new javax.swing.ButtonGroup();
        titulo = new javax.swing.JLabel();
        numPregunta = new javax.swing.JLabel();
        preguntaTest = new javax.swing.JLabel();
        respUno = new javax.swing.JRadioButton();
        respDos = new javax.swing.JRadioButton();
        respTres = new javax.swing.JRadioButton();
        respCuatro = new javax.swing.JRadioButton();
        botonAtras = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenIconito);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 490));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("PREGUNTAS");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, 50));

        numPregunta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        numPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numPregunta.setText("1");
        numPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(numPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 80));

        preguntaTest.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        preguntaTest.setText("PREGUNTA DEL TEST DE CONDUCIR");
        getContentPane().add(preguntaTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 380, 80));

        buttonGroupRespuestas.add(respUno);
        respUno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respUno.setText("Respuesta 1");
        respUno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respUnoStateChanged(evt);
            }
        });
        getContentPane().add(respUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 390, -1));
        buttonGroupRespuestas.add(respUno);

        buttonGroupRespuestas.add(respDos);
        respDos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respDos.setText("Respuesta 2");
        respDos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respDosStateChanged(evt);
            }
        });
        getContentPane().add(respDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 390, -1));
        buttonGroupRespuestas.add(respDos);

        buttonGroupRespuestas.add(respTres);
        respTres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respTres.setText("Respuesta 3");
        respTres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respTresStateChanged(evt);
            }
        });
        getContentPane().add(respTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 390, -1));
        buttonGroupRespuestas.add(respTres);

        buttonGroupRespuestas.add(respCuatro);
        respCuatro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respCuatro.setText("Respuesta 4");
        respCuatro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respCuatroStateChanged(evt);
            }
        });
        getContentPane().add(respCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 390, -1));
        buttonGroupRespuestas.add(respCuatro);

        botonAtras.setText("ATRAS");
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 130, 50));

        botonSiguiente.setText("SIGUIENTE");
        botonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 140, 50));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 22, 80));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 500, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        // BOTON SIGUIENTE //
        int numeroDeAciertos = 0;
        if (botonSiguiente.getText().equals("FINALIZAR")) {
            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres finalizar el examen?", "Advertencia", JOptionPane.YES_OPTION);
            if (resultado == 0) {
                for (Respuesta respuesta : respuestaGuardada) {
                    if (respuesta != null) {
                        if (respuesta.isVerdadero()) {
                            numeroDeAciertos++;
                        }
                    }
                }
                new Panel_resultados(numeroDeAciertos, listaDePreguntas.size()).setVisible(true);
                dispose();
            }
        } else {
            contadorPregunta++;
            escrituraPreguntasRespuestas();
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        // BOTON ANTERIOR //
        if (contadorPregunta > 0) {
            contadorPregunta--;
            escrituraPreguntasRespuestas();
        }
    }//GEN-LAST:event_botonAtrasActionPerformed
    
    /**
     * METODOS en el cual guardamos en el array la respuesta de cada una de las preguntas.
     * @param evt 
     */
    //<editor-fold defaultstate="collapsed" desc="METODOS STATES DEL FORMULARIO">
    private void respUnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respUnoStateChanged
        if (respUno.isSelected()) {
            respuestaGuardada[contadorPregunta] = numeroPregunta.respuestaUno;
        }
    }//GEN-LAST:event_respUnoStateChanged

    private void respDosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respDosStateChanged
        if (respDos.isSelected()) {
            respuestaGuardada[contadorPregunta] = numeroPregunta.respuestaDos;
        }
    }//GEN-LAST:event_respDosStateChanged

    private void respTresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respTresStateChanged
        if (respTres.isSelected()) {
            respuestaGuardada[contadorPregunta] = numeroPregunta.respuestaTres;
        }
    }//GEN-LAST:event_respTresStateChanged

    private void respCuatroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respCuatroStateChanged
        if (respCuatro.isSelected()) {
            respuestaGuardada[contadorPregunta] = numeroPregunta.respuestaCuatro;
        }
    }//GEN-LAST:event_respCuatroStateChanged
//</editor-fold>
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup buttonGroupRespuestas;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel numPregunta;
    private javax.swing.JLabel preguntaTest;
    private javax.swing.JRadioButton respCuatro;
    private javax.swing.JRadioButton respDos;
    private javax.swing.JRadioButton respTres;
    private javax.swing.JRadioButton respUno;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
