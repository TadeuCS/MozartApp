/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Home;

import Controller.ValidadeDAO;
import Model.Validade;
import Util.Classes.Data;
import Util.Classes.FileChoserManager;
import Util.Classes.MySQLBackup;
import Util.Classes.PropertiesManager;
import java.awt.Event;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.persistence.NoResultException;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Tadeu
 */
public class Frm_Backup extends javax.swing.JFrame {

    PropertiesManager props;
    MySQLBackup mySQLBackup;
    Data data;
    ValidadeDAO validadeDAO;
    Validade validade;

    public Frm_Backup() {
        initComponents();
        setVisible(true);
        carregaDados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_servidor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_banco = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_testar = new javax.swing.JButton();
        txt_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txt_validade = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_backup = new javax.swing.JButton();
        btn_restore = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_dump = new javax.swing.JTextField();
        btn_buscarDump = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_destino = new javax.swing.JTextField();
        btn_buscarDestino = new javax.swing.JButton();
        btn_gravarBackup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração do Banco de dados");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Banco de dados"));

        jLabel1.setText("Servidor *:");

        jLabel2.setText("Senha *:");

        jLabel5.setText("Usuário *:");

        jLabel6.setText("Banco *:");

        btn_gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_gravar.setText("Gravar");
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });

        btn_testar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_testar.setText("Testar");
        btn_testar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_testarActionPerformed(evt);
            }
        });

        jLabel3.setText("Validade:");

        txt_validade.setEditable(false);
        try {
            txt_validade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_validade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_validade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_validadeMousePressed(evt);
            }
        });
        txt_validade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_validadeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_senha)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_validade, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_servidor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_banco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_testar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_validade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Backuip e Restore"));

        btn_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/backup.png"))); // NOI18N
        btn_backup.setText("Backup");
        btn_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backupActionPerformed(evt);
            }
        });

        btn_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/restore.png"))); // NOI18N
        btn_restore.setText("Restore");

        jLabel4.setText("MySqlDump *:");

        btn_buscarDump.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/buscar.png"))); // NOI18N
        btn_buscarDump.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarDumpActionPerformed(evt);
            }
        });

        jLabel7.setText("Destino *:");

        btn_buscarDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/buscar.png"))); // NOI18N
        btn_buscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarDestinoActionPerformed(evt);
            }
        });

        btn_gravarBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_gravarBackup.setText("Gravar");
        btn_gravarBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarBackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_destino)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_dump)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarDump, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_gravarBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_dump, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(btn_buscarDump))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(btn_buscarDestino))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_restore, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gravarBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarDumpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarDumpActionPerformed
        txt_dump.setText(FileChoserManager.open().replace("\\", "/"));
    }//GEN-LAST:event_btn_buscarDumpActionPerformed

    private void btn_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backupActionPerformed
        validaCampos();
    }//GEN-LAST:event_btn_backupActionPerformed

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        try {
            props = new PropertiesManager();
            validadeDAO = new ValidadeDAO();
            validade = new Validade();
            validade = validadeDAO.getValidade();
            validade.setDataValidade(Data.getDataByTexto(txt_validade.getText(), "dd/MM/yyyy"));
            validadeDAO.altera(validade);
            JOptionPane.showMessageDialog(null, "Informações gravadas com sucesso!");
        } catch (NoResultException no) {
            validade = new Validade();
            validade.setDataValidade(Data.getDataByTexto(txt_validade.getText(), "dd/MM/yyyy"));
            validade.setStatus("DESBLOQUEADO");
            validadeDAO.altera(validade);
            JOptionPane.showMessageDialog(null, "Informações gravadas com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as informações!\n" + e);
        } finally {
            props.altera("ip", txt_servidor.getText());
            props.altera("dump", txt_dump.getText());
            props.altera("banco", txt_banco.getText());
            props.altera("usuario", txt_usuario.getText());
            props.altera("senha", txt_senha.getText());
            dispose();
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_testarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_testarActionPerformed
        getConexao(txt_servidor.getText(),
                txt_banco.getText(),
                txt_usuario.getText(),
                txt_senha.getText());
    }//GEN-LAST:event_btn_testarActionPerformed

    private void txt_validadeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_validadeMousePressed
        if (txt_validade.isEditable() == false) {
            JLabel label = new JLabel("Digite a senha:");
            JPasswordField jpf = new JPasswordField();
            JOptionPane.showConfirmDialog(null,
                    new Object[]{label, jpf}, "Password:",
                    JOptionPane.OK_CANCEL_OPTION);

            if (jpf.getText().equals("mutkch") == true) {
                txt_validade.setEditable(true);
            } else {
                txt_validade.setEditable(false);
            }
        }
    }//GEN-LAST:event_txt_validadeMousePressed

    private void txt_validadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_validadeKeyPressed
        if (evt.getKeyCode() == Event.ENTER) {
            data = new Data();
            txt_validade.setText(data.completaData(txt_validade.getText(), "dd/MM/yyyy"));
        }
    }//GEN-LAST:event_txt_validadeKeyPressed

    private void btn_buscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarDestinoActionPerformed
        txt_destino.setText(FileChoserManager.save().replace("\\", "/"));
    }//GEN-LAST:event_btn_buscarDestinoActionPerformed

    private void btn_gravarBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarBackupActionPerformed
        try {
            props = new PropertiesManager();
            props.altera("destinoBackup", txt_destino.getText());
            JOptionPane.showMessageDialog(null, "Informações gravadas com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as informações!\n" + e);
        }
    }//GEN-LAST:event_btn_gravarBackupActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_backup;
    private javax.swing.JButton btn_buscarDestino;
    private javax.swing.JButton btn_buscarDump;
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_gravarBackup;
    private javax.swing.JButton btn_restore;
    private javax.swing.JButton btn_testar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_banco;
    private javax.swing.JTextField txt_destino;
    private javax.swing.JTextField txt_dump;
    private javax.swing.JPasswordField txt_senha;
    private javax.swing.JTextField txt_servidor;
    private javax.swing.JTextField txt_usuario;
    private javax.swing.JFormattedTextField txt_validade;
    // End of variables declaration//GEN-END:variables

    private void carregaDados() {
        props = new PropertiesManager();
        txt_usuario.setText(props.ler("usuario"));
        txt_senha.setText(props.ler("senha"));
        txt_servidor.setText(props.ler("ip"));
        txt_banco.setText(props.ler("banco"));
        txt_dump.setText(props.ler("dump"));
        txt_destino.setText(props.ler("destinoBackup"));
        validadeDAO = new ValidadeDAO();
        try{
        txt_validade.setText(Data.getDataByDate(validadeDAO.getValidade().getDataValidade(), "dd/MM/yyyy"));
        }catch(NoResultException e){
            validade=new Validade();
        }
    }

    private void validaCampos() {
        if (txt_usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuário inválido!");
            txt_usuario.requestFocus();
        } else {
            if (txt_senha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Senha inválida!");
                txt_senha.requestFocus();
            } else {
                if (txt_banco.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Banco inválido!");
                    txt_banco.requestFocus();
                } else {
                    if (txt_servidor.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Servidor inválido!");
                        txt_servidor.requestFocus();
                    } else {
                        if (txt_dump.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Caminho do executavel DUMP inválido!");
                            txt_dump.requestFocus();
                        } else {
                            mySQLBackup = new MySQLBackup(
                                    txt_usuario.getText(),
                                    txt_senha.getText(),
                                    txt_banco.getText(),
                                    txt_dump.getText(),
                                    txt_destino.getText()
                            );
                        }
                    }
                }
            }
        }
    }

    public void getConexao(String servidor, String diretorio, String usuario, String senha) {
        try {
            Connection con;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://" + servidor + ":3306/" + diretorio + "?zeroDateTimeBehavior=convertToNull",
                    usuario,
                    senha);
            Statement st = con.createStatement();
            JOptionPane.showMessageDialog(null, "Conexão bem sucedida!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados!\n" + e);
        }
    }
}
