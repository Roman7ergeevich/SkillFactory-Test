package ru.skillFactory;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkillFactorytest {

    @Test
    public void  sillFactorytest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gas\\SkillFactory\\src\\test\\resources\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://skillfactory.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Онлайн-школа SkillFactory — онлайн-обучение востребованным IT-профессиям"));
        driver.quit();
    }


}
