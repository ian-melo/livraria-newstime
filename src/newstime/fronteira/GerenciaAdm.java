/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.fronteira;

import javax.swing.JOptionPane;
import newstime.controle.ControleAdministracao;
import newstime.entidade.ContaRestrita;
import newstime.excecao.BancoException;
import newstime.excecao.NegocioException;

/**
 *
 * @author Usuario
 */
public class GerenciaAdm extends javax.swing.JFrame {
    
    ControleAdministracao conAdmin = new ControleAdministracao();

    /**
     * Creates new form GerenciaAdm
     */
    public GerenciaAdm() {
        initComponents();
        
        //Verifica se o funcionário está logado ou não, habilitando/desabilitando
        if(ContaRestrita.getFuncionario() == null)
            desabilitarBotoes();
        else
            habilitarBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_autor = new javax.swing.JButton();
        btn_editora = new javax.swing.JButton();
        btn_livro = new javax.swing.JButton();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        txt_senha = new javax.swing.JPasswordField();

        btn_autor.setText("Adicionar Autor");
        btn_autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_autorActionPerformed(evt);
            }
        });

        btn_editora.setText("Adicionar Editora");
        btn_editora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editoraActionPerformed(evt);
            }
        });

        btn_livro.setText("Adicionar Livro");
        btn_livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_livroActionPerformed(evt);
            }
        });

        btn_entrar.setText("Entrar");
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        btn_sair.setText("Sair");
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_autor)
                        .addGap(18, 18, 18)
                        .addComponent(btn_livro)
                        .addGap(18, 18, 18)
                        .addComponent(btn_editora))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_login)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_entrar)
                    .addComponent(btn_sair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_autor)
                    .addComponent(btn_livro)
                    .addComponent(btn_editora))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_livroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_livroActionPerformed
        CadastroLivro cLivro = new CadastroLivro();
        cLivro.show();
    }//GEN-LAST:event_btn_livroActionPerformed

    private void btn_autorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_autorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_autorActionPerformed

    private void btn_editoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editoraActionPerformed

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        if(!validarCampos()) {
            JOptionPane.showMessageDialog(null,"Preencha todos os campos.");
            return;
        }
        
        try {
            conAdmin.verificaConta(txt_login.getText(), txt_senha.getText());
            JOptionPane.showMessageDialog(null,"Seja bem-vindo(a), "+ContaRestrita.getFuncionario().getNome()+".");
            limparCampos();
            habilitarBotoes();
        } catch (BancoException | NegocioException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            limparCampos();
        }
    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        ContaRestrita.deslogar();
        desabilitarBotoes();
    }//GEN-LAST:event_btn_sairActionPerformed
    
    private boolean validarCampos() {
        return (!(txt_login.getText().equals("") || txt_senha.getText().equals("")));
    }
    
    private void limparCampos() {
        txt_login.setText("");
        txt_senha.setText("");
    }
    
    private void habilitarBotoes() {
        btn_entrar.setEnabled(false);
        
        btn_sair.setEnabled(true);
        
        btn_livro.setEnabled(true);
        btn_livro.setVisible(true);
        
        btn_autor.setEnabled(true);
        btn_autor.setVisible(true);
        
        btn_editora.setEnabled(true);
        btn_editora.setVisible(true);
    }
    
    private void desabilitarBotoes() {
        btn_entrar.setEnabled(true);
        
        btn_sair.setEnabled(false);
        
        btn_livro.setEnabled(false);
        btn_livro.setVisible(false);
        
        btn_autor.setEnabled(false);
        btn_autor.setVisible(false);
        
        btn_editora.setEnabled(false);
        btn_editora.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_autor;
    private javax.swing.JButton btn_editora;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_livro;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
