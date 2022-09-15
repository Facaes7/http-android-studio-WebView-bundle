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

        Bundle bundle=new Bundle();
        bundle.putString("mensaje","Hola mundo.");
        myWebView.addJavascriptInterface(bundle,"bundle");
        myWebView.loadUrl("myURL/interfase.php?mensaje="+bundle.getString("mensaje"));
        //alerta("String myWebView: ",null,0,this);
    }
}