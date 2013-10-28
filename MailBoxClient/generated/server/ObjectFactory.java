
package server;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the server package. 
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

    private final static QName _ReadNewMessagesResponse_QNAME = new QName("http://server/", "readNewMessagesResponse");
    private final static QName _RemoveUserMailBoxResponse_QNAME = new QName("http://server/", "removeUserMailBoxResponse");
    private final static QName _RemoveUserMailBox_QNAME = new QName("http://server/", "removeUserMailBox");
    private final static QName _DeleteMessage_QNAME = new QName("http://server/", "deleteMessage");
    private final static QName _SendMessage_QNAME = new QName("http://server/", "sendMessage");
    private final static QName _SendMessageResponse_QNAME = new QName("http://server/", "sendMessageResponse");
    private final static QName _SendNewsResponse_QNAME = new QName("http://server/", "sendNewsResponse");
    private final static QName _AddUserMailBoxResponse_QNAME = new QName("http://server/", "addUserMailBoxResponse");
    private final static QName _DeleteReadMessagesResponse_QNAME = new QName("http://server/", "deleteReadMessagesResponse");
    private final static QName _AddUserMailBox_QNAME = new QName("http://server/", "addUserMailBox");
    private final static QName _ReadNewMessages_QNAME = new QName("http://server/", "readNewMessages");
    private final static QName _SendNews_QNAME = new QName("http://server/", "sendNews");
    private final static QName _ReadAllMessagesResponse_QNAME = new QName("http://server/", "readAllMessagesResponse");
    private final static QName _DeleteReadMessages_QNAME = new QName("http://server/", "deleteReadMessages");
    private final static QName _DeleteMessageResponse_QNAME = new QName("http://server/", "deleteMessageResponse");
    private final static QName _ReadAllMessages_QNAME = new QName("http://server/", "readAllMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteReadMessages }
     * 
     */
    public DeleteReadMessages createDeleteReadMessages() {
        return new DeleteReadMessages();
    }

    /**
     * Create an instance of {@link DeleteMessageResponse }
     * 
     */
    public DeleteMessageResponse createDeleteMessageResponse() {
        return new DeleteMessageResponse();
    }

    /**
     * Create an instance of {@link ReadAllMessages }
     * 
     */
    public ReadAllMessages createReadAllMessages() {
        return new ReadAllMessages();
    }

    /**
     * Create an instance of {@link ReadNewMessages }
     * 
     */
    public ReadNewMessages createReadNewMessages() {
        return new ReadNewMessages();
    }

    /**
     * Create an instance of {@link DeleteReadMessagesResponse }
     * 
     */
    public DeleteReadMessagesResponse createDeleteReadMessagesResponse() {
        return new DeleteReadMessagesResponse();
    }

    /**
     * Create an instance of {@link AddUserMailBox }
     * 
     */
    public AddUserMailBox createAddUserMailBox() {
        return new AddUserMailBox();
    }

    /**
     * Create an instance of {@link ReadAllMessagesResponse }
     * 
     */
    public ReadAllMessagesResponse createReadAllMessagesResponse() {
        return new ReadAllMessagesResponse();
    }

    /**
     * Create an instance of {@link SendNews }
     * 
     */
    public SendNews createSendNews() {
        return new SendNews();
    }

    /**
     * Create an instance of {@link SendMessage }
     * 
     */
    public SendMessage createSendMessage() {
        return new SendMessage();
    }

    /**
     * Create an instance of {@link SendMessageResponse }
     * 
     */
    public SendMessageResponse createSendMessageResponse() {
        return new SendMessageResponse();
    }

    /**
     * Create an instance of {@link DeleteMessage }
     * 
     */
    public DeleteMessage createDeleteMessage() {
        return new DeleteMessage();
    }

    /**
     * Create an instance of {@link AddUserMailBoxResponse }
     * 
     */
    public AddUserMailBoxResponse createAddUserMailBoxResponse() {
        return new AddUserMailBoxResponse();
    }

    /**
     * Create an instance of {@link SendNewsResponse }
     * 
     */
    public SendNewsResponse createSendNewsResponse() {
        return new SendNewsResponse();
    }

    /**
     * Create an instance of {@link RemoveUserMailBoxResponse }
     * 
     */
    public RemoveUserMailBoxResponse createRemoveUserMailBoxResponse() {
        return new RemoveUserMailBoxResponse();
    }

    /**
     * Create an instance of {@link ReadNewMessagesResponse }
     * 
     */
    public ReadNewMessagesResponse createReadNewMessagesResponse() {
        return new ReadNewMessagesResponse();
    }

    /**
     * Create an instance of {@link RemoveUserMailBox }
     * 
     */
    public RemoveUserMailBox createRemoveUserMailBox() {
        return new RemoveUserMailBox();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadNewMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "readNewMessagesResponse")
    public JAXBElement<ReadNewMessagesResponse> createReadNewMessagesResponse(ReadNewMessagesResponse value) {
        return new JAXBElement<ReadNewMessagesResponse>(_ReadNewMessagesResponse_QNAME, ReadNewMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserMailBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "removeUserMailBoxResponse")
    public JAXBElement<RemoveUserMailBoxResponse> createRemoveUserMailBoxResponse(RemoveUserMailBoxResponse value) {
        return new JAXBElement<RemoveUserMailBoxResponse>(_RemoveUserMailBoxResponse_QNAME, RemoveUserMailBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveUserMailBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "removeUserMailBox")
    public JAXBElement<RemoveUserMailBox> createRemoveUserMailBox(RemoveUserMailBox value) {
        return new JAXBElement<RemoveUserMailBox>(_RemoveUserMailBox_QNAME, RemoveUserMailBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteMessage")
    public JAXBElement<DeleteMessage> createDeleteMessage(DeleteMessage value) {
        return new JAXBElement<DeleteMessage>(_DeleteMessage_QNAME, DeleteMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "sendMessage")
    public JAXBElement<SendMessage> createSendMessage(SendMessage value) {
        return new JAXBElement<SendMessage>(_SendMessage_QNAME, SendMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "sendMessageResponse")
    public JAXBElement<SendMessageResponse> createSendMessageResponse(SendMessageResponse value) {
        return new JAXBElement<SendMessageResponse>(_SendMessageResponse_QNAME, SendMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "sendNewsResponse")
    public JAXBElement<SendNewsResponse> createSendNewsResponse(SendNewsResponse value) {
        return new JAXBElement<SendNewsResponse>(_SendNewsResponse_QNAME, SendNewsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserMailBoxResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addUserMailBoxResponse")
    public JAXBElement<AddUserMailBoxResponse> createAddUserMailBoxResponse(AddUserMailBoxResponse value) {
        return new JAXBElement<AddUserMailBoxResponse>(_AddUserMailBoxResponse_QNAME, AddUserMailBoxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReadMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteReadMessagesResponse")
    public JAXBElement<DeleteReadMessagesResponse> createDeleteReadMessagesResponse(DeleteReadMessagesResponse value) {
        return new JAXBElement<DeleteReadMessagesResponse>(_DeleteReadMessagesResponse_QNAME, DeleteReadMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserMailBox }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addUserMailBox")
    public JAXBElement<AddUserMailBox> createAddUserMailBox(AddUserMailBox value) {
        return new JAXBElement<AddUserMailBox>(_AddUserMailBox_QNAME, AddUserMailBox.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadNewMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "readNewMessages")
    public JAXBElement<ReadNewMessages> createReadNewMessages(ReadNewMessages value) {
        return new JAXBElement<ReadNewMessages>(_ReadNewMessages_QNAME, ReadNewMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "sendNews")
    public JAXBElement<SendNews> createSendNews(SendNews value) {
        return new JAXBElement<SendNews>(_SendNews_QNAME, SendNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllMessagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "readAllMessagesResponse")
    public JAXBElement<ReadAllMessagesResponse> createReadAllMessagesResponse(ReadAllMessagesResponse value) {
        return new JAXBElement<ReadAllMessagesResponse>(_ReadAllMessagesResponse_QNAME, ReadAllMessagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteReadMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteReadMessages")
    public JAXBElement<DeleteReadMessages> createDeleteReadMessages(DeleteReadMessages value) {
        return new JAXBElement<DeleteReadMessages>(_DeleteReadMessages_QNAME, DeleteReadMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "deleteMessageResponse")
    public JAXBElement<DeleteMessageResponse> createDeleteMessageResponse(DeleteMessageResponse value) {
        return new JAXBElement<DeleteMessageResponse>(_DeleteMessageResponse_QNAME, DeleteMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadAllMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "readAllMessages")
    public JAXBElement<ReadAllMessages> createReadAllMessages(ReadAllMessages value) {
        return new JAXBElement<ReadAllMessages>(_ReadAllMessages_QNAME, ReadAllMessages.class, null, value);
    }

}
