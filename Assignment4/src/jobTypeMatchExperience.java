import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//This is testing Function 1, condition 6. 
class jobTypeMatchExperience {
	//This is testing Function 1, condition 6.
	@Test
	void correctJobMatch() {
		Boolean expectedJobMatch = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualJobMatch = J1.invalidJobTypeforEXP();
		assertEquals(expectedJobMatch, actualJobMatch );
	}
	@Test
	void correctJobMatch2() {
		Boolean expectedJobMatch = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Medium",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualJobMatch = J1.invalidJobTypeforEXP();
		assertEquals(expectedJobMatch, actualJobMatch );
	}
	@Test
	void incorrectJobMatch() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJobTypeforEXP();
		assertEquals(expectedSalary, actualSalary );
	}
	@Test
	void incorrectJobMatch2() {
		Boolean expectedSalary = false;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Executive",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSalary = J1.invalidJobTypeforEXP();
		assertEquals(expectedSalary, actualSalary );
	}

}
