
package vista;

import conexion.connPos;
import java.awt.image.ImageObserver;
import javax.swing.JOptionPane;
import conexion.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class Registrante extends javax.swing.JInternalFrame {

   static ResultSet res; 
   
    public Registrante() {
        initComponents();
        cargaTodo();
        
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = this.getSize();
        int horizontal=(pantalla.width-ventana.width)/2;
        int vertical=(pantalla.height-ventana.height)/2;
        this.setLocation(horizontal,vertical);
        
    
        //DESHABILITANDO MOVER LA VENTANA
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
    
      public void cargaTodo(){
       DefaultTableModel modelo=(DefaultTableModel)tablaRegion.getModel();
       modelo.setRowCount(0);
       res = conexion.connPos.Consulta("SELECT * FROM REGISTRANTE");
       try{
         while(res.next()){
             Vector v = new Vector();
             v.add(res.getString(1));
             v.add(res.getString(2));
             v.add(res.getString(3));
             v.add(res.getString(4));
             modelo.addRow(v);
             tablaRegion.setModel(modelo);
             }
       }
       catch(SQLException e){
       
       }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnregistra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegion = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        txtMatern = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCodRegistrante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE PERSONAS QUE REALIZARON EL REGISTRO ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nombre (s):");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        btnregistra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregistra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrar.png"))); // NOI18N
        btnregistra.setText("REGISTRAR");
        btnregistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistraActionPerformed(evt);
            }
        });

        tablaRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "C. I.", "Ap. Paterno", "Ap. Materno", "Nombres"
            }
        ));
        jScrollPane1.setViewportView(tablaRegion);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editar.png"))); // NOI18N
        btnActualizar.setText("EDITAR REGISTRO");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eliminar.png"))); // NOI18N
        btnBorrar.setText("BORRAR REGISTRO");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("TABLA DE REGISTROS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("C. I. ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCodRegistrante, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtPaterno)
                                    .addComponent(txtMatern)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnregistra, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnActualizar))
                            .addComponent(btnBorrar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodRegistrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMatern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnregistra, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistraActionPerformed
       String codigo=txtCodRegistrante.getText();
        String paterno=txtPaterno.getText();
        String materno=txtMatern.getText();
        String nombre=txtNombre.getText();
        if(codigo.isEmpty()){
        JOptionPane.showMessageDialog(null,"Debe ingresar un dato en el campo Carnet Identidad");
        
        }
        
        connPos cn=new connPos();
        cn.insertarDatosRegion(codigo,paterno,materno,nombre);
        JOptionPane.showMessageDialog(rootPane,"Guardado correctamente");
    }//GEN-LAST:event_btnregistraActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //int conv;
        int cod_region;
        String tipo_region;
        String ecoregion;
        String dpto;
        int fila = this.tablaRegion.getSelectedRow();
        cod_region=Integer.parseInt(this.tablaRegion.getValueAt(fila, 0).toString());
        //conv=Integer.parseInt(cod_region);
        tipo_region=this.tablaRegion.getValueAt(fila, 1).toString();
        ecoregion=this.tablaRegion.getValueAt(fila, 2).toString();
        dpto=this.tablaRegion.getValueAt(fila, 3).toString();
        
        editaRegion er= new editaRegion(cod_region, tipo_region, ecoregion, dpto);
        er.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
         
        int fila;
        fila=(Integer)this.tablaRegion.getSelectedRow();
        //int codigo=Integer.parseInt(this.tablaRegion.getValueAt(fila, 0).toString());
        int codigo=Integer.parseInt(this.tablaRegion.getValueAt(fila, 0).toString());
        connPos cn= new connPos();
        cn.borrarRegion(codigo);
        
        DefaultTableModel dfmDelete = new DefaultTableModel();
        this.tablaRegion.setModel(dfmDelete);
        dfmDelete.setColumnIdentifiers(new Object[]{"cod_region","tipo_region","ecoregion","dpto"});
        ResultSet rs=cn.seleccionarTodoRegion();
        
        try{
            while(rs.next()){
            dfmDelete.addRow(new Object[]{rs.getInt("cod_region"),rs.getString("tipo_region"),rs.getString("ecoregion"),rs.getString("dpto")});    
            }
        }
        catch(Exception e){
        
        }
        
    
    }//GEN-LAST:event_btnBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnregistra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegion;
    private javax.swing.JTextField txtCodRegistrante;
    private javax.swing.JTextField txtMatern;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
}
