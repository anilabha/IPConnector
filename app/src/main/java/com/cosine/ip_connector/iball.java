package com.cosine.ip_connector;
/*

made by Anilabha Baral
 */



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class iball extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        /*webView = (WebView)findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);

        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.loadUrl("http://192.168.1.1/");*/



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
        ourBrow.loadUrl("http://192.168.1.1/");;
    }
}








