/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceld;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Eder
 */
public class LinhaDoTempo extends javax.swing.JFrame {

    /**
     * Creates new form LinhaDoTempo
     * @throws java.lang.Exception
     */
    
    public LinhaDoTempo(){
        initComponents();
       
    }
        public void bemVindo(String email)throws Exception{
        entrar log = new entrar();
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sql = "select nome from dadosUser where email='"+email+"'";
        try(Connection con = DriverManager.getConnection(url, "ldev", "ld");
            PreparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery()){
            while(rs.next()){
                String nome = rs.getString("nome");
                bemVindo.setText(nome);
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

        bemVindo = new javax.swing.JLabel();
        bemVindoFrase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(520, 520));
        setPreferredSize(new java.awt.Dimension(520, 420));
        getContentPane().setLayout(null);

        bemVindo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        bemVindo.setText("nome");
        getContentPane().add(bemVindo);
        bemVindo.setBounds(100, 70, 70, 33);

        bemVindoFrase.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        bemVindoFrase.setText("Bem Vindo");
        getContentPane().add(bemVindoFrase);
        bemVindoFrase.setBounds(100, 30, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bemVindo.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LinhaDoTempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LinhaDoTempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LinhaDoTempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LinhaDoTempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new LinhaDoTempo().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(LinhaDoTempo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bemVindo;
    private javax.swing.JLabel bemVindoFrase;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
