package testsUI;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Pages.LoginPage;

public class NegativeLoginTest extends BaseTest {
	
	@Parameters({"username","password","expectedMessage"})
	public void VerifyThatTheSystemHandlesInvalidCredentials(String username, String password, String expectedMessage) {
		// Arrange
		LoginPage loginPage = new LoginPage(driver, logger);
		
		// Act
		loginPage.negativeLogin(username, password);
		String currentError = loginPage.getErrorMessage();
		
		// Assert
		Assert.assertEquals(expectedMessage, currentError);
	}
	
}
