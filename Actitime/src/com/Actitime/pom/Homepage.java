package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//decleration
	@FindBy(xpath="//div[.='Tasks]")
	private WebElement tasktab;
	
    @FindBy(xpath="//div[.='Reports']")
    private  WebElement reporstab;
    
    @FindBy(xpath="//div[.='Users']")
    private WebElement usertab;
    
    @FindBy(id="logoutLink")
    private WebElement logoutlink;
    
//utliation
    public WebElement getTasktab() {
		return tasktab;
    }
	public WebElement getReporstab() {
		return reporstab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

    //initialiation
    public Homepage (WebDriver driver) {
    PageFactory.initElements(driver,this);
    
   
    
}
	
}