/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Controller.CidadeDAO;
import Controller.ClienteDAO;
import Model.Cidade;
import Model.Cliente;
import Model.Corrida;
import Util.Classes.IntegerDocument;
import Util.Classes.TableConfig;
import Util.Classes.UpperDocument;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Frm_CadCorrida extends javax.swing.JFrame {

    ClienteDAO clienteDAO;
    CidadeDAO cidadeDAO;

    public Frm_CadCorrida(Corrida corrida) {
        initComponents();
        setVisible(true);
        setEnabledButtons(true);
        limparCampos();
        setFieldsCase();
        carregaCidade();
        listaClientes();
        if (corrida == null) {
            abas.setSelectedIndex(1);
        } else {
            abas.setSelectedIndex(0);
            setCorridaNaTela(corrida);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        abas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        cbx_motorista = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        pnl_endDestino = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_enderecoDestino = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_bairroDestino = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbx_cidadesDestino = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txt_numeroDestino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_enderecoOrigem = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_bairroOrigem = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbx_cidadesOrigem = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txt_numeroOrigem = new javax.swing.JTextField();
        txt_valor = new javax.swing.JTextField();
        txt_nomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_passageiros = new javax.swing.JTextField();
        btn_AlterarCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        pnl_pesquisa2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_filtro = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_clientes = new javax.swing.JTable();
        btn_selecionar = new javax.swing.JButton();
        btn_novo = new javax.swing.JButton();
        btn_novo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lançamento de Corrida");
        setResizable(false);

        abas.setEnabled(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/salvar.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setText("Motorista:");

        pnl_endDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Destino"));

        jLabel5.setText("Endereço *:");

        jLabel17.setText("Bairro *:");

        jLabel18.setText("Cidade *:");

        jLabel19.setText("Numero *:");

        javax.swing.GroupLayout pnl_endDestinoLayout = new javax.swing.GroupLayout(pnl_endDestino);
        pnl_endDestino.setLayout(pnl_endDestinoLayout);
        pnl_endDestinoLayout.setHorizontalGroup(
            pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_endDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_endDestinoLayout.createSequentialGroup()
                        .addComponent(txt_enderecoDestino)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_numeroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_endDestinoLayout.createSequentialGroup()
                        .addComponent(txt_bairroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_cidadesDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_endDestinoLayout.setVerticalGroup(
            pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_endDestinoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txt_numeroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_enderecoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_endDestinoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_bairroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cbx_cidadesDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Nome:");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço Origem"));

        jLabel4.setText("Endereço *:");

        jLabel14.setText("Bairro *:");

        jLabel15.setText("Cidade *:");

        jLabel16.setText("Numero *:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_enderecoOrigem)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_numeroOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_bairroOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_cidadesOrigem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_numeroOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_enderecoOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_bairroOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cbx_cidadesOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_valorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_valorFocusLost(evt);
            }
        });

        txt_nomeCliente.setEnabled(false);

        jLabel3.setText("Valor *:");

        jLabel2.setText("Passageiros:");

        txt_passageiros.setEnabled(false);
        txt_passageiros.setVerifyInputWhenFocusTarget(false);

        btn_AlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/buscar.png"))); // NOI18N
        btn_AlterarCliente.setVerifyInputWhenFocusTarget(false);
        btn_AlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_endDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_nomeCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_AlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_passageiros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_motorista, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_AlterarCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nomeCliente)
                    .addComponent(txt_passageiros)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_endDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbx_motorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel3)
                    .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        abas.addTab("Lançamento da Corrida", jPanel2);

        pnl_pesquisa2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Filtro:");

        txt_filtro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filtroKeyReleased(evt);
            }
        });

        tb_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Telefone", "Telefone2", "Nome", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_clientes.getTableHeader().setReorderingAllowed(false);
        tb_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tb_clientesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tb_clientes);
        if (tb_clientes.getColumnModel().getColumnCount() > 0) {
            tb_clientes.getColumnModel().getColumn(0).setMinWidth(75);
            tb_clientes.getColumnModel().getColumn(0).setPreferredWidth(75);
            tb_clientes.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        javax.swing.GroupLayout pnl_pesquisa2Layout = new javax.swing.GroupLayout(pnl_pesquisa2);
        pnl_pesquisa2.setLayout(pnl_pesquisa2Layout);
        pnl_pesquisa2Layout.setHorizontalGroup(
            pnl_pesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnl_pesquisa2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 206, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_pesquisa2Layout.setVerticalGroup(
            pnl_pesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_pesquisa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_pesquisa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/selecionar.png"))); // NOI18N
        btn_selecionar.setText("Selecionar");
        btn_selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarActionPerformed(evt);
            }
        });

        btn_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/selecionar.png"))); // NOI18N
        btn_novo.setText("Novo");
        btn_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novoActionPerformed(evt);
            }
        });

        btn_novo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Util/Img/carregar.png"))); // NOI18N
        btn_novo1.setText("Atualizar");
        btn_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_pesquisa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_novo1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_pesquisa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionar)
                    .addComponent(btn_novo)
                    .addComponent(btn_novo1))
                .addContainerGap())
        );

        abas.addTab("Pesquisa de Cliente", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abas)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_valorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_valorFocusGained
        txt_valor.setText(txt_valor.getText().replace("R$", "").replace(".", ""));
    }//GEN-LAST:event_txt_valorFocusGained

    private void txt_valorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_valorFocusLost
        txt_valor.setText(NumberFormat.getCurrencyInstance().format(Double.parseDouble(txt_valor.getText().replace("R$", "").replace(".", "").replace(",", "."))));
    }//GEN-LAST:event_txt_valorFocusLost

    private void txt_filtroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filtroKeyReleased
        TableConfig.filtrar(tb_clientes, txt_filtro);
    }//GEN-LAST:event_txt_filtroKeyReleased

    private void tb_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_clientesMousePressed
        if (tb_clientes.getSelectedRowCount() == 1) {
            //            clienteDAO = new ClienteDAO();
            //            setClienteNaTela(clienteDAO.buscarbyCodigo(Integer.parseInt(tb_clientes.getValueAt(tb_clientes.getSelectedRow(), 0).toString())));
        }
    }//GEN-LAST:event_tb_clientesMousePressed

    private void btn_AlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarClienteActionPerformed
        abas.setSelectedIndex(1);
    }//GEN-LAST:event_btn_AlterarClienteActionPerformed

    private void btn_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novoActionPerformed
        Frm_CadCliente f = new Frm_CadCliente();
    }//GEN-LAST:event_btn_novoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed

    }//GEN-LAST:event_btn_salvarActionPerformed

    private void btn_selecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarActionPerformed
        if (tb_clientes.getSelectedRowCount() == 1) {
            try {
                clienteDAO = new ClienteDAO();
                setClienteNaTela(clienteDAO.buscar(Integer.parseInt(tb_clientes.getValueAt(tb_clientes.getSelectedRow(), 0).toString())));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar o Cliente " + tb_clientes.getValueAt(tb_clientes.getSelectedRow(), 0).toString() + "\n" + e);
            }
        }
    }//GEN-LAST:event_btn_selecionarActionPerformed

    private void btn_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_novo1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_CadCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_CadCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new Frm_CadCorrida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private javax.swing.JButton btn_AlterarCliente;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_novo;
    private javax.swing.JButton btn_novo1;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_selecionar;
    private javax.swing.JComboBox cbx_cidadesDestino;
    private javax.swing.JComboBox cbx_cidadesOrigem;
    private javax.swing.JComboBox cbx_motorista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_endDestino;
    private javax.swing.JPanel pnl_pesquisa2;
    private javax.swing.JTable tb_clientes;
    private javax.swing.JTextField txt_bairroDestino;
    private javax.swing.JTextField txt_bairroOrigem;
    private javax.swing.JTextField txt_enderecoDestino;
    private javax.swing.JTextField txt_enderecoOrigem;
    private javax.swing.JTextField txt_filtro;
    private javax.swing.JTextField txt_nomeCliente;
    private javax.swing.JTextField txt_numeroDestino;
    private javax.swing.JTextField txt_numeroOrigem;
    private javax.swing.JTextField txt_passageiros;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    private void setClienteNaTela(Cliente cliente) {
        try {
            txt_nomeCliente.setText(cliente.getNome());
            txt_passageiros.setText(cliente.getPassageiros() + "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar os dados do Cliente na tela!\n" + e);
        }
    }

    private void carregaCidade() {
        try {
            cidadeDAO = new CidadeDAO();
            cbx_cidadesDestino.removeAllItems();
            cbx_cidadesOrigem.removeAllItems();
            for (Cidade cidade : cidadeDAO.listar()) {
                cbx_cidadesDestino.addItem(cidade.getDescricao());
                cbx_cidadesOrigem.addItem(cidade.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar as Cidades!\n" + e);
        }
    }

    private void setFieldsCase() {
        txt_nomeCliente.setDocument(new UpperDocument(255));
        txt_passageiros.setDocument(new IntegerDocument(3));
        //endereço destino
        txt_enderecoDestino.setDocument(new UpperDocument(255));
        txt_bairroDestino.setDocument(new UpperDocument(255));
        txt_numeroDestino.setDocument(new IntegerDocument(5));
        //endereco principal
        txt_enderecoOrigem.setDocument(new UpperDocument(255));
        txt_bairroOrigem.setDocument(new UpperDocument(255));
        txt_numeroOrigem.setDocument(new IntegerDocument(5));

        txt_enderecoDestino.setDocument(new UpperDocument(255));
        txt_bairroDestino.setDocument(new UpperDocument(255));
        txt_numeroDestino.setDocument(new IntegerDocument(5));
    }

    private void setEnabledFields(boolean b) {
        txt_nomeCliente.setEnabled(b);
        txt_passageiros.setEnabled(b);
        //endereço destino
        txt_enderecoDestino.setEnabled(b);
        txt_bairroDestino.setEnabled(b);
        txt_numeroDestino.setEnabled(b);
        //endereco principal
        txt_enderecoOrigem.setEnabled(b);
        txt_bairroOrigem.setEnabled(b);
        txt_numeroOrigem.setEnabled(b);

        txt_enderecoDestino.setEnabled(b);
        txt_bairroDestino.setEnabled(b);
        txt_numeroDestino.setEnabled(b);
        txt_filtro.setEnabled(!b);
    }

    private void setEnabledButtons(boolean b) {
        btn_novo.setEnabled(b);
        btn_salvar.setEnabled(!b);
        btn_cancelar.setEnabled(!b);
        tb_clientes.setEnabled(b);
        btn_novo.requestFocus();
        setEnabledFields(!b);
    }

    private void limparCampos() {
        txt_nomeCliente.setText(null);
        txt_passageiros.setText(null);
        //endereço destino
        txt_enderecoDestino.setText(null);
        txt_bairroDestino.setText(null);
        txt_numeroDestino.setText(null);
        //endereco principal
        txt_enderecoOrigem.setText(null);
        txt_bairroOrigem.setText(null);
        txt_numeroOrigem.setText(null);

        txt_enderecoDestino.setText(null);
        txt_bairroDestino.setText(null);
        txt_numeroDestino.setText(null);
        txt_filtro.setText(null);
    }

    private void setCorridaNaTela(Corrida corrida) {
        try {
            txt_nomeCliente.setText(corrida.getCodcliente().getNome());
            txt_passageiros.setText(corrida.getCodcliente().getPassageiros()+"");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Carregar a corrida na tela!\n"+e);
        }
    }

    private void listaClientes() {
        try {
            clienteDAO = new ClienteDAO();
            TableConfig.limpaTabela(tb_clientes);
            for (Cliente cliente : clienteDAO.listar()) {
                String[] linha = new String[]{cliente.getCodcliente().toString(),
                    cliente.getTelefone1(),
                    cliente.getTelefone2(),
                    cliente.getNome(),
                    getEnderecoByCliente(cliente)
                };
                TableConfig.getModel(tb_clientes).addRow(linha);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar os Clientes!\n" + e);
        }
    }

    private String getEnderecoByCliente(Cliente cliente) {
        if (cliente.getCorridaList().isEmpty()) {
            return "Vazio";
        } else {
            Corrida ultimaCorrida = new Corrida();
            for (Corrida corrida : cliente.getCorridaList()) {
                ultimaCorrida = corrida;
            }
            return ultimaCorrida.getCodenderecoDestino().getEndereco();
        }
    }
}
