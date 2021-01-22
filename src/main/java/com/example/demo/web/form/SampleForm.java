package com.example.demo.web.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
public class SampleForm {
    @NotBlank
    @Size(min = 1,max = 10)
    private String userId;
    @NotBlank
    private String userName;
    @NotBlank
    @Email
    private String emailAddress;
    @NotBlank
    private String password;

//    public String getUserId(){ return userId; }
//
//    public void setUserId(final String userId) {
//        this.userId = userId;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(final String userName) {
//        this.userName = userName;
//    }
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(final String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(final String password) {
//        this.password = password;
//    }
}

