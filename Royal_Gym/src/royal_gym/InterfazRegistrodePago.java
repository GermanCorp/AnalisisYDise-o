/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package royal_gym;

import javax.swing.JOptionPane;

/**
 *
 * @author Jazmin Vargas
 */
public class InterfazRegistrodePago extends javax.swing.JFrame {

    /**
     * Creates new form InterfazRegistrodePago
     */
    Conexion con = new Conexion();
  
  public InterfazRegistrodePago() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Labelcliente = new javax.swing.JLabel();
        Labelmonto = new javax.swing.JLabel();
        Labeltipoplan = new javax.swing.JLabel();
        Labeltiempo = new javax.swing.JLabel();
        botonaceptar = new javax.swing.JButton();
        botoncancelar = new javax.swing.JButton();
        textcliente = new javax.swing.JTextField();
        textmonto = new javax.swing.JTextField();
        texttiempo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelcliente.setText("Cliente:");

        Labelmonto.setText("Monto:");

        Labeltipoplan.setText("Tipo de plan:");

        Labeltiempo.setText("Tiempo:");

        botonaceptar.setText("Aceptar");
        botonaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonaceptarActionPerformed(evt);
            }
        });

        botoncancelar.setText("Cancelar");
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        textmonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textmontoKeyTyped(evt);
            }
        });

        texttiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                texttiempoKeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Pareja", "Trio", "Grupo" }));
        jComboBox1.setAlignmentX(5.0F);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Semana", "Mes" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labelcliente)
                    .addComponent(Labelmonto)
                    .addComponent(Labeltipoplan)
                    .addComponent(Labeltiempo))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textcliente)
                    .addComponent(textmonto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texttiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, 84, Short.MAX_VALUE))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonaceptar)
                .addGap(38, 38, 38)
                .addComponent(botoncancelar)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Labelcliente)
                            .addComponent(textcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Labelmonto))
                    .addComponent(textmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labeltipoplan)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labeltiempo)
                    .addComponent(texttiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonaceptar)
                    .addComponent(botoncancelar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonaceptarActionPerformed
        // TODO add your handling code here:
        con.ValidarInformacion(textmonto.getText(), texttiempo.getText());
        con.insertarPagos(textmonto.getText(), texttiempo.getText());
     
    }//GEN-LAST:event_botonaceptarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        //jComboBox1.getSelectedItem().toString();
        String categoria1 = (String) jComboBox1.getSelectedItem();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        jComboBox2.getSelectedItem().toString();
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void textmontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textmontoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        
        else
            if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47 ||
               (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64 ||
               (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
            {
                getToolkit().beep();
                evt.consume();
                //JOptionPane.showMessageDialog(this, "Ingrese solo numeros","",JOptionPane.ERROR_MESSAGE);
                textmonto.setCursor(null);
            }       
 
    }//GEN-LAST:event_textmontoKeyTyped

    private void texttiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_texttiempoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        
        else
            if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47 ||
               (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64 ||
               (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
            {
                getToolkit().beep();
                evt.consume();
                //JOptionPane.showMessageDialog(this, "Ingrese solo numeros","",JOptionPane.ERROR_MESSAGE);
                texttiempo.setCursor(null);
            }       
    }//GEN-LAST:event_texttiempoKeyTyped

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botoncancelarActionPerformed
               
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrodePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrodePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrodePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazRegistrodePago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistrodePago().setVisible(true);
            }
        });
        Conexion con = new Conexion();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labelcliente;
    private javax.swing.JLabel Labelmonto;
    private javax.swing.JLabel Labeltiempo;
    private javax.swing.JLabel Labeltipoplan;
    private javax.swing.JButton botonaceptar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JTextField textcliente;
    private javax.swing.JTextField textmonto;
    private javax.swing.JTextField texttiempo;
    // End of variables declaration//GEN-END:variables
}
