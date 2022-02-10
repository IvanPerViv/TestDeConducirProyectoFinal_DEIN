package ivan.perviv;

import com.sun.tools.javac.Main;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author Iván Pérez
 */
public class Panel_resultados extends JFrame {
    
    protected Image imagenIconito;
    protected String aprobado;
    protected int numeroDeAciertos, cantidadPreguntas;

    public Panel_resultados(String titulo, Image imagenIconito, int numeroDeAciertos, int cantidadDePreguntas) {
        super(titulo);
        this.imagenIconito = imagenIconito;
        this.numeroDeAciertos = numeroDeAciertos;
        cantidadPreguntas = cantidadDePreguntas;
        
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        
        if (numeroDeAciertos >= (cantidadPreguntas - 3)) {
            jLabel1.setText("Has aprobado el examen");
            aprobado = "Aprobado";
        } else {
            jLabel1.setText("Has suspendido el examen");
        }
        imagenAprobadoSuspenso();
        jLabel2.setText("Tu resultado es " + numeroDeAciertos + "/" + cantidadPreguntas);
    }

    /*
    * Inserta una imagen en el Label en el cual varia si apruebas o suspendes
    */
    private void imagenAprobadoSuspenso() {
        if(aprobado.equals("Aprobado")) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        imagenAprobadoSuspenso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(imagenIconito);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setText("RESULTADO");

        jLabel2.setText("ACIERTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagenAprobadoSuspenso, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenAprobadoSuspenso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
