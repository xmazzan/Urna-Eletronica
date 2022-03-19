package urnaeletronica;

import LimitaCaracteres.LimitaCaracteres;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;


public class urna extends javax.swing.JFrame {
    candidato c1 = new candidato("Fabio","Meu delega","PQP",13);
    candidato c2 = new candidato("Bolorado","Morada","PMlcia",17);
    candidato c3 = new candidato("Margarina","Sementinha","Verde",18);
    candidato c4 = new candidato("Vader","Palpatine","PEM",66);
    candidato c5 = new candidato("Nulo","Nulo","Nulo",00);
    candidato c6 = new candidato("Branco","Branco","Branco",99);
    candidato[] candidatos = {c1,c2,c3,c4,c5,c6};
    int[] votos = new int[500];
    public urna() {
        initComponents();
        txtNumCand.setDocument(new LimitaCaracteres(2, LimitaCaracteres.TipoEntrada.NUMEROINTEIRO));       
        for(int i=0;i<votos.length;i++){
            votos[i] = -1;
        }
    }

private class candidato{
    private String nomePres;
    private String partido;
    private String nomeVicePres;
    private int numPartido;
    private String imgPres;
    private String imgVice;

    public candidato(String cand_nome, String vice_nome, String partido, int cand_digito){
        this.nomePres = cand_nome;
        this.partido = partido;
        this.nomeVicePres = vice_nome;
        this.numPartido = cand_digito;
        this.imgPres = cand_digito + ".png";
        this.imgVice = cand_digito + "v.png";

    }

    public String getNomePres() {
        return nomePres;
    }

    public String getPartido() {
        return partido;
    }

    public String getNomeVicePres() {
        return nomeVicePres;
    }

    public int getNumPartido() {
        return numPartido;
    }

    public String getImgPres() {
        return imgPres;
    }

    public String getImgVice() {
        return imgVice;
    }   
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNumCand = new javax.swing.JLabel();
        txtNumCand = new javax.swing.JTextField();
        lblPartd = new javax.swing.JLabel();
        lblResPart = new javax.swing.JLabel();
        lblPres = new javax.swing.JLabel();
        lblResPres = new javax.swing.JLabel();
        lblVice = new javax.swing.JLabel();
        lblResVice = new javax.swing.JLabel();
        imgPres = new javax.swing.JLabel();
        imgVice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTeclado3 = new javax.swing.JButton();
        btnTeclado1 = new javax.swing.JButton();
        btnTeclado2 = new javax.swing.JButton();
        btnTeclado4 = new javax.swing.JButton();
        btnTeclado5 = new javax.swing.JButton();
        btnTeclado6 = new javax.swing.JButton();
        btnTeclado7 = new javax.swing.JButton();
        btnTeclado8 = new javax.swing.JButton();
        btnTeclado9 = new javax.swing.JButton();
        btnTeclado0 = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnApurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Urna Eletrônica");

        lblNumCand.setText("Número do candidato:");

