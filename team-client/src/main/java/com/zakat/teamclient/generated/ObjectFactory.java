package com.zakat.teamclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.zakat.teamclient.generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddUserGroup_QNAME = new QName("http://service.teamservice.zakat.com/", "addUserGroup");
    private final static QName _AddUserGroupResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "addUserGroupResponse");
    private final static QName _DeleteUserGroup_QNAME = new QName("http://service.teamservice.zakat.com/", "deleteUserGroup");
    private final static QName _DeleteUserGroupByName_QNAME = new QName("http://service.teamservice.zakat.com/", "deleteUserGroupByName");
    private final static QName _DeleteUserGroupByNameResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "deleteUserGroupByNameResponse");
    private final static QName _DeleteUserGroupResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "deleteUserGroupResponse");
    private final static QName _FindAllUserGroup_QNAME = new QName("http://service.teamservice.zakat.com/", "findAllUserGroup");
    private final static QName _FindAllUserGroupResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "findAllUserGroupResponse");
    private final static QName _GetUserGroupById_QNAME = new QName("http://service.teamservice.zakat.com/", "getUserGroupById");
    private final static QName _GetUserGroupByIdResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "getUserGroupByIdResponse");
    private final static QName _GetUserGroupByName_QNAME = new QName("http://service.teamservice.zakat.com/", "getUserGroupByName");
    private final static QName _GetUserGroupByNameResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "getUserGroupByNameResponse");
    private final static QName _UpdateUserGroup_QNAME = new QName("http://service.teamservice.zakat.com/", "updateUserGroup");
    private final static QName _UpdateUserGroupResponse_QNAME = new QName("http://service.teamservice.zakat.com/", "updateUserGroupResponse");
    private final static QName _User_QNAME = new QName("http://service.teamservice.zakat.com/", "user");
    private final static QName _UserGroup_QNAME = new QName("http://service.teamservice.zakat.com/", "userGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zakat.teamclient.generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddUserGroup }
     */
    public AddUserGroup createAddUserGroup() {
        return new AddUserGroup();
    }

    /**
     * Create an instance of {@link AddUserGroupResponse }
     */
    public AddUserGroupResponse createAddUserGroupResponse() {
        return new AddUserGroupResponse();
    }

    /**
     * Create an instance of {@link DeleteUserGroup }
     */
    public DeleteUserGroup createDeleteUserGroup() {
        return new DeleteUserGroup();
    }

    /**
     * Create an instance of {@link DeleteUserGroupByName }
     */
    public DeleteUserGroupByName createDeleteUserGroupByName() {
        return new DeleteUserGroupByName();
    }

    /**
     * Create an instance of {@link DeleteUserGroupByNameResponse }
     */
    public DeleteUserGroupByNameResponse createDeleteUserGroupByNameResponse() {
        return new DeleteUserGroupByNameResponse();
    }

    /**
     * Create an instance of {@link DeleteUserGroupResponse }
     */
    public DeleteUserGroupResponse createDeleteUserGroupResponse() {
        return new DeleteUserGroupResponse();
    }

    /**
     * Create an instance of {@link FindAllUserGroup }
     */
    public FindAllUserGroup createFindAllUserGroup() {
        return new FindAllUserGroup();
    }

    /**
     * Create an instance of {@link FindAllUserGroupResponse }
     */
    public FindAllUserGroupResponse createFindAllUserGroupResponse() {
        return new FindAllUserGroupResponse();
    }

    /**
     * Create an instance of {@link GetUserGroupById }
     */
    public GetUserGroupById createGetUserGroupById() {
        return new GetUserGroupById();
    }

    /**
     * Create an instance of {@link GetUserGroupByIdResponse }
     */
    public GetUserGroupByIdResponse createGetUserGroupByIdResponse() {
        return new GetUserGroupByIdResponse();
    }

    /**
     * Create an instance of {@link GetUserGroupByName }
     */
    public GetUserGroupByName createGetUserGroupByName() {
        return new GetUserGroupByName();
    }

    /**
     * Create an instance of {@link GetUserGroupByNameResponse }
     */
    public GetUserGroupByNameResponse createGetUserGroupByNameResponse() {
        return new GetUserGroupByNameResponse();
    }

    /**
     * Create an instance of {@link UpdateUserGroup }
     */
    public UpdateUserGroup createUpdateUserGroup() {
        return new UpdateUserGroup();
    }

    /**
     * Create an instance of {@link UpdateUserGroupResponse }
     */
    public UpdateUserGroupResponse createUpdateUserGroupResponse() {
        return new UpdateUserGroupResponse();
    }

    /**
     * Create an instance of {@link User }
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link UserGroup }
     */
    public UserGroup createUserGroup() {
        return new UserGroup();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "addUserGroup")
    public JAXBElement<AddUserGroup> createAddUserGroup(AddUserGroup value) {
        return new JAXBElement<AddUserGroup>(_AddUserGroup_QNAME, AddUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserGroupResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link AddUserGroupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "addUserGroupResponse")
    public JAXBElement<AddUserGroupResponse> createAddUserGroupResponse(AddUserGroupResponse value) {
        return new JAXBElement<AddUserGroupResponse>(_AddUserGroupResponse_QNAME, AddUserGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "deleteUserGroup")
    public JAXBElement<DeleteUserGroup> createDeleteUserGroup(DeleteUserGroup value) {
        return new JAXBElement<DeleteUserGroup>(_DeleteUserGroup_QNAME, DeleteUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupByName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "deleteUserGroupByName")
    public JAXBElement<DeleteUserGroupByName> createDeleteUserGroupByName(DeleteUserGroupByName value) {
        return new JAXBElement<DeleteUserGroupByName>(_DeleteUserGroupByName_QNAME, DeleteUserGroupByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupByNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "deleteUserGroupByNameResponse")
    public JAXBElement<DeleteUserGroupByNameResponse> createDeleteUserGroupByNameResponse(DeleteUserGroupByNameResponse value) {
        return new JAXBElement<DeleteUserGroupByNameResponse>(_DeleteUserGroupByNameResponse_QNAME, DeleteUserGroupByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link DeleteUserGroupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "deleteUserGroupResponse")
    public JAXBElement<DeleteUserGroupResponse> createDeleteUserGroupResponse(DeleteUserGroupResponse value) {
        return new JAXBElement<DeleteUserGroupResponse>(_DeleteUserGroupResponse_QNAME, DeleteUserGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUserGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FindAllUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "findAllUserGroup")
    public JAXBElement<FindAllUserGroup> createFindAllUserGroup(FindAllUserGroup value) {
        return new JAXBElement<FindAllUserGroup>(_FindAllUserGroup_QNAME, FindAllUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUserGroupResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link FindAllUserGroupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "findAllUserGroupResponse")
    public JAXBElement<FindAllUserGroupResponse> createFindAllUserGroupResponse(FindAllUserGroupResponse value) {
        return new JAXBElement<FindAllUserGroupResponse>(_FindAllUserGroupResponse_QNAME, FindAllUserGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserGroupById }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserGroupById }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "getUserGroupById")
    public JAXBElement<GetUserGroupById> createGetUserGroupById(GetUserGroupById value) {
        return new JAXBElement<GetUserGroupById>(_GetUserGroupById_QNAME, GetUserGroupById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserGroupByIdResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserGroupByIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "getUserGroupByIdResponse")
    public JAXBElement<GetUserGroupByIdResponse> createGetUserGroupByIdResponse(GetUserGroupByIdResponse value) {
        return new JAXBElement<GetUserGroupByIdResponse>(_GetUserGroupByIdResponse_QNAME, GetUserGroupByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserGroupByName }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserGroupByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "getUserGroupByName")
    public JAXBElement<GetUserGroupByName> createGetUserGroupByName(GetUserGroupByName value) {
        return new JAXBElement<GetUserGroupByName>(_GetUserGroupByName_QNAME, GetUserGroupByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserGroupByNameResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link GetUserGroupByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "getUserGroupByNameResponse")
    public JAXBElement<GetUserGroupByNameResponse> createGetUserGroupByNameResponse(GetUserGroupByNameResponse value) {
        return new JAXBElement<GetUserGroupByNameResponse>(_GetUserGroupByNameResponse_QNAME, GetUserGroupByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateUserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "updateUserGroup")
    public JAXBElement<UpdateUserGroup> createUpdateUserGroup(UpdateUserGroup value) {
        return new JAXBElement<UpdateUserGroup>(_UpdateUserGroup_QNAME, UpdateUserGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserGroupResponse }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UpdateUserGroupResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "updateUserGroupResponse")
    public JAXBElement<UpdateUserGroupResponse> createUpdateUserGroupResponse(UpdateUserGroupResponse value) {
        return new JAXBElement<UpdateUserGroupResponse>(_UpdateUserGroupResponse_QNAME, UpdateUserGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "user")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserGroup }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link UserGroup }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.teamservice.zakat.com/", name = "userGroup")
    public JAXBElement<UserGroup> createUserGroup(UserGroup value) {
        return new JAXBElement<UserGroup>(_UserGroup_QNAME, UserGroup.class, null, value);
    }

}
