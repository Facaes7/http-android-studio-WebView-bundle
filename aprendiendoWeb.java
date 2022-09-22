package com.example.neae;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class aprendiendoWeb extends MainActivity {

    @SuppressLint("JavascriptInterface")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendiendo_web);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        
        BundleJs bundle_js=new BundleJs();
        myWebView.addJavascriptInterface(bundle_js, "bundle_js");
        String url="https://aprendoconpazyamor.org/neae/view/prueba_script.html";
        String respuesta_bundle=bundle_js.getData(myWebView,url);
        
    }
    
    class BundleJs {
        @JavascriptInterface
        public String getData(WebView wv,String url)
        {
            wv.loadUrl(url);
            return "WebPage in WebView has been readed!";
        }
    }
}
