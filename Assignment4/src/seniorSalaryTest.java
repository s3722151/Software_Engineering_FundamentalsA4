import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//This is testing Function 1, condition 4. 
class seniorSalaryTest {

	@Test
	void correctSalary() {
		Boolean expectedSalary = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Melbourne, Victoria, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidSeniorSalary();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void correctSalary2() {
		Boolean expectedSalary = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Executives",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidSeniorSalary();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void incorrectSalary() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 99999, "This person is an intern."); 
		Boolean actualSalary = J1.invalidSeniorSalary();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void incorrectSalary2() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "executive",	"Part-Time", 
				skills, 99999, "This person is an intern."); 
		Boolean actualSalary = J1.invalidSeniorSalary();
		assertEquals(expectedSalary, actualSalary );
	}

}
