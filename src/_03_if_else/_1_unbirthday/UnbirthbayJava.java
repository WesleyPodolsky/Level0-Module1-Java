package _03_if_else._1_unbirthday;
import javax.swing.JOptionPane;

public class UnbirthbayJava {

	public static void main(String[] args){
	    System.out.println("running main!");
	    
	    String currentMonth = "01";
	    String currentDay = "02";
	    
	    String monthInput = JOptionPane.showInputDialog("what is the month you were born? (??/--/----) ?");
	    String dayInput = JOptionPane.showInputDialog("what day were born? (--/??/----) ?");
	    
	    if( currentMonth.equals(monthInput) && currentDay.equals(dayInput)) {
	    System.out.println("true pass");
	    JOptionPane.showMessageDialog(null, "happy b-day!");
	    }
	    else {
	    JOptionPane.showMessageDialog(null, "happy unbirthday!");
	    }
	    
}}
