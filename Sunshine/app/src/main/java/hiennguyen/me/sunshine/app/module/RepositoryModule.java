package hiennguyen.me.sunshine.app.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hiennguyen.me.sunshine.data.Impl.WeatherRepositoryImpl;
import hiennguyen.me.sunshine.data.OpenWeatherApi;
import hiennguyen.me.sunshine.data.WeatherRepository;
import hiennguyen.me.sunshine.service.Impl.WeatherServiceImpl;
import retrofit2.Retrofit;

/**
 * Created by HienNguyen on 25/7/2016.
 */
@Module
public class RepositoryModule {

    @Singleton
    @Provides
    public OpenWeatherApi providesTokenApi(Retrofit retrofit){
        return retrofit.create(OpenWeatherApi.class);
    }

    @Singleton
    @Provides
    public WeatherRepository providesUserRepository(WeatherRepositoryImpl weatherRepository){
        return weatherRepository;
    }
}
