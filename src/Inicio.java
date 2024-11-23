
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import querys.cliente;
import querys.proveedores;

/**
 *
 * @author ascen
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComponents();

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

        querys.proveedores p = new proveedores();
        p.cargarTablaProveedores(modelo);

        DefaultTableModel modeloC = (DefaultTableModel) jTable_CLIENTES.getModel();
        querys.cliente c = new cliente();
        c.cargarTablaClientes(modeloC);

    }

    void nuevo() {
        jTextArea_direc.setText("");
        jTextField_tel.setText("");
        jTextField_email.setText("");
        jTextField_contacto.setText("");
        jTextField_nombre_emp.setText("");
        jTextField_nombre_emp.setText("");
        
        
        jTextArea_direc_cli.setText("");
        jTextField_tel_cli.setText("");
        jTextField_email_cli.setText("");
        jTextField_nombre_cli.setText("");
        jTextField_apellidos_cli.setText("");
        
        
        jTable1.clearSelection();
        jTable_CLIENTES.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_CLIENTES = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextField_nombre_cli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField_apellidos_cli = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField_tel_cli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField_email_cli = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_direc_cli = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_nombre_emp = new javax.swing.JTextField();
        jTextField_contacto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_direc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField_tel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField_email = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Campana");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(649, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Resumen", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Tiempo real", jPanel3);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", jPanel7);

        jTable_CLIENTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRES", "APELLIDOS", "TELÉFONO", "DIRECCIÓN", "EMAIL"
            }
        ));
        jTable_CLIENTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_CLIENTESMouseClicked(evt);
            }
        });
        jTable_CLIENTES.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable_CLIENTESKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_CLIENTES);

        jLabel8.setText("Nombres");

        jLabel9.setText("Apellidos");

        jTextField_apellidos_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidos_cliActionPerformed(evt);
            }
        });

        jLabel10.setText("Teléfono");

        jLabel11.setText("Email");

        jLabel12.setText("Dirección");

        jTextArea_direc_cli.setColumns(20);
        jTextArea_direc_cli.setRows(5);
        jScrollPane4.setViewportView(jTextArea_direc_cli);

        jButton5.setText("Nuevo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Agregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Clientes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(250, 250, 250)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_nombre_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_apellidos_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_tel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField_email_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jButton5)
                            .addGap(38, 38, 38)
                            .addComponent(jButton6)
                            .addGap(37, 37, 37)
                            .addComponent(jButton7)
                            .addGap(27, 27, 27)
                            .addComponent(jButton8)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(15, 15, 15)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(4, 4, 4)
                            .addComponent(jTextField_nombre_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addGap(4, 4, 4)
                            .addComponent(jTextField_apellidos_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel10)
                            .addGap(4, 4, 4)
                            .addComponent(jTextField_tel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel11)
                            .addGap(4, 4, 4)
                            .addComponent(jTextField_email_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel12)
                            .addGap(4, 4, 4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(40, 40, 40)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(jButton8))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Clientes", jPanel4);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Proovedores");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, -1));
        jPanel5.add(jTextField_nombre_emp, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, -1));
        jPanel5.add(jTextField_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 160, -1));

        jLabel3.setText("Nombre de la empresa");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 210, -1));

        jLabel4.setText("Contacto");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, -1));

        jLabel5.setText("Dirección");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 80, -1));

        jTextArea_direc.setColumns(20);
        jTextArea_direc.setRows(5);
        jScrollPane1.setViewportView(jTextArea_direc);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 230, 120));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        jButton3.setText("Nuevo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jButton4.setText("Actualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "CONTACTO", "TELÉFONO", "DIRECCIÓN", "EMAIL"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 300));

        jLabel6.setText("Teléfono");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 80, -1));
        jPanel5.add(jTextField_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 160, -1));

        jLabel7.setText("Email");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 80, -1));
        jPanel5.add(jTextField_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 160, -1));

        jTabbedPane1.addTab("Proovedores", jPanel5);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("productos", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        jMenu1.setText("Archivo");

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("Ventas");
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Clientes");
        jMenu3.add(jMenuItem3);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestionar");

        jMenu4.setText("Agregar");

        jMenuItem1.setText("Usuarios");
        jMenu4.add(jMenuItem1);

        jMenu2.add(jMenu4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed

        // Verificar si se presionó la tecla "Enter"
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {

        }

    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // Obtener la fila seleccionada
        int filaSeleccionada = jTable1.getSelectedRow();

        // Verificar que haya una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener los valores de las columnas
            String columna2 = jTable1.getValueAt(filaSeleccionada, 1).toString();
            String columna3 = jTable1.getValueAt(filaSeleccionada, 2).toString();
            String columna4 = jTable1.getValueAt(filaSeleccionada, 3).toString();
            String columna5 = jTable1.getValueAt(filaSeleccionada, 4).toString();
            String columna6 = jTable1.getValueAt(filaSeleccionada, 5).toString();

            // Mostrar los valores en los JTextFields correspondientes
            jTextField_nombre_emp.setText(columna2);
            jTextField_contacto.setText(columna3);
            jTextField_tel.setText(columna4);
            jTextArea_direc.setText(columna5);
            jTextField_email.setText(columna6);
        } else {
            // Mensaje opcional si no hay fila seleccionada
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // Crear una instancia de la clase encargada de las consultas
        querys.proveedores p = new querys.proveedores();

        // Obtener los valores de los campos de texto
        String nombreEmpresa = jTextField_nombre_emp.getText();
        String contacto = jTextField_contacto.getText();
        String telefono = jTextField_tel.getText();
        String direccion = jTextArea_direc.getText();
        String email = jTextField_email.getText();

        // Validar que todos los campos necesarios tengan datos
        if (nombreEmpresa.isEmpty() || contacto.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de agregar.");
            return;
        }

        try {
            // Llamar al método de inserción
            boolean agregado = p.agregar(nombreEmpresa, contacto, telefono, direccion, email);

            if (agregado) {
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Proveedor agregado correctamente.");
                nuevo();

                // Recargar la tabla
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); // Limpiar la tabla
                p.cargarTablaProveedores(modelo); // Método para cargar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar el proveedor. Verifique los datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al agregar el proveedor: " + e.getMessage());
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Crear una instancia de la clase encargada de las consultas
        querys.proveedores p = new querys.proveedores();

        // Obtener los valores de los campos de texto
        String nombreEmpresa = jTextField_nombre_emp.getText();
        String contacto = jTextField_contacto.getText();
        String telefono = jTextField_tel.getText();
        String direccion = jTextArea_direc.getText();
        String email = jTextField_email.getText();

        // Validar que todos los campos necesarios tengan datos
        if (nombreEmpresa.isEmpty() || contacto.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de guardar.");
            return;
        }

        try {
            // Llamar al método de actualización
            boolean actualizado = p.actualizar(nombreEmpresa, contacto, telefono, direccion, email);

            if (actualizado) {
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Proveedor actualizado correctamente.");
                nuevo();

                // Recargar la tabla
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setRowCount(0); // Limpiar la tabla
                p.cargarTablaProveedores(modelo); // Método para cargar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el proveedor. Verifique los datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el proveedor: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // Verificar si hay una fila seleccionada en la tabla
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un proveedor para eliminar.");
            return;
        }

        // Obtener el ID del proveedor de la fila seleccionada
        int idProveedor = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());

        // Confirmar la eliminación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este proveedor?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Crear instancia de la clase encargada de las consultas
                querys.proveedores p = new querys.proveedores();

                // Llamar al método de eliminación
                boolean eliminado = p.eliminar(idProveedor);

                if (eliminado) {
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Proveedor eliminado correctamente.");
                    nuevo();

                    // Recargar la tabla
                    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                    modelo.setRowCount(0); // Limpiar la tabla
                    p.cargarTablaProveedores(modelo); // Método para cargar la tabla
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el proveedor.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error al eliminar el proveedor: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable_CLIENTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_CLIENTESMouseClicked
        // Obtener la fila seleccionada
        int filaSeleccionada = jTable_CLIENTES.getSelectedRow();

        // Verificar que haya una fila seleccionada
        if (filaSeleccionada != -1) {
            // Obtener los valores de las columnas
            String columna2 = jTable_CLIENTES.getValueAt(filaSeleccionada, 1).toString();
            String columna3 = jTable_CLIENTES.getValueAt(filaSeleccionada, 2).toString();
            String columna4 = jTable_CLIENTES.getValueAt(filaSeleccionada, 3).toString();
            String columna5 = jTable_CLIENTES.getValueAt(filaSeleccionada, 4).toString();
            String columna6 = jTable_CLIENTES.getValueAt(filaSeleccionada, 5).toString();

            // Mostrar los valores en los JTextFields correspondientes
            jTextField_nombre_cli.setText(columna2);
            jTextField_apellidos_cli.setText(columna3);
            jTextField_tel_cli.setText(columna4);
            jTextArea_direc_cli.setText(columna5);
            jTextField_email_cli.setText(columna6);
        } else {
            // Mensaje opcional si no hay fila seleccionada
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        }
    }//GEN-LAST:event_jTable_CLIENTESMouseClicked

    private void jTable_CLIENTESKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable_CLIENTESKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_CLIENTESKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        nuevo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Crear una instancia de la clase encargada de las consultas
        querys.cliente p = new querys.cliente();

        // Obtener los valores de la fila seleccionada en la tabla
        int filaSeleccionada = jTable_CLIENTES.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para actualizar.");
            return;
        }

        // Obtener el ID del cliente de la fila seleccionada
        int id = Integer.parseInt(jTable_CLIENTES.getValueAt(filaSeleccionada, 0).toString());

        // Obtener los valores de los campos de texto
        String nombres = jTextField_nombre_cli.getText();
        String apellidos = jTextField_apellidos_cli.getText();
        String telefono = jTextField_tel_cli.getText();
        String direccion = jTextArea_direc_cli.getText();
        String email = jTextField_email_cli.getText();

        // Validar que todos los campos necesarios tengan datos
        if (nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de guardar.");
            return;
        }

        try {
            // Llamar al método de actualización
            boolean actualizado = p.actualizar( nombres, apellidos, telefono, direccion, email, id);

            if (actualizado) {
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente.");
                nuevo(); // Método para limpiar los campos de texto

                // Recargar la tabla
                DefaultTableModel modelo = (DefaultTableModel) jTable_CLIENTES.getModel();
                modelo.setRowCount(0); // Limpiar la tabla
                p.cargarTablaClientes(modelo); // Método para cargar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el cliente. Verifique los datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el cliente: " + e.getMessage());
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        // Crear una instancia de la clase encargada de las consultas
        querys.cliente p = new querys.cliente();

        // Obtener los valores de los campos de texto
        String nombres = jTextField_nombre_cli.getText();
        String apellidos = jTextField_apellidos_cli.getText();
        String telefono = jTextField_tel_cli.getText();
        String direccion = jTextArea_direc_cli.getText();
        String email = jTextField_email_cli.getText();

        // Validar que todos los campos necesarios tengan datos
        if (nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de agregar.");
            return;
        }

        try {
            // Llamar al método de inserción
            boolean agregado = p.agregar(nombres, apellidos, telefono, direccion, email);

            if (agregado) {
                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");
                nuevo();

                // Recargar la tabla
                DefaultTableModel modelo = (DefaultTableModel) jTable_CLIENTES.getModel();
                modelo.setRowCount(0); // Limpiar la tabla
                p.cargarTablaClientes(modelo); // Método para cargar la tabla
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo agregar al cliente. Verifique los datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Ocurrió un error al agregar al cliente: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        // Verificar si hay una fila seleccionada en la tabla
        int filaSeleccionada = jTable_CLIENTES.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente para eliminar.");
            return;
        }

        // Obtener el ID del proveedor de la fila seleccionada
        int idCliente = Integer.parseInt(jTable_CLIENTES.getValueAt(filaSeleccionada, 0).toString());

        // Confirmar la eliminación
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este clente?", "Confirmación", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                // Crear instancia de la clase encargada de las consultas
                querys.cliente p = new querys.cliente();

                // Llamar al método de eliminación
                boolean eliminado = p.eliminar(idCliente);

                if (eliminado) {
                    // Mostrar mensaje de éxito
                    JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente.");
                    nuevo();

                    // Recargar la tabla
                    DefaultTableModel modelo = (DefaultTableModel) jTable_CLIENTES.getModel();
                    modelo.setRowCount(0); // Limpiar la tabla
                    p.cargarTablaClientes(modelo); // Método para cargar la tabla
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo eliminar el cliente.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ocurrió un error al eliminar al cliente: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField_apellidos_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidos_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidos_cliActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_CLIENTES;
    private javax.swing.JTextArea jTextArea_direc;
    private javax.swing.JTextArea jTextArea_direc_cli;
    private javax.swing.JTextField jTextField_apellidos_cli;
    private javax.swing.JTextField jTextField_contacto;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_email_cli;
    private javax.swing.JTextField jTextField_nombre_cli;
    private javax.swing.JTextField jTextField_nombre_emp;
    private javax.swing.JTextField jTextField_tel;
    private javax.swing.JTextField jTextField_tel_cli;
    // End of variables declaration//GEN-END:variables
}
