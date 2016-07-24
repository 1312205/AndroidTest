package hiennguyen.me.sunshine.ui.home.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.ViewSwitcher;

import butterknife.Bind;
import hiennguyen.me.sunshine.R;
import hiennguyen.me.sunshine.app.component.AppComponent;
import hiennguyen.me.sunshine.ui.SunshineError;
import hiennguyen.me.sunshine.ui.common.BaseFragment;
import hiennguyen.me.sunshine.ui.home.viewmodel.HomeViewModel;
import hiennguyen.me.sunshine.utils.NetworkManager;

public class HomeFragment extends BaseFragment<HomeViewModel> {
    private static final String TAG = HomeFragment.class.getSimpleName();

    @Bind(R.id.content_switcher)
    ViewSwitcher mViewSwitcher;

    @Bind(R.id.error_view)
    ErrorView mErrorView;

    @Override
    public void onStart() {
        super.onStart();
        mViewModel.getWeather();
    }

    @Override
    protected int getFragmentLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void inject(AppComponent appComponent) {
        appComponent.inject(this);
    }

    @Override
    protected void bindViewModel() {

        final NetworkManager networkManager = new NetworkManager(getContext());
        mSubscriptions.add(networkManager.connection()
                        .subscribe(this::handleConnectionStateChanged));

        mSubscriptions.add(mViewModel.OnGetWeatherSuccess()
                .filter(result -> result != null)
                .subscribe(weather -> {
                    Log.i(TAG, weather.toString());
                }));
    }

    private void handleConnectionStateChanged(boolean connected) {
        if (connected) {
            mViewSwitcher.setDisplayedChild(0);
        }
        else {
            mErrorView.showError(SunshineError.NETWORK_ERROR);
            mViewSwitcher.setDisplayedChild(1);
        }
    }


}
