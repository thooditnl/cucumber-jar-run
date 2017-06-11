package com.rackspace.example.stack;

import cucumber.api.CucumberOptions;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:stack.feature",glue = "com.rackspace.example.stack")
public class stackTest {

    public static void main(String[] args)throws Throwable{
        System.out.println("This is just a test");
        Main.main(new String[]{"-g","classpath:com.rackspace.example.stack","classpath:stack.feature"});
    }

}
