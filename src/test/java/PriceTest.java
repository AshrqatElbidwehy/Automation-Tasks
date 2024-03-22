import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriceTest {
    private WebDriver driver;
    protected HomePage homePage ;
    protected DocumentPage documentPage ;
    @Test
    public void priceValidationTest() {
        driver = new ChromeDriver();
        homePage=new HomePage(driver);
        documentPage=new DocumentPage(driver);
        driver.get("https://www.levelset.com/");

        documentPage= homePage.clickGetPaidButton();
        String documentPrice = documentPage.getPriceItem();

        Assert.assertEquals(documentPrice,"$149");


    }
}
