import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//This is testing Function 1, condition 5. 
class juniorSalaryTest {

	//This is testing Function 1, condition 5. 
	@Test
	void correctSalary() {
		Boolean expectedSalary = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Melbourne, Victoria, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 45000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJunior();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void correctSalary2() {
		Boolean expectedSalary = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 70000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJunior();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void incorrectSalary() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 39999, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJunior();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void incorrectSalary2() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 70001, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJunior();
		assertEquals(expectedSalary, actualSalary );
	}

}
