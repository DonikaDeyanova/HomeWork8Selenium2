import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DashboardPageTest {
    @Before
    public void setUp() {
        Browser.setupDriver();
    }

    @Given("User is on the login page of the admin area")
    public void userIsOnTheLoginPageOfTheAdminArea() {
        LoginPage.goToBackEnd();
    }
    @When("User enters valid username and password")
    public void userEntersValidUsernameAndPassword() {
        LoginPage.writeInTheUsernameInputField("admin");
        LoginPage.writeInThePasswordInputField("parola123!");
    }
    @When("Clicks on the login button")
    public void clicksOnTheLoginButton() {
        LoginPage.clickTheLoginButton();
    }
    @Then("User is successfully logged in to the admin page")
    public void userIsSuccessfullyLoggedInToTheAdminPage() {
        DashboardPage.verifyPresenceOfLogoutButton();
    }
    @When("User clicks on the \"Customers\" menu")
    public void userClicksOnTheCustomersMenu() {
       DashboardPage.clickCustomersMenu();
    }
    @Then("The options in the \"Customers\" menu are expanded")
    public void theOptionsInTheCustomersMenuAreExpanded() {
        DashboardPage.isCustomersMenuExpanded();
    }
    @When("User clicks on the \"Design\" menu")
    public void userClicksOnTheDesignMenu() {
        DashboardPage.clickDesignMenu();
    }
    @Then("The options in the \"Design\" menu are expanded")
    public void theOptionsInTheDesignMenuAreExpanded() {
        DashboardPage.isDesignMenuExpanded();
    }
    @When("Clicks on all options in the \"Design\" menu")
    public void clicksOnAllOptionsInTheDesignMenu() {
       DashboardPage.clickDesignLayoutsSubMenu();
       DashboardPage.clickDesignThemeEditorSubMenu();
       DashboardPage.clickDesignLanguageEditorSubMenu();
       DashboardPage.clickDesignBannersSubMenu();
       DashboardPage.clickDesignSeoUrlSubMenu();
    }
    @Then("All sub menus in the \"Design\" menu are successfully loaded")
    public void allSubMenusInTheDesignMenuAreSuccessfullyLoaded() {
        DashboardPage.verifyPresenceOfLayoutsSubMenu();
        DashboardPage.verifyPresenceOfThemeEditorSubMenu();
        DashboardPage.verifyPresenceOfLanguageEditorSubMenu();
        DashboardPage.verifyPresenceOfBannersSubMenu();
        DashboardPage.verifyPresenceOfSeoUrlSubMenu();
    }
}