        txtNumCand.setName(""); // NOI18N
        txtNumCand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumCandFocusLost(evt);
            }
        });
        txtNumCand.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumCandKeyPressed(evt);
            }
        });

        lblPartd.setText("Partido:");

        lblResPart.setText("-");

        lblPres.setText("Presidente:");

        lblResPres.setText("-");

        lblVice.setText("Vice-Presidente:");

        lblResVice.setText("-");

        imgPres.setForeground(new java.awt.Color(240, 240, 240));
        imgPres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgPres.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgPres.setMaximumSize(new java.awt.Dimension(108, 127));
        imgPres.setMinimumSize(new java.awt.Dimension(108, 127));
        imgPres.setPreferredSize(new java.awt.Dimension(108, 127));

        imgVice.setForeground(new java.awt.Color(240, 240, 240));
        imgVice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgVice.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imgVice.setMaximumSize(new java.awt.Dimension(108, 127));
        imgVice.setMinimumSize(new java.awt.Dimension(108, 127));
        imgVice.setPreferredSize(new java.awt.Dimension(108, 127));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seu voto para Presidência");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnTeclado3.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado3.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado3.setText("3");
        btnTeclado3.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado3.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado3ActionPerformed(evt);
            }
        });

        btnTeclado1.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado1.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado1.setText("1");
        btnTeclado1.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado1.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado1ActionPerformed(evt);
            }
        });

        btnTeclado2.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado2.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado2.setText("2");
        btnTeclado2.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado2.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado2ActionPerformed(evt);
            }
        });

        btnTeclado4.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado4.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado4.setText("4");
        btnTeclado4.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado4.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado4ActionPerformed(evt);
            }
        });

        btnTeclado5.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado5.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado5.setText("5");
        btnTeclado5.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado5.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado5ActionPerformed(evt);
            }
        });

        btnTeclado6.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado6.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado6.setText("6");
        btnTeclado6.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado6.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado6ActionPerformed(evt);
            }
        });

        btnTeclado7.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado7.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado7.setText("7");
        btnTeclado7.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado7.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado7ActionPerformed(evt);
            }
        });

        btnTeclado8.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado8.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado8.setText("8");
        btnTeclado8.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado8.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado8ActionPerformed(evt);
            }
        });

        btnTeclado9.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado9.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado9.setText("9");
        btnTeclado9.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado9.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado9ActionPerformed(evt);
            }
        });

        btnTeclado0.setBackground(new java.awt.Color(0, 0, 0));
        btnTeclado0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnTeclado0.setForeground(new java.awt.Color(250, 250, 250));
        btnTeclado0.setText("0");
        btnTeclado0.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnTeclado0.setPreferredSize(new java.awt.Dimension(75, 75));
        btnTeclado0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeclado0ActionPerformed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(255, 255, 0));
        btnCorrige.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCorrige.setText("CORRIGE");
        btnCorrige.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnCorrige.setPreferredSize(new java.awt.Dimension(75, 75));
        btnCorrige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorrigeActionPerformed(evt);
            }
        });

        btnBranco.setBackground(new java.awt.Color(255, 255, 255));
        btnBranco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBranco.setText("BRANCO");
        btnBranco.setMargin(new java.awt.Insets(5, 14, 5, 14));
        btnBranco.setPreferredSize(new java.awt.Dimension(75, 75));
        btnBranco.setOpaque(false);
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(0, 204, 51));
        btnConfirma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirma.setText("CONFIRMA");
        btnConfirma.setMargin(new java.awt.Insets(5, 10, 5, 10));
        btnConfirma.setPreferredSize(new java.awt.Dimension(75, 75));
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTeclado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeclado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeclado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTeclado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTeclado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTeclado7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTeclado0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTeclado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTeclado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnTeclado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTeclado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTeclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeclado6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTeclado9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeclado8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTeclado0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        btnApurar.setText("Apurar");
        btnApurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblVice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblNumCand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPartd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblResPart, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(lblResPres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblResVice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtNumCand, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imgVice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(imgPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnApurar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitulo)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumCand)
                                    .addComponent(txtNumCand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPartd)
                                    .addComponent(lblResPart))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblPres)
                                    .addComponent(lblResPres))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVice)
                                    .addComponent(lblResVice)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(imgVice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btnApurar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTeclado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado2ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"2");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado2ActionPerformed

    private void btnTeclado0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado0ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"0");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado0ActionPerformed

    private void btnCorrigeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorrigeActionPerformed
        botaoCorrige();
    }//GEN-LAST:event_btnCorrigeActionPerformed
    
    private void botaoConfirmar(){
        int candVotado = 0;
        if (!txtNumCand.getText().isEmpty()){
            int votoConfirma = JOptionPane.showConfirmDialog(rootPane, "Confirma o voto?\n", "Confirma?", YES_NO_OPTION);
            switch(votoConfirma){
                case 0:
                    for(int i = 0; i < votos.length;i++){
                        if(votos[i]==-1){
                            candVotado = Integer.parseInt(txtNumCand.getText());
                            votos[i] = candVotado;
                            JOptionPane.showConfirmDialog(rootPane, "Voto confirmado com sucesso", "Confirmação", OK_CANCEL_OPTION);
                            botaoCorrige();
                            break;
                        } else if (i==votos.length){
                            break;
                        }
                    }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,"Digite o numero do candidato\nPara votar nulo, digite 00\nPara votar em branco, clique no botão 'Branco'","Voto não registrado",WARNING_MESSAGE);
        }
    }
    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        botaoConfirmar();
    }//GEN-LAST:event_btnConfirmaActionPerformed
    
    private void txtNumCandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumCandFocusLost
        gerarCandidato();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumCandFocusLost

    private void txtNumCandKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCandKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (txtNumCand.getText().length() < 2){
                JOptionPane.showMessageDialog(rootPane, "Digite os dois números do candidato", "Erro de número", HEIGHT);
                botaoCorrige();
            } else {
                gerarCandidato();
            }
        }    
    }//GEN-LAST:event_txtNumCandKeyPressed

    private void btnTeclado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado1ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"1");
        gerarCandidato();        
    }//GEN-LAST:event_btnTeclado1ActionPerformed

    private void btnTeclado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado3ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"3");
        gerarCandidato();  
    }//GEN-LAST:event_btnTeclado3ActionPerformed

    private void btnTeclado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado4ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"4");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado4ActionPerformed

    private void btnTeclado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado5ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"5");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado5ActionPerformed

    private void btnTeclado6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado6ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"6");
        gerarCandidato();
        
    }//GEN-LAST:event_btnTeclado6ActionPerformed

    private void btnTeclado7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado7ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"7");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado7ActionPerformed

    private void btnTeclado8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado8ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"8");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado8ActionPerformed

    private void btnTeclado9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeclado9ActionPerformed
        String textoPrev = txtNumCand.getText();
        txtNumCand.setText(textoPrev+"9");
        gerarCandidato();
    }//GEN-LAST:event_btnTeclado9ActionPerformed

    private void btnApurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApurarActionPerformed
        float qtdVotosTotal = 0, qtdVotosNulo = 0, qtdVotos13 = 0, qtdVotos17 = 0, qtdVotos18 = 0, qtdVotos66 = 0, qtdVotosBranco = 0;
        float percentNulo = 0, percent13 = 0, percent17 = 0, percent18 = 0, percent66 = 0, percentBranco = 0;
        
        for(int i=0;i<votos.length;i++){

            if(votos[i]!= -1){
                qtdVotosTotal++;
                if(votos[i]==00){
                    qtdVotosNulo++;

                } else if(votos[i]==99){
                    qtdVotosBranco++;

                } else if(votos[i]==13){
                    qtdVotos13++;

                } else if(votos[i]==17){
                    qtdVotos17++;

                } else if(votos[i]==18){
                    qtdVotos18++;

                } else if(votos[i]==66){
                    qtdVotos66++;

                }
            }
        }

        percentBranco = (qtdVotosBranco/qtdVotosTotal)*100;
        percentNulo = (qtdVotosNulo/qtdVotosTotal)*100;
        percent13 = (qtdVotos13/qtdVotosTotal)*100;
        percent17 = (qtdVotos17/qtdVotosTotal)*100;
        percent18 = (qtdVotos18/qtdVotosTotal)*100;
        percent66 = (qtdVotos66/qtdVotosTotal)*100;
        

        
        DecimalFormat frmtQtd = new DecimalFormat();
        frmtQtd.setMaximumFractionDigits(0);
        
        DecimalFormat frmtPerc = new DecimalFormat();
        frmtPerc.setMaximumFractionDigits(2);
        
        String textoApuracao = "Total de votos     : "+frmtQtd.format(qtdVotosTotal)+"   |   Percentual"+
        "\nVotos Nulo          : "+frmtQtd.format(qtdVotosNulo)+"   |   "+frmtPerc.format(percentNulo)+ 
        "%\nVotos Branco      : "+frmtQtd.format(qtdVotosBranco)+"   |   "+frmtPerc.format(percentBranco)+ 
        "%\nVotos 13              : "+frmtQtd.format(qtdVotos13)+ "   |   "+frmtPerc.format(percent13)+
        "%\nVotos 17              : "+frmtQtd.format(qtdVotos17)+"   |   "+frmtPerc.format(percent17)+
        "%\nVotos 18              : "+frmtQtd.format(qtdVotos18)+"   |   "+frmtPerc.format(percent18)+
        "%\nVotos 66              : "+frmtQtd.format(qtdVotos66)+"   |   "+frmtPerc.format(percent66)+"%";
        
        JOptionPane.showMessageDialog(rootPane, textoApuracao,"Apuração de Votos",PLAIN_MESSAGE);
    }//GEN-LAST:event_btnApurarActionPerformed

    
    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        int confirmaBranco = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente votar branco?", "Confirma Branco", YES_NO_OPTION, PLAIN_MESSAGE);
        switch(confirmaBranco){
            case 0:
                txtNumCand.setText("99");
                gerarCandidato();
                botaoConfirmar();
            case 1:
                botaoCorrige();
        }
    }//GEN-LAST:event_btnBrancoActionPerformed

    
    private void gerarCandidato(){
        
        // MÉTODO SÓ INICIALIZA CASO EXISTA DIGITOS & TAMANHO FOR 2
        
        if (!txtNumCand.getText().isEmpty()){
            if (txtNumCand.getText().length()==2){
                int candidatoSelecionado = Integer.parseInt(txtNumCand.getText());
                // PERCORRER VETOR EM BUSCA DO CANDIDATO
                int verificador = 0;
                for (int i = 0; i < candidatos.length; i++){
                    if (candidatoSelecionado == candidatos[i].getNumPartido()){
                        lblResPart.setText(candidatos[i].getPartido());
                        lblResPres.setText(candidatos[i].getNomePres());
                        lblResVice.setText(candidatos[i].getNomeVicePres());
                        if(candidatos[i]!=c5 && candidatos[i]!=c6){
                            ImageIcon iconPres = new ImageIcon(getClass().getResource("/urnaeletronica/"+candidatos[i].getImgPres()));
                            imgPres.setIcon(iconPres);
                            //imgPres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urnaeletronica/"+candidatos[i].getImgPres())));
                            ImageIcon iconVice = new ImageIcon(getClass().getResource("/urnaeletronica/"+candidatos[i].getImgVice()));
                            imgVice.setIcon(iconVice);
                            //imgVice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/urnaeletronica/"+candidatos[i].getImgVice())));
                        }
                        return;
                    } else {
                        verificador++;
                        if (verificador == candidatos.length){             
                            JOptionPane.showMessageDialog(rootPane, "Candidato não existe", "Sem Candidato Cadastrado", HEIGHT);
                            botaoCorrige();
                            break;
                        }
                    }
                }
            }
        }  
    }
    
    private void botaoCorrige(){
        txtNumCand.setText("");
        lblResPart.setText("-");
        lblResPres.setText("-");
        lblResVice.setText("-");
        imgPres.setIcon(null);
        imgVice.setIcon(null);
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
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(urna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new urna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApurar;
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnTeclado0;
    private javax.swing.JButton btnTeclado1;
    private javax.swing.JButton btnTeclado2;
    private javax.swing.JButton btnTeclado3;
    private javax.swing.JButton btnTeclado4;
    private javax.swing.JButton btnTeclado5;
    private javax.swing.JButton btnTeclado6;
    private javax.swing.JButton btnTeclado7;
    private javax.swing.JButton btnTeclado8;
    private javax.swing.JButton btnTeclado9;
    private javax.swing.JLabel imgPres;
    private javax.swing.JLabel imgVice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNumCand;
    private javax.swing.JLabel lblPartd;
    private javax.swing.JLabel lblPres;
    private javax.swing.JLabel lblResPart;
    private javax.swing.JLabel lblResPres;
    private javax.swing.JLabel lblResVice;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVice;
    private javax.swing.JTextField txtNumCand;
    // End of variables declaration//GEN-END:variables
}
