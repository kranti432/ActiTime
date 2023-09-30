package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewcust;
	
	@FindBy(xpath="//div[.='+New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])")
	private WebElement custname;
	
	@FindBy(xpath="(//textarea[@placeholder='Enter Customer Description']")
	private WebElement custdesp;
	
	@FindBy(xpath="//div[.=Create Customer']")
	private WebElement createcust;
	
	
	@FindBy(xpath="//div[@class='geryButton cancelBtn']") 
	private WebElement cancelbtn;
	
	//initialiation
	public TaskPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
//utliation

	public WebElement getAddnewcust() {
		return addnewcust;
	}

	public WebElement getNewcust() {
		return newcust;
	}

	public WebElement getCustname() {
		return custname;
	}

	public WebElement getCustdesp() {
		return custdesp;
	}

	public WebElement getCreatecust() {
		return createcust;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
		

}
