package royal_gym;

import javax.swing.JOptionPane;

public class GUI_Inventario extends javax.swing.JFrame {

    Validaciones ValidarLetras = new Validaciones();
    Validaciones ValidarNumeros = new Validaciones();

    public GUI_Inventario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        BotonAceptar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Descripcion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Inventario De Equipo");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        BotonAceptar.setText("Aceptar");
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonSalir.setText("Cancelar");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        textArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textArea1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BotonAceptar)
                            .addGap(35, 35, 35)
                            .addComponent(BotonSalir)
                            .addGap(15, 15, 15))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addComponent(textArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonSalir)
                            .addComponent(BotonAceptar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0); // cierre de ventana
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
        // TODO add your handling code here:
        Conexion C = new Conexion();
        C.conectar();

        //validaciones para los JTextField 1,2 y textArea1 para campos vacios
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar el nombre del Equipo", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar la cantidad de Equipo", "Error!", JOptionPane.ERROR_MESSAGE);
        } else if (textArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar la descripcion del Equipo", "Error!", JOptionPane.ERROR_MESSAGE);

        } else {
            //metodogo getText para cada los JTextField 1,2 y textArea1 y asi obtener el texto
            C.insertarInventario(jTextField1.getText(), jTextField2.getText(), textArea1.getText());
                    jTextField1.setText("");
        jTextField2.setText("");
        textArea1.setText("");
        }
    }//GEN-LAST:event_BotonAceptarActionPerformed

    //Metodo para validacion de solo letras y para caracteres especiales.
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        ValidarLetras.soloLetras(evt);
        
        if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 ||
               (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64 ||
               (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
            {
                evt.consume();
               
                jTextField1.setCursor(null);
            }
    }//GEN-LAST:event_jTextField1KeyTyped

    //Metodo para validacion de solo numeros y para caracteres especiales.
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        ValidarNumeros.soloNumeros(evt);
        
        if((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47 ||
               (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64 ||
               (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
            {
                evt.consume();
               
                jTextField2.setCursor(null);
            }
    }//GEN-LAST:event_jTextField2KeyTyped

    //Metodo para validacion de caracteres especiales.
    private void textArea1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textArea1KeyTyped

        if((int)evt.getKeyChar()>32 && (int)evt.getKeyChar()<=47 ||
               (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=64 ||
               (int)evt.getKeyChar()>=123 && (int)evt.getKeyChar()<=255)
            {
                evt.consume();
               
                textArea1.setCursor(null);
            }
    }//GEN-LAST:event_textArea1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
