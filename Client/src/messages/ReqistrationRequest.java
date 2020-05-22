package messages;

import java.io.Serializable;

public class ReqistrationRequest extends RequestInfo implements Serializable {
    String login;
    String password;
    public ReqistrationRequest(String login, String password){
        super(RequestType.REGISTARTION);
        this.login = login;
        this.password = password;
    }
}