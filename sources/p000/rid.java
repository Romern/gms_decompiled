package p000;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebViewClient;
import com.google.android.chimera.Activity;
import com.google.android.chimera.WebView;

/* renamed from: rid */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class rid extends Activity {
    /* renamed from: a */
    public static void m33629a(Activity activity, Intent intent, int i) {
        intent.setClassName(activity, "com.google.android.gms.common.activity.WhitelistWebViewActivity");
        activity.startActivityForResult(intent, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public WebViewClient mo17698a() {
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        setContentView(webView);
        if (!"com.google.android.gms".equals(spn.m35852a((Activity) this))) {
            setResult(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!(intent == null || intent.getData() == null)) {
            webView.loadUrl(intent.getData().toString());
        }
        webView.setWebViewClient(mo17698a());
        setResult(-1);
    }
}
