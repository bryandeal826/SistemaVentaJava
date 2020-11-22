/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteDAO;
import modelo.ProductoDAO;
import modelo.VentasDAO;
import modelo.Cliente;
import modelo.DetalleVentas;
import modelo.Producto;
import modelo.Ventas;
import vistas.Principal;

public class VentasForm extends javax.swing.JInternalFrame {

    VentasDAO vdao = new VentasDAO();
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();

    Cliente cliente = new Cliente();

    DefaultTableModel modelo = new DefaultTableModel();
    int idp = 0;
    int cant;
    Double pre;
    String nomp;
    double tpagar;

    public VentasForm() {
        initComponents();
        generarSerie();
        fecha();
        txtMostrarVende.setText("Alejandro Bryan Delgado ALiaga");
    }

    void fecha() {
        Calendar calendar = new GregorianCalendar();
        txtFecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));

    }

    void generarSerie() {
        String serie = vdao.NroSerieVentas();
        int increment;
        if (serie == null) {
            txtSerie.setText("0000001");
        } else {
            increment = Integer.parseInt(serie);
            increment = increment + 1;
            if (increment < 10) {
                txtSerie.setText("000000" + increment);
            } else {
                if ((increment >= 10) && (increment <= 99)) {
                    txtSerie.setText("00000" + increment);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMostrarCLie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodProdu = new javax.swing.JTextField();
        btnBuscarProdu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtMostrarPro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodPrecio = new javax.swing.JTextField();
        btnAgregarPre = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtMostrarStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMostrarVende = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Sistema de Ventas");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("COD. CLIENTE : ");

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btnBuscarCliente.setText("BUSCAR");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("CLIENTE: ");

        txtMostrarCLie.setEditable(false);

        jLabel8.setText("COD. PRODU : ");

        btnBuscarProdu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar.png"))); // NOI18N
        btnBuscarProdu.setText("BUSCAR");
        btnBuscarProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProduActionPerformed(evt);
            }
        });

        jLabel9.setText("PRODUC: ");

        txtMostrarPro.setEditable(false);

        jLabel10.setText("PRECIO : ");

        btnAgregarPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnAgregarPre.setText("AGREGAR");
        btnAgregarPre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPreActionPerformed(evt);
            }
        });

        jLabel11.setText("STOCK : ");

        txtMostrarStock.setEditable(false);

        jLabel12.setText("CANTIDAD : ");

        txtMostrarVende.setEditable(false);

        jLabel13.setText("VENDE : ");

        txtFecha.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(12, 12, 12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGap(30, 30, 30)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCodCliente)
                    .addComponent(txtCodProdu)
                    .addComponent(txtCodPrecio)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregarPre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarProdu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMostrarCLie))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMostrarPro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMostrarStock)
                            .addComponent(txtMostrarVende))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente)
                    .addComponent(jLabel7)
                    .addComponent(txtMostrarCLie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodProdu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProdu)
                    .addComponent(jLabel9)
                    .addComponent(txtMostrarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtCodPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregarPre))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtMostrarStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(txtMostrarVende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NRO", "COD", "PRODUCTO", "CANTIDAD", "PRE UNI", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(tablaDetalle);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jLabel14.setText("TOTAL A PAGAR : ");

        btnGenerar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/calcular.png"))); // NOI18N
        btnGenerar.setText("GENERAR VENTA");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(28, 28, 28)
                .addComponent(btnGenerar)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("PUNTO DE VENTA \"ALEJANDRO\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Venta de Productos Tecnologicos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tel: 912-345-678");

        jLabel4.setText("NRO SERIE:");

        txtSerie.setEditable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/tlogo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15))
                                    .addComponent(jLabel2)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnBuscarProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProduActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarProduActionPerformed

    private void btnAgregarPreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPreActionPerformed
        agregarProducto();
    }//GEN-LAST:event_btnAgregarPreActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (txtTotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Datoa");
        } else {
            guardarVenta();
            guardarDetalle();
            actulizarStock();
            JOptionPane.showMessageDialog(this, "Se realizo con Exito");
            nuevo();
            generarSerie();
        }

    }//GEN-LAST:event_btnGenerarActionPerformed
    
    void nuevo(){
        limpiarTabla();
        txtCodCliente.setText("");
        txtMostrarCLie.setText("");
        txtCantidad.setValue(1);
        txtCodProdu.setText("");
        txtCodPrecio.setText("");
        txtMostrarPro.setText("");
        txtMostrarStock.setText("");
        txtTotal.setText("");
        txtCodCliente.requestFocus();
    }
    
    void limpiarTabla(){
        for(int i=0 ; i<modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void actulizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            Producto pr = new Producto();
            idp = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pr = pdao.listarID(idp);
            int sa = pr.getStock() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }

    void guardarVenta() {
        int idv = 1;
        int idc = cliente.getId();
        String serie = txtSerie.getText();
        String fecha = txtFecha.getText();
        double monto = tpagar;
        String estado = "1";

        v.setIdCliente(idc);
        v.setIdVendedor(idv);
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        v.setEstado(estado);
        vdao.GuardarVentas(v);
    }

    void guardarDetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            int idp = Integer.parseInt(tablaDetalle.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idp);
            dv.setCantidad(cant);
            dv.setPreVenta(pre);
            vdao.GuardarDetalleVentas(dv);
        }
    }

    void agregarProducto() {
        double total = 0.0;
        int item = 0;
        modelo = (DefaultTableModel) tablaDetalle.getModel();
        item = item + 1;
        idp = p.getId();
        nomp = txtMostrarPro.getText();
        pre = Double.parseDouble(txtCodPrecio.getText());
        cant = Integer.parseInt(txtCantidad.getValue().toString());
        int stock = Integer.parseInt(txtMostrarStock.getText());
        total = cant * pre;
        ArrayList lista = new ArrayList();
        if (stock > 0) {
            if (cant > 0) {
                lista.add(item);
                lista.add(idp);
                lista.add(nomp);
                lista.add(cant);
                lista.add(pre);
                lista.add(total);
                Object[] ob = new Object[6];
                ob[0] = lista.get(0);
                ob[1] = lista.get(1);
                ob[2] = lista.get(2);
                ob[3] = lista.get(3);
                ob[4] = lista.get(4);
                ob[5] = lista.get(5);
                modelo.addRow(ob);
                tablaDetalle.setModel(modelo);
                calcularTotal();

            } else {
                JOptionPane.showMessageDialog(this, "Cantidad tiene que ser mayor que 0");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Stock Producto no Disponible");
        }
    }

    void calcularTotal() {
        tpagar = 0.0;
        for (int i = 0; i < tablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(tablaDetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(tablaDetalle.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant * pre);
        }
        txtTotal.setText("" + tpagar + "0");
    }

    void buscarProducto() {
        int id = Integer.parseInt(txtCodProdu.getText());
        if (txtCodProdu.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar cod Producto");

        } else {
            p = pdao.listarID(id);
            if (p.getId() != 0) {
                txtMostrarPro.setText(p.getNom());
                txtCodPrecio.setText("" + p.getPre());
                txtMostrarStock.setText("" + p.getStock());
            } else {
                JOptionPane.showMessageDialog(this, "Producto no registrado");
                txtCodProdu.requestFocus();
            }

        }
    }

    void buscarCliente() {
        int r = 0;
        String cod = txtCodCliente.getText();
        if (txtCodCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar cod Cliente");
        } else {
            cliente = cdao.listarID(cod);
            if (cliente.getDni() != null) {
                txtMostrarCLie.setText(cliente.getNom());
                txtCodProdu.requestFocus();
            } else {
                JOptionPane.showConfirmDialog(this, "Cliente No Registrado, Desea Registrar?");
                if (r == 0) {
                    ClienteForm cf = new ClienteForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPre;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProdu;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodPrecio;
    private javax.swing.JTextField txtCodProdu;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtMostrarCLie;
    private javax.swing.JTextField txtMostrarPro;
    private javax.swing.JTextField txtMostrarStock;
    private javax.swing.JTextField txtMostrarVende;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
