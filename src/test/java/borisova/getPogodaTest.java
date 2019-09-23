package borisova;

import borisova.models.WeatherResponse;
import io.restassured.RestAssured;
import org.junit.Test;


public class getPogodaTest {

@Test
    public void main() {

    Double lat = 55.833332;
    Double lon = 37.616667;
    Integer offset = 10800;
    String name = "Europe/Moscow";
    String abbr = "MSK";
    Boolean dst = false;
    String url ="https://yandex.ru/pogoda/?lat=55.833332&lon=37.616667";
    String season = "autumn";



        WeatherResponse s = RestAssured.given()
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("limit", "2")
                .header("X-Yandex-API-Key", "2b69c6ab-5417-4d5e-ad4c-c5f38192cefb")
                .get("https://api.weather.yandex.ru/v1/forecast")
                .as(WeatherResponse.class);


    System.out.println("===Проверка lat=======");
    Double lat1 = s.getInfo().getLat();
    boolean testLat = lat.equals(lat1);
    pravda(testLat);


    System.out.println("===Проверка lon=======");
    Double lon1 = s.getInfo().getLon();
  boolean testLon = lon.equals(lon1);
   pravda(testLon);

    System.out.println("===Проверка offset=======");
    Integer offset1 = s.getInfo().getTzinfo().getOffset();
    boolean testoffset = offset.equals(offset1);
    pravda(testoffset);

    System.out.println("===Проверка часового пояса=======");
    String name1 = s.getInfo().getTzinfo().getName();
    boolean testname = name.equals(name1);
    pravda(testname);

    System.out.println("===Проверка сокращенного название часового пояса=======");
    String abbr1 = s.getInfo().getTzinfo().getAbbr();
    boolean testabbr = abbr.equals(abbr1);
    pravda(testabbr);

    System.out.println("===Проверка признака лета=======");
    Boolean dst1 = s.getInfo().getTzinfo().getDst();
    boolean testdst = dst.equals(dst1);
    pravda(testdst);

    System.out.println("===Проверка URL=======");
    String url1 = s.getInfo().getUrl();
    boolean testurl = url.equals(url1);
    pravda(testurl);

    System.out.println("===Проверка сезона=======");
    String season1 = s.getFact().getSeason();
    boolean testseason = season.equals(season1);
    pravda(testseason);






    }

public void pravda (Boolean a){
    if (a == true){
        System.out.println("Test ok" );
    }
    else System.out.println("Test no ok" );
}
}

