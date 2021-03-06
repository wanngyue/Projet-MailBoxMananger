
package ejb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DirectoryManagerBean", targetNamespace = "http://ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DirectoryManagerBean {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateUserRights", targetNamespace = "http://ejb/", className = "ejb.UpdateUserRights")
    @ResponseWrapper(localName = "updateUserRightsResponse", targetNamespace = "http://ejb/", className = "ejb.UpdateUserRightsResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/updateUserRightsRequest", output = "http://ejb/DirectoryManagerBean/updateUserRightsResponse")
    public void updateUserRights(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listUsers", targetNamespace = "http://ejb/", className = "ejb.ListUsers")
    @ResponseWrapper(localName = "listUsersResponse", targetNamespace = "http://ejb/", className = "ejb.ListUsersResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/listUsersRequest", output = "http://ejb/DirectoryManagerBean/listUsersResponse")
    public String listUsers();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lookupUserRights", targetNamespace = "http://ejb/", className = "ejb.LookupUserRights")
    @ResponseWrapper(localName = "lookupUserRightsResponse", targetNamespace = "http://ejb/", className = "ejb.LookupUserRightsResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/lookupUserRightsRequest", output = "http://ejb/DirectoryManagerBean/lookupUserRightsResponse")
    public int lookupUserRights(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns ejb.FinalUser
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFinalUser", targetNamespace = "http://ejb/", className = "ejb.GetFinalUser")
    @ResponseWrapper(localName = "getFinalUserResponse", targetNamespace = "http://ejb/", className = "ejb.GetFinalUserResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/getFinalUserRequest", output = "http://ejb/DirectoryManagerBean/getFinalUserResponse")
    public FinalUser getFinalUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "removeUser", targetNamespace = "http://ejb/", className = "ejb.RemoveUser")
    @ResponseWrapper(localName = "removeUserResponse", targetNamespace = "http://ejb/", className = "ejb.RemoveUserResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/removeUserRequest", output = "http://ejb/DirectoryManagerBean/removeUserResponse")
    public void removeUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addUser", targetNamespace = "http://ejb/", className = "ejb.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://ejb/", className = "ejb.AddUserResponse")
    @Action(input = "http://ejb/DirectoryManagerBean/addUserRequest", output = "http://ejb/DirectoryManagerBean/addUserResponse")
    public void addUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
