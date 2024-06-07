/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.panel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.Cliente;
import sistemareserva.Main;

/**
 *
 * @author RaikerXV
 */
public class ClientesPanel extends JPanel {

    private javax.swing.JButton cliCleanBtn;
    private javax.swing.JButton cliDeleteBtn;
    private javax.swing.JLabel cliDocumentoLabel;
    private javax.swing.JTextField cliDocumentoText;
    private javax.swing.JButton cliEditButton;
    private javax.swing.JLabel cliEmailLabel;
    private javax.swing.JTextField cliEmailText;
    private javax.swing.JLabel cliNombreLabel;
    private javax.swing.JTextField cliNombreText;
    private javax.swing.JLabel cliPassLabel;
    private javax.swing.JTextField cliPassText;
    private javax.swing.JButton cliSaveBtn;
    private javax.swing.JPanel clientesForm;
    private javax.swing.JScrollPane clientesScrollPane;
    private javax.swing.JTable clientesTable;
    
    private int cliUpdateIndex = -1;

    public ClientesPanel() {
        
    }

    public void initComponents() {
        clientesScrollPane = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        clientesForm = new javax.swing.JPanel();
        cliDocumentoLabel = new javax.swing.JLabel();
        cliDocumentoText = new javax.swing.JTextField();
        cliNombreLabel = new javax.swing.JLabel();
        cliNombreText = new javax.swing.JTextField();
        cliEmailLabel = new javax.swing.JLabel();
        cliEmailText = new javax.swing.JTextField();
        cliPassLabel = new javax.swing.JLabel();
        cliPassText = new javax.swing.JTextField();
        cliSaveBtn = new javax.swing.JButton();
        cliCleanBtn = new javax.swing.JButton();
        cliEditButton = new javax.swing.JButton();
        cliDeleteBtn = new javax.swing.JButton();
        
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        clientesTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Documento", "Nombre", "Email", "Reservas"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        clientesScrollPane.setViewportView(clientesTable);

        add(clientesScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1068, 268));

        clientesForm.setLayout(new java.awt.GridLayout(7, 3, 20, 10));

        cliDocumentoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliDocumentoLabel.setText("Documento");
        clientesForm.add(cliDocumentoLabel);
        clientesForm.add(cliDocumentoText);

        cliNombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliNombreLabel.setText("Nombre");
        clientesForm.add(cliNombreLabel);
        clientesForm.add(cliNombreText);

        cliEmailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliEmailLabel.setText("Email");
        clientesForm.add(cliEmailLabel);
        clientesForm.add(cliEmailText);

        cliPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cliPassLabel.setText("Contraseña");
        clientesForm.add(cliPassLabel);
        clientesForm.add(cliPassText);

        cliSaveBtn.setText("Crear");
        cliSaveBtn.addActionListener(this::cliSaveBtnActionPerformed);
        clientesForm.add(cliSaveBtn);

        cliCleanBtn.setText("Limpiar");
        cliCleanBtn.addActionListener(this::cliCleanBtnActionPerformed);
        clientesForm.add(cliCleanBtn);

        add(clientesForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 18, 530, 246));

        cliEditButton.setText("Editar");
        cliEditButton.addActionListener(this::cliEditButtonActionPerformed);
        add(cliEditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 300, -1, -1));

        cliDeleteBtn.setText("Eliminar");
        cliDeleteBtn.addActionListener(this::cliDeleteBtnActionPerformed);
        add(cliDeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 300, -1, -1));
        
        loadClientes();
    }
    
    private void cliSaveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String documento = cliDocumentoText.getText();
        String email = cliEmailText.getText();
        String nombre = cliNombreText.getText();
        String pass = cliPassText.getText();

        if (!documento.isEmpty() && !email.isEmpty() && !nombre.isEmpty() && !pass.isEmpty()) {
            boolean existe = false;

            for (Cliente cliente : Main.clientes()) {
                if (cliente.getDocumento().equals(documento) || cliente.getEmail().equals(email)) {
                    existe = true;
                }
            }

            Cliente newCliente = new Cliente(documento, nombre, email, pass);

            if (cliSaveBtn.getText().equals("Crear")) {
                if (!existe) {
                    Main.hotel.getClientes().crear(newCliente);
                    loadClientes();
                } else {
                    JOptionPane.showMessageDialog(this, "El documento o email ya estan registrados.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Main.hotel.getClientes().actualizar(cliUpdateIndex, newCliente);
                loadClientes();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }     
    
    private void loadClientes() {

        int totalClientes = Main.clientes().size();
        String[] columnNames = {"Documento", "Nombre", "Email", "Reservas"};
        clientesTable.setModel(new DefaultTableModel(columnNames, totalClientes));

        for (int i = 0; i < totalClientes; i++) {
            Cliente cliente = Main.clientes().get(i);
            cliente.setReservas(Main.reservaciones(cliente.getDocumento()));

            clientesTable.getModel().setValueAt(cliente.getDocumento(), i, 0);
            clientesTable.getModel().setValueAt(cliente.getNombre(), i, 1);
            clientesTable.getModel().setValueAt(cliente.getEmail(), i, 2);
            clientesTable.getModel().setValueAt(cliente.getReservas().size(), i, 3);
        }

    }

    private void cliCleanBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        cliDocumentoText.setEnabled(true);
        cliDocumentoText.setText("");
        cliNombreText.setText("");
        cliEmailText.setEnabled(true);
        cliEmailText.setText("");
        cliPassText.setText("");

        cliSaveBtn.setText("Crear");
        cliUpdateIndex = -1;
        loadClientes();
    }                                           

    private void cliEditButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        cliUpdateIndex = clientesTable.getSelectedRow();
        if (cliUpdateIndex != -1) {
            Cliente cliente = Main.clientes().get(cliUpdateIndex);
            cliDocumentoText.setEnabled(false);
            cliDocumentoText.setText(cliente.getDocumento());
            cliNombreText.setText(cliente.getNombre());
            cliEmailText.setEnabled(false);
            cliPassText.setText(cliente.getPassword());

            cliSaveBtn.setText("Guardar");
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente para editar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                             

    private void cliDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int index = clientesTable.getSelectedRow();
        if (index != -1) {
            Cliente cliente = Main.clientes().get(index);

            int result = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el cliente " + cliente.getNombre() + "?",
                    "Eliminar",
                    JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                Main.hotel.getClientes().eliminar(cliente);
                loadClientes();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
