
package ejb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ejb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListUsersResponse_QNAME = new QName("http://ejb/", "listUsersResponse");
    private final static QName _AddUser_QNAME = new QName("http://ejb/", "addUser");
    private final static QName _UpdateUserRights_QNAME = new QName("http://ejb/", "updateUserRights");
    private final static QName _UpdateUserRightsResponse_QNAME = new QName("http://ejb/", "updateUserRightsResponse");
    private final static QName _RemoveUser_QNAME = new QName("http://ejb/", "removeUser");
    private final static QName _LookupUserRights_QNAME = new QName("http://ejb/", "lookupUserRights");
    private final static QName _LookupUserRightsResponse_QNAME = new QName("http://ejb/", "lookupUserRightsResponse");
    private final static QName _GetFinalUserResponse_QNAME = new QName("http://ejb/", "getFinalUserResponse");
    private final static QName _RemoveUserResponse_QNAME = new QName("http://ejb/", "removeUserResponse");
    private final static QName _GetFinalUser_QNAME = new QName("http://ejb/", "getFinalUser");
    private final static QName _AddUserResponse_QNAME = new QName("http://ejb/", "addUserResponse");
    private final static QName _ListUsers_QNAME = new QName("http://ejb/", "listUsers");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ejb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveUserResponse }
     * 
     */
    public RemoveUserResponse createRemoveUserResponse() {
        return new RemoveUserResponse();
    }

    /**
     * Create an instance of {@link GetFinalUserResponse }
     * 
     */
    public GetFinalUserResponse createGetFinalUserResponse() {
        return new GetFinalUserResponse();
    }

    /**
     * Create an instance of {@link ListUsers }
     * 
     */
    public ListUsers createListUsers() {
        return new ListUsers();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link GetFinalUser }
     * 
     */
    public GetFinalUser createGetFinalUser() {
        return new GetFinalUser();
    }

    /**
     * Create an instance of {@link RemoveUser }
     * 
     */
    public RemoveUser createRemoveUser() {
        return new RemoveUser();
    }

    /**
     * Create an instance of {@link UpdateUserRightsResponse }
     * 
     */
    public UpdateUserRightsResponse createUpdateUserRightsResponse() {
        return new UpdateUserRightsResponse();
    }

    /**
     * Create an instance of {@link UpdateUserRights }
     * 
     */
    public UpdateUserRights createUpdateUserRights() {
        return new UpdateUserRights();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }

    /**
     * Create an instance of {@link LookupUserRightsResponse }
     * 
     */
    public LookupUserRightsResponse createLookupUserRightsResponse() {
        return new LookupUserRightsResponse();
    }

    /**
     * Create an instance of {@link LookupUserRights }
     * 
     */
    public LookupUserRights createLookupUserRights() {
        return new LookupUserRights();
    }

    /**
     * Create an instance of {@link FinalUser }
     * 
     */
    public FinalUser createFinalUser() {
        return new FinalUser();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "listUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateUserRights")
    public JAXBElement<UpdateUserRights> createUpdateUserRights(UpdateUserRights value) {
        return new JAXBElement<UpdateUserRights>(_UpdateUserRights_QNAME, UpdateUserRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserRightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "updateUserRightsResponse")
    public JAXBElement<UpdateUserRightsResponse> createUpdateUserRightsResponse(UpdateUserRightsResponse value) {
        return new JAXBElement<UpdateUserRightsResponse>(_UpdateUserRightsResponse_QNAME, UpdateUserRightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUser")
    public JAXBElement<RemoveUser> createRemoveUser(RemoveUser value) {
        return new JAXBElement<RemoveUser>(_RemoveUser_QNAME, RemoveUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupUserRights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "lookupUserRights")
    public JAXBElement<LookupUserRights> createLookupUserRights(LookupUserRights value) {
        return new JAXBElement<LookupUserRights>(_LookupUserRights_QNAME, LookupUserRights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupUserRightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "lookupUserRightsResponse")
    public JAXBElement<LookupUserRightsResponse> createLookupUserRightsResponse(LookupUserRightsResponse value) {
        return new JAXBElement<LookupUserRightsResponse>(_LookupUserRightsResponse_QNAME, LookupUserRightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFinalUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getFinalUserResponse")
    public JAXBElement<GetFinalUserResponse> createGetFinalUserResponse(GetFinalUserResponse value) {
        return new JAXBElement<GetFinalUserResponse>(_GetFinalUserResponse_QNAME, GetFinalUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "removeUserResponse")
    public JAXBElement<RemoveUserResponse> createRemoveUserResponse(RemoveUserResponse value) {
        return new JAXBElement<RemoveUserResponse>(_RemoveUserResponse_QNAME, RemoveUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFinalUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "getFinalUser")
    public JAXBElement<GetFinalUser> createGetFinalUser(GetFinalUser value) {
        return new JAXBElement<GetFinalUser>(_GetFinalUser_QNAME, GetFinalUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ejb/", name = "listUsers")
    public JAXBElement<ListUsers> createListUsers(ListUsers value) {
        return new JAXBElement<ListUsers>(_ListUsers_QNAME, ListUsers.class, null, value);
    }

}
