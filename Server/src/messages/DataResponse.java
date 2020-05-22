package messages;

import java.io.Serializable;

public class DataResponse extends ResponseInfo implements Serializable {
    DataInfo dataInfo;
    public DataResponse(DataInfo dataInfo){
        super(ResponseType.DATAOK);
        this.dataInfo = dataInfo;
    }
}
