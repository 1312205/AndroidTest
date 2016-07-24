package hiennguyen.me.sunshine.data;

import hiennguyen.me.sunshine.model.Weather;
import rx.Observable;

/**
 * Created by HienNguyen on 24/7/2016.
 */
public interface WeatherRepository {
    Observable<Weather> getWeather(double lat, double lon);
}
