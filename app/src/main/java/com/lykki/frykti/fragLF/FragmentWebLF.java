package com.lykki.frykti.fragLF;

import static com.lykki.frykti.MainActivity.cfvd;
import static com.lykki.frykti.MainActivity.navControllerLF;
import static com.lykki.frykti.fragLF.FragmentStLF.decodeLF;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lykki.frykti.MainActivity;
import com.lykki.frykti.R;


public class FragmentWebLF extends Fragment {


    public static WebView webViewFullAppLF;
    public static MainActivity mainActivity;
    public static ValueCallback<Uri> xzxb;
    public static Uri nvdsg = null;
    public static ValueCallback<Uri[]> xsaxs;
    public static String cdgt;
    public static final int hyju = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web_l, container, false);
        webViewFullAppLF = view.findViewById(R.id.webViewFullAppLF);
        webViewFullAppLF.getSettings().setJavaScriptEnabled(true);
        webViewFullAppLF.getSettings().setDomStorageEnabled(true);
        webViewFullAppLF.getSettings().setLoadWithOverviewMode(true);
        webViewFullAppLF.clearCache(false);
        webViewFullAppLF.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        CookieManager.getInstance().setAcceptCookie(true);
        CookieManager.getInstance().setAcceptThirdPartyCookies(webViewFullAppLF, true);
        webViewFullAppLF.setWebViewClient(new WebClLF());
        webViewFullAppLF.setWebChromeClient(new WebChLF());
        webViewFullAppLF.loadUrl(cfvd);
        return view;
    }

    public class WebClLF extends WebViewClient{
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            if (url.contains(decodeLF("ZXJyb3I9YXBwYWZBczNm")) || url.contains(decodeLF("ZGlzYWJsZWQuaHRtbA=="))) {

                navControllerLF.navigate(R.id.fragmentBtLB);
                Log.d("weq", "boot");
            }
        }
    }

    public class WebChLF extends WebChromeClient{
        @Override
        public boolean onShowFileChooser(WebView view,
                                         ValueCallback<Uri[]> filePath,
                                         FileChooserParams fileChooserParams) {
            if (xsaxs != null) {
                xsaxs.onReceiveValue(null);
            }
            xsaxs = filePath;
            Intent csadf = new Intent(Intent.ACTION_GET_CONTENT);
            csadf.addCategory(Intent.CATEGORY_OPENABLE);
            csadf.setType("*/*");
            Intent[] vfdr = new Intent[0];
            Intent xsd = new Intent(Intent.ACTION_CHOOSER);
            xsd.putExtra(Intent.EXTRA_INTENT, csadf);
            xsd.putExtra(Intent.EXTRA_TITLE, decodeLF("U2VsZWN0IE9wdGlvbjo="));
            xsd.putExtra(Intent.EXTRA_INITIAL_INTENTS, vfdr);
            mainActivity.startActivityForResult(xsd, 1);
            return true;
        }
    }
}