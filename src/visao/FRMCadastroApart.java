package visao;

import controle.ApartamentoControle;
import modelo.ApartamentoBEAN;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FRMCadastroApart extends javax.swing.JFrame {

    private ApartamentoControle aControle = new ApartamentoControle();
    private ArrayList<ApartamentoBEAN> dados;
    private DefaultTableModel dTable;
    private int codigo;

    public FRMCadastroApart() {
        initComponents();

        this.preencheTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tpGuia = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblPrecoDiaria = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfPrecoDiaria = new javax.swing.JTextField();
        tfNumCamaCasal = new javax.swing.JTextField();
        tfNumCamaSolteiro = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfAndar = new javax.swing.JTextField();
        tipoQuarto = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jcbVentilador = new javax.swing.JCheckBox();
        jcbBanheira = new javax.swing.JCheckBox();
        jcbFrigobar = new javax.swing.JCheckBox();
        jcbAr = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        taObservacoes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNumHospedes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLocalizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApartamento = new javax.swing.JTable();

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/exit.png"))); // NOI18N
        jButton2.setText("Sair");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/file.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Apartamentos");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/g.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), new java.awt.Color(51, 153, 0)));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Apartamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel27.setText("Nome:");

        jLabel28.setText("Número:");

        jLabel29.setText("Andar:");

        jLabel30.setText("Núm. de Camas Solteiro:");

        jLabel31.setText("Núm. de camas casal:");

        lblPrecoDiaria.setText("Valor:");

        tfNome.setForeground(new java.awt.Color(153, 153, 153));
        tfNome.setText("Nome");
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNomeFocusLost(evt);
            }
        });

        tfPrecoDiaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecoDiariaActionPerformed(evt);
            }
        });

        tfNumCamaSolteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumCamaSolteiroActionPerformed(evt);
            }
        });

        tfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroActionPerformed(evt);
            }
        });

        tfAndar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAndarActionPerformed(evt);
            }
        });

        tipoQuarto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha um tipo de quarto:", "Simples", "Suíte", "Luxo" }));
        tipoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoQuartoActionPerformed(evt);
            }
        });

        jLabel33.setText("Tipo:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionais:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jcbVentilador.setText("Ventilador");
        jcbVentilador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jcbBanheira.setText("Banheira de Hidromassagem");

        jcbFrigobar.setText("Frigobar");
        jcbFrigobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFrigobarActionPerformed(evt);
            }
        });

        jcbAr.setText("Ar Condicionado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbAr)
                    .addComponent(jcbFrigobar)
                    .addComponent(jcbVentilador))
                .addGap(173, 173, 173))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbBanheira)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jcbVentilador)
                .addGap(18, 18, 18)
                .addComponent(jcbFrigobar)
                .addGap(18, 18, 18)
                .addComponent(jcbAr)
                .addGap(18, 18, 18)
                .addComponent(jcbBanheira)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        taObservacoes.setColumns(20);
        taObservacoes.setRows(5);
        jScrollPane2.setViewportView(taObservacoes);

        jLabel1.setText("Observações:");

        jLabel2.setText("Núm. de Hóspedes:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(tfNumCamaCasal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel30)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfNumCamaSolteiro))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(6, 6, 6)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfAndar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(16, 16, 16)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfNumHospedes))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(lblPrecoDiaria)
                                    .addGap(18, 18, 18)
                                    .addComponent(tfPrecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAndar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(tfNumCamaSolteiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(tfNumCamaCasal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNumHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecoDiaria)
                    .addComponent(tfPrecoDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/file.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/file.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/Sem título.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visao/icon/Delete-48_1.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpGuia.addTab("Cadastrar Apartamentos", jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 0), new java.awt.Color(51, 153, 0)));

        tableApartamento.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        tableApartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableApartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableApartamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableApartamento);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tpGuia.addTab("Listar Apartamentos", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpGuia))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(tpGuia)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        ApartamentoControle ap = new ApartamentoControle();

        ApartamentoBEAN apartamento = new ApartamentoBEAN();
        apartamento.setNumero(Integer.parseInt(tfNumero.getText()));
        apartamento.setNome(tfNome.getText());
        apartamento.setNumCamaCasal(Integer.parseInt(tfNumCamaCasal.getText()));
        apartamento.setNumCamaSolteiro(Integer.parseInt(tfNumCamaSolteiro.getText()));
        apartamento.setPrecoDiaria(Float.parseFloat(tfPrecoDiaria.getText()));
        apartamento.setAndar(Integer.parseInt(tfAndar.getText()));
        apartamento.setFrigobar(jcbFrigobar.isSelected());
        apartamento.setBanheiraHidromassagem(jcbBanheira.isSelected());
        apartamento.setVentilador(jcbVentilador.isSelected());
        apartamento.setArCondicionado(jcbAr.isSelected());
        apartamento.setNumHospedes(Integer.parseInt(tfNumHospedes.getText()));
        apartamento.setTipoQuarto(String.valueOf(tipoQuarto.getSelectedItem()));
        apartamento.setObs(taObservacoes.getText());

        ap.cadastrar(apartamento);
        limparCampos();
        this.preencheTabela();
        JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso");

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void jcbFrigobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFrigobarActionPerformed
    }//GEN-LAST:event_jcbFrigobarActionPerformed

    private void tipoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoQuartoActionPerformed
    }//GEN-LAST:event_tipoQuartoActionPerformed

    private void tfAndarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAndarActionPerformed
    }//GEN-LAST:event_tfAndarActionPerformed

    private void tfNumCamaSolteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumCamaSolteiroActionPerformed
    }//GEN-LAST:event_tfNumCamaSolteiroActionPerformed

    private void tfPrecoDiariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecoDiariaActionPerformed
    }//GEN-LAST:event_tfPrecoDiariaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ApartamentoBEAN apartamento = new ApartamentoBEAN();
        apartamento.setCodigo(codigo);
        apartamento.setNumero(Integer.parseInt(tfNumero.getText()));
        apartamento.setNome(tfNome.getText());
        apartamento.setNumCamaSolteiro(Integer.parseInt(tfNumCamaSolteiro.getText()));
        apartamento.setNumCamaCasal(Integer.parseInt(tfNumCamaCasal.getText()));
        apartamento.setPrecoDiaria(Float.parseFloat(tfPrecoDiaria.getText()));
        apartamento.setAndar(Integer.parseInt(tfAndar.getText()));
        apartamento.setFrigobar(jcbFrigobar.isSelected());
        apartamento.setBanheiraHidromassagem(jcbBanheira.isSelected());
        apartamento.setVentilador(jcbVentilador.isSelected());
        apartamento.setArCondicionado(jcbAr.isSelected());
        apartamento.setNumHospedes(Integer.parseInt(tfNumHospedes.getText()));
        apartamento.setTipoQuarto(String.valueOf(tipoQuarto.getSelectedItem()));
        apartamento.setObs(taObservacoes.getText());

        boolean retorno = aControle.editar(apartamento);
        if (retorno == true) {
            JOptionPane.showMessageDialog(null, "Apartamento MODIFICADO com sucesso");
            this.limparCampos();
            this.preencheTabela();
        } else {
            JOptionPane.showMessageDialog(null, "ERRO na EDIÇÃO do apartamento!");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusGained
        if (tfNome.getText().equals("Nome")) {
            tfNome.setText("");
            tfNome.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_tfNomeFocusGained

    private void tfNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNomeFocusLost
        if (tfNome.getText().equals("")) {
            tfNome.setText("Nome");
            tfNome.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_tfNomeFocusLost

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código do apartamento"));
        ApartamentoBEAN c = aControle.localizar(codigo);
        // string.valueOF =s converte de inteiro para string
        tfNome.setText(c.getNome());
        tfNumero.setText(String.valueOf(c.getNumero()));
        tfAndar.setText(String.valueOf(c.getAndar()));
        tfNumCamaCasal.setText(String.valueOf(c.getNumCamaCasal()));
        //String.valueOf transforma um objeto em int
        tfNumCamaSolteiro.setText(String.valueOf(c.getNumCamaSolteiro()));
        tipoQuarto.setSelectedItem(c.getTipoQuarto());
        tfNumHospedes.setText(String.valueOf(c.getNumHospedes()));
        tfPrecoDiaria.setText(String.valueOf(c.getPrecoDiaria()));
        jcbVentilador.setSelected(c.isVentilador());
        jcbAr.setSelected(c.isArCondicionado());
        jcbFrigobar.setSelected(c.isFrigobar());
        jcbBanheira.setSelected(c.isBanheiraHidromassagem());
        taObservacoes.setText(c.getObs());
        
        if(codigo == 0){
        JOptionPane.showMessageDialog(null, "O código deste apartamento é inexistente!");
        }
        
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        boolean retorno = aControle.remover(codigo);
        if (retorno == true) {
            JOptionPane.showMessageDialog(null, "Apartamento EXCLUÍDO com sucesso");
            this.preencheTabela();
            this.limparCampos();
        } else {
            JOptionPane.showMessageDialog(null, "ERRO na exclusão do apartamento");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroActionPerformed
    }//GEN-LAST:event_tfNumeroActionPerformed

    private void tableApartamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableApartamentoMouseClicked
        this.pegaSelecionado();
        tpGuia.setSelectedIndex(0);
    }//GEN-LAST:event_tableApartamentoMouseClicked

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
            java.util.logging.Logger.getLogger(FRMCadastroApart.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMCadastroApart.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMCadastroApart.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMCadastroApart.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMCadastroApart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcbAr;
    private javax.swing.JCheckBox jcbBanheira;
    private javax.swing.JCheckBox jcbFrigobar;
    private javax.swing.JCheckBox jcbVentilador;
    private javax.swing.JLabel lblPrecoDiaria;
    private javax.swing.JTextArea taObservacoes;
    private javax.swing.JTable tableApartamento;
    private javax.swing.JTextField tfAndar;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumCamaCasal;
    private javax.swing.JTextField tfNumCamaSolteiro;
    private javax.swing.JTextField tfNumHospedes;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPrecoDiaria;
    private javax.swing.JComboBox<String> tipoQuarto;
    private javax.swing.JTabbedPane tpGuia;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        tfNumero.setText("");
        tfNome.setText("");
        tfAndar.setText("");
        tfNumCamaCasal.setText("");
        tfNumCamaSolteiro.setText("");
        tipoQuarto.setSelectedIndex(0); //seleciona a primeira posição do combo
        tfNumHospedes.setText("");
        tfPrecoDiaria.setText("");
        jcbVentilador.setSelected(false);
        jcbAr.setSelected(false);
        jcbBanheira.setSelected(false);
        jcbFrigobar.setSelected(false);
        taObservacoes.setText("");

    }

    private void preencheTabela() {
        dTable = criaTabela();
        dTable.addColumn("Código");
        dTable.addColumn("Nome");
        dTable.addColumn("Número");
        dTable.addColumn("Camas Casal");
        dTable.addColumn("Camas Solteiro");
        dTable.addColumn("Preço Diária");
        
        


        
        dados = aControle.listarALL();

        for (ApartamentoBEAN dado : dados) {
            dTable.addRow(new Object[]{dado.getCodigo(), dado.getNome(),
              dado.getNumero(), dado.getNumCamaCasal(), dado.getNumCamaSolteiro(), dado.getPrecoDiaria()});
        }
        tableApartamento.setModel(dTable);

    }

    private DefaultTableModel criaTabela() {
        //sempre que usar JTable é necessário ter um DefaulttableModel
        DefaultTableModel dTable = new DefaultTableModel() {
            //Define o tipo dos campos (coluna) na mesma ordem que as colunas foram criadas
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                 false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        ;

        };
    return dTable;
    }

    private void pegaSelecionado() {
        int linha = retornaLinha();
        dados = aControle.listarALL();
        tfNumero.setText(String.valueOf(dados.get(linha).getNumero()));
        tfNome.setText(dados.get(linha).getNome());
        tfNumCamaSolteiro.setText(String.valueOf(dados.get(linha).getNumCamaSolteiro()));
        tfNumCamaCasal.setText(String.valueOf(dados.get(linha).getNumCamaCasal()));    
        tfPrecoDiaria.setText(String.valueOf(dados.get(linha).getPrecoDiaria()));   
        tfAndar.setText(String.valueOf(dados.get(linha).getAndar()));  
        jcbFrigobar.setSelected((dados.get(linha).isFrigobar()));   
       jcbBanheira.setSelected((dados.get(linha).isBanheiraHidromassagem()));   
        jcbVentilador.setSelected((dados.get(linha).isVentilador()));   
        jcbAr.setSelected((dados.get(linha).isArCondicionado()));   
        tfNumHospedes.setText(String.valueOf(dados.get(linha).getNumHospedes()));   
        tipoQuarto.setSelectedItem(dados.get(linha).getTipoQuarto());   
        taObservacoes.setText(dados.get(linha).getObs());
        codigo= dados.get(linha).getCodigo();
    }

    private int retornaLinha() {
        int linha = tableApartamento.getSelectedRow();
        return linha;
    }
}
//try{
   //javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/##");
   //SeuJTextField = new javax.swing.JFormattedTextField(data);
//}
   //catch (Exception e){
//} // usar máscara para data , cpf e telefone se for preciso