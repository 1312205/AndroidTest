package hiennguyen.me.sunshine.data;

import hiennguyen.me.sunshine.data.response.WeatherResponse;
import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by HienNguyen on 24/7/2016.
 */
public interface OpenWeatherApi {
    @GET("weather?lat=21.03&lon=105.85&appid=d30d7e3341272983cfb2a378c00c15a1")
    Observable<WeatherResponse> getWeather();
}
