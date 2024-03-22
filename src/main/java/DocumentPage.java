import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocumentPage {
    private WebDriver driver;
    private By priceLocator = By.xpath("//div[contains(text(),\"Release a Lien\")]/..//span[@class=\"price-amount\"]");
    public DocumentPage (WebDriver driver){
        this.driver=driver;
    }
    public String getPriceItem(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(priceLocator));
        String price = driver.findElement(priceLocator).getText();
        return price;
    }
}
