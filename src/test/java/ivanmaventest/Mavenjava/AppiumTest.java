package ivanmaventest.Mavenjava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void NativeAPPAndroid() {
		System.out.println("NativeAppAndroid");
	}

	@Test
	public void IOSApp() {
		System.out.println("IOSApp");
		Assert.assertTrue(false);
	}
}
