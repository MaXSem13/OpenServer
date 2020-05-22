package messages;

import java.io.Serializable;
import java.util.List;

public class DataInfo implements Serializable {
    List<String> titles;
    List<List<String>> comments;
    public DataInfo(List<String> titles, List<List<String>> comments){
        this.titles = titles;
        this.comments = comments;
    }
}
