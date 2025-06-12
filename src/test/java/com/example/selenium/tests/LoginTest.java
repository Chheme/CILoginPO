package com.example.selenium.tests;



import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.selenium.POs.LoginFormPO;
import com.example.selenium.POs.LoginSuccessPO;


/**
 * Unit test for simple App.
 */
public class LoginTest extends DriverLifeCycleSetting
{
    private LoginFormPO login;
    private LoginSuccessPO loginSuccess;

    @Test
    public void testLoginOK()
    {
        login=new LoginFormPO(driver);
        loginSuccess = (LoginSuccessPO) login.with("user", "user");
        assertTrue(loginSuccess.successBoxIsPresent());
    }

    @Test
    public void testLoginNoOK(){
        login = new LoginFormPO(driver);
        login.with("user", "error");
        assertTrue(login.invalidBoxIsPresent());
    }

    @Test
    public void testLoginEmpty(){
        login = new LoginFormPO(driver);
        login.with("", "");
        assertTrue(login.invalidBoxIsPresent());
    }

}
