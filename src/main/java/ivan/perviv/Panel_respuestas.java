package ivan.perviv;

import com.sun.tools.javac.Main;
import java.awt.Image;
import java.io.File;
import java.net.URL;
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
    protected Pregunta objPregunta;

    public Panel_respuestas(String titulo, Image imagenIconito, File archivoPreguntas) {
        super(titulo);
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
        numPregunta.setText(String.valueOf(contadorPregunta + 1)+".");
        preguntaTest.setText(objPregunta.getPregunta());

        respUno.setText(objPregunta.getRespuestaUno().getTextoRespuesta());
        respDos.setText(objPregunta.getRespuestaDos().getTextoRespuesta());
        respTres.setText(objPregunta.getRespuestaTres().getTextoRespuesta());
        respCuatro.setText(objPregunta.getRespuestaCuatro().getTextoRespuesta());

        // pinta las imagenes para cada pregunta //
        pintarImagenes(objPregunta);
        
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
            labelSiguiente.setText("SIGUIENTE");
        } else {
            labelSiguiente.setText("FINALIZAR");
        }

        //Actualizamos el numero de preguntas y que se vaya guardando.
        this.objPregunta = listaDePreguntas.get(contadorPregunta);
    }
    
    /**
     * Metodo que pinta las imagenes para cada pregunta
     * @param preguntilla 
     */
    public void pintarImagenes (Pregunta preguntilla){
        URL imageResource = Main.class.getClassLoader().getResource("Panel_respuestas/"+preguntilla.getImagen());
        foto.setIcon(new ImageIcon(imageResource));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRespuestas = new javax.swing.ButtonGroup();
        panelMenu = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelFoto = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        numPregunta = new javax.swing.JLabel();
        preguntaTest = new javax.swing.JLabel();
        respUno = new javax.swing.JRadioButton();
        respDos = new javax.swing.JRadioButton();
        respTres = new javax.swing.JRadioButton();
        respCuatro = new javax.swing.JRadioButton();
        botonAtras = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelSiguiente = new javax.swing.JLabel();
        labelAnterior = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenIconito);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(160, 160, 160)));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo1.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("PREGUNTAS");
        panelMenu.add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 490, 70));

        titulo2.setFont(new java.awt.Font("Rockwell", 2, 16)); // NOI18N
        titulo2.setText("TEST DE CONDUCIR      -Test basico-");
        panelMenu.add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/dgt.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 30));

        getContentPane().add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 70));

        panelFoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), new java.awt.Color(255, 255, 255)));
        panelFoto.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 260));

        getContentPane().add(panelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 460));

        numPregunta.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        numPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numPregunta.setText("1");
        getContentPane().add(numPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 50, 50));

        preguntaTest.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        preguntaTest.setText("PREGUNTA DEL TEST DE CONDUCIR");
        getContentPane().add(preguntaTest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 410, 80));

        buttonGroupRespuestas.add(respUno);
        respUno.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respUno.setText("Respuesta 1");
        respUno.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respUnoStateChanged(evt);
            }
        });
        getContentPane().add(respUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 360, 40));
        buttonGroupRespuestas.add(respUno);

        buttonGroupRespuestas.add(respDos);
        respDos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respDos.setText("Respuesta 2");
        respDos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respDosStateChanged(evt);
            }
        });
        getContentPane().add(respDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 360, 40));
        buttonGroupRespuestas.add(respDos);

        buttonGroupRespuestas.add(respTres);
        respTres.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respTres.setText("Respuesta 3");
        respTres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respTresStateChanged(evt);
            }
        });
        getContentPane().add(respTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 360, 40));
        buttonGroupRespuestas.add(respTres);

        buttonGroupRespuestas.add(respCuatro);
        respCuatro.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        respCuatro.setText("Respuesta 4");
        respCuatro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                respCuatroStateChanged(evt);
            }
        });
        getContentPane().add(respCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 360, 40));
        buttonGroupRespuestas.add(respCuatro);

        botonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/izquierda.png"))); // NOI18N
        botonAtras.setToolTipText("Pregunta anterior.");
        botonAtras.setBorderPainted(false);
        botonAtras.setContentAreaFilled(false);
        botonAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/izquierdaION.png"))); // NOI18N
        botonAtras.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/izquierdaION.png"))); // NOI18N
        botonAtras.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/izquierdaION.png"))); // NOI18N
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 130, 110));

        botonSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/derecha.png"))); // NOI18N
        botonSiguiente.setToolTipText("Pregunta siguiente.");
        botonSiguiente.setBorderPainted(false);
        botonSiguiente.setContentAreaFilled(false);
        botonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSiguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/derechaON.png"))); // NOI18N
        botonSiguiente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Panel_respuestas/derechaON.png"))); // NOI18N
        botonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(botonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 140, 110));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 22, 480));

        labelSiguiente.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        labelSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSiguiente.setText("SIGUIENTE");
        getContentPane().add(labelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 90, 30));

        labelAnterior.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        labelAnterior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnterior.setText("ANTERIOR");
        getContentPane().add(labelAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 90, 30));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 20, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSiguienteActionPerformed
        // BOTON SIGUIENTE //
        int numeroDeAciertos = 0;
        if (labelSiguiente.getText().equals("FINALIZAR")) {
            int resultado = JOptionPane.showConfirmDialog(this, "¿Quieres finalizar el examen?", "Advertencia", JOptionPane.YES_OPTION);
            if (resultado == 0) {
                for (Respuesta respuesta : respuestaGuardada) {
                    if (respuesta != null) {
                        if (respuesta.isVerdadero()) {
                            numeroDeAciertos++;
                        }
                    }
                }
                new Panel_resultados("IP", imagenIconito, numeroDeAciertos, listaDePreguntas.size()).setVisible(true);
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
     * METODOS en el cual guardamos en el array la respuesta de cada una de las
     * preguntas.
     */
    //<editor-fold defaultstate="collapsed" desc="METODOS STATES DEL FORMULARIO">
    private void respUnoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respUnoStateChanged
        if (respUno.isSelected()) {
            respuestaGuardada[contadorPregunta] = objPregunta.respuestaUno;
        }
    }//GEN-LAST:event_respUnoStateChanged

    private void respDosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respDosStateChanged
        if (respDos.isSelected()) {
            respuestaGuardada[contadorPregunta] = objPregunta.respuestaDos;
        }
    }//GEN-LAST:event_respDosStateChanged

    private void respTresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respTresStateChanged
        if (respTres.isSelected()) {
            respuestaGuardada[contadorPregunta] = objPregunta.respuestaTres;
        }
    }//GEN-LAST:event_respTresStateChanged

    private void respCuatroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_respCuatroStateChanged
        if (respCuatro.isSelected()) {
            respuestaGuardada[contadorPregunta] = objPregunta.respuestaCuatro;
        }
    }//GEN-LAST:event_respCuatroStateChanged
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.ButtonGroup buttonGroupRespuestas;
    private javax.swing.JLabel foto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelAnterior;
    private javax.swing.JLabel labelSiguiente;
    private javax.swing.JLabel numPregunta;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JLabel preguntaTest;
    private javax.swing.JRadioButton respCuatro;
    private javax.swing.JRadioButton respDos;
    private javax.swing.JRadioButton respTres;
    private javax.swing.JRadioButton respUno;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    // End of variables declaration//GEN-END:variables
}
