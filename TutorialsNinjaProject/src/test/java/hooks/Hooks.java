package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		System.out.println("++ Browser Launch");
		System.out.println("++ Application URL got Open in the Browser");
	}
	
	
	@After
	public void closeDown() {
		System.out.println("Logout from the Application--");
		System.out.println("Browser got Close--");
	}

}
