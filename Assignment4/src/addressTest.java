import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//This is testing Function 1, condition 3. 
class addressTest {

//This is testing Function 1, condition 3.
	@Test
	void correctAddress() {
		Boolean expectedAddress = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Melbourne, Victoria, Australia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 45000, "This person is an intern."); 
		Boolean actualAddress = J1.invalidAddress();
		assertEquals(expectedAddress, actualAddress);
	}
	@Test
	void correctAddress2() {
		Boolean expectedAddress = true;
		//Test data 2
		String[] skills = {"SQL","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, sAustralia", 
				"2023-09-01", "Junior",	"Part-Time", 
				skills, 45000, "This person is an intern."); 
		Boolean actualAddress = J1.invalidAddress();
		assertEquals(expectedAddress, actualAddress );
	}
	@Test
	void incorrectAddressTest1() {
		Boolean expectedAddress = false;
		//Test data 3
		String[] skills = {"SQL","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Melbourne, Victoria, ", 
				"01-10-1999", "Junior",	"Part-Time", 
				skills, 45000, "This person is an intern."); 
		Boolean actualAddress2  = J1.invalidAddress();
		assertEquals(expectedAddress, actualAddress2);
		
	}
    @Test
    void incorrectAddressTest2() {
        boolean expectedAddress = false;
        String[] skills = {"SQL", "Access", "Microsoft"};
        Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern",
                "Melbourne",
                "01-10-1999", "Junior", "Part-Time",
                skills, 45000, "This person is an intern.");
        boolean actualAddress3 = J1.invalidAddress();
        assertEquals(expectedAddress, actualAddress3);
    }

}
