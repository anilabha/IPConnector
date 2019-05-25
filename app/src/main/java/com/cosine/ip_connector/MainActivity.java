package com.cosine.ip_connector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();



/*

made by Anilabha Baral
 */
        WebView ourBrow=(WebView) findViewById(R.id.webview);
        ourBrow.getSettings().setJavaScriptEnabled(true);
        ourBrow.getSettings().setLoadWithOverviewMode(true);
        ourBrow.getSettings().setUseWideViewPort(true);
        ourBrow.setWebViewClient(new ourViewClient());



        ourBrow.getSettings().setSupportZoom(true);
        ourBrow.getSettings().setBuiltInZoomControls(true);
        ourBrow.getSettings().setDisplayZoomControls(false);

        ourBrow.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        ourBrow.setScrollbarFadingEnabled(false);
        ourBrow.loadUrl("http://10.254.254.23/0/up/");









    }
}
