import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

//This is testing Function 1, condition 7. 
class skillInputTest {

	@Test
	void correctSkillInput() {
		Boolean expectedSkillInput = true;
		//Test data 1
		String[] skills = {"SQl","Access", "Microsoft"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Executives",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSkillInput = J1.invalidWordCountSkill();
		assertEquals(expectedSkillInput , actualSkillInput );
	}
	@Test
	void correctSkillInput2() {
		Boolean expectedSkillInput2 = true;
		//Test data 1
		String[] skills = {"C++","Sharp", "Python"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Executives",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSkillInput2 = J1.invalidWordCountSkill();
		assertEquals(expectedSkillInput2 , actualSkillInput2 );
	}
	@Test
	void incorrectcorrectSkillInput() {
		Boolean expectedSkillInput3  = false;
		//Test data 1
		String[] skills = {"Excel","Microsoft", "SQL","Python"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSkillInput3 = J1.invalidWordCountSkill();
		assertEquals(expectedSkillInput3 , actualSkillInput3 );
	}
	@Test
	void incorrectcorrectSkillInput2() {
		Boolean expectedSkillInput4  = false;
		//Test data 1
		String[] skills = {"Excels in SQL","Access", "Java"};
		Jobs J1 = new Jobs("12345MMM!", "Data Analyst", "Google Intern", 
				"Sydney, New South Wales, Australia", 
				"2023-09-01", "Senior",	"Part-Time", 
				skills, 100000, "This person is an intern."); 
		Boolean actualSkillInput4 = J1.invalidWordCountSkill();
		assertEquals(expectedSkillInput4 , actualSkillInput4 );
	}

}
