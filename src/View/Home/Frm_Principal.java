package View.Home;

import Util.Classes.Data;
import Util.Classes.MySQLBackup;
import Util.Classes.PropertiesManager;
import View.Cadastros.Frm_CadCidade;
import View.Cadastros.Frm_CadCliente;
import View.Cadastros.Frm_CadCorrida;
import View.Cadastros.Frm_CadMotorista;
import View.Cadastros.Frm_CadUsuario;
import View.Cadastros.Frm_CadViagem;
import View.Consulta.Frm_ConsRotas;
import View.Consulta.Frm_ConsViagens;
import View.Relatorios.Frm_RelFaturamento;
import java.awt.Event;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frm_Principal extends javax.swing.JFrame {

    public static Frm_Principal j = null;
    int tentativas;

    public Frm_Principal(String usuario) {
        initComponents();
        txt_usuarioLogado.setText(usuario);
        setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Thread acao;
        acao = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        lb_data.setText(Data.getData("EEEE, d' de 'MMMM' de 'yyyy"));
                        lb_hora.setText(Data.getData("HH:mm:ss"));
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Frm_Principal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
        );
        acao.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_atalhos = new javax.swing.JPanel();
        atalho2 = new javax.swing.JPanel();
        atalhoCadClientes = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        atalho3 = new javax.swing.JPanel();
        atalhoEmissaoContrato = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        atalho4 = new javax.swing.JPanel();
        atalhoConsRetDev = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        atalho5 = new javax.swing.JPanel();
        atalhoLancCaixa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        atalho6 = new javax.swing.JPanel();
        atalhoConsPrecoViagens = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnl_rodape = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuarioLogado = new javax.swing.JTextField();
        lb_data = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_hora = new javax.swing.JLabel();
        Menu_barra = new javax.swing.JMenuBar();
        menu_cadastros = new javax.swing.JMenu();
        item_cadCliente = new javax.swing.JMenuItem();
        item_cadCidade = new javax.swing.JMenuItem();
        item_cadCorrida = new javax.swing.JMenuItem();
        item_cadMotorista = new javax.swing.JMenuItem();
        item_cadViagens = new javax.swing.JMenuItem();
        item_cadUsuario = new javax.swing.JMenuItem();
        menu_consulta = new javax.swing.JMenu();
        item_consCorridas = new javax.swing.JMenuItem();
        item_consPrecoViagens = new javax.swing.JMenuItem();
        menu_relatorios = new javax.swing.JMenu();
        item_retFaturamentoPorPeriodo = new javax.swing.JMenuItem();
        menu_utilitarios = new javax.swing.JMenu();
        item_backup = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MozartApp 1.0");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnl_atalhos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        atalhoCadClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoCadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cadCliente.png"))); // NOI18N
        atalhoCadClientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoCadClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoCadClientesMousePressed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cadastro de Clientes");

        javax.swing.GroupLayout atalho2Layout = new javax.swing.GroupLayout(atalho2);
        atalho2.setLayout(atalho2Layout);
        atalho2Layout.setHorizontalGroup(
            atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoCadClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho2Layout.setVerticalGroup(
            atalho2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoCadClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        atalhoEmissaoContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoEmissaoContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/corridas.png"))); // NOI18N
        atalhoEmissaoContrato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoEmissaoContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoEmissaoContratoMousePressed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Lançar Corrida");

        javax.swing.GroupLayout atalho3Layout = new javax.swing.GroupLayout(atalho3);
        atalho3.setLayout(atalho3Layout);
        atalho3Layout.setHorizontalGroup(
            atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoEmissaoContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho3Layout.setVerticalGroup(
            atalho3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoEmissaoContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        atalhoConsRetDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoConsRetDev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/consRotas.png"))); // NOI18N
        atalhoConsRetDev.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoConsRetDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoConsRetDevMousePressed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Lista de Corridas");

        javax.swing.GroupLayout atalho4Layout = new javax.swing.GroupLayout(atalho4);
        atalho4.setLayout(atalho4Layout);
        atalho4Layout.setHorizontalGroup(
            atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoConsRetDev, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho4Layout.setVerticalGroup(
            atalho4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoConsRetDev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        atalhoLancCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoLancCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/lancCaixa.png"))); // NOI18N
        atalhoLancCaixa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoLancCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoLancCaixaMousePressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Relatório de Faturamento");

        javax.swing.GroupLayout atalho5Layout = new javax.swing.GroupLayout(atalho5);
        atalho5.setLayout(atalho5Layout);
        atalho5Layout.setHorizontalGroup(
            atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoLancCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho5Layout.setVerticalGroup(
            atalho5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoLancCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        atalhoConsPrecoViagens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        atalhoConsPrecoViagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/consulta.png"))); // NOI18N
        atalhoConsPrecoViagens.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        atalhoConsPrecoViagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atalhoConsPrecoViagensMousePressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Preço de Viagens");

        javax.swing.GroupLayout atalho6Layout = new javax.swing.GroupLayout(atalho6);
        atalho6.setLayout(atalho6Layout);
        atalho6Layout.setHorizontalGroup(
            atalho6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atalho6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalhoConsPrecoViagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addContainerGap())
        );
        atalho6Layout.setVerticalGroup(
            atalho6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atalho6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalhoConsPrecoViagens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_atalhosLayout = new javax.swing.GroupLayout(pnl_atalhos);
        pnl_atalhos.setLayout(pnl_atalhosLayout);
        pnl_atalhosLayout.setHorizontalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atalho2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(atalho6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_atalhosLayout.setVerticalGroup(
            pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_atalhosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnl_atalhosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atalho6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atalho5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnl_rodape.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Bem Vindo (a):");

        txt_usuarioLogado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usuarioLogado.setEnabled(false);

        lb_data.setForeground(new java.awt.Color(0, 0, 51));
        lb_data.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel2.setFont(new java.awt.Font("Adobe Garamond Pro", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Desenvolvido por TCS Sistemas ");

        lb_hora.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        lb_hora.setForeground(new java.awt.Color(51, 0, 0));
        lb_hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_hora.setText("00:00");

        javax.swing.GroupLayout pnl_rodapeLayout = new javax.swing.GroupLayout(pnl_rodape);
        pnl_rodape.setLayout(pnl_rodapeLayout);
        pnl_rodapeLayout.setHorizontalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_data, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_hora)
                .addGap(6, 6, 6))
        );
        pnl_rodapeLayout.setVerticalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rodapeLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_data, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_usuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb_hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_atalhos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_rodape, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addComponent(pnl_atalhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addComponent(pnl_rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu_cadastros.setText("Cadastros");

        item_cadCliente.setText("Cliente");
        item_cadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadClienteActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadCliente);

        item_cadCidade.setText("Cidade");
        item_cadCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadCidadeActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadCidade);

        item_cadCorrida.setText("Corrida");
        item_cadCorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadCorridaActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadCorrida);

        item_cadMotorista.setText("Motorista");
        item_cadMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadMotoristaActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadMotorista);

        item_cadViagens.setText("Viagens");
        item_cadViagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadViagensActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadViagens);

        item_cadUsuario.setText("Usuário");
        item_cadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_cadUsuarioActionPerformed(evt);
            }
        });
        menu_cadastros.add(item_cadUsuario);

        Menu_barra.add(menu_cadastros);

        menu_consulta.setText("Consulta");

        item_consCorridas.setText("Lista de Corridas");
        item_consCorridas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_consCorridasActionPerformed(evt);
            }
        });
        menu_consulta.add(item_consCorridas);

        item_consPrecoViagens.setText("Lista preço de viagens");
        item_consPrecoViagens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_consPrecoViagensActionPerformed(evt);
            }
        });
        menu_consulta.add(item_consPrecoViagens);

        Menu_barra.add(menu_consulta);

        menu_relatorios.setText("Relatorios");

        item_retFaturamentoPorPeriodo.setText("Faturamento por período");
        item_retFaturamentoPorPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_retFaturamentoPorPeriodoActionPerformed(evt);
            }
        });
        menu_relatorios.add(item_retFaturamentoPorPeriodo);

        Menu_barra.add(menu_relatorios);

        menu_utilitarios.setText("Utilitários");

        item_backup.setText("Fazer Backup");
        item_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_backupActionPerformed(evt);
            }
        });
        menu_utilitarios.add(item_backup);

        Menu_barra.add(menu_utilitarios);

        setJMenuBar(Menu_barra);

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

        setSize(new java.awt.Dimension(1269, 676));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == Event.ESCAPE) {
            if (JOptionPane.showConfirmDialog(null, "Deseja realmente Sair?", "Saindo", 0) == 0) {
                Frm_Login f = new Frm_Login();
                dispose();
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void item_retFaturamentoPorPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_retFaturamentoPorPeriodoActionPerformed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_RelFaturamento f = new Frm_RelFaturamento();
    }//GEN-LAST:event_item_retFaturamentoPorPeriodoActionPerformed

    private void atalhoCadClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoCadClientesMousePressed
        Frm_CadCliente f = new Frm_CadCliente();
    }//GEN-LAST:event_atalhoCadClientesMousePressed

    private void item_cadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadClienteActionPerformed
        Frm_CadCliente f = new Frm_CadCliente();
    }//GEN-LAST:event_item_cadClienteActionPerformed

    private void item_cadMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadMotoristaActionPerformed
        Frm_CadMotorista f = new Frm_CadMotorista();
    }//GEN-LAST:event_item_cadMotoristaActionPerformed

    private void item_cadViagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadViagensActionPerformed
        Frm_CadViagem f = new Frm_CadViagem();
    }//GEN-LAST:event_item_cadViagensActionPerformed

    private void item_cadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadUsuarioActionPerformed
        Frm_CadUsuario f = new Frm_CadUsuario();
    }//GEN-LAST:event_item_cadUsuarioActionPerformed

    private void atalhoEmissaoContratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoEmissaoContratoMousePressed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_CadCorrida f= new Frm_CadCorrida();
    }//GEN-LAST:event_atalhoEmissaoContratoMousePressed

    private void atalhoConsRetDevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoConsRetDevMousePressed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_ConsRotas f= new Frm_ConsRotas();
    }//GEN-LAST:event_atalhoConsRetDevMousePressed

    private void atalhoLancCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoLancCaixaMousePressed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_RelFaturamento f = new Frm_RelFaturamento();
    }//GEN-LAST:event_atalhoLancCaixaMousePressed

    private void item_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_backupActionPerformed
        PropertiesManager props = new PropertiesManager();
        MySQLBackup mySQLBackup = new MySQLBackup(
                props.ler("usuario"),
                props.ler("senha"),
                props.ler("banco"),
                props.ler("dump"),
                props.ler("destinoBackup")
        );
    }//GEN-LAST:event_item_backupActionPerformed

    private void item_consCorridasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_consCorridasActionPerformed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_ConsRotas f = new Frm_ConsRotas();
    }//GEN-LAST:event_item_consCorridasActionPerformed

    private void atalhoConsPrecoViagensMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atalhoConsPrecoViagensMousePressed
        Frm_ConsViagens f = new Frm_ConsViagens();
    }//GEN-LAST:event_atalhoConsPrecoViagensMousePressed

    private void item_cadCorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadCorridaActionPerformed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_CadCorrida f = new Frm_CadCorrida();
    }//GEN-LAST:event_item_cadCorridaActionPerformed

    private void item_consPrecoViagensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_consPrecoViagensActionPerformed
        JOptionPane.showMessageDialog(null, "Módulo ainda não desenvolvido!");
