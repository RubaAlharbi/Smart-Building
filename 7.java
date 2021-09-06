package SB;
import java.io.*; 
import java.util.Scanner; 
import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
    }                                       

    private void jCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
     dispose();  
    }    
	
    private void jNextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
dispose();
new ComBooking().setVisible(true); 
       
    }                                           

	   private void jfileButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      File file;        
      Scanner inputFile = null; 
      String fileName;  

      fileName = JOptionPane.showInputDialog("Enter " +
                                "the name of a file:");

								
      try
      {
         file = new File(fileName);
         inputFile = new Scanner(file);
         JOptionPane.showMessageDialog(null,
                          "The file was found.");
      }
      catch (FileNotFoundException e)
      {
         JOptionPane.showMessageDialog(null,
                               "File not found.");
      }
        
 while (inputFile.hasNextLine())
JOptionPane.showMessageDialog(null,inputFile.nextLine());
      System.exit(0);
   
    }   
    public static void main(String args[]) {
java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }
                   
    private javax.swing.JLabel errorLable;
    private javax.swing.JComboBox<String> jClassType;
    private javax.swing.JLabel jClassTypeLable;
    private javax.swing.JButton jCloseButton;
    private javax.swing.JLabel jHeader;
    private javax.swing.JButton jNextButton;
    private javax.swing.JComboBox<String> jNumberOfSeat;
    private javax.swing.JLabel jNumberSeat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jfileButton;
                  
}