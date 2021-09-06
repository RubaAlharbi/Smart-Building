package SB;

public class Welcome extends javax.swing.JFrame {
 public static final char [] ClASSROOMS ={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'}; 
 public static final int NO_OF_SEATS_PER_ClASSROOM=100;
private static Time[][]theater =new Time[ClASSROOMS.length][NO_OF_SEATS_PER_ClASSROOM];

public Welcome() {
   initComponents();
for(int i = 0; i <ClASSROOMS.length; i++)
for (int j = 0; j < NO_OF_SEATS_PER_ClASSROOM; j++)
theater [i][j] = new Time(ClASSROOMS [i], j,false," "); }

public static int convertClassRoom(char letter){
for (int i=0; i <ClASSROOMS.length;i++)
if (ClASSROOMS[i]==letter)
return i;
return -1;}
 
public static Time getTime(int i, int j) { return theater[i][j];}
public static void setTime(Time t, int i, int j) { theater[i][j]=t;}

	
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    new Booking().setVisible(true);      
}                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     new BookManagement().setVisible(true);  
    }                                        
	
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }
                    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
                
}
