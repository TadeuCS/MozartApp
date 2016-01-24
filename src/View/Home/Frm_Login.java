package View.Home;

import Controller.UsuarioDAO;
import Controller.ValidadeDAO;
import Model.Usuario;
import Model.Validade;
import Util.Classes.Conexao;
import Util.Classes.Criptografia;
import Util.Classes.Data;
import Util.Classes.PropertiesManager;
import Util.Classes.UpperDocument;
import java.awt.Event;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.persistence.NoResultException;
import javax.swing.JOptionPane;

public class Frm_Login extends javax.swing.JFrame {

    Frm_Principal p;
    PropertiesManager prop;
    Conexao conexao;
    UsuarioDAO usuarioDAO;
    ValidadeDAO validadeDAO;
    Usuario usuario;
    Thread acao;

    public Frm_Login() {
        initComponents();
        setVisible(true);
        txt_usuario.setDocument(new UpperDocument(20));
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                usuarioDAO = new UsuarioDAO();
            }
        }
        );
        acao.start();
    }

    public boolean validaUsuario(String user, String senha) {
        if ((user.equals("ADMIN") == true) && (senha.equals("80177534a0c99a7e3645b52f2027a48b") == true)) {
            try {
                return true;
            } catch (Exception e) {
                limpaCampos();
                txt_usuario.requestFocus();
                return false;
            }
        } else {
            try {
                usuarioDAO = new UsuarioDAO();
                usuario = new Usuario();
                usuario = usuarioDAO.buscar(user);
                return true;
            } catch (NoResultException e) {
                limpaCampos();
                txt_usuario.requestFocus();
                return false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_dados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_senha = new javax.swing.JPasswordField();
        btn_entrar = new javax.swing.JButton();
        btn_sair = new javax.swing.JButton();
        btn_conexao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);

        pnl_dados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Usuário:");

        txt_usuario.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txt_usuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        jLabel2.setText("Senha:");

        txt_senha.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txt_senha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_senhaKeyPressed(evt);
            }
        });

        btn_entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/entrar.png"))); // NOI18N
        btn_entrar.setText("Entrar");
        btn_entrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entrarActionPerformed(evt);
            }
        });

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/sair.png"))); // NOI18N
        btn_sair.setText("Sair");
        btn_sair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        btn_conexao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/bd.png"))); // NOI18N
        btn_conexao.setToolTipText("Conexão com Banco de dados");
        btn_conexao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_conexaoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_conexaoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_dadosLayout = new javax.swing.GroupLayout(pnl_dados);
        pnl_dados.setLayout(pnl_dadosLayout);
        pnl_dadosLayout.setHorizontalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_conexao, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_dadosLayout.createSequentialGroup()
                        .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_dadosLayout.setVerticalGroup(
            pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_conexao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(pnl_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entrarActionPerformed
        if (txt_usuario.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário Inválido!");
            txt_usuario.requestFocus();
        } else {
            if (txt_senha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Senha Inválida!");
                txt_senha.requestFocus();
            } else {
                loga();
            }
        }

    }//GEN-LAST:event_btn_entrarActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        acao.stop();
        dispose();
    }//GEN-LAST:event_btn_sairActionPerformed

    private void txt_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_senhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_entrar.doClick();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                txt_usuario.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_senhaKeyPressed

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            txt_senha.requestFocus();
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void btn_conexaoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conexaoMousePressed
        valida();
    }//GEN-LAST:event_btn_conexaoMousePressed

    private void btn_conexaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_conexaoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_conexaoMouseReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Login.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_conexao;
    private javax.swing.JButton btn_entrar;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_dados;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        txt_senha.setText(null);
        txt_usuario.setText(null);
        txt_usuario.requestFocus();
    }

    private void valida() {
        if ((!txt_usuario.getText().trim().isEmpty() && txt_usuario.getText().toUpperCase().equals("ADMIN") == true)
                && (!txt_senha.getText().isEmpty() && Criptografia.criptografar(txt_senha.getText()).equals("80177534a0c99a7e3645b52f2027a48b") == true)) {
            Frm_Backup f = new Frm_Backup();
        } else {
            JOptionPane.showMessageDialog(null, "Você não tem permissão de alterar as configurações de conexão!");
        }
    }

    private void loga() {
        if (validaUsuario(txt_usuario.getText(), Criptografia.criptografar(txt_senha.getText())) == true) {
            Date dataAtual = new Date();
            if (verificaValidade(dataAtual) == true) {
                if (txt_usuario.getText().equals("ADMIN") == true) {
                    Frm_Principal f = new Frm_Principal("ADMINISTRADOR");
                    dispose();
                } else {
                    Frm_Principal f = new Frm_Principal(txt_usuario.getText());
                    dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
        }
    }

    private boolean verificaValidade(Date dataAtual) {
        Validade validade = new Validade();
        validadeDAO = new ValidadeDAO();
        boolean valido;
        try {
        validade = validadeDAO.getValidade();
        valido=true;
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, "Sistema não conseguiu localizar o prazo de validade!");
            valido=false;
        }
        if(valido==true){
        if (validade.getStatus().equals("DESBLOQUEADO") == true) {
            if (Data.comparaDatas(dataAtual, validade.getDataValidade()) == true) {
                int diferenca = Data.getDiferencaEntreDatas(
                        Data.getDataByDate(dataAtual, "dd/MM/yyyy"),
                        Data.getDataByDate(validade.getDataValidade(), "dd/MM/yyyy"));
                if (diferenca <= 10) {
                    JOptionPane.showMessageDialog(null, "Sua licença de avaliação expira em " + diferenca + " dias!");
                }
                return true;
            } else {
                validade.setStatus("BLOQUEADO");
                validadeDAO.altera(validade);
                btn_entrar.doClick();
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Período de avaliação da aplicação expirou!");
            int codigoLiberacao = Integer.parseInt(JOptionPane.showInputDialog("Informe o código de liberação:"));
            String data = codigoLiberacao / 5 + "";
            if (Data.comparaDatas(dataAtual, Data.getDataByTexto(Data.getDataByStringSemBarras(data), "dd/MM/yyyy")) == true) {
                validade.setDataValidade(Data.getDataByTexto(Data.getDataByStringSemBarras(data), "dd/MM/yyyy"));
                validade.setStatus("DESBLOQUEADO");
                validadeDAO.altera(validade);
                JOptionPane.showMessageDialog(null, "Senha prorrogada com sucesso para: " + Data.getDataByStringSemBarras(data));
            } else {
                JOptionPane.showMessageDialog(null, "Código inválido!");
            }
            return false;
        }
        }else{
            return false;
        }
    }
}
