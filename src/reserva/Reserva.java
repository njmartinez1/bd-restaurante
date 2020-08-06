/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reserva;

/**
 *
 * @author DavAtem
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Reserva extends javax.swing.JFrame {

    /**
     * Creates new form Reserva
     */
    public Reserva() {
        initComponents();
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo=(DefaultTableModel)tblCedulas.getModel();
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.130.130/proyecto1reserva","alumno","remoto");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT cedula_cliente FROM cliente");
            rs.first();
            do{
                String[] fila={rs.getString(1)};
                modelo.addRow(fila);
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo=(DefaultTableModel)tblMesas.getModel();
            Connection con=DriverManager.getConnection("jdbc:mysql://192.168.130.130/proyecto1reserva","alumno","remoto");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT id_mesa FROM mesa");
            rs.first();
            do{
                String[] fila={rs.getString(1)};
                modelo.addRow(fila);
            }while(rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlab_reserva = new javax.swing.JLabel();
        jbtn_guardarres = new javax.swing.JButton();
        jbtn_regresarres = new javax.swing.JButton();
        jlab_numero_personas = new javax.swing.JLabel();
        jlab_fecha = new javax.swing.JLabel();
        jtxt_numero_personas = new javax.swing.JTextField();
        jtxt_fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCedulas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMesas = new javax.swing.JTable();
        txtCedulaDisponible = new javax.swing.JTextField();
        jlab_numero_personas1 = new javax.swing.JLabel();
        jlab_numero_personas2 = new javax.swing.JLabel();
        txtMesaDisponible = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlab_reserva.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlab_reserva.setText("Crear Reserva");

        jbtn_guardarres.setBackground(new java.awt.Color(102, 255, 102));
        jbtn_guardarres.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbtn_guardarres.setText("Guardar");
        jbtn_guardarres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarresActionPerformed(evt);
            }
        });

        jbtn_regresarres.setBackground(new java.awt.Color(204, 102, 0));
        jbtn_regresarres.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jbtn_regresarres.setText("Regresar");
        jbtn_regresarres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_regresarresMouseClicked(evt);
            }
        });

        jlab_numero_personas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlab_numero_personas.setText("Numero de Personas");

        jlab_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlab_fecha.setText("Fecha");

        jtxt_numero_personas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_numero_personasActionPerformed(evt);
            }
        });

        jtxt_fecha.setText("año/mes/dia");

        tblCedulas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula del cliente"
            }
        ));
        jScrollPane1.setViewportView(tblCedulas);

        tblMesas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mesas"
            }
        ));
        jScrollPane2.setViewportView(tblMesas);

        txtCedulaDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaDisponibleActionPerformed(evt);
            }
        });

        jlab_numero_personas1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlab_numero_personas1.setText("Ingrese una cedula disponible:");

        jlab_numero_personas2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlab_numero_personas2.setText("Ingrese una mesa disponible:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlab_reserva)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jbtn_guardarres)
                        .addGap(103, 103, 103)
                        .addComponent(jbtn_regresarres))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedulaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlab_numero_personas1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jlab_numero_personas2)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMesaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlab_numero_personas, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlab_fecha, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_numero_personas)
                                        .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlab_reserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_numero_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlab_numero_personas))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlab_fecha))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlab_numero_personas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedulaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlab_numero_personas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMesaDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_regresarres)
                    .addComponent(jbtn_guardarres))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_regresarresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_regresarresMouseClicked
Inicio inicio = new Inicio();
inicio.setVisible(true);
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_regresarresMouseClicked

    private void jbtn_guardarresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarresActionPerformed
       
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("Driver esta cargando correctamente");
            Connection con=null;
            con=DriverManager.getConnection("jdbc:mysql://192.168.130.130/proyecto1reserva","alumno","remoto");
            System.out.println("Base de datos conectada");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO reserva VALUES('"+txtCedulaDisponible.getText()+"','"+jtxt_numero_personas.getText()+"','"+jtxt_fecha.getText()+"','"+txtMesaDisponible.getText()+"')");
            System.out.println("Registrado correctamente");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getException());
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        

        JOptionPane.showMessageDialog(null,"La reserva se a registrado correctamente");
    }//GEN-LAST:event_jbtn_guardarresActionPerformed

    private void txtCedulaDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaDisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaDisponibleActionPerformed

    private void jtxt_numero_personasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_numero_personasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_numero_personasActionPerformed

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtn_guardarres;
    private javax.swing.JButton jbtn_regresarres;
    private javax.swing.JLabel jlab_fecha;
    private javax.swing.JLabel jlab_numero_personas;
    private javax.swing.JLabel jlab_numero_personas1;
    private javax.swing.JLabel jlab_numero_personas2;
    private javax.swing.JLabel jlab_reserva;
    private javax.swing.JTextField jtxt_fecha;
    private javax.swing.JTextField jtxt_numero_personas;
    private javax.swing.JTable tblCedulas;
    private javax.swing.JTable tblMesas;
    private javax.swing.JTextField txtCedulaDisponible;
    private javax.swing.JTextField txtMesaDisponible;
    // End of variables declaration//GEN-END:variables
}
