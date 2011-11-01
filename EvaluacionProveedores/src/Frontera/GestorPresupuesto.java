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
    private MiModelo modelo;
    private JTable tabla;
    private Sistema sistema;
    private JFrame frame;
    /** Creates new form GestorPresupuesto */
    public GestorPresupuesto() {
        initComponents();
        sistema = Splash.sistema;
        modelo = new MiModelo();
        tabla = new JTable(modelo);
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        try{
        for(Productos u: sistema.getProductos()){
            Vector obj = new Vector();
            obj.add(u.getNombreProducto());
            obj.add(u.getDineroDisponible());
            modelo.addRow(obj);
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
                    .addComponent(btnProductoAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnProductoAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductoEliminar)
                .addGap(31, 31, 31)
                .addComponent(btnPresupuestoAsignar)
                .addContainerGap(29, Short.MAX_VALUE))
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
                        .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        obj.add("");
        obj.add(new Float(0));
        modelo.addRow(obj);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPresupuestoAsignar;
    private javax.swing.JButton btnProductoAgregar;
    private javax.swing.JButton btnProductoEliminar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelProductos;
    // End of variables declaration//GEN-END:variables
    private List<ProductoProveedor> listaLocal;
}
