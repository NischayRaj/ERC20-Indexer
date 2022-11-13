
package erc20.indexer;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TotalAmountBought extends javax.swing.JFrame {

    String aname;
    public TotalAmountBought() {
        initComponents();
    }
    //Validataion is done to check whether the entered address is valid or not.
    boolean validation() {
        
         aname = Add_txt.getText();
    
        if(aname.equals("")) {
            JOptionPane.showMessageDialog(this,"Please enter valid address");
            return false;
        }
        return true;
    }
    //checkaddress is done to check whether the entered adddress is of 35 characters, it will throw if the length is less than 35.
      public void checkAddress() {
           aname = Add_txt.getText();
           if(aname.length()<34) {
            Add_error.setText("Address should be of 35 alphanumeric charatcers");
        }
           else {
           Add_error.setText("");
      }
      }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Token_lbl = new javax.swing.JLabel();
        Amt_lbl = new javax.swing.JLabel();
        Buy_btn = new javax.swing.JButton();
        Token_Combo_Box = new javax.swing.JComboBox<>();
        Amt_txt = new javax.swing.JTextField();
        Add_lbl = new javax.swing.JLabel();
        Add_txt = new javax.swing.JTextField();
        Add_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabel1.setText("Amount of Token Purchased");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        jPanel2.setBackground(new java.awt.Color(233, 245, 233));

        Token_lbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Token_lbl.setText("Token            :");

        Amt_lbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Amt_lbl.setText("Amount        :");

        Buy_btn.setBackground(new java.awt.Color(51, 153, 0));
        Buy_btn.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Buy_btn.setForeground(new java.awt.Color(255, 255, 255));
        Buy_btn.setText("BUY");
        Buy_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buy_btnActionPerformed(evt);
            }
        });

        Token_Combo_Box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ethereum", "Polygon", "Solana", "Doge" }));

        Amt_txt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        Add_lbl.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Add_lbl.setText("Address        :");

        Add_txt.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        Add_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Add_txtKeyPressed(evt);
            }
        });

        Add_error.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Add_error.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Amt_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Token_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buy_btn)
                            .addComponent(Amt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Token_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(Add_error, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Token_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Token_Combo_Box, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amt_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Buy_btn)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        
//Checks the address and enters the value into the databse with the token name, amount.
    private void Buy_btnActionPerformed(java.awt.event.ActionEvent evt) {                                        

        try {
              String addname = Add_txt.getText();
               Conn c = new Conn();
               
               String query = "select * from addaddress where addname = '"+ addname + "'";
               
               ResultSet rs = c.s.executeQuery(query);
               
               if(rs.next()) {
                   setVisible(false);
                   //JOptionPane.showMessageDialog(null, "Token Bought");
               }
               else {
                   JOptionPane.showMessageDialog(null, "Invalid Address");
                   setVisible(false);
               }
      
           } catch (Exception e) {
               e.printStackTrace();
           }
        
        try {
            String add = Add_txt.getText();
            String token =(String) Token_Combo_Box.getSelectedItem();
            String Amt = Amt_txt.getText();
            
            Conn conn = new Conn();
            
            String query = "insert into purchase values ('"+add+"','"+token+"','"+Amt+"')";
        
            conn.s.executeUpdate(query);
            
           
            JOptionPane.showMessageDialog(null,"Token Bought Successfully");
        
            setVisible(false);
        }catch (Exception e) {
            e.printStackTrace();
        }   
    }                                       
// This click is used to get back to the home page i,e indexer.
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
         IndexerPage ip = new IndexerPage();
        ip.setVisible(true);
        this.dispose();
    }                                    

    private void Add_txtKeyPressed(java.awt.event.KeyEvent evt) {                                   
        checkAddress();
    }                                  

   
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
            java.util.logging.Logger.getLogger(TotalAmountBought.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TotalAmountBought.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TotalAmountBought.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TotalAmountBought.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TotalAmountBought().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Add_error;
    private javax.swing.JLabel Add_lbl;
    private javax.swing.JTextField Add_txt;
    private javax.swing.JLabel Amt_lbl;
    private javax.swing.JTextField Amt_txt;
    private javax.swing.JButton Buy_btn;
    private javax.swing.JComboBox<String> Token_Combo_Box;
    private javax.swing.JLabel Token_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration                   
}
