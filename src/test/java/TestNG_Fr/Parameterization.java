package TestNG_Fr;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Test
    @Parameters({"username", "password"})
    public void loginTest(String username, String password) {
        System.out.println("Logging in with username: " + username + " and password: " + password);
    }

}
