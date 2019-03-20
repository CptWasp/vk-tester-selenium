package deleveryClub;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class engine implements ActionListener {
    public ChromeDriver driver;
    frameApp parent;
    engine(frameApp parent){
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e){

        //frameApp fr1 = new frameApp();

        String login = parent.login.getText();
        String password = parent.pass.getText();
        String userId = parent.user.getText();
        String message = parent.message.getText();


        //##### TESTER #####

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        driver = new ChromeDriver();
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
        idField.sendKeys(userId);
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


        //System.out.println(login+password+userId+message);
        /**JOptionPane.showConfirmDialog(null,login+password+userId+message,
                "Just a test", JOptionPane.PLAIN_MESSAGE);
        */
    }

}
