/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysbusca.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author EnOqUe
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

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        desktop = new javax.swing.JDesktopPane();
        lblUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menuCad = new javax.swing.JMenu();
        menuCadUsu = new javax.swing.JMenuItem();
        menuBusca = new javax.swing.JMenu();
        menuCadNascimento = new javax.swing.JMenuItem();
        menuCadCasamento = new javax.swing.JMenuItem();
        menuCadObito = new javax.swing.JMenuItem();
        menuCadProcuracao = new javax.swing.JMenuItem();
        menuCadEscritura = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        subMenuSair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Busca");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 153, 153));
        lblUsuario.setText("Usuario");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblData.setForeground(new java.awt.Color(0, 153, 153));
        lblData.setText("Data ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysbusca/icones/user.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sysbusca/icones/data.png"))); // NOI18N

        menuCad.setText("Cadastrar");

        menuCadUsu.setText("Usuarios");
        menuCadUsu.setEnabled(false);
        menuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuActionPerformed(evt);
            }
        });
        menuCad.add(menuCadUsu);

        menu.add(menuCad);

        menuBusca.setText("Cadastar/Buscar");

        menuCadNascimento.setText("Nascimento");
        menuCadNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadNascimentoActionPerformed(evt);
            }
        });
        menuBusca.add(menuCadNascimento);

        menuCadCasamento.setText("Casamento");
        menuCadCasamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadCasamentoActionPerformed(evt);
            }
        });
        menuBusca.add(menuCadCasamento);

        menuCadObito.setText("Obito");
        menuCadObito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadObitoActionPerformed(evt);
            }
        });
        menuBusca.add(menuCadObito);

        menuCadProcuracao.setText("Procuração");
        menuCadProcuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadProcuracaoActionPerformed(evt);
            }
        });
        menuBusca.add(menuCadProcuracao);

        menuCadEscritura.setText("Escritura");
        menuCadEscritura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadEscrituraActionPerformed(evt);
            }
        });
        menuBusca.add(menuCadEscritura);

        menu.add(menuBusca);

        menuAjuda.setText("Ajuda");

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        menu.add(menuAjuda);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        subMenuSair.setText("Sair");
        subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSairActionPerformed(evt);
            }
        });
        menuSair.add(subMenuSair);

        menu.add(menuSair);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 344, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1279, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuActionPerformed
        //Chamando a TelaUsaurio
        TelaUsuario usuario = new TelaUsuario();//Instanciando 
        usuario.setVisible(true);//Vai ficar visivel para o usuario
        desktop.add(usuario);//Desktop é nosso painel. Via ser adicionado dentro do nosso desktop
    }//GEN-LAST:event_menuCadUsuActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // Temos que importar essas cuas classes import java.text.DateFormat; import java.util.Date;
        Date data = new Date(); //Vamos criar um objeto da classe date e vamos instanciar essa classe
        /*DateFormat é utilizado para formatar data e hora a gosta, temos varios opções de formatação
          criamor um objeto chamado de formatador da classe DateFormat que recebe getDateInstance como parametro
        e dentro deste vai DateFormat como instancia e short e o modelo de formação que é a data*/ 
          DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
          //Agora vamos fazer o lblData receber a valor do formatador, e portanto temos que chama-la e passamos 
          // a variavel data como parametro
          lblData.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void subMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSairActionPerformed
        /*Criando uma caixa de dialogo e irá perguntar ao usuarios se ele deseja sair do sistema
        Criaremos uma variavel do tipo inteira denominada de sair 
        */
        int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair?", "Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){//se meu sair receber a opção sair == JOptionPane.YES_OPTION
            System.exit(0);// comando para sair do sistema
        }//não precisamos fazer o else porque temos só duas opção ou sair ou ficar
    }//GEN-LAST:event_subMenuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        /*Vamos inserir a instancia TelaSobre, vamos criar um objeto chamado de sobre, vamos dar um new tela sobre
        como estão no mesmo pacote não precisa importar*/
        TelaSobre sobre = new TelaSobre();
        sobre.setVisible(true);//chamamos o nosso objeto que será visto, e damos um setVisible e passamos o valor true
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuCadNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadNascimentoActionPerformed
       TelaNascimento cliente = new TelaNascimento();
       desktop.add(cliente);
       cliente.setVisible(true);
    }//GEN-LAST:event_menuCadNascimentoActionPerformed

    private void menuCadCasamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadCasamentoActionPerformed
       TelaCasamento cliente = new TelaCasamento();
       desktop.add(cliente);
       cliente.setVisible(true);
    }//GEN-LAST:event_menuCadCasamentoActionPerformed

    private void menuCadObitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadObitoActionPerformed
       TelaObito cliente = new TelaObito();
       desktop.add(cliente);
       cliente.setVisible(true);
    }//GEN-LAST:event_menuCadObitoActionPerformed

    private void menuCadProcuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadProcuracaoActionPerformed
        TelaProcuracao cliente = new TelaProcuracao();
       desktop.add(cliente);
       cliente.setVisible(true);
    }//GEN-LAST:event_menuCadProcuracaoActionPerformed

    private void menuCadEscrituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadEscrituraActionPerformed
        TelaEscritura cliente = new TelaEscritura();
        desktop.add(cliente);
        cliente.setVisible(true);
    }//GEN-LAST:event_menuCadEscrituraActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblData;
    public static javax.swing.JLabel lblUsuario;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuBusca;
    private javax.swing.JMenu menuCad;
    private javax.swing.JMenuItem menuCadCasamento;
    private javax.swing.JMenuItem menuCadEscritura;
    private javax.swing.JMenuItem menuCadNascimento;
    private javax.swing.JMenuItem menuCadObito;
    private javax.swing.JMenuItem menuCadProcuracao;
    public static javax.swing.JMenuItem menuCadUsu;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JMenuItem subMenuSair;
    // End of variables declaration//GEN-END:variables
}
