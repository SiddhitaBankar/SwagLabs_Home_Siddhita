package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePage extends Utility{
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	WebElement productHeading;
	
	
	public String productHeading()
	{
	   return productHeading.getText();
	}

	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement cart_option;  

	public HomePage cartoptionButton() throws IOException
	{
		cart_option.click();
		return new HomePage();
	}
	

	
	public boolean addtocart()
	{
		System.out.println(add_to_cart_icon.isDisplayed());
		return add_to_cart_icon.isDisplayed();
	   
		
	}
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu_icon; 
	
	public boolean menu_icon()
	{
		System.out.println(menu_icon.isDisplayed());
		return menu_icon.isDisplayed();
	   
		
	}
	
	
	public  String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}  
	
	
	@FindBy(xpath="//div[@class='app_logo']")

    private WebElement heading;

    public String Heading()

    {

        return heading.getText();

    }
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement add_to_cart_icon;

	
	public HomePage addtocarticonButton() throws IOException
{
	add_to_cart_icon.click();
	return new HomePage();
}
	
	
	@FindBy(xpath="//button[@id='continue-shopping']")
	WebElement continue_shopping;

	
	public HomePage continueshoppingButton() throws IOException
	{
		continue_shopping.click();
		return new HomePage();
	}
	

	@FindBy(xpath="	//select[@class='product_sort_container']")
	WebElement filter_icon;

	
	public HomePage filtericonButton() throws IOException
	{
		filter_icon.click();
		return new HomePage();
	
	}
	
/*
	@FindBy(xpath="//*[text()='Name (A to Z)']")
	private WebElement first_filter_icon;
		
		public HomePage firstfilterButton() throws IOException
		{
			first_filter_icon.click();
			return new HomePage();
		}	
*/	
		
	@FindBy(xpath="//*[text()='Name (Z to A)']")
	private WebElement second_filter_icon;
		
		public HomePage second_filter_Button() throws IOException
		{
			second_filter_icon.click();
			return new HomePage();
		}	
		
	/*	
	@FindBy(xpath="//*[text()='Price (low to high)']")
	private WebElement third_filter_icon;
			
			public HomePage thirdfilterButton() throws IOException
			{
				thirdfiltericon.click();
				return new HomePage();
}
	*/
		
	@FindBy(xpath="//*[text()='Price (high to low)']")
	private WebElement last_filter_icon;
	
	public HomePage lastfilterButton() throws IOException
	{
		last_filter_icon.click();
		return new HomePage();
	
	}



	public String validatefirstproductTitle() 
	{
		return driver.getTitle();
	}
	}

