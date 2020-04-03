package com.bridgelabz.UserVerificationProject;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN="^[A-Z]{1}[a-zA-Z]{2}[a-zA-z0-9]*";
    private static final String LAST_NAME_PATTERN="^[A-Z]{1}[a-zA-Z]{2}[a-zA-z0-9]*";
    private static final String MOBILE_NUMBER_PATTERN="^[0-9 ]{3}[6-9]{1}[0-9]{9}$";
    private static final String EMAIL_PATTERN="^[a-zA-z]{3}[-_+.]{1}?[0-9]{3}?@(bridgelabz|gmail|yahoo|1|abc|a-zA-Z)(.com|.co|.net|.com.com)(.au|.in)?$";


    public boolean validateFirstName(String firstName) {
        Pattern check=Pattern.compile(FIRST_NAME_PATTERN);
        boolean value=check.matcher(firstName).matches();
        return value;
    }

    public static boolean validateLastName(String lastName) {
        Pattern check = Pattern.compile(LAST_NAME_PATTERN);
        boolean value = check.matcher(lastName).matches();
        return value;
    }


    public boolean validateMobileNumber(String mobileNumber) {
        Pattern check = Pattern.compile( MOBILE_NUMBER_PATTERN );
        boolean value = check.matcher( mobileNumber ).matches();
        return value;
    }

    public boolean validateEmail(String email) {
        Pattern check = Pattern.compile( EMAIL_PATTERN );
        boolean value = check.matcher( email ).matches();
        return value;
    }
}
