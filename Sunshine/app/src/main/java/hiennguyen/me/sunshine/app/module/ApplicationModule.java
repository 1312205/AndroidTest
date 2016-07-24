package hiennguyen.me.sunshine.app.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import hiennguyen.me.sunshine.service.Impl.WeatherServiceImpl;
import hiennguyen.me.sunshine.service.WeatherService;
import hiennguyen.me.sunshine.ui.common.Router;


@Module
public class ApplicationModule {

    private Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Singleton
    @Provides
    Application providesApplication() {
        return mApplication;
    }

    @Singleton
    @Provides
    Router providesRouter() {
        return new Router();
    }

    @Singleton
    @Provides
    Context providesContext() {
        return mApplication;
    }

    @Provides
    @Singleton
    public WeatherService providesAuthenticationService(WeatherServiceImpl weatherService) {
        return weatherService;
    }
}
