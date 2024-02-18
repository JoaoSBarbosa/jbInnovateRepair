/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jbinnovateRepair.telas;

import java.sql.*;
import br.com.jbinnovateRepair.dao.ModuloConexao;
import java.awt.Color;
import java.awt.Insets;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author João Barbosa
 */
public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet resultSet = null;

    public void logar() {
        String query = "SELECT * FROM tb_usuarios WHERE user_login=? AND user_senha=?";
        try {
            pst = conexao.prepareStatement(query);
            pst.setString(1, userLoginLabel.getText());
            String passwordSecurity = new String(passwordLoginLabel.getPassword());
            pst.setString(2, passwordSecurity);

            // executando a query
            resultSet = pst.executeQuery();

            if (resultSet.next()) {
                TelaPrincipal principal = new TelaPrincipal();

                principal.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s)");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public TelaLogin() {
        initComponents();
        setEmptyBorder();
        conexao = ModuloConexao.conector();
        //status da conexão
        if (conexao != null) {
            loginStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/conectado.png")));
        } else {
            loginStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/desconectado.png")));

        }
    }

    public final void setEmptyBorder() {
        EmptyBorder emptyBorder = new EmptyBorder(5, 5, 5, 5);

        userLoginLabel.setBorder(emptyBorder);
        passwordLoginLabel.setBorder(emptyBorder);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLogin = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JLabel();
        userLoginLabel = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        passwordLoginLabel = new javax.swing.JPasswordField();
        loginStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JB Innovate Repair - Login");
        setResizable(false);

        userLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userLogin.setText("Usuário");

        passwordLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passwordLogin.setText("Senha");

        userLoginLabel.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        userLoginLabel.setForeground(new java.awt.Color(153, 153, 153));
        userLoginLabel.setText("Insira o usuario...");
        userLoginLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        userLoginLabel.setMinimumSize(new java.awt.Dimension(8, 18));
        userLoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLoginLabelMouseClicked(evt);
            }
        });
        userLoginLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLoginLabelActionPerformed(evt);
            }
        });
        userLoginLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userLoginLabelKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/seta-direita_branco.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        passwordLoginLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        passwordLoginLabel.setPreferredSize(new java.awt.Dimension(8, 20));

        loginStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/desconectado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userLogin)
                            .addComponent(passwordLogin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(passwordLogin))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginStatus))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(326, 207));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // chama o método logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void userLoginLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLoginLabelActionPerformed

    }//GEN-LAST:event_userLoginLabelActionPerformed

    private void userLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLoginLabelMouseClicked
        // remove texto
        resetLoginLabel();
    }//GEN-LAST:event_userLoginLabelMouseClicked

    private void userLoginLabelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userLoginLabelKeyPressed
        //resetLoginLabel();

        if (userLoginLabel.getText().equals(placeholderText)) {
            userLoginLabel.setText("");
            userLoginLabel.setForeground(Color.DARK_GRAY);
        }

    }//GEN-LAST:event_userLoginLabelKeyPressed

    private final String placeholderText = "Insira o usuario...";

    private void resetLoginLabel() {

        if (userLoginLabel.getText().equals(placeholderText)) {
            userLoginLabel.setText("");
            userLoginLabel.setForeground(Color.DARK_GRAY);
        }
    }

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel loginStatus;
    private javax.swing.JLabel passwordLogin;
    private javax.swing.JPasswordField passwordLoginLabel;
    private javax.swing.JLabel userLogin;
    private javax.swing.JTextField userLoginLabel;
    // End of variables declaration//GEN-END:variables
}
