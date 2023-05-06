package Vistas;

import GuiaTelefonica_Consola.Cliente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewBuscarYBorrarCLientes extends javax.swing.JInternalFrame {

    public ViewBuscarYBorrarCLientes() {
        initComponents();
        jtTelefono.requestFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jtTelefono = new javax.swing.JTextField();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtCiudad = new javax.swing.JTextField();
        jtDireccion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlCiudad = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlGato = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Buscar y Borrar Cliente");
        setAutoscrolls(true);
        setNormalBounds(new java.awt.Rectangle(800, 800, 300, 300));
        setPreferredSize(new java.awt.Dimension(650, 680));
        setVisible(true);

        jtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jtDni.setEditable(false);
        jtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDni.setEnabled(false);

        jtNombre.setEditable(false);
        jtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtNombre.setEnabled(false);

        jtApellido.setEditable(false);
        jtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtApellido.setEnabled(false);

        jtCiudad.setEditable(false);
        jtCiudad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtCiudad.setEnabled(false);

        jtDireccion.setEditable(false);
        jtDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jtDireccion.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BUSCAR CLIENTE");

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("TELEFONO:");

        jlDni.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jlDni.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDni.setText("DNI:");
        jlDni.setEnabled(false);

        jlNombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jlNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlNombre.setText("NOMBRE:");
        jlNombre.setEnabled(false);

        jlApellido.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jlApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlApellido.setText("APELLIDO:");
        jlApellido.setEnabled(false);

        jlCiudad.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jlCiudad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlCiudad.setText("CIUDAD:");
        jlCiudad.setEnabled(false);

        jlDireccion.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jlDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlDireccion.setText("DIRECCION:");
        jlDireccion.setEnabled(false);

        jbBorrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbBorrar.setText("BORRAR");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gatito.png"))); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jbSalir.setText("SALIR");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlGato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato grande.png"))); // NOI18N
        jlGato.setEnabled(false);

        jSeparator1.setForeground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlDni, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jbBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlGato, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jlCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jlGato, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        String numero = "¿Esta Seguro que desea borra del"
                + "\n directoro el N° " + jtTelefono.getText() + " ?";

        ImageIcon iconoBorrar = new ImageIcon(getClass().getResource("/Imagenes/eliminar_mediano.png"));
        int respuesta = JOptionPane.showConfirmDialog(this, numero, "BORRAR CLIENTE", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, iconoBorrar);

        System.out.println(respuesta);
        if (respuesta == 0) {
            Long telefono = Long.parseLong(jtTelefono.getText());
            Menu.guiaTelefonica.borrarCliente(telefono);

            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtCiudad.setText("");
            jtDireccion.setText("");
            jtTelefono.setText("");
            jbBorrar.setEnabled(false);
            jlGato.setEnabled(false);
            jlDni.setEnabled(false);
            jlNombre.setEnabled(false);
            jlApellido.setEnabled(false);
            jlCiudad.setEnabled(false);
            jlDireccion.setEnabled(false);
            jtDni.setEnabled(false);
            jtNombre.setEnabled(false);
            jtApellido.setEnabled(false);
            jtCiudad.setEnabled(false);
            jtDireccion.setEnabled(false);
            JOptionPane.showMessageDialog(this, "ELIMINADO");
        }


    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
         jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            jtCiudad.setText("");
            jtDireccion.setText("");
            jtTelefono.setText("");
            jbBorrar.setEnabled(false);
            jlGato.setEnabled(false);
            jlDni.setEnabled(false);
            jlNombre.setEnabled(false);
            jlApellido.setEnabled(false);
            jlCiudad.setEnabled(false);
            jlDireccion.setEnabled(false);
            jtDni.setEnabled(false);
            jtNombre.setEnabled(false);
            jtApellido.setEnabled(false);
            jtCiudad.setEnabled(false);
            jtDireccion.setEnabled(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            long telefono = Long.parseLong(jtTelefono.getText());
            Cliente usuario = Menu.guiaTelefonica.buscarCliente(telefono);

            if (usuario != null) {
                jtDni.setText(usuario.getDni());
                jtNombre.setText(usuario.getNombre());
                jtApellido.setText(usuario.getApellido());
                jtCiudad.setText(usuario.getCiudad());
                jtDireccion.setText(usuario.getDireccion());
                jbBorrar.setEnabled(true);
                jlGato.setEnabled(true);
                jlDni.setEnabled(true);
                jlNombre.setEnabled(true);
                jlApellido.setEnabled(true);
                jlCiudad.setEnabled(true);
                jlDireccion.setEnabled(true);
                jtDni.setEnabled(true);
                jtNombre.setEnabled(true);
                jtApellido.setEnabled(true);
                jtCiudad.setEnabled(true);
                jtDireccion.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(this, "Telefono no Registrado");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "INGRESE UN NUMERO TELEFONICO");

        }


    }//GEN-LAST:event_jbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlCiudad;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlGato;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCiudad;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
