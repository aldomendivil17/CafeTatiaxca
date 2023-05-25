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
public class frmTizana extends javax.swing.JFrame {
    
    private List<ProductoCarrito> productosCarrito;
    private ProductoCarrito productoCarrito;
    private frmProductos frmProductos;
    
    /**
     * Creates new form frmProductos
     */
    public frmTizana(List<ProductoCarrito> productosCarrito, ProductoCarrito productoCarrito,frmProductos frmProductos) {
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
        lblTizana = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnFrutasTropicales = new javax.swing.JButton();
        btnExplosionManzana = new javax.swing.JButton();
        btnFrutasSilvestres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tizana");
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

        lblTizana.setFont(new java.awt.Font("Segoe UI Emoji", 0, 70)); // NOI18N
        lblTizana.setForeground(new java.awt.Color(91, 91, 91));
        lblTizana.setText("Tizana");

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

        btnFrutasTropicales.setBackground(new java.awt.Color(193, 232, 213));
        btnFrutasTropicales.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        btnFrutasTropicales.setForeground(new java.awt.Color(91, 91, 91));
        btnFrutasTropicales.setText("Frutas tropicales");
        btnFrutasTropicales.setBorder(null);
        btnFrutasTropicales.setBorderPainted(false);
        btnFrutasTropicales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrutasTropicalesActionPerformed(evt);
            }
        });

        btnExplosionManzana.setBackground(new java.awt.Color(193, 232, 213));
        btnExplosionManzana.setFont(new java.awt.Font("Segoe UI Emoji", 1, 28)); // NOI18N
        btnExplosionManzana.setForeground(new java.awt.Color(91, 91, 91));
        btnExplosionManzana.setText("Explosión manzana");
        btnExplosionManzana.setBorder(null);
        btnExplosionManzana.setBorderPainted(false);
        btnExplosionManzana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExplosionManzanaActionPerformed(evt);
            }
        });

        btnFrutasSilvestres.setBackground(new java.awt.Color(193, 232, 213));
        btnFrutasSilvestres.setFont(new java.awt.Font("Segoe UI Emoji", 1, 30)); // NOI18N
        btnFrutasSilvestres.setForeground(new java.awt.Color(91, 91, 91));
        btnFrutasSilvestres.setText("Frutas silvestres");
        btnFrutasSilvestres.setBorder(null);
        btnFrutasSilvestres.setBorderPainted(false);
        btnFrutasSilvestres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrutasSilvestresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBodyLayout = new javax.swing.GroupLayout(pnlBody);
        pnlBody.setLayout(pnlBodyLayout);
        pnlBodyLayout.setHorizontalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTizana, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBodyLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(457, Short.MAX_VALUE))
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnFrutasTropicales, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnFrutasSilvestres, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExplosionManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        pnlBodyLayout.setVerticalGroup(
            pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBodyLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblTizana)
                .addGap(132, 132, 132)
                .addGroup(pnlBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFrutasTropicales, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExplosionManzana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFrutasSilvestres, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
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

    private void btnFrutasTropicalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrutasTropicalesActionPerformed
        // TODO add your handling code here:
        this.productoCarrito.setSabor("Frutas tropicales");
        this.productoCarrito.setTamaño("Regular");
        
        continuar();
    }//GEN-LAST:event_btnFrutasTropicalesActionPerformed

    private void btnExplosionManzanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExplosionManzanaActionPerformed
        // TODO add your handling code here:
        this.productoCarrito.setSabor("Explosion manzana");
        this.productoCarrito.setTamaño("Regular");
        
        continuar();
    }//GEN-LAST:event_btnExplosionManzanaActionPerformed

    private void btnFrutasSilvestresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrutasSilvestresActionPerformed
        // TODO add your handling code here:
        this.productoCarrito.setSabor("Frutas silvestres");
        this.productoCarrito.setTamaño("Regular");
        
        continuar();
    }//GEN-LAST:event_btnFrutasSilvestresActionPerformed

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
    private javax.swing.JButton btnExplosionManzana;
    private javax.swing.JButton btnFrutasSilvestres;
    private javax.swing.JButton btnFrutasTropicales;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTizana;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlHeader;
    // End of variables declaration//GEN-END:variables
}