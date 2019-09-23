package borisova.models;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)

@Setter
@Getter

public class WeatherResponse {

    private int now;
    private String now_dt;
    private Info info;
    private Fact fact;




    public Info getInfo() {
        return info;
    }
    public Fact getFact(){return fact;}


}
