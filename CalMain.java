/**
 *
 * @author Nikhil
 * Haldia Institute of Technology (CSE: 2014-2018)
 * Github: https://www.github.com/nikhil-cs
 */
import javax.swing.JOptionPane;

public class CalMain extends javax.swing.JFrame {
    double firstNum, secondNum,result;
    String operation="",inText,answer;
    boolean isPoint = false;        //Track input decimal
    public CalMain() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        screenPanel = new javax.swing.JPanel();
        displayText = new javax.swing.JTextField();
        keyPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnReciprocal = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        keyPanel2 = new javax.swing.JPanel();
        btnSquare = new javax.swing.JButton();
        btnPow = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("nik's Calculator");

        displayText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout screenPanelLayout = new javax.swing.GroupLayout(screenPanel);
        screenPanel.setLayout(screenPanelLayout);
        screenPanelLayout.setHorizontalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayText)
        );
        screenPanelLayout.setVerticalGroup(
            screenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(displayText, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
        );

        btn7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnDecimal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPlusMinus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnMulti.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMulti.setText("X");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnPlus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnEquals.setBackground(new java.awt.Color(153, 153, 255));
        btnEquals.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 204, 102));
        btnClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnReciprocal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnReciprocal.setText("1/n");
        btnReciprocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciprocalActionPerformed(evt);
            }
        });

        btnDiv.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keyPanel1Layout = new javax.swing.GroupLayout(keyPanel1);
        keyPanel1.setLayout(keyPanel1Layout);
        keyPanel1Layout.setHorizontalGroup(
            keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyPanel1Layout.createSequentialGroup()
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReciprocal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        keyPanel1Layout.setVerticalGroup(
            keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyPanel1Layout.createSequentialGroup()
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(keyPanel1Layout.createSequentialGroup()
                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(keyPanel1Layout.createSequentialGroup()
                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(keyPanel1Layout.createSequentialGroup()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReciprocal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(keyPanel1Layout.createSequentialGroup()
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEquals, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnSquare.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSquare.setText("x^2");
        btnSquare.setMaximumSize(new java.awt.Dimension(43, 31));
        btnSquare.setMinimumSize(new java.awt.Dimension(43, 31));
        btnSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareActionPerformed(evt);
            }
        });

        btnPow.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPow.setText("x^y");
        btnPow.setMaximumSize(new java.awt.Dimension(43, 31));
        btnPow.setMinimumSize(new java.awt.Dimension(43, 31));
        btnPow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowActionPerformed(evt);
            }
        });

        btnSqrt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSqrt.setText("sqrt");
        btnSqrt.setMaximumSize(new java.awt.Dimension(43, 31));
        btnSqrt.setMinimumSize(new java.awt.Dimension(43, 31));
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSin.setText("sin");
        btnSin.setMaximumSize(new java.awt.Dimension(43, 31));
        btnSin.setMinimumSize(new java.awt.Dimension(43, 31));
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCos.setText("cos");
        btnCos.setMaximumSize(new java.awt.Dimension(43, 31));
        btnCos.setMinimumSize(new java.awt.Dimension(43, 31));
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnTan.setText("tan");
        btnTan.setMaximumSize(new java.awt.Dimension(43, 31));
        btnTan.setMinimumSize(new java.awt.Dimension(43, 31));
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMod.setText("Mod");
        btnMod.setMaximumSize(new java.awt.Dimension(43, 31));
        btnMod.setMinimumSize(new java.awt.Dimension(43, 31));
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLog.setText("log");
        btnLog.setMaximumSize(new java.awt.Dimension(43, 31));
        btnLog.setMinimumSize(new java.awt.Dimension(43, 31));
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(251, 104, 50));
        btnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setMaximumSize(new java.awt.Dimension(43, 31));
        btnExit.setMinimumSize(new java.awt.Dimension(43, 31));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout keyPanel2Layout = new javax.swing.GroupLayout(keyPanel2);
        keyPanel2.setLayout(keyPanel2Layout);
        keyPanel2Layout.setHorizontalGroup(
            keyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyPanel2Layout.createSequentialGroup()
                .addGroup(keyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(keyPanel2Layout.createSequentialGroup()
                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(keyPanel2Layout.createSequentialGroup()
                        .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPow, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        keyPanel2Layout.setVerticalGroup(
            keyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(keyPanel2Layout.createSequentialGroup()
                .addGroup(keyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPow, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(keyPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(screenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(keyPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(keyPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(keyPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        isPoint = false;
        displayText.setText("");
    }                                        

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        isPoint = false;
         if((displayText.getText()).equals(""))
               firstNum = 0;
        else
                firstNum = Double.parseDouble(displayText.getText());
        displayText.setText("");
        operation = "-";
    }                                        

    private void btnReciprocalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            result = 1/firstNum;
            answer = String.format("%f", result);
            displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                             

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        isPoint = false;
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            displayText.setText("");
            operation = "/";
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter valid expression");
        }
        
    }                                      

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn7.getText();
        displayText.setText(inText);
    }                                    

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn4.getText();
        displayText.setText(inText);
    }                                    

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn1.getText();
        displayText.setText(inText);
    }                                    

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if((displayText.getText()).equals("") || (displayText.getText()).equals("0") )
               displayText.setText("0");
        else{
            inText = displayText.getText() + btn0.getText();
            displayText.setText(inText);
        }
    }                                    

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn8.getText();
        displayText.setText(inText);
    }                                    

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn5.getText();
        displayText.setText(inText);
    }                                    

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn2.getText();
        displayText.setText(inText);
    }                                    

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        if(!isPoint){
        if((displayText.getText()).equals("") || ((displayText.getText()).equals("0"))) { //decimal is the starting of any number
            inText = "0.";
            displayText.setText(inText);
        }
        else{                                                           //when there is no decimal in input
            inText = displayText.getText() + btnDecimal.getText();
            displayText.setText(inText);
        }
        }
        isPoint = true;
    }                                          

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn9.getText();
        displayText.setText(inText);
    }                                    

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn6.getText();
        displayText.setText(inText);
    }                                    

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        inText = displayText.getText() + btn3.getText();
        displayText.setText(inText);
    }                                    

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            result = (-1)*firstNum;
            answer = String.format("%s", result);
            displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                            

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        isPoint = false;
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            displayText.setText("");
            operation = "*";
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter valid expression");
        }
  
    }                                        

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        isPoint = false;
        if((displayText.getText()).equals(""))
               firstNum = 0;
        else
               firstNum = Double.parseDouble(displayText.getText());
        displayText.setText("");
        operation = "+";
    }                                       

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        isPoint = false;
        try{
        if((displayText.getText()).equals("")||operation.equals("")) { //if there is no input for secondNum
            //firstNum = 0;
            throw new myException();
        }
        else{
            secondNum = Double.parseDouble(displayText.getText());
        switch(operation)
        {
            case "+":
                result = firstNum + secondNum;
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
            case "-":
                result = firstNum - secondNum;
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
            case "*":
                result = firstNum * secondNum;
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
            case "/":
                result = firstNum / secondNum;
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
            case "^":
                result = Math.pow(firstNum, secondNum);
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
            case "%":
                result = firstNum % secondNum;
                answer = String.format("%s",result);
                displayText.setText(answer);
                break;
        }
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter valid expression");
        }
        
    }                                         

    private void btnSquareActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            result = firstNum * firstNum;
            answer = String.format("%s",result);
            displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                         

    private void btnPowActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            displayText.setText("");
            operation = "^";
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                      

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            result = Math.sqrt(firstNum);
            answer = String.format("%s",result);
            displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
         
    }                                       

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        isPoint = false;
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
             firstNum = Double.parseDouble(displayText.getText());
             displayText.setText("");
             operation = "%";
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
       
    }                                      

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
             firstNum = Double.parseDouble(displayText.getText());
             result = Math.log(firstNum);
             answer = String.format("%s",result);
             displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                      

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
            firstNum = Double.parseDouble(displayText.getText());
            result = Math.sin(firstNum);
            answer = String.format("%s",result);
            displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                      

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
              firstNum = Double.parseDouble(displayText.getText());
              result = Math.cos(firstNum);
              answer = String.format("%s",result);
              displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
    }                                      

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        try{
        if((displayText.getText()).equals(""))  //if there is no input for firstNum
            throw new myException();
        else{
             firstNum = Double.parseDouble(displayText.getText());
             result = Math.tan(firstNum);
             answer = String.format("%s",result);
             displayText.setText(answer);
        }
        }catch(myException me){
           JOptionPane.showMessageDialog(null, "Please Enter value first");
        }
        
        
    }                                      

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(CalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPow;
    private javax.swing.JButton btnReciprocal;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSquare;
    private javax.swing.JButton btnTan;
    private javax.swing.JTextField displayText;
    private javax.swing.JPanel keyPanel1;
    private javax.swing.JPanel keyPanel2;
    private javax.swing.JPanel screenPanel;
    // End of variables declaration                   
}
