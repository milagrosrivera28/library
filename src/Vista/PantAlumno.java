
package Vista;

import Controlador.ConectaDb;
import static Vista.PantAlumEdit.jtxMateActuAlum;
import static Vista.PantAlumEdit.jtxNomActAlum;
import static Vista.PantAlumEdit.jtxPateActAlum;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class PantAlumno extends javax.swing.JFrame {
    public static String idalumno;

    public PantAlumno() {
        initComponents();
        try    
    {
            DefaultTableModel modelo= new DefaultTableModel();
            jtb_alumno.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            ConectaDb conn= new ConectaDb();
            Connection con=(Connection) conn.getConnection();
            //SELECT idautores,nombre,paterno,materno FROM autores
            
            String sql="SELECT idAlumno,nombre,paterno,materno,dni,direccion,telefono FROM alumno  ";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadColumnas=rsMd.getColumnCount();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("DNI");
           // modelo.addColumn("Clave");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            
            while(rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_alumno = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Atrás.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtb_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoCliente", "Nombre", "A.Paterno", "A.Materno", "DNI", "Estado", "(-)"
            }
        ));
        jScrollPane1.setViewportView(jtb_alumno);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ALUMNO");

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Configuración.png"))); // NOI18N
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Añadir.png"))); // NOI18N
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("DNI");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_editar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregar)
                            .addComponent(btn_editar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_buscar)))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try    
    {
            DefaultTableModel modelo= new DefaultTableModel();
            jtb_alumno.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            ConectaDb conn= new ConectaDb();
            Connection con=(Connection) conn.getConnection();
           String dni=txt_dni.getText();
            
            String sql="SELECT idAlumno,nombre,paterno,materno,dni,direccion,telefono FROM alumno WHERE dni='"+dni+"'  ";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadColumnas=rsMd.getColumnCount();
            
            modelo.addColumn("Codigo");
            modelo.addColumn("Nombre");
            modelo.addColumn("Paterno");
            modelo.addColumn("Materno");
            modelo.addColumn("DNI");
           // modelo.addColumn("Clave");
            modelo.addColumn("Direccion");
            modelo.addColumn("Telefono");
            
            while(rs.next()){
                Object[] filas=new Object[cantidadColumnas];
                
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i]=rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        }
    catch(SQLException e){
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PantallaMenu menu = new PantallaMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        PantAlumEdit menu = new PantAlumEdit();
        menu.setVisible(true);
        this.setVisible(false);
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            
            
            ConectaDb objCon=new ConectaDb();
            Connection conn=(Connection) objCon.getConnection();
            
            int Fila=jtb_alumno.getSelectedRow();
             idalumno=jtb_alumno.getValueAt(Fila, 0).toString();
            
            
            ps=conn.prepareStatement("SELECT nombre,paterno,materno,dni,direccion,telefono FROM alumno WHERE idalumno=?");            
            ps.setString(1, idalumno);
            rs=ps.executeQuery();
            while(rs.next()){
                jtxNomActAlum.setText(rs.getString("nombre"));
                jtxPateActAlum.setText(rs.getString("paterno"));
                jtxMateActuAlum.setText(rs.getString("materno"));
                PantAlumEdit.jtxDniActAlum.setText(rs.getString("dni"));
                //jtxClav.setText(rs.getString("clave"));
                PantAlumEdit.jtxDirecActAlum.setText(rs.getString("direccion"));
                PantAlumEdit.jtxTelefActAlum.setText(rs.getString("telefono"));
               
            }
            
                    
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
           
        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        PantAlumAgre menu = new PantAlumAgre();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_agregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtb_alumno;
    private javax.swing.JTextField txt_dni;
    // End of variables declaration//GEN-END:variables
}
