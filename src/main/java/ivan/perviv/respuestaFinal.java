package ivan.perviv;

import java.io.Serializable;
import javax.swing.JLabel;

public class respuestaFinal extends javax.swing.JPanel implements Serializable {

    public respuestaFinal() {

    }

    public respuestaFinal(Pregunta pregunta) {
        initComponents();

        labelPregunta.setText(pregunta.getPregunta());
        
        if (pregunta.getRespuestaUno().isVerdadero()) {
            respuestaCorrecta.setText(pregunta.getRespuestaUno().getTextoRespuesta());
        } else if (pregunta.getRespuestaDos().isVerdadero()) {
            respuestaCorrecta.setText(pregunta.getRespuestaDos().getTextoRespuesta());
        } else if (pregunta.getRespuestaTres().isVerdadero()) {
            respuestaCorrecta.setText(pregunta.getRespuestaTres().getTextoRespuesta());
        } else if (pregunta.getRespuestaCuatro().isVerdadero()) {
            respuestaCorrecta.setText(pregunta.getRespuestaCuatro().getTextoRespuesta());
        }

    }

    public JLabel getLabelPregunta() {
        return labelPregunta;
    }

    public void setLabelPregunta(JLabel labelPregunta) {
        this.labelPregunta = labelPregunta;
    }

    public JLabel getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(JLabel respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPregunta = new javax.swing.JLabel();
        respuestaCorrecta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(460, 230));

        labelPregunta.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        labelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPregunta.setText("<Pregunta>");

        respuestaCorrecta.setFont(new java.awt.Font("Rockwell", 2, 12)); // NOI18N
        respuestaCorrecta.setText("<Respuesta Correcta>");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("La respuesta correcta era: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(respuestaCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelPregunta;
    private javax.swing.JLabel respuestaCorrecta;
    // End of variables declaration//GEN-END:variables
}
