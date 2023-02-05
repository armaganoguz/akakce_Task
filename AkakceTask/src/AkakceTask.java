import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AkakceTask {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		Actions action = new Actions(driver);
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
 
		// Kullanýcý akakce.com sitesine giriþ yapar.
		driver.get("https://www.akakce.com/");
		driver.manage().window().maximize();

		// Kullanýcý arama iþlemi yapar (Örnek: “iphone” gibi popüler ve yorumu olan bir ürün)
		WebElement search = driver.findElement(By.id("q"));
		WebElement btnSearch = driver.findElement(By.cssSelector("button[title='Ara']"));
		search.sendKeys("iphone");
		btnSearch.click();
		
		// Kullanýcý arama sonucunda gelen ürün listesinden ürün seçer ve ürüne git seçeneðine týklar.
		WebElement goToProduct = driver.findElement(By.cssSelector("a[title='iPhone 13 128 GB'] span[class='bt_v8'] b"));
		goToProduct.click();
		
		// Kullanýcý ürünü takip listesine ekler.(Belki arttýrabiliriz)
		WebElement followProduct = driver.findElement(By.cssSelector("div[id='pf_w_v8'] span[class='ufo_v8']"));
		followProduct.click();
	}

}
