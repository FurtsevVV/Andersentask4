package com.zakat.teamclient.generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for user complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telegramUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telegramChatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userRole" type="{http://service.teamservice.zakat.com/}roleEnum" minOccurs="0"/&gt;
 *         &lt;element name="userGroup" type="{http://service.teamservice.zakat.com/}userGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
        "userId",
        "username",
        "telegramUserId",
        "telegramChatId",
        "userRole",
        "userGroup"
})
public class User {

    @XmlElement(name = "user_id")
    protected int userId;
    protected String username;
    protected String telegramUserId;
    protected String telegramChatId;
    @XmlSchemaType(name = "string")
    protected RoleEnum userRole;
    protected UserGroup userGroup;

    /**
     * Gets the value of the userId property.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     */
    public void setUserId(int value) {
        this.userId = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the telegramUserId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelegramUserId() {
        return telegramUserId;
    }

    /**
     * Sets the value of the telegramUserId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTelegramUserId(String value) {
        this.telegramUserId = value;
    }

    /**
     * Gets the value of the telegramChatId property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTelegramChatId() {
        return telegramChatId;
    }

    /**
     * Sets the value of the telegramChatId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTelegramChatId(String value) {
        this.telegramChatId = value;
    }

    /**
     * Gets the value of the userRole property.
     *
     * @return possible object is
     * {@link RoleEnum }
     */
    public RoleEnum getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     *
     * @param value allowed object is
     *              {@link RoleEnum }
     */
    public void setUserRole(RoleEnum value) {
        this.userRole = value;
    }

    /**
     * Gets the value of the userGroup property.
     *
     * @return possible object is
     * {@link UserGroup }
     */
    public UserGroup getUserGroup() {
        return userGroup;
    }

    /**
     * Sets the value of the userGroup property.
     *
     * @param value allowed object is
     *              {@link UserGroup }
     */
    public void setUserGroup(UserGroup value) {
        this.userGroup = value;
    }

}
