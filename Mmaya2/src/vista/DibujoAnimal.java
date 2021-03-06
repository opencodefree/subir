
package vista;

import conexion.connPos;
import static conexion.connPos.getConexion;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class DibujoAnimal extends javax.swing.JInternalFrame {
      
    FileInputStream fis;
    //FileInputStream fisI;
     int lndBytes;
       
    public DibujoAnimal() {
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        int horizontal=(pantalla.width-ventana.width)/2;
        int vertical=(pantalla.height-ventana.height)/2;
        this.setLocation(horizontal,vertical);
    
        //DESHABILITANDO MOVER LA VENTANA
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
             // MOSTRANDO DATOS EN EL COMBOBOX DESDE LA BD
         this.cmbfotoAni.removeAllItems();
         try{
             Connection cn=getConexion();
             Statement sent=cn.createStatement();
             ResultSet rs=sent.executeQuery("SELECT * FROM ANIMAL");
             while(rs.next()){
                  this.cmbfotoAni.addItem(rs.getString("cod_animal"));
             }
             
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbfotoAni = new javax.swing.JComboBox();
        txtNomNat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNomCien = new javax.swing.JTextField();
        btnFotoAni = new javax.swing.JButton();
        lblFotoAni = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFotoGuarda = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Codigo de Animal :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("FORMULARIO DE REGISTRO DE  DIBUJO NATIVO DE  ANIMALES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("FOTO ");

        cmbfotoAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfotoAniActionPerformed(evt);
            }
        });

        txtNomNat.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Nombre Cientifico :");

        txtNomCien.setEditable(false);

        btnFotoAni.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFotoAni.setText("Examinar...");
        btnFotoAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoAniActionPerformed(evt);
            }
        });

        lblFotoAni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre Nativo :");

        btnFotoGuarda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFotoGuarda.setText("ALMACENAR");
        btnFotoGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoGuardaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(txtNomCien, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNomNat, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbfotoAni, javax.swing.GroupLayout.Alignment.LEADING, 0, 163, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFotoAni)
                        .addGap(18, 18, 18)))
                .addComponent(lblFotoAni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFotoGuarda, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFotoAni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbfotoAni, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomNat, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomCien, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFotoAni, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFotoGuarda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbfotoAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfotoAniActionPerformed

        try{
            Connection cn=getConexion();
            Statement sent1=cn.createStatement();
            ResultSet rs1=sent1.executeQuery("SELECT * FROM animal WHERE cod_animal= '"+this.cmbfotoAni.getSelectedItem()+"'");
            rs1.next();
            this.txtNomNat.setText(String.valueOf(rs1.getString("nombre_nativo")));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        try{
            Connection cn=getConexion();
            Statement sent1=cn.createStatement();
            ResultSet rs1=sent1.executeQuery("SELECT * FROM animal WHERE cod_animal= '"+this.cmbfotoAni.getSelectedItem()+"'");
            rs1.next();
            this.txtNomCien.setText(String.valueOf(rs1.getString("nombre_cientifico")));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_cmbfotoAniActionPerformed

    private void btnFotoAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoAniActionPerformed

        lblFotoAni.setIcon(null);
        JFileChooser dato=new JFileChooser();
        dato.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado=dato.showOpenDialog(null);
        if(estado== JFileChooser.APPROVE_OPTION){
            try{
                fis=new FileInputStream(dato.getSelectedFile());
                this.lndBytes=(int)dato.getSelectedFile().length();
                try {
                    Image icono=ImageIO.read(dato.getSelectedFile()).getScaledInstance
                    (lblFotoAni.getWidth(), lblFotoAni.getHeight(), Image.SCALE_DEFAULT);
                    lblFotoAni.setIcon(new ImageIcon(icono));
                    lblFotoAni.updateUI();
                }catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "imagen: "+ex);
                }
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnFotoAniActionPerformed

    private void btnFotoGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoGuardaActionPerformed

        try{
            connPos cn=new connPos();
            String sql="INSERT INTO \"fotoanimaldibujo\"(cod_animal,foto) VALUES (?,?)";

            PreparedStatement ps=cn.getConexion().prepareStatement(sql);
            //txtCodFotoAni
            //ps.setString(1,txtCodFotoAni.getText());
            ps.setString(1,(String)cmbfotoAni.getSelectedItem());
            //ps.setString(2,txtnombre.getText());
            ps.setBinaryStream(2,fis,lndBytes);

            ps.execute();
            // ps.close();

            cmbfotoAni.setSelectedItem("");
            lblFotoAni.setIcon(null);

            if(cmbfotoAni==null){
                System.out.println("Debe introducir un codigo de animal relacionado a la FOTO");
            }

            JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");
        }catch(SQLException x){
            JOptionPane.showMessageDialog(rootPane, "Debe elegir el codigo de animal correspondiente a la foto "+x);
        }
    }//GEN-LAST:event_btnFotoGuardaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFotoAni;
    private javax.swing.JButton btnFotoGuarda;
    private javax.swing.JComboBox cmbfotoAni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblFotoAni;
    private javax.swing.JTextField txtNomCien;
    private javax.swing.JTextField txtNomNat;
    // End of variables declaration//GEN-END:variables
}
