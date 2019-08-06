import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + " " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName, String lastName, int idNumber,int testScores[]){
		super(firstName,lastName,idNumber);
		this.testScores=testScores;
	}

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
		int total=0;
		int n=testScores.length;
		for(int i = 0; i < n; i++){
			total+=testScores[i];
		}
		int avg=total/n;
		//return(avg> 89 ?'O': avg>79 ? 'E' : avg > 69 ? 'A' : avg > 54 ? 'P' :avg > 39 ? 'D' : 'T' );
		char grade=' ';
		if(a>=90&&a<=100)
			 grade='O';
		else if(a>=80&&a<90)
			 grade='E';
		else if(a>=70&&a<80)
			grade='A';		
		else if(a>=55&&a<70)
			grade='P';			
		else if(a>=40&&a<55)
			grade='D';		
		else if(a<40)
			grade='T';
		return grade;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
		
	}
}