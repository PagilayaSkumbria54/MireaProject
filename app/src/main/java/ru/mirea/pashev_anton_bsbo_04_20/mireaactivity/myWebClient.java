package ru.mirea.pashev_anton_bsbo_04_20.mireaactivity;

import android.webkit.WebView;
import android.webkit.WebViewClient;


public class myWebClient extends WebViewClient {


    @SuppressWarnings("deprecation")
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
