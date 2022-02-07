package ivan.perviv;

import com.sun.tools.javac.Main;
import java.awt.*;
import java.io.*;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author Iván Pérez
 */
public class Main_selector extends JFrame {

    protected Image imagenIconito;
    protected File archivoPreguntas;

    public Main_selector() {
        initComponents();
        imagenIconito = getIconImage();
        setLocationRelativeTo(null);
    }

    @Override
    public Image getIconImage() {
        URL imageResource = Main.class.getClassLoader().getResource("Main_selector/iconito.png");
        Image iconito = Toolkit.getDefaultToolkit().getImage(imageResource);
        return iconito;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        botonSelector = new javax.swing.JButton();
        botonEmpezar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        jIcon = new javax.swing.JLabel();
        jIcon2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(0, 0));
        setResizable(false);

        Titulo.setFont(new java.awt.Font("Felix Titling", 1, 26)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("TEST DE CONDUCIR MANOLIN.");

        botonSelector.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        botonSelector.setText("Elegir preguntas...");
        botonSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSelector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSelectorActionPerformed(evt);
            }
        });

        botonEmpezar.setFont(new java.awt.Font("Perpetua", 1, 16)); // NOI18N
        botonEmpezar.setText("Empezar");
        botonEmpezar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEmpezar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpezarActionPerformed(evt);
            }
        });

        botonAyuda.setText("?");
        botonAyuda.setToolTipText("Ayuda.");
        botonAyuda.putClientProperty("JButton.buttonType", "help");

        jIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_selector/abrir.png"))); // NOI18N

        jIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_selector/play.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonAyuda)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonSelector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jIcon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIcon)
                    .addComponent(botonSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIcon2)
                    .addComponent(botonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonAyuda)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSelectorActionPerformed
        ////// BOTON SELECTOR DE PREGUNTAS /////
        JFileChooser fc = new JFileChooser();
        int numero = fc.showOpenDialog(this);

        if (numero == JFileChooser.APPROVE_OPTION) {
            archivoPreguntas = fc.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Archivo cargado.");
        }
    }//GEN-LAST:event_botonSelectorActionPerformed

    private void botonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpezarActionPerformed
        /////// BOTON EMPEZAR TEST ///////
        if (archivoPreguntas != null) {
            new Panel_respuestas(imagenIconito, archivoPreguntas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showConfirmDialog(this, "No has cogido las preguntas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonEmpezarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            //UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatDarkLaf());
            UIManager.setLookAndFeel(new com.formdev.flatlaf.FlatLightLaf());
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Main_selector.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_selector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonEmpezar;
    private javax.swing.JButton botonSelector;
    private javax.swing.JLabel jIcon;
    private javax.swing.JLabel jIcon2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
