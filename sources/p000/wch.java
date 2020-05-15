package p000;

import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;

/* renamed from: wch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wch implements cayy {

    /* renamed from: a */
    private final cijl f50486a;

    /* renamed from: b */
    private final cijl f50487b;

    /* renamed from: c */
    private final cijl f50488c;

    public wch(cijl cijl, cijl cijl2, cijl cijl3) {
        this.f50486a = cijl;
        this.f50487b = cijl2;
        this.f50488c = cijl3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        wbp b = ((wbq) this.f50487b).mo6445a();
        bycs bycs = (bycs) this.f50488c.mo6445a();
        WebView webView = (WebView) ((Activity) ((cayz) this.f50486a).f176439a).findViewById(C0126R.C0129id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(b, "bridge");
        if (bycs.f165685d.isEmpty()) {
            webView.loadUrl(bycs.f165697p);
        } else {
            webView.loadDataWithBaseURL(bycs.f165697p, bycs.f165685d, bqca.f140449b.toString(), bmwy.f131158c.toString(), null);
        }
        webView.setBackgroundColor(0);
        cazf.m127593a(webView, "Cannot return null from a non-@Nullable @Provides method");
        return webView;
    }
}
