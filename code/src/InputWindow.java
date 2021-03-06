/**
 * Created by WYF on 4/28/2017.
 */
public class InputWindow extends javax.swing.JFrame{

    private int num_city;

    private boolean pressed_or_not=false;
    /**
     * Creates new form input_window
     */
    public InputWindow() {
        initComponents();
        t_apm.setText(Integer.toString(300));
        t_tpm.setText(Integer.toString(400));
        t_spm.setText(Integer.toString(200));
        t_asm.setText(Double.toString(900));
        t_tsm.setText(Double.toString(150));
        t_ssm.setText(Double.toString(100));
        t_apm.setEditable(false);
        t_tpm.setEditable(false);
        t_spm.setEditable(false);
        t_asm.setEditable(false);
        t_tsm.setEditable(false);
        t_ssm.setEditable(false);
        t_rs.setText(Double.toString(0.04167));
        t_rm.setText(Double.toString(1.19048));
        t_rl.setText(Double.toString(35));
        t_ar.setText(Double.toString(0.0001));
        t_mv.setText(Integer.toString(100));
        t_mp.setText(Integer.toString(100));
        t_mq.setText(Integer.toString(50));
        t_cr.setText(Double.toString(3));
        t_cn.setText(Integer.toString(309));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t_apm = new javax.swing.JTextField();
        run_button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t_tpm = new javax.swing.JTextField();
        t_spm = new javax.swing.JTextField();
        t_asm = new javax.swing.JTextField();
        t_tsm = new javax.swing.JTextField();
        t_ssm = new javax.swing.JTextField();
        t_ar = new javax.swing.JTextField();
        t_rs = new javax.swing.JTextField();
        t_rm = new javax.swing.JTextField();
        t_rl = new javax.swing.JTextField();
        t_mv = new javax.swing.JTextField();
        t_mp = new javax.swing.JTextField();
        t_mq = new javax.swing.JTextField();
        t_cr = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t_cn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Parameter input");

        jLabel1.setText("air_passenger_mean");

        t_apm.setPreferredSize(new java.awt.Dimension(100, 30));

        run_button.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        run_button.setText("run");
        run_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                run_buttonActionPerformed(evt);
            }
        });

        jLabel3.setText("train_passenger_mean");

        jLabel4.setText("ship_passenger_mean");

        jLabel5.setText("air_speed_mean");

        jLabel6.setText("train_speed_mean");

        jLabel7.setText("antibody_rate");

        jLabel8.setText("ship_speed_mean");

        jLabel9.setText("rate_morbidity");

        jLabel10.setText("rate_spread");

        jLabel11.setText("max_vaccine");

        jLabel12.setText("rate_lethality");

        jLabel13.setText("max_patient");

        jLabel14.setText("max_quarantine");

        jLabel15.setText("cure_rate");

        t_tpm.setMinimumSize(new java.awt.Dimension(100, 30));
        t_tpm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_spm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_asm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_tsm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_ssm.setMinimumSize(new java.awt.Dimension(100, 30));
        t_ssm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_ar.setMinimumSize(new java.awt.Dimension(100, 30));
        t_ar.setPreferredSize(new java.awt.Dimension(100, 30));

        t_rs.setMinimumSize(new java.awt.Dimension(100, 30));
        t_rs.setPreferredSize(new java.awt.Dimension(100, 30));

        t_rm.setMinimumSize(new java.awt.Dimension(100, 30));
        t_rm.setPreferredSize(new java.awt.Dimension(100, 30));

        t_rl.setMinimumSize(new java.awt.Dimension(100, 30));
        t_rl.setPreferredSize(new java.awt.Dimension(100, 30));

        t_mv.setMinimumSize(new java.awt.Dimension(100, 30));
        t_mv.setPreferredSize(new java.awt.Dimension(100, 30));

        t_mp.setMinimumSize(new java.awt.Dimension(100, 30));
        t_mp.setPreferredSize(new java.awt.Dimension(100, 30));

        t_mq.setMinimumSize(new java.awt.Dimension(100, 30));
        t_mq.setPreferredSize(new java.awt.Dimension(100, 30));

        t_cr.setMinimumSize(new java.awt.Dimension(100, 30));
        t_cr.setPreferredSize(new java.awt.Dimension(100, 30));

        jLabel16.setText("city_number");

        t_cn.setMinimumSize(new java.awt.Dimension(100, 30));
        t_cn.setPreferredSize(new java.awt.Dimension(100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(284, 284, 284)
                                                .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addGap(47, 47, 47))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(30, 30, 30))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel4)
                                                                        .addGap(34, 34, 34)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel16))
                                                                .addGap(66, 66, 66)))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(t_ssm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_tsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_asm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_spm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_tpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_apm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(75, 75, 75)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel14)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel12)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel15))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(t_cr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_mv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_rl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_rm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_rs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(t_mq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(t_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(172, 172, 172)
                                                                .addComponent(run_button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(t_apm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10)
                                                .addComponent(t_rs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel9)
                                        .addComponent(t_tpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_rm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel12)
                                        .addComponent(t_spm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_rl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel11)
                                        .addComponent(t_asm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_mv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel13)
                                        .addComponent(t_tsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel14)
                                        .addComponent(t_ssm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_mq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel7)
                                        .addComponent(t_ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(t_cr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(t_cn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(run_button, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void run_buttonActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("pressed run");
        Parameter.air_passenger_mean=Integer.parseInt(t_apm.getText());
        Parameter.train_passenger_mean=Integer.parseInt(t_tpm.getText());
        Parameter.ship_passenger_mean=Integer.parseInt(t_tpm.getText());
        Parameter.air_speed_mean=Double.parseDouble(t_asm.getText());
        Parameter.train_speed_mean=Double.parseDouble(t_tpm.getText());
        Parameter.ship_speed_mean=Double.parseDouble(t_ssm.getText());
        Parameter.rate_spread=Double.parseDouble(t_rs.getText());
        Parameter.rate_morbidity=Double.parseDouble(t_rm.getText())/100.;
        Parameter.rate_lethality=Double.parseDouble(t_rl.getText())/100.;
        Parameter.antibody_ratio=Double.parseDouble(t_ar.getText())/100.;
        Parameter.max_vaccine=Integer.parseInt(t_mv.getText());
        Parameter.max_patient=Integer.parseInt(t_mp.getText());
        Parameter.max_quarantine=Integer.parseInt(t_mq.getText());
        Parameter.cure_rate=Double.parseDouble(t_cr.getText())/100.;
        num_city=Integer.parseInt(t_cn.getText());
        pressed_or_not=true;
    }



    public boolean isPressed_or_not() {return pressed_or_not;}
    public int getNum_city(){return num_city;}

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton run_button;
    private javax.swing.JTextField t_apm;
    private javax.swing.JTextField t_ar;
    private javax.swing.JTextField t_asm;
    private javax.swing.JTextField t_cn;
    private javax.swing.JTextField t_cr;
    private javax.swing.JTextField t_mp;
    private javax.swing.JTextField t_mq;
    private javax.swing.JTextField t_mv;
    private javax.swing.JTextField t_rl;
    private javax.swing.JTextField t_rm;
    private javax.swing.JTextField t_rs;
    private javax.swing.JTextField t_spm;
    private javax.swing.JTextField t_ssm;
    private javax.swing.JTextField t_tpm;
    private javax.swing.JTextField t_tsm;
    // End of variables declaration
}
