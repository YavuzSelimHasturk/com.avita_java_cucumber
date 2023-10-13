package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp(Scenario scenario){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Driver.getDriver().manage().window().maximize();
        System.out.println(scenario.getName());
    }


    @After
    public void closeDriver(Scenario scenario){
        if (!(scenario.isFailed())) {
            Driver.closeDriver();
        }
    }


}
