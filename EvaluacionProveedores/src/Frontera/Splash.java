/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Splash.java
 *
 * Created on 17-sep-2011, 10:19:04
 */

package Frontera;

import Entidad.Evaluaciones;
import Entidad.ProductoProveedor;
import Entidad.Proveedores;
import Entidad.Sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.UIManager;

/**
 *
 * @author Fernando
 */
public class Splash extends javax.swing.JFrame {
    public static Sistema sistema = new Sistema();

    /** Creates new form Splash */
    public Splash() {
        initComponents();
        inicializacion();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEP");
        setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 3, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE EVALUACION A PROVEEDORES");

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        jLabel2.setText("Bienvenido");

        jButton1.setText("Ingresar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel2)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Login nuevologin = new Login();
        nuevologin.setLocationRelativeTo(null);
        nuevologin.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void inicializacion() {
        Proveedores proveedor = new Proveedores();
        listaproductos = null;
        List<ProductoProveedor> listaProductos = new ArrayList<ProductoProveedor>();
        ProductoProveedor productoa = new ProductoProveedor();
        ProductoProveedor productob = new ProductoProveedor();
        Evaluaciones evaluacion = new Evaluaciones();

        proveedor.setNombre("Mercados La Primera");
        evaluacion.setCalidad((float)78);
        evaluacion.setAdaptabilidad("Buena");
        evaluacion.setCercania("buena");
        evaluacion.setComentarios(null);
        proveedor.setNit(1);
        evaluacion.setFiabilidad((float)98);
        evaluacion.setAnio(2011);
        evaluacion.setMes(11);
        evaluacion.setDia(3);
        evaluacion.setHora(12);
        evaluacion.setMin(22);
        proveedor.getEvaluaciones().add(evaluacion);
        proveedor.setCorreo("laprimera@colombia.com");
        proveedor.setDireccion("Cra 6 # 65 - 18");
        proveedor.setRepresentante("Henry Murillo");

        productoa.setNombreProducto("Marcadores");
        productoa.setPrecio(2500);
        productob.setNombreProducto("Borradores");
        productob.setPrecio(3000);

        listaProductos.add(productoa);
        listaProductos.add(productob);

        proveedor.setProductos(listaProductos);

        Proveedores proveedor2 = new Proveedores();
        Evaluaciones evaluacion2 = new Evaluaciones();

        proveedor2.setNombre("Mercados La Segunda");
        evaluacion2.setCalidad((float)87);
        evaluacion2.setAdaptabilidad("Buena");
        evaluacion2.setCercania("buena");
        evaluacion2.setComentarios(null);
        proveedor2.setNit(2);
        evaluacion2.setFiabilidad((float)96);
        evaluacion2.setAnio(2011);
        evaluacion2.setMes(10);
        evaluacion2.setDia(28);
        evaluacion2.setHora(10);
        evaluacion2.setMin(35);
        proveedor2.getEvaluaciones().add(evaluacion2);
        proveedor2.setCorreo("lasegunda@colombia.com");
        proveedor2.setDireccion("Cra 7 # 40 - 29");
        proveedor2.setRepresentante("Andres Malzahar");

        ProductoProveedor productoc = new ProductoProveedor();
        ProductoProveedor productod = new ProductoProveedor();
        List<ProductoProveedor> listaProductos2 = new ArrayList<ProductoProveedor>();

        productoc.setNombreProducto("Tableros");
        productoc.setPrecio(120000);
        productod.setNombreProducto("Pupitres");
        productod.setPrecio(110000);

        listaProductos2.add(productoc);
        listaProductos2.add(productod);

        proveedor2.setProductos(listaProductos2);

        List<Proveedores> listaProveedor = new ArrayList<Proveedores>();
        listaProveedor.add(proveedor);
        listaProveedor.add(proveedor2);

        sistema.setProveedores(listaProveedor);
        sistema.setProductosProveedor(listaProductos);
    }


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceMistAquaLookAndFeel");
                }catch (Exception e){
                    e.printStackTrace();
                }
                Splash proyecto = new Splash();
                proyecto.setLocationRelativeTo(null);
                proyecto.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    public static Vector listaproductos;
}
