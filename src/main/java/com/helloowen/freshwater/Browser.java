package com.helloowen.freshwater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;

@Component
public class Browser {

    WebDriver webDriver;

    public Browser() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        webDriver = new ChromeDriver();
    }

    public Browser(WebDriver driver) {
        this.webDriver = driver;
    }

    public void visit(String url) {
        this.webDriver.get(url);
    }

    public void close() {
        this.webDriver.close();
    }

    public void quite() {
        this.webDriver.quit();
    }

    public WebDriver getBrowser() {
        return this.webDriver;
    }

    public Object findView(Class viewClass) {
        return null;
    }

}
