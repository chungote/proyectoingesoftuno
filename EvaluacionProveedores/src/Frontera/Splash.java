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
    public static Sistema listaProveedores = new Sistema();

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
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEP");
        setForeground(java.awt.Color.white);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("SISTEMA DE EVALUACION A PROVEEDORES");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel2)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        proveedor.setNombre("Mercados La Primera");
        proveedor.setCalidad((float)78);
        proveedor.setAdaptabilidad("Buena");
        proveedor.setCercania("buena");
        proveedor.setComentarios(null);
        proveedor.setNit(1);
        proveedor.setFiabilidad((float)98);
        proveedor.setCorreo("laprimera@colombia.com");
        proveedor.setDireccion("Cra 6 # 65 - 18");
        proveedor.setRepresentante("Henry Murillo");

        productoa.setNombreProducto("Marcadores");
        productoa.setPrecio((float)2500);
        productob.setNombreProducto("Borradores");
        productob.setPrecio((float)3000);

        listaProductos.add(productoa);
        listaProductos.add(productob);

        proveedor.setProductos(listaProductos);

        Proveedores proveedor2 = new Proveedores();

        proveedor2.setNombre("Mercados La Segunda");
        proveedor2.setCalidad((float)87);
        proveedor2.setAdaptabilidad("Buena");
        proveedor2.setCercania("buena");
        proveedor2.setComentarios(null);
        proveedor2.setNit(2);
        proveedor2.setFiabilidad((float)96);
        proveedor2.setCorreo("lasegunda@colombia.com");
        proveedor2.setDireccion("Cra 7 # 40 - 29");
        proveedor2.setRepresentante("Andres Malzahar");
        
        proveedor2.setProductos(listaProductos);

        List<Proveedores> listaProveedor = new ArrayList<Proveedores>();
        listaProveedor.add(proveedor);
        listaProveedor.add(proveedor2);
        
        listaProveedores.setProveedores(listaProveedor);
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public static Vector listaproductos;
}
