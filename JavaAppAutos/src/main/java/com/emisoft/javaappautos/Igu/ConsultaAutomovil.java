package com.emisoft.javaappautos.Igu;

import com.emisoft.javaappautos.Logica.Automovil;
import com.emisoft.javaappautos.Logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAutomovil extends javax.swing.JFrame
{

    Controladora controladora = new Controladora();

    public ConsultaAutomovil()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("CONSULTA DE AUTOMÓVILES");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        tblAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        jScrollPane1.setViewportView(tblAutos);

        btnEliminar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 51, 51));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalir2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSalir2.setForeground(new java.awt.Color(255, 51, 51));
        btnSalir2.setText("Salir");
        btnSalir2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            //Controlar la tbal de que no este vacia:
            if (tblAutos.getRowCount() > 0)
            {
                // Valido que se haya seleccionado un registro a eliminar

                if (tblAutos.getSelectedRow() != -1)
                {
                    int salida = JOptionPane.showConfirmDialog(null,
                            "Desea Borrar el Registro?", "Borrar Autómovil",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.WARNING_MESSAGE);
                    if (salida == 0)
                    {
                        //Obtner la Id del dato que queiro borrar:
                        int idAuto = Integer.parseInt(String.valueOf(tblAutos.getValueAt(tblAutos.getSelectedRow(), 0)));
                        controladora.BorrarAutoPorId(idAuto);
                        MostrarMensajes("Autómovil Borrado de la BD.", "Informacion", "Dato Borrado!");
                         CargarTabla();
                    }
                    else
                    {
                        CargarTabla();

                    }
                    
                    CargarTabla();

                }
                else
                {
                    MostrarMensajes("No ha Seleccionado Dato ha Eliminar", "Error", "Error: Dato no Seleccionado");
                }
            }else
            {
                MostrarMensajes("No Existe datos en la BD", "Error", "Tabla sin Datos");
            }
        }
        catch (Exception e)
        {
            System.out.println("ERROR: en Elininar Auto Consulta Automovile: " + e.getMessage());
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditarActionPerformed
    {//GEN-HEADEREND:event_btnEditarActionPerformed
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalir2ActionPerformed
    {//GEN-HEADEREND:event_btnSalir2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        CargarTabla();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutos;
    // End of variables declaration//GEN-END:variables

    private void CargarTabla()
    {
        //Hacemos que la tabla no sea editable;
        DefaultTableModel defaultTableModel = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int row, int column)
            {

                return false;
            }
        };

        //Ponemos titulos a las Columnas de la Tabla:
        String titulos[] =
        {
            "Id", "Modelo", "Marca", "Motor", "Color", "Patente", "Puertas"
        };
        defaultTableModel.setColumnIdentifiers(titulos);

        tblAutos.setModel(defaultTableModel);

        //Traer los autos desde la Base de datos:
        List<Automovil> listaAutomoviles = controladora.TrarListaAutomoviles();

        //Setaer los datos en la Tabla:
        if (listaAutomoviles != null)
        {
            for (Automovil listaAutomovile : listaAutomoviles)
            {
                Object[] objects =
                {
                    listaAutomovile.getId(),
                    listaAutomovile.getModelo(),
                    listaAutomovile.getMarca(),
                    listaAutomovile.getMotor(),
                    listaAutomovile.getColor(),
                    listaAutomovile.getPatente(),
                    listaAutomovile.getCantidadDePuerta()
                };

                defaultTableModel.addRow(objects);
            }
        }

        tblAutos.setModel(defaultTableModel);

    }
    
    public void MostrarMensajes(String mensaje, String tipo, String titulo)
    {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Informacion"))
        {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        }
        else if (tipo.equals("Error"))
        {

            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

}
