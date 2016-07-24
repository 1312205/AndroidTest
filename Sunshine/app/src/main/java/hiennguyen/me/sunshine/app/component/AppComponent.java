package hiennguyen.me.sunshine.app.component;

import javax.inject.Singleton;

import dagger.Component;
import hiennguyen.me.sunshine.app.module.ApplicationModule;
import hiennguyen.me.sunshine.app.module.NetworkModule;
import hiennguyen.me.sunshine.ui.common.Router;


@Singleton
@Component(modules = {ApplicationModule.class, NetworkModule.class})
public interface AppComponent {
    Router getRouter();
}
