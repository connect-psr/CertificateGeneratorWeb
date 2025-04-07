package com.certificate.models;

public class UserInfo {
    private String emailId;
    private String name;
    private String collegeName;

    public UserInfo(String emailId, String name, String collegeName) {
        this.emailId = emailId;
        this.name = name;
        this.collegeName = collegeName;
    }

    public String getEmailId() { return emailId; }
    public String getName() { return name; }
    public String getCollegeName() { return collegeName; }
}
