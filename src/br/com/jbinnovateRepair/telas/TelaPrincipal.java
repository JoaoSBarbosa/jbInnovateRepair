/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jbinnovateRepair.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author João Barbosa
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        DesktopLayout = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        loggedInUser = new javax.swing.JLabel();
        currentDate = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        menCad = new javax.swing.JMenu();
        menCadClient = new javax.swing.JMenuItem();
        menCadOs = new javax.swing.JMenuItem();
        menCadUser = new javax.swing.JMenuItem();
        menReport = new javax.swing.JMenu();
        menReportService = new javax.swing.JMenuItem();
        menHelp = new javax.swing.JMenu();
        menHelpAbout = new javax.swing.JMenuItem();
        menOptions = new javax.swing.JMenu();
        menOptionsExit = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JB Innovate Repair - Sistema de gerenciamento de Ordens de Serviços");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        DesktopLayout.setPreferredSize(new java.awt.Dimension(640, 480));

        javax.swing.GroupLayout DesktopLayoutLayout = new javax.swing.GroupLayout(DesktopLayout);
        DesktopLayout.setLayout(DesktopLayoutLayout);
        DesktopLayoutLayout.setHorizontalGroup(
            DesktopLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        DesktopLayoutLayout.setVerticalGroup(
            DesktopLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/logo3.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        logo.setIconTextGap(0);
        logo.setMaximumSize(new java.awt.Dimension(200, 200));
        logo.setMinimumSize(new java.awt.Dimension(200, 200));
        logo.setPreferredSize(new java.awt.Dimension(200, 200));

        loggedInUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loggedInUser.setText("Usuário");

        currentDate.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        currentDate.setText("Data");

        menCad.setText("Cadastro");

        menCadClient.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menCadClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/clientes_24.png"))); // NOI18N
        menCadClient.setText("Cliente");
        menCad.add(menCadClient);

        menCadOs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_MASK));
        menCadOs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/os_24.png"))); // NOI18N
        menCadOs.setText("OS");
        menCad.add(menCadOs);

        menCadUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        menCadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/suporte_24.png"))); // NOI18N
        menCadUser.setText("Usuários");
        menCadUser.setEnabled(false);
        menCad.add(menCadUser);

        MenuBar.add(menCad);

        menReport.setText("Relatório");
        menReport.setEnabled(false);

        menReportService.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menReportService.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/relatorio.png"))); // NOI18N
        menReportService.setText("Serviços");
        menReportService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menReportServiceActionPerformed(evt);
            }
        });
        menReport.add(menReportService);

        MenuBar.add(menReport);

        menHelp.setText("Ajuda");

        menHelpAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.ALT_MASK));
        menHelpAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/sobre.png"))); // NOI18N
        menHelpAbout.setText("Sobre");
        menHelpAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menHelpAboutActionPerformed(evt);
            }
        });
        menHelp.add(menHelpAbout);

        MenuBar.add(menHelp);

        menOptions.setText("Opções");

        menOptionsExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menOptionsExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/jbinnovateRepair/icones/sair.png"))); // NOI18N
        menOptionsExit.setText("Sair");
        menOptionsExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menOptionsExitActionPerformed(evt);
            }
        });
        menOptions.add(menOptionsExit);

        MenuBar.add(menOptions);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(currentDate)
                    .addComponent(loggedInUser)
                    .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loggedInUser)
                        .addGap(18, 18, 18)
                        .addComponent(currentDate)
                        .addGap(142, 142, 142)
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(0, 185, Short.MAX_VALUE))
                    .addComponent(DesktopLayout, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1123, 688));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menReportServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menReportServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menReportServiceActionPerformed


    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // quando a tela for ativada

        loggedInUser.setText("Teste");

        updateDateTime();

        // Agendando uma tarefa para atualizar a hora a cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateDateTime();
            }
        });
        timer.start();
    }//GEN-LAST:event_formWindowActivated

    private void menOptionsExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menOptionsExitActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menOptionsExitActionPerformed

    private void menHelpAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menHelpAboutActionPerformed
        TelaSobre telaSobre = new TelaSobre();
        telaSobre.setVisible(true);
    }//GEN-LAST:event_menHelpAboutActionPerformed

    private void updateDateTime() {
        Date data = new Date();
        DateFormat formatoDataHora = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
        String dataHoraFormatada = formatoDataHora.format(data);

        currentDate.setText(dataHoraFormatada);
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopLayout;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel currentDate;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel loggedInUser;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menCad;
    private javax.swing.JMenuItem menCadClient;
    private javax.swing.JMenuItem menCadOs;
    public static javax.swing.JMenuItem menCadUser;
    private javax.swing.JMenu menHelp;
    private javax.swing.JMenuItem menHelpAbout;
    private javax.swing.JMenu menOptions;
    private javax.swing.JMenuItem menOptionsExit;
    public static javax.swing.JMenu menReport;
    private javax.swing.JMenuItem menReportService;
    // End of variables declaration//GEN-END:variables
}
