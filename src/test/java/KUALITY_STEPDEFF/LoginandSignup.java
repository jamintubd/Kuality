package KUALITY_STEPDEFF;

import KUALITY_UTILITY.Kuality_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginandSignup extends Kuality_Base{


	@Given("^Open \"([^\"]*)\"Applicaton URL$")
	public void open_Applicaton_URL(String URL) throws Throwable {
		KualityLaunchingURL(URL);
}

@Then("^Mouseover Signin link$")
public void mouseover_Signin_link() throws Throwable {
   
}

@Then("^Click Create Account$")
public void click_Create_Account() throws Throwable {
   
}

@Then("^Enter FirstName LastName$")
public void enter_FirstName_LastName() throws Throwable {
    
}

@Then("^Enter Email address$")
public void enter_Email_address() throws Throwable {
   
}

@Then("^Enter passwork$")
public void enter_passwork() throws Throwable {
   
}

@Then("^Click Creat Account$")
public void click_Creat_Account() throws Throwable {
    
}

@Then("^verity user can signup successfully$")
public void verity_user_can_signup_successfully() throws Throwable {
   
}


}
