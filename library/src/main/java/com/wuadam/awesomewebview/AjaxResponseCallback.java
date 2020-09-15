package com.wuadam.awesomewebview;

import android.os.Parcelable;

public interface AjaxResponseCallback extends Parcelable {
    void onAjaxSuccess(String host, String url, String html);

    void onAjaxError(String host, String url, int errorCode);
}
