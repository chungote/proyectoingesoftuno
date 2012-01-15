package Frontera;

import Control.ControlGestionarPresupuesto;
import DAO.PresupuestoDisponibleJpaController;
import DAO.ProductosJpaController;
import Entidad.PresupuestoDisponible;
import Entidad.Productos;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.persistence.EntityManager;

public class GestorPresupuesto extends javax.swing.JFrame {
    EntityManager em;
    MiModelo modelo;
    private JTable tabla;
    private JFrame frame;
    String texto;
    PresupuestoDisponibleJpaController jpaPresupuesto = new PresupuestoDisponibleJpaController();
    PresupuestoDisponible presupuesto = new PresupuestoDisponible();
    ProductosJpaController jpaProductos = new ProductosJpaController();
    Productos productos = new Productos();

    public GestorPresupuesto() {
        em = Splash.em;
        initComponents();
        modelo = new MiModelo();
        tabla = new JTable(modelo);
        Vector titulos = new Vector();
        titulos.add("Producto");
        titulos.add("Precio");
        PanelMP.setVisible(false);
        presupuesto = jpaPresupuesto.getPresupuestoDisponible(em);
        if(presupuesto != null){
            TTotal.setText(String.valueOf(presupuesto.getPresupuesto()));
            TDisponible.setText(String.valueOf(presupuesto.getPresupuestoDisponible()));
        }
        else{
            TTotal.setText(String.valueOf(new Float(0)));
            TDisponible.setText(String.valueOf(0));
            try{
                Float a = new Float(0);
                for(Productos u:  jpaProductos.getProductos(em)){
                    Vector obje = new Vector();
                    obje.add(u.getNombreProducto());
                    obje.add(u.getDineroDisponible());
                    modelo.setColumnIdentifiers(titulos);
                    modelo.addRow(obje);
                    a = a- u.getDineroDisponible();
                }
                TDisponible.setText(String.valueOf(a));
            }catch(NullPointerException ex){
                modelo.setColumnIdentifiers(titulos);
            }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        Jdisponible = new javax.swing.JLabel();
        JTotal = new javax.swing.JLabel();
        ModificarPresupuesto = new javax.swing.JButton();
        TTotal = new javax.swing.JTextField();
        TDisponible = new javax.swing.JTextField();
        PanelMP = new javax.swing.JPanel();
        TNuevoPresupuesto = new javax.swing.JTextField();
        PresupuestoAñadir = new javax.swing.JButton();
        PresupuestoQuitar = new javax.swing.JButton();
        ModificarCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SEP - Presupuesto");
        setResizable(false);

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

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProductoEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductoAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnProductoAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductoEliminar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Presupuesto"));

        Jdisponible.setText("Disponible: ");

        JTotal.setText("Total: ");

        ModificarPresupuesto.setText("Modificar presupuesto");
        ModificarPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarPresupuestoActionPerformed(evt);
            }
        });

        TTotal.setEditable(false);
        TTotal.setText("0");

        TDisponible.setEditable(false);
        TDisponible.setText("0");

        PresupuestoAñadir.setText("Añadir");
        PresupuestoAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresupuestoAñadirActionPerformed(evt);
            }
        });

        PresupuestoQuitar.setText("Quitar");
        PresupuestoQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresupuestoQuitarActionPerformed(evt);
            }
        });

        ModificarCancelar.setText("Cancelar");
        ModificarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMPLayout = new javax.swing.GroupLayout(PanelMP);
        PanelMP.setLayout(PanelMPLayout);
        PanelMPLayout.setHorizontalGroup(
            PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMPLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(TNuevoPresupuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(PanelMPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PresupuestoAñadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(PresupuestoQuitar)
                .addContainerGap())
            .addGroup(PanelMPLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ModificarCancelar)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        PanelMPLayout.setVerticalGroup(
            PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TNuevoPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PresupuestoAñadir)
                    .addComponent(PresupuestoQuitar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ModificarCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Jdisponible)
                            .addComponent(JTotal))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TDisponible, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(TTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ModificarPresupuesto)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTotal)
                    .addComponent(TTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jdisponible)
                    .addComponent(TDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ModificarPresupuesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTerminar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTerminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap())
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
        Productos producto1 = new Productos();
        ControlGestionarPresupuesto verificar = new ControlGestionarPresupuesto();
        String producto = JOptionPane.showInputDialog("Producto");
        String precio = JOptionPane.showInputDialog("Precio");
        float a, b = 0;
        b=Float.parseFloat(precio);
        if(b<=(Float.parseFloat(TDisponible.getText())))
        {
           try {
                a=Float.parseFloat(precio);
                TDisponible.setText(Float.parseFloat(TDisponible.getText())-a +"");
                producto = verificar.estandarizarNombre(producto);
                if(validarNombre(producto)){
                    obj.addElement(producto);
                    obj.addElement(a);
                    producto1.setNombreProducto((String) obj.get(0));
                    producto1.setDineroDisponible( (Float)obj.get(1));
             
                    String resultado = verificar.verificarProducto(producto1);
                    if(resultado.equals("Correcto")){
                        obj.addElement(producto1.getNombreProducto());
                        obj.addElement(producto1.getDineroDisponible());
                        modelo.addRow(obj);
                        if(jpaProductos.getProductos(em) == null){
                            productos.setNombreProducto(producto);
                            jpaProductos.create(productos, em);
                        }else{
                            jpaProductos.create(producto1, em);
                        }
                    }
                }
           }catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "datos Incorrectos");
            }
        }
        else JOptionPane.showMessageDialog(null, "no hay presupuesto");
    }//GEN-LAST:event_btnProductoAgregarActionPerformed

    private void btnProductoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoEliminarActionPerformed
        int size=0;
        float b;
        String a;
        Vector obj = new Vector();
        int filaBorrar = 0;
        try{
            size = modelo.getDataVector().size();
            TDisponible.setText(Float.parseFloat(TDisponible.getText()) +"");
        }catch(NullPointerException ex){
            size = 0;
        }
        filaBorrar = tabla.getSelectionModel().getLeadSelectionIndex();
        if(filaBorrar == -1 && size > 0){
            filaBorrar = size - 1;
        }
        if(filaBorrar > -1){
            if(filaBorrar >= size){
                modelo.removeRow(filaBorrar);
                jpaProductos.delete(jpaProductos.getProductos(em).get(filaBorrar), em);
            }
            else if( JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(frame, "Esta seguro que desea\n eliminar este producto?", "Confirmacion" ,JOptionPane.YES_NO_OPTION)){
                obj= modelo.getDataVector();
                obj=(Vector) obj.elementAt(filaBorrar);
                a=(obj.elementAt(1)+"");
                b=Float.parseFloat(a);
                TDisponible.setText(Float.parseFloat(TDisponible.getText())+b+"");
                modelo.removeRow(filaBorrar);
                jpaProductos.delete(jpaProductos.getProductos(em).get(filaBorrar), em);
            }
        }
    }//GEN-LAST:event_btnProductoEliminarActionPerformed

    private void ModificarPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarPresupuestoActionPerformed
        PanelMP.setVisible(true);                   // TODO add your handling code here:
    }//GEN-LAST:event_ModificarPresupuestoActionPerformed

    private void ModificarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarCancelarActionPerformed
        PanelMP.setVisible(false);
          
    }//GEN-LAST:event_ModificarCancelarActionPerformed

    private void PresupuestoAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresupuestoAñadirActionPerformed
       if(!TNuevoPresupuesto.getText().equals("")){
            try {
                texto = TNuevoPresupuesto.getText();
                if(Float.parseFloat(texto) > 0){
                    presupuesto.setPresupuesto(presupuesto.getPresupuesto() + Float.parseFloat(texto));
                    TTotal.setText(String.valueOf(presupuesto.getPresupuesto()));
                    presupuesto.setPresupuestoDisponible(presupuesto.getPresupuestoDisponible() + Float.parseFloat(texto));
                    TDisponible.setText(String.valueOf(TDisponible.getText()));
                    
                    PanelMP.setVisible(false);
                    TNuevoPresupuesto.setText("");

                    jpaPresupuesto.update(presupuesto, em);
                }
                else
                    JOptionPane.showMessageDialog(null, "Presupuesto invalido");
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "datos Incorrectos");
            }
        }
    }//GEN-LAST:event_PresupuestoAñadirActionPerformed

    private void PresupuestoQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresupuestoQuitarActionPerformed
        if(!TNuevoPresupuesto.getText().equals("")){
            try {
                texto = TNuevoPresupuesto.getText();
                if(Float.parseFloat(texto)>0){
                if(Float.parseFloat(texto)<=presupuesto.getPresupuesto()){
                    presupuesto.setPresupuesto(presupuesto.getPresupuesto() - Float.parseFloat(texto));
                    TTotal.setText(String.valueOf(presupuesto.getPresupuesto()));
                    presupuesto.setPresupuestoDisponible(presupuesto.getPresupuestoDisponible() - Float.parseFloat(texto));
                    TDisponible.setText(String.valueOf(TDisponible.getText()));

                    PanelMP.setVisible(false);
                    TNuevoPresupuesto.setText("");
                    
                    jpaPresupuesto.update(presupuesto, em);
                }
                else
                    JOptionPane.showMessageDialog(null, "Presupuesto Incorrecto");
                }
                else
                    JOptionPane.showMessageDialog(null, "Presupuesto Incorrecto");
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "datos Incorrectos");
            }
        }
    }//GEN-LAST:event_PresupuestoQuitarActionPerformed

    private boolean validarNombre(String nombre){
        Vector nombres = modelo.getDataVector();
        for (int i=0; i< nombres.size(); i=i+2){
            if(((Vector)nombres.elementAt(i)).get(0).equals(nombre)){
                return false;
            }
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JTotal;
    private javax.swing.JLabel Jdisponible;
    private javax.swing.JButton ModificarCancelar;
    private javax.swing.JButton ModificarPresupuesto;
    private javax.swing.JPanel PanelMP;
    private javax.swing.JButton PresupuestoAñadir;
    private javax.swing.JButton PresupuestoQuitar;
    private javax.swing.JTextField TDisponible;
    private javax.swing.JTextField TNuevoPresupuesto;
    private javax.swing.JTextField TTotal;
    private javax.swing.JButton btnProductoAgregar;
    private javax.swing.JButton btnProductoEliminar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelProductos;
    // End of variables declaration//GEN-END:variables
}