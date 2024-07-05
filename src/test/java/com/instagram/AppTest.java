package com.instagram;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AppTest {

    private WebDriver driver;
    @Before

    public  void setup() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Devraj\\IdeaProjects\\instagram_login_page_testing\\src\\driver\\edge\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @Test

    public void testInstagramTitle() {
        driver.get("https://www.instagram.com/");
        String title = driver.getTitle();
        System.out.println(title);
        assertTrue("Title should contain 'Instagram'", title.contains("Instagram"));
    }

    @After

    public void tearDown(){
        if (driver !=null){
            driver.quit();
        }

    }

}
