package final_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact_details 
{

	public static void main(String[] args) 
	{

		WebDriverManager.chromedriver().browserPath("95.0.4638.69").setup();
		WebDriverManager.chromedriver().setup();
		
		WebDriver w= new ChromeDriver();
		
		
		//Click on main URL
		w.get("http://www.seleniumframework.com/forums/");
		//Click On Home
		w.findElement(By.linkText("HOME")).click();
		//click on TUTORIALS
		w.findElement(By.linkText("TUTORIALS")).click();
		//Click on PRACTICE
		w.findElement(By.linkText("PRACTICE")).click();
		//click on SELENIUM
		w.findElement(By.linkText("SELENIUM")).click();
		//click on CUCUMBER
		w.findElement(By.linkText("CUCUMBER")).click();
		//click on PYTHON
		w.findElement(By.linkText("PYTHON")).click();
		//Click on Forums
		w.findElement(By.linkText("FORUMS")).click();
		
		//Click on About
	    w.findElement(By.linkText("ABOUT")).click();
	    //Enter Name
  		w.findElement(By.name("name")).sendKeys("Poonam Pawar");
  	   //Enter E-mail
  		w.findElement(By.name("email")).sendKeys("poonamPawar123@gmail.com");
  	   //enter telephone
  		w.findElement(By.name("telephone")).sendKeys("0217 345 3455");
  	    //Enter some message
  		w.findElement(By.name("message")).sendKeys("Sucessful Details");
  		//Click on Sign Up Course
  		w.findElement(By.linkText("Sign Up Course")).click();
  		
  		
  		//Click on Contact
  		w.findElement(By.linkText("CONTACT")).click();
		//Enter Name
		w.findElement(By.name("name")).sendKeys("Sonali Pawar");
	    //Enter E-Mail
		w.findElement(By.name("email")).sendKeys("sonalipawar123@gmail.com");
		//Enter Telephone
		w.findElement(By.name("telephone")).sendKeys("012-345-6789");
		//Enter Country
		w.findElement(By.name("country")).sendKeys("India");
		//Enter City
		w.findElement(By.name("city")).sendKeys("Mumbai");
		//Enter Company
		w.findElement(By.name("company")).sendKeys("ABC");
		//Enter Message
		w.findElement(By.name("message")).sendKeys("Details are Successful");
		//Click on Send Message
		w.findElement(By.linkText("Send message")).click();
			
  		
  		
  		
  		
  		
  		//HARBAL TEA For GREEN TEA//
		//Click on main URL
	    w.navigate().to("http://www.practiceselenium.com/");
		//Harbal1 Tea click on See Collection
		w.findElement(By.linkText("See Collection")).click();
		//Click On Check Out
		w.findElement(By.linkText("Check Out")).click();
		//Enter Your E-Mail
		w.findElement(By.id("email")).sendKeys("senha123@gmail.com");
		//Enter Name
		w.findElement(By.id("name")).sendKeys("Senha Pawar");
		//Enter Adderess1
		w.findElement(By.id("address")).sendKeys("Solapur");
		//Card Type
		Select s1=new Select(w.findElement(By.id("card_type")));
		//s1.selectByVisibleText("Visa");
		//Card Number
		w.findElement(By.id("card_number")).sendKeys("1234 5678 9012 3456");
		//Card Holder Name
		w.findElement(By.id("cardholder_name")).sendKeys("Senha Pawar");
		//Verification Code
		w.findElement(By.id("verification_code")).sendKeys("423222");
		//Click on Place Oredr1
		w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
		
		
		
		//HARBAL TEA For RED TEA//
		//Click On Check Out 
		w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")).click();
		//Enter Your E-Mail
		w.findElement(By.id("email")).sendKeys("kiranbansode123@gmail.com");
	    //Enter Name
		w.findElement(By.id("name")).sendKeys("Kiran Bansode");
		 //Enter Adderess1
		w.findElement(By.id("address")).sendKeys("Pune");
		//Card Type
		 Select s2=new Select(w.findElement(By.id("card_type")));
		s2.selectByVisibleText("Mastercard");
		//Card Number
		w.findElement(By.id("card_number")).sendKeys("1987 6543 2112 3456");
		//Card Holder Name
		w.findElement(By.id("cardholder_name")).sendKeys("Karan Bansode");
		//Verification Code
		w.findElement(By.id("verification_code")).sendKeys("456789");
		//Click on Place Oredr1
		w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
					  		
					  		
		//HARBAL TEA For OOLONG1 TEA//
		 //Click On Check Out for  
		 w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")).click();
		//Enter Your E-Mail
		w.findElement(By.id("email")).sendKeys("nikitapawar123@gmail.com");
		//Enter Name
		w.findElement(By.id("name")).sendKeys("Nikita Pawar");
		//Enter Adderess1
		w.findElement(By.id("address")).sendKeys("Delhi");
		//Card Type
		Select s3=new Select(w.findElement(By.id("card_type")));
		s3.selectByVisibleText("American Express");
		//Card Number
		w.findElement(By.id("card_number")).sendKeys("1234 0987 4567 1234");
		//Card Holder Name
		w.findElement(By.id("cardholder_name")).sendKeys("Nikita Pawar");
		//Verification Code
		w.findElement(By.id("verification_code")).sendKeys("533898");
		//Click on Place Oredr1
		w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
						  		
						  		
			
						  		
						  		
		 // LOOSE TEA FOR GREEN TEA//
		 //Click on main URL
		 w.navigate().to("http://www.practiceselenium.com/");
	     //Harbal1 Tea click on See Collection
		 w.findElement(By.linkText("See Collection")).click();
		 //Click On Check Out
		 w.findElement(By.linkText("Check Out")).click();
		 //Enter Your E-Mail
		 w.findElement(By.id("email")).sendKeys("senha123@gmail.com");
		 //Enter Name
		 w.findElement(By.id("name")).sendKeys("Senha Pawar");
		 //Enter Adderess1
		 w.findElement(By.id("address")).sendKeys("Solapur");
		 //Card Type
		 Select s4=new Select(w.findElement(By.id("card_type")));
		 s4.selectByVisibleText("Visa");
		 //Card Number
		 w.findElement(By.id("card_number")).sendKeys("1234 5678 9012 3456");
		 //Card Holder Name
		 w.findElement(By.id("cardholder_name")).sendKeys("Senha Pawar");
		 //Verification Code
		 w.findElement(By.id("verification_code")).sendKeys("423222");
		 //Click on Place Oredr1
		 w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
				
				
				
		 // LOOSE TEA FOR RED TEA//	
		  //Click On Check Out
		  w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")).click();
		  //Enter Your E-Mail
		  w.findElement(By.id("email")).sendKeys("kiranbansode123@gmail.com");
		  //Enter Name
		   w.findElement(By.id("name")).sendKeys("Kiran Bansode");
		   //Enter Adderess1
		   w.findElement(By.id("address")).sendKeys("Pune");
		   //Card Type
		   Select s5=new Select(w.findElement(By.id("card_type")));
		   s5.selectByVisibleText("Mastercard");
		   //Card Number
		   w.findElement(By.id("card_number")).sendKeys("1987 6543 2112 3456");
		   //Card Holder Name
		   w.findElement(By.id("cardholder_name")).sendKeys("Karan Bansode");
		   //Verification Code
			w.findElement(By.id("verification_code")).sendKeys("456789");
			//Click on Place Oredr1
			w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
							  		
							  		
			 // LOOSE TEA FOR OOLONG1 TEA//
			//Click On Check Out
			 w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")).click();
			 //Enter Your E-Mail
			w.findElement(By.id("email")).sendKeys("nikitapawar123@gmail.com");
			//Enter Name
			w.findElement(By.id("name")).sendKeys("Nikita Pawar");
			//Enter Adderess1
			w.findElement(By.id("address")).sendKeys("Delhi");
			//Card Type
			Select s6=new Select(w.findElement(By.id("card_type")));
			s6.selectByVisibleText("American Express");
			//Card Number
			w.findElement(By.id("card_number")).sendKeys("1234 0987 4567 1234");
			//Card Holder Name
			w.findElement(By.id("cardholder_name")).sendKeys("Nikita Pawar");
			//Verification Code
			w.findElement(By.id("verification_code")).sendKeys("533898");
			//Click on Place Oredr1
			w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
								  		
								  		
					
								  		
	       //FLAVORED1 TEA FOR GREEN TEA//
		   //Click on main URL
	       w.navigate().to("http://www.practiceselenium.com/");
		   //Flavored1 Tea click on See Collection
		   w.findElement(By.linkText("See Collection")).click();
		   //Click On Check Out
		   w.findElement(By.linkText("Check Out")).click();
		   //Enter Your E-Mail
		   w.findElement(By.id("email")).sendKeys("sonalipawar123@gmail.com");
		   //Enter Name
		   w.findElement(By.id("name")).sendKeys("Sonali Pawar");
		   //Enter Adderess1
		   w.findElement(By.id("address")).sendKeys("Solapur");
		  //Card Type
		   Select s7=new Select(w.findElement(By.id("card_type")));
		   s7.selectByVisibleText("Visa");
		  //Card Number
		   w.findElement(By.id("card_number")).sendKeys("1234 5678 9012 3456");
		  //Card Holder Name
		  w.findElement(By.id("cardholder_name")).sendKeys("Sonali Pawar");
		  //Verification Code
		  w.findElement(By.id("verification_code")).sendKeys("423222");
		  //Click on Place Oredr1
		  w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
		
		
		
		 //FLAVORED1 TEA FOR RED TEA//
		 //Click On Check Out
		 w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")).click();
	     //Enter Your E-Mail
	     w.findElement(By.id("email")).sendKeys("manalipawar123@gmail.com");
		 //Enter Name
	     w.findElement(By.id("name")).sendKeys("Manali Pawar");
	     //Enter Adderess1
		 w.findElement(By.id("address")).sendKeys("Pune");
		 //Card Type
	     Select s8=new Select(w.findElement(By.id("card_type")));
		 s8.selectByVisibleText("Mastercard");
		 //Card Number
		 w.findElement(By.id("card_number")).sendKeys("1987 6543 2112 3456");
	    //Card Holder Name
	    w.findElement(By.id("cardholder_name")).sendKeys("Manali Pawar");
		//Verification Code
		w.findElement(By.id("verification_code")).sendKeys("456789");
		//Click on Place Oredr1
		w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
			  		
			  		
		//FLAVORED1 TEA FOR OOLONG TEA//
	    //Click On Check Out
	    w.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")).click();
	    //Enter Your E-Mail
		w.findElement(By.id("email")).sendKeys("shraddhapawar123@gmail.com");
		//Enter Name
		w.findElement(By.id("name")).sendKeys("Shraddha Pawar");
		//Enter Adderess1
		w.findElement(By.id("address")).sendKeys("Delhi");
		//Card Type
		Select s9=new Select(w.findElement(By.id("card_type")));
		s9.selectByVisibleText("American Express");
		//Card Number
		w.findElement(By.id("card_number")).sendKeys("1234 0987 4567 1234");
		//Card Holder Name
		w.findElement(By.id("cardholder_name")).sendKeys("Shraddha Pawar");
	   //Verification Code
		w.findElement(By.id("verification_code")).sendKeys("533898");
		//Click on Place Oredr1
		w.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/div/button")).click();
				  		
				  		
				  		
				  		
	   //CLICK ON LETS TALK TEA//
	   w.findElement(By.linkText("Let's Talk Tea")).click();
	   //Enter Name
	   w.findElement(By.name("name")).sendKeys("Shraddha Kapoor");
	   //Enter Your E-Mail
	   w.findElement(By.name("email")).sendKeys("shraddhakapoor123@gmail.com");
	   //Enter Subject
	   w.findElement(By.name("subject")).sendKeys("ABC");
	   //Enter Message
	   w.findElement(By.name("message")).sendKeys("Hello");
	   //Click on Submit
	   w.findElement(By.xpath("//*[@id=\"form_78ea690540a24bd8b9dcfbf99e999fea\"]/div[1]/div[5]/input")).click();
	   //Click on main URL
	   w.navigate().to("http://www.practiceselenium.com/");
					
				  		
	}
}
				  		
				  		
			  		
			  		
			  		
			  		
			  		
			  		
			  		
				

			

		
  		
			  		
			  		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


