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

    public Panel_resultados(String titulo, Image imagenIconito, int numeroDeAciertos, int cantidadDePreguntas, ArrayList<Pregunta> p) {
        super(titulo);
        this.titulo = titulo;
        this.imagenIconito = imagenIconito;
        this.numeroDeAciertos = numeroDeAciertos;
        cantidadPreguntas = cantidadDePreguntas;
        listaDePreguntas = p;

        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        resultado(numeroDeAciertos);
        
        jLabel2.setText(numeroDeAciertos + "/" + cantidadPreguntas);
        for (int i = 0; i < listaDePreguntas.size(); i++) {
            jTabbedPane1.addTab(Integer.toString(i + 1), new ComponenteRespuestaFinal(listaDePreguntas.get(i)));
        }
    }

    /**
     * Calcula si has aprovado o suspendido el examen.
     * @param aciertos numero total de aciertos coseguidos.
     * @param preguntas numero de preguntas
     */
    public void resultado (int aciertos){
        if (aciertos >= 5) {
            jLabel1.setText("¡APROBADO!");
            imagenAprobado();
        } else {
            jLabel1.setText("¡SUSPENSO!");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagenAprobadoSuspenso = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        respuestas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenIconito);
        setUndecorated(true);
        setResizable(false);

        tituloFinal.setFont(new java.awt.Font("Rockwell", 0, 48)); // NOI18N
        tituloFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFinal.setText("¡HAS FINALIZADO!");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<RESULTADO>");

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<ACIERTOS>");

        imagenAprobadoSuspenso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jTabbedPane1.setMaximumSize(null);

        respuestas.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        respuestas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        respuestas.setText("- RESPUESTAS CORRECTAS -");

        jButton1.setText("MENU PRINCIPAL");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(25, 25, 25)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(respuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))))
                    .addComponent(tituloFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(214, 214, 214))
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(respuestas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Main_selector(titulo).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenAprobadoSuspenso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel respuestas;
    private javax.swing.JLabel tituloFinal;
    // End of variables declaration//GEN-END:variables
}
