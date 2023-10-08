package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterExcelDataIntoActitime {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		FileInputStream fis1 = new FileInputStream("./Testdata/Common data.property");
		Properties p = new Properties();
		
		p.load(fis1);
		
		  String URL = p.getProperty("url");
		  driver.get(URL);
		  Thread.sleep(3000);
		  
		  String UN = p.getProperty("Username");
		  driver.findElement(By.id("username")).sendKeys(UN);
		  
		  String Pwd = p.getProperty("password");
		  driver.findElement(By.name("pwd")).sendKeys(Pwd);
		
		//driver.get("https://demo.actitime.com/login.do");
		//Thread.sleep(3000);
		
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		
		FileInputStream fis = new FileInputStream("./Testdata/Testdata.xlsx");
//		Properties p = new Properties();
//		p.load(fis);
		
		Workbook wb = WorkbookFactory.create(fis);
		String CN = wb.getSheet("CustomerDetails").getRow(1).getCell(1).getStringCellValue();
		String CDes = wb.getSheet("CustomerDetails").getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(CN);
		System.out.println(CDes);
		
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(CN);
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(CDes);
//		Thread.sleep(2000);
//		
//		
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		Thread.sleep(5000);
//		
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
