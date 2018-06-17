package com.cucumber.stepDefinition;

import java.net.MalformedURLException;
import java.nio.channels.InterruptedByTimeoutException;

import com.cucumber.selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GithubLoginSD {
	
	SeleniumFunctions sf = new SeleniumFunctions();

	 @Given("^user is on github homepage$")
	    public void user_is_on_github_homepage() throws MalformedURLException, InterruptedException  {
		 	sf.createDriver();
		 	sf.isHomepageDisplayed();
		 	System.out.println("This is the GIVEN part of the test");
	        
	    }

	    @When("^user clicks on Sign in button$")
	    public void user_clicks_on_Sign_in_button() throws Throwable {
	    	sf.clickSigninLink();
	    }

	    @Then("^user is displayed login screen$")
	    public void user_is_displayed_login_screen() throws Throwable {
	    	sf.isLoginSectionDisplayed();
	    	sf.teardown();
	    }
	    
}
