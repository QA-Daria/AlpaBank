package borisova.models;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)

public class Info {
    private Double lat;
    private Double lon;
    private String url;

    private Tzinfo tzinfo;

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }
    public String getUrl(){
        return url;
    }

    public Tzinfo getTzinfo() {
        return tzinfo;
    }
}
