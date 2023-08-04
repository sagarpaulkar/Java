import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropdownSorted {
    
    public static void main(String[] args) {
        
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sagar Paulkar\\Documents\\WebDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
        driver.manage().window().maximize();
        
        Select options = new Select(driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")));        
        List<WebElement> lists = options.getOptions();
        
        List originalList = new ArrayList();        
        for(WebElement ele : lists) {
            originalList.add(ele.getText());
        }
        
        System.out.println("Options in dropdown: " +originalList);
        
        Collections.sort(originalList);
        System.out.println("Sorted List:" + originalList );
                    
        driver.quit();
        
    }
}