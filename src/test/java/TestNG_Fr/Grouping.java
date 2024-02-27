package TestNG_Fr;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = { "smoke" })
    public void testLogin() {
        System.out.println("Executing Login Test");
    }

    @Test(groups = { "regression", "sanity" })
    public void testHomePage() {
        System.out.println("Executing Home Page Test");
    }

    @Test(groups = { "regression" })
    public void testUserManagement() {
        System.out.println("Executing User Management Test");
    }

    @Test(groups = { "sanity" })
    public void testSearch() {
        System.out.println("Executing Search Test");
    }
}
