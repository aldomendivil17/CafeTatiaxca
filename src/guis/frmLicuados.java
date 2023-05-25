/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guis;

import Controlador.CtrlProductos;
import Dominio.Producto;
import Dominio.ProductoCarrito;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.Border;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class frmLicuados extends javax.swing.JFrame {
    
    private List<ProductoCarrito> productosCarrito;
    private ProductoCarrito productoCarrito;
    private frmProductos frmProductos;
    
    /**
     * Creates new form frmProductos
     */
    public frmLicuados(List<ProductoCarrito> productosCarrito, ProductoCarrito productoCarrito, frmProductos frmProductos) {
        initComponents();
        this.frmProductos = frmProductos;
        //imagen origen
        Image img = new ImageIcon(getClass().getResource("/imagenes/logo tatiaxca.png")).getImage();
        //escala imagen
        Image newimg = img.getScaledInstance(84, 79, java.awt.Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newimg);
        //asigna a componenente JLabel
        lblLogo.setIcon(imageIcon);
        this.productosCarrito = productosCarrito;
        this.productoCarrito = productoCarrito;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        lblLicuados = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnFresa = new javax.swing.JButton();
        btnPlatano = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Licuados");
        setBackground(new java.awt.Color(255, 102, 102));
        setForeground(new java.awt.Color(51, 51, 255));

        pnlHeader.setBackground(new java.awt.Color(222, 202, 184));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(18, 93, 54));
        jLabel1.setText("Café Tatiaxca");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));

        lblLicuados.setFont(new java.awt.Font("Segoe UI Emoji", 0, 70)); // NOI18N
        lblLicuados.setForeground(new java.awt.Color(91, 91, 91));
        lblLicuados.setText("Licuados");

        btnVolver.setBackground(new java.awt.Color(91, 91, 91));
        btnVolver.setFont(new java.awt.Font("Segoe UI Emoji", 1, 15)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("volver");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnFresa.setBackground(new java.awt.Color(193, 232, 213));
        btnFresa.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        btnFresa.setForeground(new java.awt.Color(91, 91, 91));
        btnFresa.setText("Fresa");
        btnFresa.setBorder(null);
        btnFresa.setBorderPainted(false);
        btnFresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFresaActionPerformed(evt);
            }
        });

        btnPlatano.setBackground(new java.awt.Color(193, 232, 213));
        btnPlatano.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        btnPlatano.setForeground(new java.awt.Color(91, 91, 91));
        btnPlatano.setText("Plátano");
        btnPlatano.setBorder(null);
        btnPlatano.setBorderPainted(false);
        btnPlatano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLicuados, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlBodyLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnPlatano, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(241, Short.MAX_VALUE))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblLicuados)
                .addGap(132, 132, 132)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFresa, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlatano, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        frmProductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFresaActionPerformed
        // TODO add your handling code here:
        this.productoCarrito.setSabor("Fresa");
        this.productoCarrito.setTamaño("");
        
        continuar();
    }//GEN-LAST:event_btnFresaActionPerformed

    private void btnPlatanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatanoActionPerformed
        // TODO add your handling code here:
        this.productoCarrito.setSabor("Platano");
        this.productoCarrito.setTamaño("");
        
        continuar();
    }//GEN-LAST:event_btnPlatanoActionPerformed
    
    private void continuar() {
        Producto producto = CtrlProductos.getInstance().consultarPorNombre(productoCarrito.getNombre());
        this.productoCarrito.setPrecio(producto.getPrecioVenta());
        this.productoCarrito.setCantidad(1);
        this.productoCarrito.setUnidadMedida("");
        this.productosCarrito.add(this.productoCarrito);
        new frmCarrito(this.productosCarrito).setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFresa;
    private javax.swing.JButton btnPlatano;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLicuados;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}