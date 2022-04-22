import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercadoLibreTest {
	private WebDriver driver;
	By locator =By.id("BO");
	By locator_name = By.name("as_word");
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mercadolibre.com/");
	}
	
	@Test
	public void testMercadoLibre() throws InterruptedException{
		driver.findElement(locator).click();
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(locator_name);
		
		searchbox.sendKeys("ropa de mujer");
		searchbox.submit();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		assertEquals("Ropa De Mujer | MercadoLibre.com.bo", driver.getTitle());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.get("https://listado.mercadolibre.com.bo/ropa-de-mujer_ITEM*CONDITION_2230284_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D4%26applied_value_id%3D2230284%26applied_value_name%3DNuevo%26applied_value_order%3D1%26applied_value_results%3D76%26is_custom%3Dfalse");

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://listado.mercadolibre.com.bo/ropa-de-mujer_ITEM*CONDITION_2230581_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D4%26applied_value_id%3D2230581%26applied_value_name%3DUsado%26applied_value_order%3D2%26applied_value_results%3D1%26is_custom%3Dfalse");

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		WebElement searchbox1 = driver.findElement(locator_name);
		searchbox1.clear();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		searchbox1.sendKeys("zapatos");
		searchbox1.submit();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		assertEquals("Zapatos | MercadoLibre.com.bo", driver.getTitle());
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.get("https://listado.mercadolibre.com.bo/zapatos_ITEM*CONDITION_2230284_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D4%26applied_value_id%3D2230284%26applied_value_name%3DNuevo%26applied_value_order%3D1%26applied_value_results%3D4%26is_custom%3Dfalse");

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://listado.mercadolibre.com.bo/zapatos_ITEM*CONDITION_2230581_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D4%26applied_value_id%3D2230581%26applied_value_name%3DUsado%26applied_value_order%3D2%26applied_value_results%3D1%26is_custom%3Dfalse");
		
		WebElement searchbox2 = driver.findElement(locator_name);
		searchbox2.clear();
		
		searchbox2.sendKeys("reloj");
		searchbox2.submit();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		assertEquals("Reloj | MercadoLibre.com.bo", driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.get("https://listado.mercadolibre.com.bo/reloj_ITEM*CONDITION_2230284_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D2%26applied_value_id%3D2230284%26applied_value_name%3DNuevo%26applied_value_order%3D1%26applied_value_results%3D6%26is_custom%3Dfalse");
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		
		driver.get("https://listado.mercadolibre.com.bo/ropa-de-mujer_ITEM*CONDITION_2230581_NoIndex_True#applied_filter_id%3DITEM_CONDITION%26applied_filter_name%3DCondici%C3%B3n%26applied_filter_order%3D4%26applied_value_id%3D2230581%26applied_value_name%3DUsado%26applied_value_order%3D2%26applied_value_results%3D1%26is_custom%3Dfalse");

	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
