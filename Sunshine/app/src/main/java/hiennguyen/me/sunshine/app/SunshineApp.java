package hiennguyen.me.sunshine.app;

import android.app.Application;

import hiennguyen.me.sunshine.R;
import hiennguyen.me.sunshine.app.component.AppComponent;
import hiennguyen.me.sunshine.app.component.DaggerAppComponent;
import hiennguyen.me.sunshine.app.module.ApplicationModule;
import hiennguyen.me.sunshine.app.module.NetworkModule;


public class SunshineApp extends Application{
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        String serverUrl = getResources().getString(R.string.open_weather_url);

        appComponent = DaggerAppComponent.builder()
                .networkModule(new NetworkModule(serverUrl))
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
