import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String fullnameXpath = "//div[@class='tico ellip']";

    public String getFullname()
    {
      return $(By.xpath(fullnameXpath)).text();
    }

}
