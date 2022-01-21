package com.zakat.teamservice.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User.
 * Description of app user
 * Fields: user_id, firstname, lastname, phonenumber
 */
@XmlRootElement
@Entity
@Table(name = "users", schema = "teamserv")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;
    @Column(name = "phone")
    private String phonenumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserGroup userGroup;

    public User() {
    }

    public User(String firstname, String lastname, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }



    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
