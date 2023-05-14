package Vistas;

//              GRUPO 9
//INTEGRANTES : Pablo Nicolas Peñaloza
//              Alex Gustavo Astudillo Duran
//              Gabriel Ezequiel Becerra Diaz

import GuiaTelefonica_Ventanas.DirectorioVentanas;

public class Menu extends javax.swing.JFrame {

    public static DirectorioVentanas guiaTelefonica = new DirectorioVentanas();  //creamos una instancia static de directorio para poder usarla en todas las ventanas
    
    
    ViewBuscarYBorrarCLientes buscarBorrar = new ViewBuscarYBorrarCLientes();
    ViewAgregarClientes agregar = new ViewAgregarClientes();

    public Menu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jEscritorio = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jDirectorio = new javax.swing.JMenu();
        jmAgregar = new javax.swing.JMenuItem();
        jmBuscarYBorrar = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenu();
        jSalirDelSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jEscritorio.setAutoscrolls(true);
        jEscritorio.setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText(" GRUPO 9");

        jLabel4.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("INTEGRANTES : ");

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Pablo Nicolas Peñaloza");

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Practico N° 6 ");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Becerra Diaz Gabriel Ezequiel");

        jLabel7.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Alex Gustavo Astudillo Duran");

        jLabel8.setFont(new java.awt.Font("Stencil", 1, 70)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("directorio");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato LLamando.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agenda.png"))); // NOI18N
        jLabel2.setDisabledIcon(null);

        jEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(315, 315, 315))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jEscritorioLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(391, 391, 391)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        jDirectorio.setText("DIRECTORIO");

        jmAgregar.setText("Agregar Cliente");
        jmAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarActionPerformed(evt);
            }
        });
        jDirectorio.add(jmAgregar);

        jmBuscarYBorrar.setText("Buscar y Borrar Cliente");
        jmBuscarYBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarYBorrarActionPerformed(evt);
            }
        });
        jDirectorio.add(jmBuscarYBorrar);

        jMenuBar1.add(jDirectorio);

        jSalir.setText("SALIR");

        jSalirDelSistema.setText("Salir del Sistema");
        jSalirDelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirDelSistemaActionPerformed(evt);
            }
        });
        jSalir.add(jSalirDelSistema);

        jMenuBar1.add(jSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jmAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        agregar.setVisible(true);
        jEscritorio.add(agregar);
        jEscritorio.moveToFront(agregar);
        buscarBorrar.setVisible(false);
    }//GEN-LAST:event_jmAgregarActionPerformed

    private void jmBuscarYBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarYBorrarActionPerformed
        jEscritorio.removeAll();
        jEscritorio.repaint();
        buscarBorrar.setVisible(true);
        jEscritorio.add(buscarBorrar);
        jEscritorio.moveToFront(buscarBorrar);
        agregar.setVisible(false);

    }//GEN-LAST:event_jmBuscarYBorrarActionPerformed

    private void jSalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirDelSistemaActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirDelSistemaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jDirectorio;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jSalir;
    private javax.swing.JMenuItem jSalirDelSistema;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JMenuItem jmAgregar;
    private javax.swing.JMenuItem jmBuscarYBorrar;
    // End of variables declaration//GEN-END:variables
}
