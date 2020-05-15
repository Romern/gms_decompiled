package com.google.android.gms.plus.p064ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.google.android.gms.plus.ui.DpadNavigableWebViewChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DpadNavigableWebViewChimeraActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String uri = getIntent().getData().toString();
        setContentView((int) C0126R.C0128layout.common_dpad_navigable_web_view_activity);
        WebView webView = (WebView) findViewById(C0126R.C0129id.web_content);
        webView.setWebViewClient(new aone());
        webView.clearCache(true);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (!TextUtils.isEmpty(language)) {
            String variant = locale.getVariant();
            if (!TextUtils.isEmpty(variant)) {
                language = getString(C0126R.string.web_view_accept_language_header, new Object[]{language, variant});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Accept-Language", language);
            webView.loadUrl(uri, hashMap);
            return;
        }
        webView.loadUrl(uri);
    }
}
