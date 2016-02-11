package com.helloowen.freshwater;

import org.openqa.selenium.WebElement;

public class Element {

    private WebElement element;

    public Element(WebElement e) {
        this.element = e;
    }

    public String getId() {
        return element.getAttribute("id");
    }

    public String getName() {
        return element.getAttribute("name");
    }

    public String getCSSClass() {
        return element.getAttribute("class");
    }

}
