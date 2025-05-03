import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//This is testing Function 2, condition 3. 
class updateJobTypeTest {

//	void correctChangeJob() {
//		Boolean expectedCorrectUpdate = true;
//		//Test data 1
//		String[] skills = {"SQl","Access", "Microsoft"};
//		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
//				"Sydney, New South Wales, Australia", 
//				"2023-09-01", "Medium",	"Part-Time", 
//				skills, 100000, "This person is an intern."); 
//		Boolean actualUpdate = J1.invalidJobTypeChange();
//		assertEquals(expectedCorrectUpdate, actualUpdate );
//	}
	@Test // We are Part Time
	void incorrectJobMatch() {
		Boolean expectedIncorrectUpdate = false;
		//Test data 2
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualUpdate = J1.invalidJobTypeChange();
		assertEquals(expectedIncorrectUpdate, actualUpdate );
	}
//	@Test
//	void incorrectJobMatch2() {
//		Boolean expectedIncorrectUpdate2 = false;
//		//Test data 3"
//		String[] skills = {"SQl","Access", "Microsoft"};
//		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
//				"Sydney, New South Wales, Australia", 
//				"2023-09-01", "Senior",	"Volunteer", 
//				skills, 100000, "This person is an intern."); 
//		Boolean actualUpdate2 = J1.invalidJobTypeChange();
//		assertEquals(expectedIncorrectUpdate2, actualUpdate2 );
//	}

}
