import com.codeborne.selenide.Selenide;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    String loginXpath = "//input[@id='field_email']";
    String passwordXpath = "//input[@id='field_password']";
    String buttonXpath = "//input[@type='submit']";

    public LoginPage open()
    {

      Selenide.open("/");
      return this;
    }

    MainPage transitionToMainPage(@NotNull User user)
    {
      $(By.xpath(loginXpath)).setValue(user.getLogin());
      $(By.xpath(passwordXpath)).setValue(user.getPassword());
      $(By.xpath(buttonXpath)).click();
      return new MainPage();
    }



}
