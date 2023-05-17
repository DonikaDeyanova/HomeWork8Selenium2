import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id = "input-username")
    private static WebElement usernameInputField;

    @FindBy(id = "input-password")
    private static WebElement passwordInputField;

    @FindBy(className = "btn-primary")
    private static WebElement loginButton;

    private static final String urlBackEnd = "https://shop.pragmatic.bg/admin/";
    private static final String urlFrontEnd = "http://shop.pragmatic.bg";

    static {
        PageFactory.initElements(Browser.getDriver(), LoginPage.class);
    }
    public static void goToBackEnd() {
        Browser.getDriver().get(urlBackEnd);
    }
    public static void goToFrontEnd(){
        Browser.getDriver().get(urlFrontEnd);
    }
    public static void writeInTheUsernameInputField(String username) {
        usernameInputField.sendKeys(username);
    }
    public static void writeInThePasswordInputField(String password) {
        passwordInputField.sendKeys(password);
    }
    public static void clickTheLoginButton() {
        loginButton.click();
    }

}
