package messages;

import java.io.Serializable;
import java.util.List;

public class DataRequest extends  RequestInfo implements Serializable {
    List<String> titles;
    public DataRequest(List<String> titles){
        super(RequestType.DATAINFO);
        this.titles = titles;
    }
}
