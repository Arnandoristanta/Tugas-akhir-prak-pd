
package aplikasi.tiket.bioskop;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Form_tiket extends javax.swing.JFrame {

    
    
    public Form_tiket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        FilmGroup = new javax.swing.ButtonGroup();
        JenisTiketGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_proses = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        hargaSatuan = new javax.swing.JTextField();
        eva = new javax.swing.JRadioButton();
        ghost = new javax.swing.JRadioButton();
        akira = new javax.swing.JRadioButton();
        lain = new javax.swing.JRadioButton();
        reguler = new javax.swing.JRadioButton();
        atmos = new javax.swing.JRadioButton();
        ultra_xd = new javax.swing.JRadioButton();
        vip = new javax.swing.JRadioButton();
        jamTayang = new javax.swing.JComboBox<>();
        Total_beli = new javax.swing.JTextField();
        JumlahBeli = new javax.swing.JTextField();
        BeliSpinner = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Pemesanan Tiket Bioskop XXI ");

        jLabel2.setText("Nama");

        jLabel3.setText("Film");

        jLabel4.setText("Jenis Tiket");

        jLabel5.setText("Jam Tayang");

        jLabel6.setText("Harga Tiket");

        jLabel7.setText("Jumlah Beli");

        btn_proses.setText("Proses");
        btn_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prosesActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jLabel8.setText("Total");

        FilmGroup.add(eva);
        eva.setText("The End of Evangelion");
        eva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaActionPerformed(evt);
            }
        });

        FilmGroup.add(ghost);
        ghost.setText("Ghost In The Shell");
        ghost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ghostActionPerformed(evt);
            }
        });

        FilmGroup.add(akira);
        akira.setText("Akira");
        akira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akiraActionPerformed(evt);
            }
        });

        FilmGroup.add(lain);
        lain.setText("Serial Experimental Lain");
        lain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lainActionPerformed(evt);
            }
        });

        JenisTiketGroup.add(reguler);
        reguler.setText("Reguler");
        reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulerActionPerformed(evt);
            }
        });

        JenisTiketGroup.add(atmos);
        atmos.setText("Ultra XD Atmos");
        atmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atmosActionPerformed(evt);
            }
        });

        JenisTiketGroup.add(ultra_xd);
        ultra_xd.setText("Ultra XD");
        ultra_xd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultra_xdActionPerformed(evt);
            }
        });

        JenisTiketGroup.add(vip);
        vip.setText("VIP");
        vip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vipActionPerformed(evt);
            }
        });

        jamTayang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10.00", "14.00", "17.00", "20.00", "22.00" }));

        Total_beli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_beliActionPerformed(evt);
            }
        });

        JumlahBeli.setEditable(false);

        BeliSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        BeliSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                catchValueSpinner(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reguler)
                                .addGap(18, 18, 18)
                                .addComponent(atmos)
                                .addGap(18, 18, 18)
                                .addComponent(ultra_xd)
                                .addGap(18, 18, 18)
                                .addComponent(vip))
                            .addComponent(jamTayang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(JumlahBeli)
                                    .addGap(18, 18, 18)
                                    .addComponent(BeliSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eva)
                                    .addComponent(ghost))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lain)
                                    .addComponent(akira)))
                            .addComponent(jLabel1)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(89, 89, 89)
                        .addComponent(Total_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_proses)
                        .addGap(69, 69, 69)
                        .addComponent(btn_hapus)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(eva)
                            .addComponent(akira))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ghost)
                        .addComponent(lain)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(reguler)
                    .addComponent(atmos)
                    .addComponent(ultra_xd)
                    .addComponent(vip))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jamTayang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hargaSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(JumlahBeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeliSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_proses)
                    .addComponent(btn_hapus))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Total_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void evaActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
        
    }                                   

    private void ghostActionPerformed(java.awt.event.ActionEvent evt) {                                      
      
        
    }                                     

    private void akiraActionPerformed(java.awt.event.ActionEvent evt) {                                      
      
    }                                     

    private void lainActionPerformed(java.awt.event.ActionEvent evt) {                                     
      
    }                                    

    private void regulerActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
        hargaSatuan.setText("20000");
    }                                       

    private void atmosActionPerformed(java.awt.event.ActionEvent evt) {                                      
      
        hargaSatuan.setText("50000");
    }                                     

    private void ultra_xdActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        hargaSatuan.setText("80000");
    }                                        

    private void vipActionPerformed(java.awt.event.ActionEvent evt) {                                    
     
        hargaSatuan.setText("100000");
    }                                   

    private void btn_prosesActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
        int a = Integer.parseInt (hargaSatuan.getText());
        int b = Integer.parseInt(JumlahBeli.getText());
        int hasil = a * b;
        Total_beli.setText("Rp " + hasil);
        
        
    }                                          

    private void catchValueSpinner(javax.swing.event.ChangeEvent evt) {                                   
       
      
        String spinner = "changed";
        Integer myInt = (Integer)BeliSpinner.getValue();
        spinner = myInt.toString();
        JumlahBeli.setText(spinner);
        
    }                                  

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {                                          
      
        Nama.setText("");
        hargaSatuan.setText("");
        Total_beli.setText("");
        JumlahBeli.setText("");
        BeliSpinner.setValue(1);
        
        
       FilmGroup.clearSelection();
       JenisTiketGroup.clearSelection();
        
        
    }                                         

    private void Total_beliActionPerformed(java.awt.event.ActionEvent evt) {                                           
     
    }                                          

    public static void main(String args[]) {
     
        
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form_tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_tiket().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify                     
    private javax.swing.JSpinner BeliSpinner;
    private javax.swing.ButtonGroup FilmGroup;
    private javax.swing.ButtonGroup JenisTiketGroup;
    private javax.swing.JTextField JumlahBeli;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Total_beli;
    private javax.swing.JRadioButton akira;
    private javax.swing.JRadioButton atmos;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_proses;
    private javax.swing.JRadioButton eva;
    private javax.swing.JRadioButton ghost;
    private javax.swing.JTextField hargaSatuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jamTayang;
    private javax.swing.JRadioButton lain;
    private javax.swing.JRadioButton reguler;
    private javax.swing.JRadioButton ultra_xd;
    private javax.swing.JRadioButton vip;
    // End of variables declaration                   
}
