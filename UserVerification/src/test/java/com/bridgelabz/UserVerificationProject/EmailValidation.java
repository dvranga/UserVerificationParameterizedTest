package com.bridgelabz.UserVerificationProject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class EmailValidation {
    private  boolean expectedResults;
    private  String email;
    private UserEmailValidation userEmailValidation;
    public EmailValidation(String email, boolean expectedResults) {
        this.email=email;
        this.expectedResults=expectedResults;
    }
    @Before
    public void initialize(){
        userEmailValidation = new UserEmailValidation();
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com",true},
                {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"abc-100@abc.net",true},
                {"abc.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.co",true},
                {"abc-gmail.com",false},
                {"abc@.com.my",false},
                {"abc123@gmail.a",false},
                {"abc123@.com",false},
                {"abc123@.com.com",false},
                {".abc@abc.com",false},
                {"abc()*gmail.com",false},
                {"abc@%*.com",false},
                {"abc..2002@gmail.com",false},
                {"abc.gmail.com",false},
                {"abc@abc@gmail.com",false},
                {"abc@gmail.com.1a",false},
                {"abc@gmail.com.aa.au",false}
        });
    }
    @Test
    public void givenEmailAsVar_ShouldReturnAsPerTheParameterizedResults(){
        assertEquals( this.expectedResults,userEmailValidation.validateEmail(this.email) );
    }

}
