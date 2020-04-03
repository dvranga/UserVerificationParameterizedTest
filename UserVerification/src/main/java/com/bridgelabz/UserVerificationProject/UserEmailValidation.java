package com.bridgelabz.UserVerificationProject;

import java.util.regex.Pattern;

public class UserEmailValidation {
    private static final String EMAIL_PATTERN="^[a-zA-Z]{3}([-_+.]{0,}[0-9a-zA-Z]{3})*@(bridgelabz|gmail|yahoo|1|abc)(.com|.co|.net|.com.com)([.]?[a-z]{2,})?$";

    public boolean validateEmail(String email) {
        Pattern check = Pattern.compile( EMAIL_PATTERN );
        boolean matches = check.matcher( email ).matches();
        return matches;
    }
}
