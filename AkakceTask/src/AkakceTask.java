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
 
		// Kullan�c� akakce.com sitesine giri� yapar.
		driver.get("https://www.akakce.com/");
		driver.manage().window().maximize();

		// Kullan�c� arama i�lemi yapar (�rnek: �iphone� gibi pop�ler ve yorumu olan bir �r�n)
		WebElement search = driver.findElement(By.id("q"));
		WebElement btnSearch = driver.findElement(By.cssSelector("button[title='Ara']"));
		search.sendKeys("iphone");
		btnSearch.click();
		
		// Kullan�c� arama sonucunda gelen �r�n listesinden �r�n se�er ve �r�ne git se�ene�ine t�klar.
		WebElement goToProduct = driver.findElement(By.cssSelector("a[title='iPhone 13 128 GB'] span[class='bt_v8'] b"));
		goToProduct.click();
		
		// Kullan�c� �r�n� takip listesine ekler.(Belki artt�rabiliriz)
		WebElement followProduct = driver.findElement(By.cssSelector("div[id='pf_w_v8'] span[class='ufo_v8']"));
		followProduct.click();
	}

}
