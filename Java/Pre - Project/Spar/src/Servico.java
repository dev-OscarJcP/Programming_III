/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author oscar
 */
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Servico extends javax.swing.JFrame {

    /**
     * Creates new form Servico
     */
    public Servico() {
        initComponents();
        setLocationRelativeTo(null); //colocar no meio
        toFront();
        Image icon = new ImageIcon(this.getClass().getResource("image.png")).getImage();
        this.setIconImage(icon);
        
        //ATUALIZACAO DE UNHAS
        
         Connection conexao = null; 
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://127.0.0.1:3306/spar?serverTimezone=UTC&useSSL=false";

                    String usuario = "root";
                    String senha = "";

                    conexao = DriverManager.getConnection(url, usuario, senha);

                    Statement statement = conexao.createStatement();
                    // Faça algo com a conexão, se necessário

                    String consultaSQL = "SELECT * FROM unhas";
                    ResultSet resultSet = statement.executeQuery(consultaSQL);

                    DefaultTableModel agenda = (DefaultTableModel) tabela.getModel();
                    while(resultSet.next()){
                        String horario = resultSet.getString("horario");
                        String data = resultSet.getString("dataa");
                        String nome = resultSet.getString("nome");
                        String telefone = resultSet.getString("telefone");
                        String profissional = resultSet.getString("profissional");


                        Object[] dados = {data,horario, nome, telefone, profissional};
                        agenda.addRow(dados);

                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error: " + ex);
                }
                finally{
                          try {
                              conexao.close();
                          } catch (SQLException ex) {
                              Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
                          }
                }
                
                //ATUALIZACAO DE SOBRANCELHA
                Connection conexa = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://127.0.0.1:3306/spar?serverTimezone=UTC&useSSL=false";

                    String usuario = "root";
                    String senha = "";

                    conexa = DriverManager.getConnection(url, usuario, senha);

                    Statement statement = conexa.createStatement();
                    // Faça algo com a conexão, se necessário

                    String consultaSQL = "SELECT * FROM cabelo WHERE profissional = 'Ana Arouca'";
                    ResultSet resultSet = statement.executeQuery(consultaSQL);

                    DefaultTableModel agenda1 = (DefaultTableModel) tabela1.getModel();
                    while(resultSet.next()){
                        String horario = resultSet.getString("horario");
                        String data = resultSet.getString("dataa");
                        String nome = resultSet.getString("nome");
                        String telefone = resultSet.getString("telefone");


                        Object[] dados = {data, horario, nome, telefone};
                        agenda1.addRow(dados);

                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error: " + ex);
                }
                finally{
                          try {
                              conexao.close();
                          } catch (SQLException ex) {
                              Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
                          }
                }
                
                //ATUALIZAO DE CABELO
                Connection conex = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://127.0.0.1:3306/spar?serverTimezone=UTC&useSSL=false";

                    String usuario = "root";
                    String senha = "";

                    conex = DriverManager.getConnection(url, usuario, senha);

                    Statement statement = conex.createStatement();
                    // Faça algo com a conexão, se necessário

                    String consultaSQL = "SELECT * FROM cabelo WHERE profissional = 'Mariana Silva'";
                    ResultSet resultSet = statement.executeQuery(consultaSQL);

                    DefaultTableModel agenda = (DefaultTableModel) tabela2.getModel();
                    while(resultSet.next()){
                        String horario = resultSet.getString("horario");
                        String data = resultSet.getString("dataa");
                        String nome = resultSet.getString("nome");
                        String telefone = resultSet.getString("telefone");


                        Object[] dados = {data, horario, nome, telefone};
                        agenda.addRow(dados);

                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error: " + ex);
                }
                finally{
                          try {
                              conexao.close();
                          } catch (SQLException ex) {
                              Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
                          }
                }
                //atualizacao do banco de dados
            Connection cone = null;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");

                    String url = "jdbc:mysql://127.0.0.1:3306/spar?serverTimezone=UTC&useSSL=false";

                    String usuario = "root";
                    String senha = "";

                    cone = DriverManager.getConnection(url, usuario, senha);

                    Statement statement = cone.createStatement();
                    // Faça algo com a conexão, se necessário

                    String consultaSQL = "SELECT * FROM cabelo WHERE profissional = 'Martha Nogueira'";
                    ResultSet resultSet = statement.executeQuery(consultaSQL);

                    DefaultTableModel agenda = (DefaultTableModel) tabela3.getModel();
                    while(resultSet.next()){
                        String horario = resultSet.getString("horario");
                        String data = resultSet.getString("dataa");
                        String nome = resultSet.getString("nome");
                        String telefone = resultSet.getString("telefone");
                        


                        Object[] dados = {data, horario, nome, telefone};
                        agenda.addRow(dados);

                    }

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.println("Error: " + ex);
                }
                finally{
                          try {
                              conexao.close();
                          } catch (SQLException ex) {
                              Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
                          }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabela2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Servico");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unhas");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sobrancelha");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cabelo");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Depilacao");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Servicos");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "Nome", "Telefone", "Profissional"
            }
        ));
        jScrollPane5.setViewportView(tabela);

        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "Nome", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tabela1);

        tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "Nome", "Telefone"
            }
        ));
        jScrollPane3.setViewportView(tabela2);

        tabela3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Horario", "Nome", "Telefone"
            }
        ));
        jScrollPane4.setViewportView(tabela3);

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jButton1.setText("Pagamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 601, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 765, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(295, 295, 295))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
 
         new pagamento().setVisible(true);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTable tabela2;
    private javax.swing.JTable tabela3;
    // End of variables declaration//GEN-END:variables
}
