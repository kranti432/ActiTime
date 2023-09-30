package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.LoginPage;

public class BaseClass {
	 FileLibrary f=new FileLibrary(); 
	public  static WebDriver driver;
	
	@BeforeSuite
	public void databaseConnection() {
		Reporter.log("database connected",true);
	}
	@BeforeClass
	 public void launchBrowser() throws IOException {
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  String Link=f.readDatafromPropertyFileString("url");
	  driver.get(Link);
	 Reporter.log("browser Launched Successfully",true);
	      }  
	      
		   
	     @BeforeMethod
	      public void loginToActitime() throws IOException {
	    	 LoginPage Ip = new LoginPage(driver);
	  	String un = f.readDatafromPropertyFileString("username");
	  	Ip.getUntbx().sendKeys(un);
	  	String pw = f.readDatafromPropertyFileString("password");
	  	Ip.getPwtbx().sendKeys(pw);
	  	Ip.getLgbtn().click();
	  	Reporter.log("logged in successfully",true);
	       }
	       
	       
	  @AfterMethod
	     public void logoutFromActitime() {
			driver.findElement(By.id("logoutLink")).click();
			Reporter.log("logged out sucessfully",true);
	  }
			
	  
	  @AfterClass
	  public void classbrowser() {
		  driver.close();
		  Reporter.log("browser close successfully",true);
	  }
	  @AfterSuite
	  public void closeddatabaseconnection() {
		  Reporter.log("database disconnected",true);
	  }
	    	
	}		
		
	    	 
	 	 
	


