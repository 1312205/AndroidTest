package hiennguyen.me.sunshine.app.component;

import javax.inject.Singleton;

import dagger.Component;
import hiennguyen.me.sunshine.app.module.ApplicationModule;
import hiennguyen.me.sunshine.app.module.NetworkModule;
import hiennguyen.me.sunshine.app.module.RepositoryModule;
import hiennguyen.me.sunshine.ui.common.Router;
import hiennguyen.me.sunshine.ui.home.view.HomeFragment;


@Singleton
@Component(modules = {ApplicationModule.class, RepositoryModule.class, NetworkModule.class})
public interface AppComponent {
    Router getRouter();

    void inject(HomeFragment homeFragment);
}
