package hiennguyen.me.sunshine.service.Impl;

import javax.inject.Inject;

import hiennguyen.me.sunshine.data.WeatherRepository;
import hiennguyen.me.sunshine.model.Weather;
import hiennguyen.me.sunshine.service.WeatherService;
import rx.Observable;

public class WeatherServiceImpl implements WeatherService {

    private WeatherRepository mWeatherRepository;
    @Inject
    public WeatherServiceImpl(WeatherRepository weatherRepository){
        this.mWeatherRepository = weatherRepository;

    }
    @Override
    public Observable<Weather> getWeatherLocation(double lat, double lon) {
        return mWeatherRepository.getWeather(lat, lon);
    }
}
