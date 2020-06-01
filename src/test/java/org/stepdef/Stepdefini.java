package org.stepdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Stepdefini {
	public static WebDriver d;
	
	
	@Given("User launch adactin signup page")
	public void user_launch_adactin_signup_page() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Users\\Rajesh Mohan\\eclipse-workspace\\Adactin\\Driver\\chromedriver1.exe");
	    d= new ChromeDriver();
	    d.get("http://adactinhotelapp.com/");
	    	}

	@When("User needs to enter {string}")
	public void user_needs_to_enter(String username) {
		d.findElement(By.className("login_register")).click();
		d.findElement(By.name("username")).sendKeys(username);
	    
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String pass, String conpass) {
	    d.findElement(By.name("password")).sendKeys(pass);
	    d.findElement(By.name("re_password")).sendKeys(conpass);
	}
	
	@When("User enters {string} and {string}")
	public void user_enters_and(String fullname, String email) {
	    d.findElement(By.name("full_name")).sendKeys(fullname);
	    d.findElement(By.id("email_add")).sendKeys(email);
	}


	@When("check terms and condition")
	public void check_terms_and_condition() {
	    d.findElement(By.id("tnc_box")).click();
	}

	@When("click register button")
	public void click_register_button() {
	    d.findElement(By.id("Submit")).click();
	}

	@Then("User created account")
	public void user_created_account() {
	    System.out.println("Done");
	}
	
	@Given("User launch adactin login page")
	public void user_launch_adactin_login_page() {
		d.get("http://adactinhotelapp.com/");
	    
	}


	@When("User needs to enter {string} and {string}")
	public void user_needs_to_enter_and(String uname, String pswd) {
	    d.findElement(By.id("username")).sendKeys(uname);
	    d.findElement(By.id("password")).sendKeys(pswd);
	}

	@When("click login button")
	public void click_login_button() {
	    d.findElement(By.id("login")).click();
	}

	@Then("User should be in adactin login page")
	public void user_should_be_in_adactin_login_page() {
	    Assert.assertTrue(d.getCurrentUrl().contains("Search"));
	   

	}
	 
	@Given("User should be in search page")
	public void user_should_be_in_search_page() {
	   d.get("http://adactinhotelapp.com/SearchHotel.php");
		
	}


	@When("select city for location")
	public void select_city_for_location() {
		WebElement loc = d.findElement(By.id("location"));
	    Select s = new Select(loc);
	    s.selectByIndex(2);
	
	}

	@When("select hotel and Roomtype")
	public void select_hotel_and_Roomtype() {
	    WebElement hotel = d.findElement(By.id("hotels"));
	    Select s= new Select(hotel);
	    s.selectByIndex(1);
	    WebElement roomtype = d.findElement(By.name("room_type"));
	    Select s1= new Select(roomtype);
	    s.selectByIndex(2);
	}

	@When("Select no of rooms")
	public void select_no_of_rooms() {
		WebElement noofrooms = d.findElement(By.id("room_nos"));
		Select s= new Select(noofrooms);
		s.selectByIndex(2);
	    
	}

	@When("User enters {string} and {string} dates")
	public void user_enters_and_dates(String checkin, String checkout) {
	    
		d.findElement(By.id("datepick_in")).sendKeys(checkin);
		d.findElement(By.id("datepick_out")).sendKeys(checkout);
		
	}


	@When("User select Adults per room")
	public void user_select_Adults_per_room() {
	    WebElement adult = d.findElement(By.id("adult_room"));
	    Select s= new Select(adult);
	    s.selectByIndex(1);
	}

	@When("Select children per room")
	public void select_children_per_room() {
	   WebElement child = d.findElement(By.id("child_room"));
	   Select s = new Select(child);
	   s.selectByIndex(2);
	}
	

@When("click search button")
public void click_search_button() {
    d.findElement(By.id("Submit")).click();
}

	@Then("User enters to available hotel page")
	public void user_enters_to_available_hotel_page() {
	   Assert.assertEquals("http://adactinhotelapp.com/SelectHotel.php", d.getCurrentUrl());	
	   }


	
	@When("Select the hotel")
	public void select_the_hotel() {
	    d.findElement(By.id("radiobutton_2")).click();
	}

	@When("click continue button")
	public void click_continue_button() {
	    d.findElement(By.id("continue")).click();
	   
	}

	@When("User needs to enter Firstname and lastname and address and creditcard")
	public void user_needs_to_enter_Firstname_and_lastname_and_address_and_creditcard(io.cucumber.datatable.DataTable dt) {
		
		List<Map<String, String>> mp = dt.asMaps(String.class,String.class);
		d.findElement(By.id("first_name")).sendKeys(mp.get(0).get("Firstname"));
		d.findElement(By.id("last_name")).sendKeys(mp.get(0).get("lastname"));
	    d.findElement(By.name("address")).sendKeys(mp.get(0).get("address"));
	    d.findElement(By.id("cc_num")).sendKeys(mp.get(0).get("creditcard"));
	    
	}

	@When("user needs to select creditcard type and expiry date")
	public void user_needs_to_select_creditcard_type_and_expiry_date() {
	   WebElement cctype = d.findElement(By.id("cc_type"));
	   Select s= new Select(cctype);
	   s.selectByValue("VISA");
	   
	   WebElement expmonth = d.findElement(By.id("cc_exp_month"));
	   Select s1=new Select(expmonth);
	   s1.selectByVisibleText("May");

	   
	   WebElement expyear = d.findElement(By.id("cc_exp_year"));
	   Select s2 = new Select(expyear);
	   s2.selectByIndex(11);
	   
	   
	}

	@When("user needs to enter cvvnumber")
	public void user_needs_to_enter_cvvnumber(io.cucumber.datatable.DataTable dt1) {
	    Map<String, String> mp = dt1.asMap(String.class, String.class);
	    d.findElement(By.id("cc_cvv")).sendKeys(mp.get("cvvnumber"));
	}

	@When("click the booknow button")
	public void click_the_booknow_button() {
	    d.findElement(By.id("book_now")).click();
	    d.manage().timeouts().implicitlyWait(60, TimeUnit.MINUTES);
	}
	
	@When("get the order no")
	public void get_the_order_no() {
	    WebElement orderno = d.findElement(By.id("order_no"));
	    String val = orderno.getAttribute("value");
	    System.out.println("Order no:"+val);
	    
		
		
	}

	
	
	
	



	
}
