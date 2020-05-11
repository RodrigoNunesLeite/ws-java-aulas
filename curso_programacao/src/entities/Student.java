package entities;

public class Student {
	public String name;
	public double note1, note2, note3;
	
	public String finalGrade() {
		double total     = 100.00;
		double noteFinal = note1 + note2 + note3;
		
		if (noteFinal >= (total * 0.6)) {
			return "FINAL GRADE = " + String.format("%.2f", noteFinal) + "\n" 
				   + "PASS";
		} else  {
			return "FINAL GRADE = " + String.format("%.2f",noteFinal) + "\n"
					 + "FAILED \n"
					 + "MISSING " + String.format("%.2f",  ((total * 0.6) - noteFinal)) + " POINTS";
		}
		
	}
}
