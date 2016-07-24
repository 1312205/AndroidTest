package hiennguyen.me.sunshine.ui.home.viewmodel;


import javax.inject.Inject;

import hiennguyen.me.sunshine.model.Weather;
import hiennguyen.me.sunshine.service.WeatherService;
import hiennguyen.me.sunshine.ui.common.BaseViewModel;
import rx.Observable;
import rx.subjects.BehaviorSubject;

public class HomeViewModel extends BaseViewModel {
    Observable<Weather> onGetWeatherSuccess = Observable.empty();
    private double mLatLocation;
    private double mLongLocation;
    private BehaviorSubject<Weather> mWeather = BehaviorSubject.create();

    @Inject
    public HomeViewModel(WeatherService weatherService){
        onGetWeatherSuccess = mWeather.flatMap(trigger -> weatherService.getWeatherLocation(mLatLocation, mLongLocation));
    }

    public Observable<Weather> OnGetWeatherSuccess(){
        return onGetWeatherSuccess;
    }

    public void getWeather(){
        mWeather.onNext(null);
    }

    public void setmLongLocation(double mLongLocation) {
        this.mLongLocation = mLongLocation;
    }

    public void setmLatLocation(double mLatLocation) {
        this.mLatLocation = mLatLocation;
    }

}
