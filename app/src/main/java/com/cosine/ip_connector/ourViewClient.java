package com.cosine.ip_connector;

import android.webkit.WebView;
import android.webkit.WebViewClient;
/*

made by Anilabha Baral
 */

public class ourViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url)
    {
        v.loadUrl(url);
        return true;
    }
}