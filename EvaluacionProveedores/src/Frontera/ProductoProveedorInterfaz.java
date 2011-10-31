/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProductoProveedor.java
 *
 * Created on 30-oct-2011, 21:43:53
 */

package Frontera;

import Entidad.ProductoProveedor;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Camilo
 */
public class ProductoProveedorInterfaz extends javax.swing.JFrame {

    /** Creates new form ProductoProveedor */
    public ProductoProveedorInterfaz(){
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modelo = new DefaultTableModel();
        tabla = new JTable(modelo);
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        jScrollPane1.setViewportView(tabla);
    }
    public ProductoProveedorInterfaz(List<ProductoProveedor> productos) {
        initComponents();
        listaLocal = productos;
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        modelo = new DefaultTableModel();
        tabla = new JTable(modelo);
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");

        for(ProductoProveedor u: productos){
            Vector obj = new Vector();
            obj.add(u.getNombreProducto());
            obj.add(u.getPrecio());
            modelo.addRow(obj);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BtnAñadir = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnAñadir.setText("Añadir");
        BtnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAñadirActionPerformed(evt);
            }
        });

        BtnBorrar.setText("Borrar Fila");
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar Cambios");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(BtnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(BtnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BtnAñadir)
                .addGap(18, 18, 18)
                .addComponent(BtnBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAñadirActionPerformed
        Vector obj= new Vector();
        modelo.addRow(obj);
    }//GEN-LAST:event_BtnAñadirActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        if(tabla.getSelectionModel().getLeadSelectionIndex() >= listaLocal.size()){
            modelo.removeRow(tabla.getSelectionModel().getLeadSelectionIndex());
        }
        else if( JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(frame, "Esta seguro que desea\n eliminar este producto?", "Confirmacion" ,JOptionPane.YES_NO_OPTION)){
            modelo.removeRow(tabla.getSelectionModel().getLeadSelectionIndex());
        }
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        Vector lista = new Vector();
        lista = modelo.getDataVector();
        Splash.listaProductos = lista;
    }//GEN-LAST:event_BtnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAñadir;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private JTable tabla;
    private DefaultTableModel modelo;
    private List<ProductoProveedor> listaLocal;
    private JFrame frame;
}
