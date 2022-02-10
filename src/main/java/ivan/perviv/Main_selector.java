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

    public Main_selector(String titulo) {
        super(titulo);
        initComponents();
        imagenIconito = getIconImage();
        setLocationRelativeTo(null);
        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
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

        jSeparator1 = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        botonSelector = new javax.swing.JButton();
        botonEmpezar = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        jIcon = new javax.swing.JLabel();
        jIcon2 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(355, 480));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Autoescuela");

        botonSelector.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        botonSelector.setText("Elegir preguntas...");
        botonSelector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSelector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSelectorActionPerformed(evt);
            }
        });

        botonEmpezar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
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

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Main_selector/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jIcon)
                                .addGap(10, 10, 10)
                                .addComponent(botonSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jIcon2)
                                .addGap(10, 10, 10)
                                .addComponent(botonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAyuda)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIcon)
                    .addComponent(botonSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jIcon2)
                    .addComponent(botonEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(botonAyuda)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSelectorActionPerformed
        // BOTON SELECTOR DE PREGUNTAS //
        JFileChooser fc = new JFileChooser();
        int numero = fc.showOpenDialog(this);

        if (numero == JFileChooser.APPROVE_OPTION) {
            archivoPreguntas = fc.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Archivo cargado.");
        }
    }//GEN-LAST:event_botonSelectorActionPerformed

    private void botonEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpezarActionPerformed
        // BOTON EMPEZAR TEST //
        if (archivoPreguntas != null) {
            new Panel_respuestas("IP",imagenIconito, archivoPreguntas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showConfirmDialog(this, "No has cogido las preguntas", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonEmpezarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "F";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowOpened

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
                new Main_selector("IP").setVisible(true);
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
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
