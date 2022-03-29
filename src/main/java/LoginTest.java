import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginTest {

    @BeforeEach
    public void setup()
    {
        Configuration.baseUrl = "https://ok.ru/";
        Configuration.browser = "firefox";
    }

    @Test
    @DisplayName("Test for login in OK")
    public void test()
    {
        System.setProperty("selenide.browser", "firefox");
        User user = new User("d","sa","sa");
        LoginPage loginPage = new LoginPage();
        MainPage mainPage = loginPage.open().transitionToMainPage(user);
        assertEquals(mainPage.getFullname(),user.getFullname());
    }

}
