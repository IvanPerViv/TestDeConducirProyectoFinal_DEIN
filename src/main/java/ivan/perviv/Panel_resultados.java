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
    protected String aprobado;
    protected int numeroDeAciertos, cantidadPreguntas;
    ArrayList<Pregunta> listaDePreguntas;

    public Panel_resultados(String titulo, Image imagenIconito, int numeroDeAciertos, int cantidadDePreguntas, ArrayList<Pregunta> p ){
        super(titulo);
        this.imagenIconito = imagenIconito;
        this.numeroDeAciertos = numeroDeAciertos;
        cantidadPreguntas = cantidadDePreguntas;
        listaDePreguntas = p;

        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        if (numeroDeAciertos >= (cantidadPreguntas - 3)) {
            jLabel1.setText("¡APROBADO!");
            aprobado = "Aprobado";
        } else {
            jLabel1.setText("¡SUSPENSO!");
        }
        imagenAprobadoSuspenso();
        jLabel2.setText(numeroDeAciertos + "/" + cantidadPreguntas);
        for (int i = 0; i < listaDePreguntas.size(); i++) {
            jTabbedPane1.addTab(Integer.toString(i+1),new respuestaFinal(listaDePreguntas.get(i)));
        }
    }

    /*
    * Inserta una imagen en el Label en el cual varia si apruebas o suspendes
     */
    private void imagenAprobadoSuspenso() {
        if (aprobado.equals("Aprobado")) {
            URL imageResource = Main.class.getClassLoader().getResource("Panel_resultados/aprobado.png");
            imagenAprobadoSuspenso.setIcon(new ImageIcon(imageResource));
        } else {
            URL imageResource = Main.class.getClassLoader().getResource("Panel_resultados/suspenso.png");
            imagenAprobadoSuspenso.setIcon(new ImageIcon(imageResource));
        }
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(respuestas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
