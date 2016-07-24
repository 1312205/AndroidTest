package hiennguyen.me.sunshine.data.Impl;

import javax.inject.Inject;

import hiennguyen.me.sunshine.data.OpenWeatherApi;
import hiennguyen.me.sunshine.data.WeatherRepository;
import hiennguyen.me.sunshine.data.response.OpenWeather;
import hiennguyen.me.sunshine.model.Weather;
import rx.Observable;

/**
 * Created by HienNguyen on 24/7/2016.
 */
public class WeatherRepositoryImpl implements WeatherRepository {
    OpenWeatherApi mOpenWeatherApi;

    @Inject
    public WeatherRepositoryImpl(OpenWeatherApi openWeather){
        this.mOpenWeatherApi = openWeather;
    }
    @Override
    public Observable<Weather> getWeather(double lat, double lon) {
        return mOpenWeatherApi.getWeather()
                .map(weatherResponse -> new Weather(weatherResponse.getMain().getTemp(),
                        weatherResponse.getMain().getTempMin(),
                        weatherResponse.getMain().getTempMax(),
                        weatherResponse.getOpenWeather().get(0).getMain(),
                        weatherResponse.getMain().getHumidity()));
    }
}
