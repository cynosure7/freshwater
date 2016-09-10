package com.helloowen.freshwater;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.helloowen.freshwater"})
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:com/",
        glue = "com.helloowen",
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json-report.json"}
)

public class MyCucumber {

    public static void main(String[] args) {

        final JUnitCore core = new JUnitCore();
        core.addListener(new TextListener(System.out));
        core.run(MyCucumber.class);

    }
}
