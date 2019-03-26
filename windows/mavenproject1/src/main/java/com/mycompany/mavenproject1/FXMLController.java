package com.mycompany.mavenproject1;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FXMLController implements Initializable {
    public ChromeDriver driver;
    @FXML
    static String uname = "";
//    MainApp parent;
//    FXMLController(MainApp parent){
//        this.parent = parent;
//    }
    
    public TextField textField0;
    public TextField textField1;
    public TextField textField2;
    public TextField textField3;
    public Button button;
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException{

        String login = textField0.getText();
        String password = textField1.getText();
        String user = textField2.getText();
        String message = textField3.getText();
        
        
        
//        Тестинг
        
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
    

        driver = new ChromeDriver(options); // (options)
        // открытие сайта


        driver.get("https://vk.com");
        // меняем значение input
        WebElement mailField = driver.findElement(By.id("index_email"));
        mailField.clear();
        //mailField.sendKeys("89393335805"); //89393335805 login
        mailField.sendKeys(login);
        WebElement passField = driver.findElement(By.id("index_pass"));
        passField.clear();
        //passField.sendKeys(""); //password
        passField.sendKeys(password);
        // нажимаем на кнопку
        driver.findElement(By.id("index_login_button")).click();


        driver.get("https://vk.com/dev/messages.send");
        //id 144970652  audiomsgpl_144970652_493819179
        WebElement idField = driver.findElement(By.id("dev_const_user_id"));
        idField.clear();
        //idField.sendKeys("144970652"); //user_id
        idField.sendKeys(user);
        WebElement textField = driver.findElement(By.id("dev_const_message"));
        textField.clear();
        Integer random_number2 = 10 + (int) (Math.random() * 1000);
        String str = random_number2.toString();
        WebElement randField = driver.findElement(By.id("dev_const_random_id"));
        randField.clear();
        randField.sendKeys(str);
        WebElement attachField = driver.findElement(By.id("dev_const_attachment"));
        attachField.clear();
        //attachField.sendKeys("doc144970652_493819179"); // document
        attachField.sendKeys(message);
        driver.findElement(By.id("dev_req_run_btn")).click();
        driver.quit();
        
        
        
        
        
        
        
        
//        System.out.println(login+", "+password+", "+user+", "+message );
        
    }
    
      
    
}
