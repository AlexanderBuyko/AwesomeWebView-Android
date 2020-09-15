package com.wuadam.awesomewebview;

import java.io.Serializable;

public interface AjaxResponseCallback extends Serializable {
    void onAjaxSuccess(String host, String url, String html);

    void onAjaxError(String host, String url, int errorCode);
}
