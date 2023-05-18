import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class DashboardPage {

    @FindBy(xpath = "//*[@class='fa fa-sign-out']/ ..")
    private static WebElement logoutButton;
    @FindBy(xpath = "//*[@id='menu-customer']/a")
    private static WebElement customersMenu;
    @FindBy(xpath = "//*[@id='collapse5']/li[1]/a")
    private static WebElement customersSubMenuCustomers;
    @FindBy(xpath = "//*[@id='collapse5']/li[2]/a")
    private static WebElement customerGroupsSubMenuCustomers;
    @FindBy(xpath = "//*[@id='collapse5']/li[3]/a")
    private static WebElement customerApprovalsSubMenuCustomers;
    @FindBy(xpath = "//*[@id='collapse5']/li[4]/a")
    private static WebElement customerFieldsSubMenuCustomers;
    @FindBy(xpath = "//*[@id='menu-design']/a")
    private static WebElement designMenu;
    @FindBy(xpath = "//*[@id='collapse3']/li[1]/a")
    private static WebElement designLayoutsSubMenu;
    @FindBy(xpath = "//*[@id='collapse3']/li[2]/a")
    private static WebElement designThemeEditorSubMenu;
    @FindBy(xpath = "//*[@id='collapse3']/li[3]/a")
    private static WebElement designLanguageEditorSubMenu;
    @FindBy(xpath = "//*[@id='collapse3']/li[4]/a")
    private static WebElement designBannersSubMenu;
    @FindBy(xpath = "//*[@id='collapse3']/li[5]/a")
    private static WebElement designCeoUrlSubMenu;

    static {
        PageFactory.initElements(Browser.getDriver(), DashboardPage.class);
    }

    public static void verifyPresenceOfLogoutButton() {
        Assert.assertTrue(logoutButton.isDisplayed());
    }

    public static void clickCustomersMenu() {
        customersMenu.click();
    }

    public static void isCustomersMenuExpanded() {
        Assert.assertTrue(customersMenu.getAttribute("aria-expanded").contains("true"));
    }

    public static void clickCustomersSubMenuCustomers() {
        customersSubMenuCustomers.click();
    }

    public static void clickCustomerGroupsSubMenuCustomers() {
        customerGroupsSubMenuCustomers.click();
    }

    public static void clickCustomerApprovalsSubMenuCustomers() {
        customerApprovalsSubMenuCustomers.click();
    }
    public static void clickCustomerFieldsSubMenuCustomers() {
        customerFieldsSubMenuCustomers.click();
    }
    public static void clickDesignLayoutsSubMenu() {
        designLayoutsSubMenu.click();
    }
    public static void clickDesignThemeEditorSubMenu(){
        designThemeEditorSubMenu.click();
    }
    public static void clickDesignLanguageEditorSubMenu(){
        designLanguageEditorSubMenu.click();
    }
    public static void clickDesignBannersSubMenu(){
        designBannersSubMenu.click();
    }
    public static void clickDesignSeoUrlSubMenu(){
        designCeoUrlSubMenu.click();
    }
    public static void isCustomerSubMenuIsDisplayed() {
        Assert.assertTrue(customersSubMenuCustomers.isDisplayed());
        Assert.assertTrue(customerGroupsSubMenuCustomers.isDisplayed());
        Assert.assertTrue(customerApprovalsSubMenuCustomers.isDisplayed());
        Assert.assertTrue(customerFieldsSubMenuCustomers.isDisplayed());
    }

    public static void clickDesignMenu() {
        designMenu.click();
    }

    public static void isDesignMenuExpanded() {
        Assert.assertTrue(designMenu.getAttribute("aria-expanded").contains("true"));
    }

    public static void isDesignSubMenuIsDisplayed() {
        Assert.assertTrue(designLayoutsSubMenu.isDisplayed());
        Assert.assertTrue(designThemeEditorSubMenu.isDisplayed());
        Assert.assertTrue(designLanguageEditorSubMenu.isDisplayed());
        Assert.assertTrue(designBannersSubMenu.isDisplayed());
        Assert.assertTrue(designCeoUrlSubMenu.isDisplayed());
    }

    public static void verifyPresenceOfLayoutsSubMenu() {
        Assert.assertEquals(Browser.getDriver().getTitle(),"Layouts");
    }
    public static void verifyPresenceOfThemeEditorSubMenu() {
        Assert.assertEquals(Browser.getDriver().getTitle(), "Theme Editor");
    }
    public static void verifyPresenceOfLanguageEditorSubMenu() {
        Assert.assertEquals(Browser.getDriver().getTitle(), "Language Editor");
    }
    public static void verifyPresenceOfBannersSubMenu() {
        Assert.assertEquals(Browser.getDriver().getTitle(), "Banners");
    }
    public static void verifyPresenceOfSeoUrlSubMenu() {
        Assert.assertEquals(Browser.getDriver().getTitle(), "SEO URL");
    }
//    public static void designMenuSubMenusAreClickable(){
//        DashboardPage.clickDesignMenu();
//        DashboardPage.clickDesignLayoutsSubMenu();
//        DashboardPage.verifyPresenceOfLayoutsSubMenu();
//        DashboardPage.clickDesignThemeEditorSubMenu();
//        DashboardPage.verifyPresenceOfThemeEditorSubMenu();
//        DashboardPage.clickDesignLanguageEditorSubMenu();
//        DashboardPage.verifyPresenceOfLanguageEditorSubMenu();
//        DashboardPage.clickDesignBannersSubMenu();
//        DashboardPage.verifyPresenceOfBannersSubMenu();
//        DashboardPage.clickDesignSeoUrlSubMenu();
//        DashboardPage.verifyPresenceOfSeoUrlSubMenu();
//    }
}

