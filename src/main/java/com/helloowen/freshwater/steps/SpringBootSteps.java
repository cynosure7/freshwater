package com.helloowen.freshwater.steps;

import com.helloowen.freshwater.MyCucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyCucumber.class, loader = SpringApplicationContextLoader.class)
public abstract class SpringBootSteps {
}