//        Frm_ConsViagens f = new Frm_ConsViagens();
    }//GEN-LAST:event_item_consPrecoViagensActionPerformed

    private void item_cadCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_cadCidadeActionPerformed
        Frm_CadCidade f= new Frm_CadCidade();
    }//GEN-LAST:event_item_cadCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_Principal();
            }
        });
        //Listener que capitura o evento "minimizar"

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu_barra;
    private javax.swing.JPanel atalho2;
    private javax.swing.JPanel atalho3;
    private javax.swing.JPanel atalho4;
    private javax.swing.JPanel atalho5;
    private javax.swing.JPanel atalho6;
    private javax.swing.JLabel atalhoCadClientes;
    private javax.swing.JLabel atalhoConsPrecoViagens;
    private javax.swing.JLabel atalhoConsRetDev;
    private javax.swing.JLabel atalhoEmissaoContrato;
    private javax.swing.JLabel atalhoLancCaixa;
    private javax.swing.JMenuItem item_backup;
    private javax.swing.JMenuItem item_cadCidade;
    private javax.swing.JMenuItem item_cadCliente;
    private javax.swing.JMenuItem item_cadCorrida;
    private javax.swing.JMenuItem item_cadMotorista;
    private javax.swing.JMenuItem item_cadUsuario;
    private javax.swing.JMenuItem item_cadViagens;
    private javax.swing.JMenuItem item_consCorridas;
    private javax.swing.JMenuItem item_consPrecoViagens;
    private javax.swing.JMenuItem item_retFaturamentoPorPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_data;
    private javax.swing.JLabel lb_hora;
    private javax.swing.JMenu menu_cadastros;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenu menu_relatorios;
    private javax.swing.JMenu menu_utilitarios;
    private javax.swing.JPanel pnl_atalhos;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_rodape;
    private javax.swing.JTextField txt_usuarioLogado;
    // End of variables declaration//GEN-END:variables

}
