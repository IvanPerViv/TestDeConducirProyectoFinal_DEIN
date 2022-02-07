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
    protected ConexionBBDD con;

    protected ArrayList<Pregunta> listapreguntas;
    protected int contadorPregunta = 0;

    public Panel_respuestas(Image imagenIconito, File archivoPreguntas) {

        this.imagenIconito = imagenIconito;
        this.archivoPreguntas = archivoPreguntas;

        initComponents();
        setLocationRelativeTo(null);

        // DEVUELVE LAS PREGUNTAS //
        con = new ConexionBBDD(archivoPreguntas);
        listapreguntas = con.ConexionBBDD();

        // RANDOMIZAR LAS PREGUNTAS //
        Collections.shuffle(listapreguntas);
        escrituraPreguntasRespuestas();

    }

    public void escrituraPreguntasRespuestas() {
        Pregunta preg = listapreguntas.get(contadorPregunta);
        numPregunta.setText(String.valueOf(contadorPregunta + 1));
        preguntaTest.setText(preg.getPregunta());

        respUno.setText(preg.getRespuestaUno().getTextoRespuesta());
        respDos.setText(preg.getRespuestaDos().getTextoRespuesta());
        respTres.setText(preg.getRespuestaTres().getTextoRespuesta());
        respCuatro.setText(preg.getRespuestaCuatro().getTextoRespuesta());

        
        if (contadorPregunta + 1 == listapreguntas.size()) {
            botonSiguiente.setText("Finalizar");
        } else {
            botonSiguiente.setText("Siguiente");
        }

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
        setMaximumSize(null);
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
        getContentPane().add(respUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 390, -1));
        buttonGroupRespuestas.add(respUno);

        buttonGroupRespuestas.add(respDos);
        respDos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respDos.setText("Respuesta 2");
        getContentPane().add(respDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 390, -1));
        buttonGroupRespuestas.add(respDos);

        buttonGroupRespuestas.add(respTres);
        respTres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respTres.setText("Respuesta 3");
        getContentPane().add(respTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 390, -1));
        buttonGroupRespuestas.add(respTres);

        buttonGroupRespuestas.add(respCuatro);
        respCuatro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respCuatro.setText("Respuesta 4");
        getContentPane().add(respCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 390, -1));
        buttonGroupRespuestas.add(respCuatro);

        botonAtras.setText("ATRAS");
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        if (!botonSiguiente.getText().equals("Finalizar")) {
            contadorPregunta++;
            escrituraPreguntasRespuestas();
        } else {
            new Panel_resultados(0, listapreguntas.size()).setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_botonSiguienteActionPerformed

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
