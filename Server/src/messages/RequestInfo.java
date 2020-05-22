package messages;

public abstract class RequestInfo {
    public RequestType requestType;
    public RequestInfo(RequestType requestType){
        this.requestType = requestType;
    }
}
