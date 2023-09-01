package com.emisoft.javaappautos.Igu;

import com.emisoft.javaappautos.Logica.Automovil;
import com.emisoft.javaappautos.Logica.Controladora;
import javax.swing.JOptionPane;

public class AltaAutos extends javax.swing.JFrame
{

    Automovil automovil = null;
    Controladora controladora = null;

    public AltaAutos()
    {
        automovil = new Automovil();
        controladora = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        brnConsultaEditarBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumeroPuertas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(0, 255, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Emilio\\Documents\\GitHub\\JavaAppAutos\\JavaAppAutos\\src\\main\\java\\com\\emisoft\\javaappautos\\Igu\\Img\\a-PgqkBf_400x400.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("ALTA DE AUTOMÓVILES");

        brnConsultaEditarBaja.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        brnConsultaEditarBaja.setForeground(new java.awt.Color(255, 51, 51));
        brnConsultaEditarBaja.setText("Consulta, Edición y Bajas");
        brnConsultaEditarBaja.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                brnConsultaEditarBajaActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnAlta.setForeground(new java.awt.Color(255, 51, 51));
        btnAlta.setText("Alta Automoviles");
        btnAlta.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAltaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("ID:");

        txtId.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Marca: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Modelo: ");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Motor: ");

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Color: ");

        jLabel8.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Número de Puertas: ");

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Patente: ");

        jSeparator1.setForeground(new java.awt.Color(255, 51, 51));

        jButton1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(416, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca)
                            .addComponent(txtMotor)
                            .addComponent(txtColor)
                            .addComponent(txtPatente))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(brnConsultaEditarBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtNumeroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnConsultaEditarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAltaActionPerformed
    {//GEN-HEADEREND:event_btnAltaActionPerformed

        try
        {

          
              if (txtModelo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Por favor Ingrese Modelo!");
                return;
            }

            if (txtMarca.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Por favor Ingrese la Marca!");
                return;
            }
            
          
            
            if (txtMotor.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Por favor Ingrese Motor!");
                return;
            }
            
              if (txtColor.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this, "Por favor Ingrese Color!");
                return;
            }

            if (txtPatente.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Por favor Ingrese Patente!");
                return;
            }
            
            if (txtNumeroPuertas.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Por favor Ingrese Número de Puertas!");
                return;
            }
            
            //int id = Integer.parseInt(txtId.getText());
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String motor = txtMotor.getText();
            String color = txtColor.getText();
            String patente = txtPatente.getText();
            int numeroPuertas = Integer.parseInt(txtNumeroPuertas.getText());
            controladora.AgregarAutomovil(modelo, marca, motor, color, patente, numeroPuertas);

            JOptionPane.showMessageDialog(null, "Datos Guardado de Forma Exitosa!");

            this.LimpiarCampos();
            
            ConsultaAutomovil consultaAutomovil = new ConsultaAutomovil();
            consultaAutomovil.setVisible(true);
            consultaAutomovil.setLocationRelativeTo(null);
            
            this.dispose();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error en Alta Autos: " + e.getMessage());
        }


    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalirActionPerformed
    {//GEN-HEADEREND:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void brnConsultaEditarBajaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_brnConsultaEditarBajaActionPerformed
    {//GEN-HEADEREND:event_brnConsultaEditarBajaActionPerformed
        ConsultaAutomovil consultaAutomovil = new ConsultaAutomovil();
        consultaAutomovil.setVisible(true);
        consultaAutomovil.setLocationRelativeTo(null);
        
        dispose();
    }//GEN-LAST:event_brnConsultaEditarBajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnConsultaEditarBaja;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNumeroPuertas;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables

    private void LimpiarCampos()
    {
        txtColor.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtMotor.setText("");
        txtNumeroPuertas.setText("");
        txtPatente.setText("");

    }

}

//boolean Valida(){
//    if(txtRFC.getText().equals("")){
//        javax.swing.JOptionPane.showMessageDialog(this, "Llene todos los campos");
//        return true;
//    } 
//        return false;
//}//Validaciones
