package ivan.perviv;

import java.io.Serializable;
import javax.swing.*;

/**
 * @author Iván Pérez
 */
public class ComponenteRespuestaFinal extends JPanel implements Serializable {

    public ComponenteRespuestaFinal() {

    }
    public ComponenteRespuestaFinal(Pregunta pregunta) {
        initComponents();

        labelPregunta.setText("<html><h3>" + pregunta.getPregunta() + "</h3></html>");

        if (pregunta.getRespuestaUno().isVerdadero()) {
            respuestaCorrecta.setText("<html><p>" + pregunta.getRespuestaUno().getTextoRespuesta() + "</p></html>");
        } else if (pregunta.getRespuestaDos().isVerdadero()) {
            respuestaCorrecta.setText("<html><p>" + pregunta.getRespuestaDos().getTextoRespuesta() + "</p></html>");
        } else if (pregunta.getRespuestaTres().isVerdadero()) {
            respuestaCorrecta.setText("<html><p>" + pregunta.getRespuestaTres().getTextoRespuesta() + "</p></html>");
        } else if (pregunta.getRespuestaCuatro().isVerdadero()) {
            respuestaCorrecta.setText("<html><p>" + pregunta.getRespuestaCuatro().getTextoRespuesta() + "</p></html>");
        }

    }

    //<editor-fold defaultstate="collapsed" desc="METODOS Getters">
    public JLabel getLabelPregunta() {
        return labelPregunta;
    }

    public JLabel getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="METODOS Setters">
    public void setLabelPregunta(JLabel labelPregunta) {
        this.labelPregunta = labelPregunta;
    }

    public void setRespuestaCorrecta(JLabel respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
    //</editor-fold> 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPregunta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        respuestaCorrecta = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(460, 230));

        labelPregunta.setFont(new java.awt.Font("Rockwell", 0, 16)); // NOI18N
        labelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPregunta.setText("<Pregunta>");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("La respuesta correcta era: ");

        respuestaCorrecta.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        respuestaCorrecta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        respuestaCorrecta.setText("<Respuestas>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel respuestaCorrecta;
    // End of variables declaration//GEN-END:variables
}
