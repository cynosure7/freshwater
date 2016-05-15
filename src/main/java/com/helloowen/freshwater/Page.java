package com.helloowen.freshwater;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class Page implements FindComponent {

    private WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public String getURL() {
        return driver.getCurrentUrl();
    }

    public Element find(String selector) {
        return null;
    }

    public List<Element> findAll(String selector) {
        return null;
    }
}
