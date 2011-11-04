/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 17-sep-2011, 9:36:05
 */

package Frontera;

/**
 *
 * @author Fernando
 */
public class Principal extends javax.swing.JFrame {

    /** Creates new form Principal */
    public Principal(String permiso) {
        initComponents();
        if(permiso.equals("Rector")){
            btnGenerar.setEnabled(false);
            btnGestor.setEnabled(false);
        }
        if(permiso.equals("Auxiliar")){
            btnEvaluar.setEnabled(false);
            btnGestor.setEnabled(false);
            btnAdministrar.setEnabled(false);
            btnContratar.setEnabled(false);
        }
        if(permiso.equals("Concejo")){
            btnEvaluar.setEnabled(false);
            btnGenerar.setEnabled(false);
            btnAdministrar.setEnabled(false);
            btnContratar.setEnabled(false);
        }
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnContratar = new javax.swing.JButton();
        btnAdministrar = new javax.swing.JButton();
        btnEvaluar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnGestor = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEP");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de evaluacion a proveedores");

        btnContratar.setText("Contratar Proveedor");
        btnContratar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContratarMouseClicked(evt);
            }
        });

        btnAdministrar.setText("Administrar Proveedor");
        btnAdministrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrarMouseClicked(evt);
            }
        });

        btnEvaluar.setText("Evaluar Proveedor");
        btnEvaluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEvaluarMouseClicked(evt);
            }
        });

        btnGenerar.setText("Generar Reporte");
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });

        btnGestor.setText("Gestor de Presupuesto");
        btnGestor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGestorMouseClicked(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdministrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnContratar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnEvaluar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnGenerar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(btnGestor, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jButton6)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnContratar)
                .addGap(38, 38, 38)
                .addComponent(btnAdministrar)
                .addGap(34, 34, 34)
                .addComponent(btnEvaluar)
                .addGap(36, 36, 36)
                .addComponent(btnGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnGestor)
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnEvaluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEvaluarMouseClicked
    if (btnEvaluar.isEnabled()==true){
        EvaluarProveedor nuevaevaluacion = new EvaluarProveedor();
        nuevaevaluacion.setLocationRelativeTo(null);
        nuevaevaluacion.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnEvaluarMouseClicked

    private void btnAdministrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarMouseClicked
    if (btnAdministrar.isEnabled()==true){
        AdministrarProveedor administrar = new AdministrarProveedor();
        administrar.setLocationRelativeTo(null);
        administrar.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnAdministrarMouseClicked

    private void btnContratarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContratarMouseClicked
    if (btnContratar.isEnabled()==true){
        ContratarProveedor nuevocontrato = new ContratarProveedor();
        nuevocontrato.setLocationRelativeTo(null);
        nuevocontrato.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnContratarMouseClicked

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
    if (btnGenerar.isEnabled()==true){
        GenerarReporte reporte = new GenerarReporte();
        reporte.setLocationRelativeTo(null);
        reporte.setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnGenerarMouseClicked

    private void btnGestorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestorMouseClicked
    if (btnGestor.isEnabled()==true){
        GestorPresupuesto gestor = new GestorPresupuesto();
        gestor.setLocationRelativeTo(null);
        gestor.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_btnGestorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrar;
    private javax.swing.JButton btnContratar;
    private javax.swing.JButton btnEvaluar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGestor;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
