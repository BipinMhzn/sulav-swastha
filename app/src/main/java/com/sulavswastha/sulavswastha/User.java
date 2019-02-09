package com.sulavswastha.sulavswastha;

/**
 * Created by user1 on 12/1/2017.
 */

public class User {
    private String FirstName;
    private String LastName;
    private String Address;
    private String BloodGroup;
    private String PhoneNo;

    public User(String fName,String lName, String address, String bloodgroup, String phoneno){
        FirstName = fName;
        LastName = lName;
        Address = address;
        BloodGroup=bloodgroup;
        PhoneNo=phoneno;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getAddress() {
        return Address;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }
}
