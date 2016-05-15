package com.helloowen.freshwater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by caoyunxiang on 2/20/16.
 */
public abstract class Broswer {
    static {
        System.setProperty("webdriver.chrome.driver", "/Users/caoyunxiang/Dev/AngularMaterialTest/src/chromedriver");
    }

    static WebDriver webDriver = new ChromeDriver();

    public static WebDriver getBrower() {
        return webDriver;
    }

    public static void main(String[] args) {
        webDriver.get("https://material.angularjs.org/latest/demo/autocomplete");
    }
}
