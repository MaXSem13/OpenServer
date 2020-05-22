package messages;

import java.io.Serializable;

public class AuthorizationRequest extends RequestInfo implements Serializable {
    String login;
    String password;
    public AuthorizationRequest(String login, String password, RequestType requestType){
        super(requestType);
        this.login = login;
        this.password = password;
    }
}
