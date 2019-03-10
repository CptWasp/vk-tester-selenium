package ru.deleveryClub;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/blurryface/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test

    public void firstTest(){

        // открытие сайта
        driver.get("https://vk.com");

        // меняем значение input
        WebElement mailField = driver.findElement(By.id("index_email"));
        mailField.clear();
        mailField.sendKeys(""); //89393335805 login

        WebElement passField = driver.findElement(By.id("index_pass"));
        passField.clear();
        passField.sendKeys(""); //password

        // нажимаем на кнопку
        driver.findElement(By.id("index_login_button")).click();

        driver.get("https://vk.com/dev/messages.send");

        //id 144970652  audiomsgpl_144970652_493819179

        WebElement idField = driver.findElement(By.id("dev_const_user_id"));
        idField.clear();
        idField.sendKeys("144970652"); //user_id

        WebElement textField = driver.findElement(By.id("dev_const_message"));
        textField.clear();

        Integer random_number2 = 10 + (int) (Math.random() * 1000);
        String str = random_number2.toString();
        WebElement randField = driver.findElement(By.id("dev_const_random_id"));
        randField.clear();
        randField.sendKeys(str);

        WebElement attachField = driver.findElement(By.id("dev_const_attachment"));
        attachField.clear();
        attachField.sendKeys("doc144970652_493819179"); // document

        driver.findElement(By.id("dev_req_run_btn")).click();


    }
/**
    @After
    public void close() {
        driver.quit();
    }
*/
}
