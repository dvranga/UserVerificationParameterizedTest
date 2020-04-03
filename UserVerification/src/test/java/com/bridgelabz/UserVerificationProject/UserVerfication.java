package com.bridgelabz.UserVerificationProject;

import org.junit.Assert;
import org.junit.Test;

public class UserVerfication {
    @Test
    public void givenFirstName_WhenFirstIsNotCap_ShouldReturnFalse() {
      UserValidator validator=  new UserValidator();
      boolean result=validator.validateFirstName("ranganath");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Ranganath");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenMinLength_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Rang");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenFirstName_WhenStartWithDigit_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("1Rang");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenFirstName_WhenSpecialChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("R@ang");
        Assert.assertEquals(false,result);
    }

    @Test
    public void WhenLastNameProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Vatt");
        Assert.assertEquals(true,result);
    }

    @Test
    public void WhenLastNameDigit_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("V1att");
        Assert.assertEquals(false,result);
    }
    @Test
    public void WhenLastNameLessChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Vt");
        Assert.assertEquals(false,result);
    }

    @Test
    public void WhenMobileNumberMin_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber( "91748324703" );
        Assert.assertEquals( false,result );
    }
    @Test
    public void WhenMobileNumberNoContryCode_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber( "748324703" );
        Assert.assertEquals( false,result );
    }
    @Test
    public void WhenMobileNumberProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber( "91 7483247032" );
        Assert.assertEquals( true,result );
    }

    @Test
    public void Emial_Proper1_Should_RetrunTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail( "abc-143@bridgelabz.com.com" );
        Assert.assertEquals( true,result );
    }
    @Test
    public void Emial_Proper2_Should_RetrunTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail( "abc.100@abc.com.au" );
        Assert.assertEquals( true,result );
    }
    @Test
    public void Emial_Proper3_Should_RetrunFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail( "abc@gmail.com.aa.au" );
        Assert.assertEquals( false,result );
    }
    @Test
    public void Emial_Proper4_Should_RetrunFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail( "abc@abc@gmail.com" );
        Assert.assertEquals( false,result );
    }
    @Test
    public void Emial_Proper5_Should_RetrunFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail( "abc123@.com" );
        Assert.assertEquals( false,result );
    }
}
