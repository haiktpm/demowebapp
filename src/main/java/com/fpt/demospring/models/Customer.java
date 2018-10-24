package com.fpt.demospring.models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Customer", schema = "SalesLT")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "CustomerID")
    private int CustomerID;
    @Column(name = "NameStyle")
    private String NameStyle;
    @Column(name = "FirstName")
    private String FirstName;
    @Column(name = "MiddleName")
    private String MiddleName;
    @Column(name = "LastName")
    private String LastName;
    @Column(name = "Title")
    private String Title;
    @Column(name = "Suffix")
    private String Suffix;
    @Column(name = "CompanyName")
    private String CompanyName;
    @Column(name = "SalesPerson")
    private String SalesPerson;
    @Column(name = "EmailAddress")
    private String EmailAddress;
    @Column(name = "Phone")
    private String Phone;
    @Column(name = "PasswordHash")
    private String PasswordHash;
    @Column(name = "PasswordSalt")
    private String PasswordSalt;
    @Column(name = "rowguid")
    private String rowguid;
    @Column(name = "ModifiedDate")
    private java.sql.Timestamp ModifiedDate;

    public Customer(){}

    public Customer(String nameStyle, String firstName, String middleName, String lastName, String title, String suffix, String companyName, String salesPerson, String emailAddress, String phone, String passwordHash, String passwordSalt, String rowguid, java.sql.Timestamp modifiedDate) {
        NameStyle = nameStyle;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        Title = title;
        Suffix = suffix;
        CompanyName = companyName;
        SalesPerson = salesPerson;
        EmailAddress = emailAddress;
        Phone = phone;
        PasswordHash = passwordHash;
        PasswordSalt = passwordSalt;
        this.rowguid = rowguid;
        ModifiedDate = modifiedDate;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getNameStyle() {
        return NameStyle;
    }

    public void setNameStyle(String nameStyle) {
        NameStyle = nameStyle;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSuffix() {
        return Suffix;
    }

    public void setSuffix(String suffix) {
        Suffix = suffix;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getSalesPerson() {
        return SalesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        SalesPerson = salesPerson;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        PasswordHash = passwordHash;
    }

    public String getPasswordSalt() {
        return PasswordSalt;
    }

    public void setPasswordSalt(String passwordSalt) {
        PasswordSalt = passwordSalt;
    }

    public String getRowguid() {
        return rowguid;
    }

    public void setRowguid(String rowguid) {
        this.rowguid = rowguid;
    }

    public java.sql.Timestamp getModifiedDate() {
        return ModifiedDate;
    }

    public void setModifiedDate(java.sql.Timestamp modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerID=" + CustomerID +
                ", NameStyle='" + NameStyle + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Title='" + Title + '\'' +
                ", Suffix='" + Suffix + '\'' +
                ", CompanyName='" + CompanyName + '\'' +
                ", SalesPerson='" + SalesPerson + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", Phone='" + Phone + '\'' +
                ", PasswordHash='" + PasswordHash + '\'' +
                ", PasswordSalt='" + PasswordSalt + '\'' +
                ", rowguid='" + rowguid + '\'' +
                ", ModifiedDate=" + ModifiedDate +
                '}';
    }
}
