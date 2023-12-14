package org.adactin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {

	WebDriver driver;

	@BeforeClass
	private void test1() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://adactinhotelapp.com/");

	}

	@BeforeMethod
	private void test2() {

		Date d = new Date();
		System.out.println(d);

	}

	@Test
	private void test3() {

		WebElement userName = driver.findElement(By.id("username"));

		userName.sendKeys("saravananjei02");

		WebElement pass = driver.findElement(By.id("password"));

		pass.sendKeys("saravananjei@0205" + Keys.ENTER);

		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);

		s.selectByIndex(6);

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s1 = new Select(hotels);

		s1.selectByVisibleText("Hotel Sunshine");

		WebElement roomType = driver.findElement(By.id("room_type"));

		Select s2 = new Select(roomType);

		s2.selectByVisibleText("Super Deluxe");

		WebElement noOfRooms = driver.findElement(By.id("room_nos"));

		Select s3 = new Select(noOfRooms);

		s3.selectByVisibleText("2 - Two");

		WebElement checkInDate = driver.findElement(By.id("datepick_in"));

		checkInDate.clear();

		checkInDate.sendKeys("15/12/2023");

		WebElement checkOut = driver.findElement(By.id("datepick_out"));

		checkOut.clear();

		checkOut.sendKeys("17/12/2023");

		WebElement adultsRoom = driver.findElement(By.id("adult_room"));

		Select s4 = new Select(adultsRoom);

		s4.selectByVisibleText("2 - Two");

		WebElement childRoom = driver.findElement(By.id("child_room"));

		Select s5 = new Select(childRoom);

		s5.selectByVisibleText("2 - Two");

		WebElement search = driver.findElement(By.id("Submit"));

		search.click();

		String title = driver.getTitle();

		System.out.println(title);

		WebElement checkBox = driver.findElement(By.id("radiobutton_0"));

		checkBox.click();

		WebElement continueButton = driver.findElement(By.id("continue"));

		continueButton.click();

		String title1 = driver.getTitle();

		System.out.println(title1);

		WebElement firstName = driver.findElement(By.id("first_name"));

		firstName.sendKeys("Saravanan");

		WebElement lastName = driver.findElement(By.id("last_name"));
		lastName.sendKeys("Jeyaraman");

		WebElement address = driver.findElement(By.id("address"));

		address.sendKeys("1/287,malaiyamman illam,k.k.pudhur road,saibaba colony road,coimbatore");

		WebElement creditCardNo = driver.findElement(By.id("cc_num"));

		creditCardNo.sendKeys("1234567890987652");

		WebElement creditcardType = driver.findElement(By.id("cc_type"));

		Select s6 = new Select(creditcardType);

		s6.selectByVisibleText("American Express");

		WebElement expiryMonth = driver.findElement(By.id("cc_exp_month"));

		Select s7 = new Select(expiryMonth);

		s7.selectByVisibleText("May");

		WebElement expiryYear = driver.findElement(By.id("cc_exp_year"));

		Select s8 = new Select(expiryYear);

		s8.selectByVisibleText("2024");

		WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));

		cvvNumber.sendKeys("7010");

		WebElement bookNow = driver.findElement(By.id("book_now"));

		bookNow.click();
		WebElement orderNo = driver.findElement(By.id("order_no"));

		String attribute = orderNo.getAttribute("value");

		System.out.println(attribute);

	}

	@AfterMethod
	private void test4() {

		Date d = new Date();

		System.out.println(d);

	}

	@AfterClass
	private void test5() {

		driver.close();

	}

}
