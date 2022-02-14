package ivan.perviv;

import com.sun.tools.javac.Main;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Iván Pérez
 */
public class Panel_resultados extends JFrame {

    protected Image imagenIconito;
    protected int numeroDeAciertos, cantidadPreguntas;
    protected String titulo;
    protected ArrayList<Pregunta> listaDePreguntas;

    public Panel_resultados(String titulo, Image imagenIconito, int numeroDeAciertos, int numeroDePreguntas, ArrayList<Pregunta> p) {
        super(titulo);
        this.titulo = titulo;
        this.imagenIconito = imagenIconito;
        this.numeroDeAciertos = numeroDeAciertos;
        cantidadPreguntas = numeroDePreguntas;
        listaDePreguntas = p;

        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        //Metodo en el cual pone en el label correspondiende (con una IMAGEN) + texto, si aprobado o suspendido.
        resultado(numeroDeAciertos,numeroDePreguntas);
        
        //Pone en label el numero total de aciertos.
        jAciertos.setText(numeroDeAciertos + "/" + cantidadPreguntas);
        for (int i = 0; i < listaDePreguntas.size(); i++) {
            jTabbedPane1.addTab(Integer.toString(i + 1), new ComponenteRespuestaFinal(listaDePreguntas.get(i)));
        }
    }

    /**
     * Calcula si has aprobado o suspendido el examen.
     * @param aciertos numero total de aciertos coseguidos.
     * @param preguntas numero de preguntas
     */
    public void resultado (int aciertos, int cantidadPreguntas){
        if (aciertos >=(cantidadPreguntas - 3)) {
            jResultado.setText("¡APROBADO!");
            imagenAprobado();
        } else {
            jResultado.setText("¡SUSPENSO!");
            imagenSuspenso();
        }
    }
    
    /*
    * Inserta una imagen en el Label en el cual varia si apruebas o suspendes
     */
    private void imagenAprobado() {
        URL imageResource = Main.class.getClassLoader().getResource("Panel_resultados/aprobado.png");
        imagenAprobadoSuspenso.setIcon(new ImageIcon(imageResource));
    }

    private void imagenSuspenso() {
        URL imageResource = Main.class.getClassLoader().getResource("Panel_resultados/suspenso.png");
        imagenAprobadoSuspenso.setIcon(new ImageIcon(imageResource));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloFinal = new javax.swing.JLabel();
        jResultado = new javax.swing.JLabel();
        jAciertos = new javax.swing.JLabel();
        imagenAprobadoSuspenso = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        respuestas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        version1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenIconito);
        setUndecorated(true);
        setResizable(false);

        tituloFinal.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        tituloFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFinal.setText("¡HAS FINALIZADO!");

        jResultado.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jResultado.setText("<RESULTADO>");

        jAciertos.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jAciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jAciertos.setText("<ACIERTOS>");

        imagenAprobadoSuspenso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(null);

        respuestas.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        respuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuestas.setText("- RESPUESTAS CORRECTAS -");

        jButton1.setText("Menú Principal");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        version1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        version1.setText("Copyright © 2022");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jAciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(respuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(version1)
                        .addGap(35, 35, 35))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(275, 275, 275))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tituloFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jResultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAciertos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(respuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(version1)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON PARA VOLVER A MENU DE INICIO //
        new Main_selector(titulo).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenAprobadoSuspenso;
    private javax.swing.JLabel jAciertos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jResultado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel respuestas;
    private javax.swing.JLabel tituloFinal;
    private javax.swing.JLabel version1;
    // End of variables declaration//GEN-END:variables
}
