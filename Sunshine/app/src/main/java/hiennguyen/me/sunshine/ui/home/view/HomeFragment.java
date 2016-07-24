package hiennguyen.me.sunshine.ui.home.view;


import hiennguyen.me.sunshine.R;
import hiennguyen.me.sunshine.app.component.AppComponent;
import hiennguyen.me.sunshine.ui.common.BaseFragment;
import hiennguyen.me.sunshine.ui.home.viewmodel.HomeViewModel;

public class HomeFragment extends BaseFragment<HomeViewModel> {

    @Override
    protected int getFragmentLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void inject(AppComponent appComponent) {

    }

    @Override
    protected void bindViewModel() {

    }


}
