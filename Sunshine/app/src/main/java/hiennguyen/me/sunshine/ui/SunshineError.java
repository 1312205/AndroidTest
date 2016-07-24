package hiennguyen.me.sunshine.ui;

import hiennguyen.me.sunshine.R;

/**
 * Created by HienNguyen on 25/7/2016.
 */
public enum SunshineError {
    NETWORK_ERROR(R.id.error_network_id, R.string.no_internet, R.drawable.wifi);

    int errorId;
    int stringResource;
    int drawableResource;

    SunshineError(int errorId, int stringResource, int drawableResource) {
        this.errorId = errorId;
        this.stringResource = stringResource;
        this.drawableResource = drawableResource;
    }

    public int getErrorId() {
        return errorId;
    }

    public int getStringResource() {
        return stringResource;
    }

    public int getDrawableResource() {
        return drawableResource;
    }
}
