package ivanmaventest.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {

	//Trigger testng xml file from maven
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void ElementsUi() {
		System.out.println("ElementsUI");
	}

	@Test
	public void Login() {
		System.out.println("Login");
	}
	
}
