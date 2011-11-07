/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GestorPresupuesto.java
 *
 * Created on 22-sep-2011, 15:12:46
 */

package Frontera;

import Control.ControlGestionarPresupuesto;
import Entidad.ProductoProveedor;
import Entidad.Productos;
import Entidad.Sistema;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Fernando
 */
public class GestorPresupuesto extends javax.swing.JFrame {
    MiModelo modelo;
    private JTable tabla;
    private Sistema sistema;
    private JFrame frame;
    String texto;

    
   public GestorPresupuesto() {

        initComponents();
        sistema = Splash.sistema;
        modelo = new MiModelo();
        tabla = new JTable(modelo);
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        jButton3.setVisible(false);
        jButton2.setVisible(false);
        jTextField3.setVisible(false);
        try{
        for(Productos u: sistema.getProductos()){
            Vector obje = new Vector();
            obje.add(u.getNombreProducto());
            obje.add(u.getDineroDisponible());
            modelo.addRow(obje);
            //
        }
        }catch(NullPointerException ex){
        }
        jScrollPane1.setViewportView(tabla);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTerminar = new javax.swing.JButton();
        panelProductos = new javax.swing.JPanel();
        btnProductoAgregar = new javax.swing.JButton();
        btnProductoEliminar = new javax.swing.JButton();
        btnPresupuestoAsignar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEP - Presupuesto");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setText("Presupuesto");

        btnTerminar.setText("Terminar");
        btnTerminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTerminarMouseClicked(evt);
            }
        });
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        panelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));

        btnProductoAgregar.setText("Añadir producto");
        btnProductoAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoAgregarActionPerformed(evt);
            }
        });

        btnProductoEliminar.setText("Eliminar producto");
        btnProductoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoEliminarActionPerformed(evt);
            }
        });

        btnPresupuestoAsignar.setText("Guardar Cambios");
        btnPresupuestoAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresupuestoAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnPresupuestoAsignar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProductoAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductoEliminar)
                .addGap(31, 31, 31)
                .addComponent(btnPresupuestoAsignar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Presupuesto"));

        jLabel2.setText("Disponible: ");

        jLabel3.setText("Total: ");

        jButton1.setText("Modificar presupuesto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("0");

        jTextField2.setEditable(false);
        jTextField2.setText("0");

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton3))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(btnTerminar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTerminar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminarMouseClicked
    Principal regresar = new Principal(Login.roll);
    regresar.setLocationRelativeTo(null);
    regresar.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnTerminarMouseClicked

    private void btnProductoAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoAgregarActionPerformed
       Vector obj = new Vector();
        String producto = JOptionPane.showInputDialog("Producto");
        String precio = JOptionPane.showInputDialog("Precio");
        int a;
        a=Integer.parseInt(precio);
        if(a<(Integer.parseInt(jTextField2.getText())))
        {
            try {
                jTextField2.setText(Integer.parseInt(jTextField2.getText())-a +"");
                obj.addElement(producto);
                obj.addElement(a);
                modelo.addRow(obj);

            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "datos Incorrectos");
            }
        }
        else JOptionPane.showMessageDialog(null, "no hay presupuesto");
    }//GEN-LAST:event_btnProductoAgregarActionPerformed

    private void btnProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoEliminarActionPerformed
        int size=0;
        int filaBorrar = 0;
        try{
            size = modelo.getDataVector().size();
        }catch(NullPointerException ex){
            size = 0;
        }
        filaBorrar = tabla.getSelectionModel().getLeadSelectionIndex();
        if(filaBorrar == -1 && size > 0){
            filaBorrar = size - 1;
        }
        if(filaBorrar >= size){
            modelo.removeRow(filaBorrar);
        }
        else if( JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(frame, "Esta seguro que desea\n eliminar este producto?", "Confirmacion" ,JOptionPane.YES_NO_OPTION)){
            modelo.removeRow(filaBorrar);
        }
    }//GEN-LAST:event_btnProductoEliminarActionPerformed

    private void btnPresupuestoAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresupuestoAsignarActionPerformed
        if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(frame, "Desea guardar los cambios?", "Guardar", JOptionPane.YES_NO_OPTION)){
            ControlGestionarPresupuesto control = new ControlGestionarPresupuesto();
            control.modificarProductos(modelo.getDataVector());
        }
    }//GEN-LAST:event_btnPresupuestoAsignarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton2.setVisible(true);
          jButton3.setVisible(true);
          jTextField3.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          jButton2.setVisible(false);
          jButton3.setVisible(false);
          jTextField3.setVisible(false);// TODO add your handling code here:
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(!jTextField3.getText().equals("")){
            int a;
            try {
                texto = jTextField3.getText();
                a=Integer.parseInt(texto);
                jTextField1.setText(Integer.toString(a));
                jTextField2.setText(a+"");
                jButton3.setVisible(false);
                jButton2.setVisible(false);
                jTextField3.setVisible(false);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "datos Incorrectos");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPresupuestoAsignar;
    private javax.swing.JButton btnProductoAgregar;
    private javax.swing.JButton btnProductoEliminar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panelProductos;
    // End of variables declaration//GEN-END:variables
    private List<ProductoProveedor> listaLocal;
}
