package com.example.selenium.POs;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;


public class LoginSuccessPO extends BasePagePO{

    private By successBox = By.id("success");

    public LoginSuccessPO(WebDriver driver){
        super(driver);
    }

    public boolean successBoxIsPresent(){
        return isIn(successBox);
    }
}