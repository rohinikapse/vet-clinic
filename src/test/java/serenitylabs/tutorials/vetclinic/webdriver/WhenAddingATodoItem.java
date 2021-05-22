package serenitylabs.tutorials.vetclinic.webdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class WhenAddingATodoItem {

    @Test
    public void should_add_new_item_to_list() {
        System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://todomvc.com/examples/angularjs/#/");


        //When
        WebElement inputField = driver.findElement(By.className("new-todo"));
        inputField.sendKeys("Buy some milk");
        inputField.sendKeys(Keys.RETURN);

        //Then

        WebElement todoListContents = driver.findElement(By.className("todo-list"));
        assertThat(todoListContents.getText(),containsString("Buy some milk"));
        driver.quit();
    }


}
