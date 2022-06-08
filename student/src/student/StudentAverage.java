tpackage student;

public class StudentAverage {
	String name="Grishma";
	int roll_no= 01;
	float mark1=56.67f;
	float mark2=67.32f;
	float mark3=78.01f;
	float mark4=89.45f;
	char gender= 'F';
	char grade;
	long mobile = 9807654312l;;
	float total = 0f;
	float average = 0f;
	boolean isgraduate = true;
	String address ="2001 wheeling";
	
	public float calculateSum()
	{
		float totalMarks =0f;
		totalMarks = mark1+mark2+mark3+mark4;
		System.out.println( totalMarks);
		return totalMarks;
	
	}
	
	

	public float calculateAverage()
	{
		float average=0f;
		float totalMarks=calculateSum();
		average = totalMarks/4;
		return average;
	}

public void printGrade() {
		
		float average = calculateAverage();
		
		if(average>=90)
			System.out.println("student secured A grade with avg. " + average );
		if(average>=80 && average<90)
			System.out.println("student secured B grade with avg. " + average );
		if(average>=70 && average<80)
			System.out.println("student secured C grade with avg. " + average );
		if(average>=60 && average<70)
			System.out.println("student secured D grade with avg. " + average );
		if(average>=50 && average<60)
			System.out.println("student secured E grade with avg. " + average );
		if(average<50 )
			System.out.println("student secured F grade with avg. " + average );
	
	}
public static void main(String[] args) {
	new StudentAverage().printGrade();
}
	
}
