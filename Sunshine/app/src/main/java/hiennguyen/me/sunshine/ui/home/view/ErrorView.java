package hiennguyen.me.sunshine.ui.home.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import hiennguyen.me.sunshine.R;
import hiennguyen.me.sunshine.ui.SunshineError;
import rx.Completable;

/**
 * Created by HienNguyen on 25/7/2016.
 */
public class ErrorView extends LinearLayout {
    private ImageView errorIconView;
    private TextView errorTextView;

    public ErrorView(Context context) {
        this(context, null);
    }

    public ErrorView(Context context, AttributeSet attributeSet){
        this(context, attributeSet, 0);
    }

    public ErrorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ErrorView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context);
    }

    private void init(Context context) {
        setGravity(Gravity.CENTER_HORIZONTAL);
        setOrientation(VERTICAL);

        inflate(context, R.layout.view_error, this);
        bindView();
    }

    private void bindView() {
        errorIconView = (ImageView) findViewById(R.id.error_icon);
        errorTextView = (TextView) findViewById(R.id.error_text);
    }

    public void showError(SunshineError errorCode) {
        errorIconView.setImageDrawable(ContextCompat.getDrawable(getContext(), errorCode.getDrawableResource()));
        errorTextView.setText(errorCode.getStringResource());
    }


}
