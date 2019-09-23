package borisova.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Tzinfo {
    private Integer offset;
    private String name;
    private String abbr;
    private boolean dst;

    public Integer getOffset(){
        return offset;
    }
    public  String getName(){
        return name;
    }
    public  String getAbbr(){
        return abbr;
    }
    public Boolean getDst(){
        return dst;
    }
}
