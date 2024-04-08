/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class KhozaLearnerTaskTaskTwoPrj {

    /**
     * @param args the command line arguments
     */
    static Learner objLearner = new Learner();
    
    public static void main(String[] args) {
      
     getLearnerInput();   
     
     displayMarks();
     
     
     
        
    }
    

    public static void getLearnerInput() {
        objLearner.setSubject(JOptionPane.showInputDialog("Enter Full name "));
          objLearner.setSubject(JOptionPane.showInputDialog("Enter Subject"));
          objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Exam Mark")));
          objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Test Mark")));
       objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter Assignment Mark")));
        
        
     
       
    }

    public static void displayMarks() {
        double finalMark=objLearner.calcFinalMark();
        JOptionPane.showMessageDialog(null, "Final Mark: "+finalMark);
    }
    
}
