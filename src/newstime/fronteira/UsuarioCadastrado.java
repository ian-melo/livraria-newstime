/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newstime.fronteira;

import javax.swing.JOptionPane;
import newstime.entidade.Cliente;
import newstime.entidade.Conta;
import newstime.excecao.*;

/**
 *
 * @author voce
 */
public class UsuarioCadastrado extends javax.swing.JFrame {

    /**
     * Creates new form UsuarioCadastrado
     */
    public UsuarioCadastrado() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_logar = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        jLabel1.setText("Login");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Broadway", 0, 12)); // NOI18N
        jLabel3.setText("Senha");

        btn_logar.setText("Logar");
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(185, 185, 185))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_senha))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btn_logar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_logar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        if(txt_email.getText().equals("") || txt_senha.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
            return;
        }
        String trat;
        Cliente cc = new Cliente();
        try {
            cc.setEmail(txt_email.getText());
            cc.setSenha(txt_senha.getText());
            Conta.logar(cc);
            trat = (Conta.getCliente().getSexo().equals("F"))?"a":"o";
            JOptionPane.showMessageDialog(null, "Seja bem vind"+trat+", " + Conta.getCliente().getNome());
            txt_email.setText("");
            txt_senha.setText("");
            Home.habilitarCliente();
        } catch(FormatacaoIncorretaException | NegocioException | BancoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btn_logarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_senha;
    // End of variables declaration//GEN-END:variables
}
