package com.zakat.teamservice.model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Group of Users.
 * Description of users group
 * Fields: group_id, groupName, colorMark
 */
@XmlRootElement
@Entity
@Table(name = "userGroup", schema = "teamserv")
public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private int group_id;
    @Column(name = "groupname")
    private String groupName;
    @Column(name = "color")
    private String colorMark;



    @OneToMany(mappedBy = "userGroup", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<User> userList = new ArrayList<>();



    public UserGroup() {
    }

    public UserGroup(String groupName, String colorMark) {
        this.groupName = groupName;
        this.colorMark = colorMark;
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getColorMark() {
        return colorMark;
    }

    public void setColorMark(String colorMark) {
        this.colorMark = colorMark;
    }

    @Override
    public String toString() {
        return "UserGroup{" +
                "group_id=" + group_id +
                ", groupName='" + groupName + '\'' +
                ", colorMark='" + colorMark + '\'' +
                '}';
    }
}
