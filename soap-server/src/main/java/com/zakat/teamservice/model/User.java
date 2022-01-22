package com.zakat.teamservice.model;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * User.
 * Description of app user
 * Fields: user_id, firstname, lastname, phonenumber
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "users", schema = "teamserv")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int user_id;
    @Column(name = "username")
    private String username;
    @Column(name="telegram_user_id")
    private String telegramUserId;
    @Column(name="telegram_chat_id")
    private String telegramChatId;

    @Column(name = "roles")
    @Enumerated(EnumType.STRING)
    public RoleEnum userRole;


    @ManyToOne(fetch = FetchType.EAGER)
    private UserGroup userGroup;

    public User() {
    }

    public User(String username, String telegramUserId, String telegramChatId, RoleEnum userRole) {
        this.username = username;
        this.telegramUserId = telegramUserId;
        this.telegramChatId = telegramChatId;
        this.userRole = userRole;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelegramUserId() {
        return telegramUserId;
    }

    public void setTelegramUserId(String telegramUserId) {
        this.telegramUserId = telegramUserId;
    }

    public String getTelegramChatId() {
        return telegramChatId;
    }

    public void setTelegramChatId(String telegramChatId) {
        this.telegramChatId = telegramChatId;
    }

    public RoleEnum getUserRole() {
        return userRole;
    }

    public void setUserRole(RoleEnum userRole) {
        this.userRole = userRole;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", telegramUserId='" + telegramUserId + '\'' +
                ", telegramChatId='" + telegramChatId + '\'' +
                ", userRole=" + userRole +
                ", userGroup=" + userGroup +
                '}';
    }
}

