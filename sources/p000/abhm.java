package p000;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;

/* renamed from: abhm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhm extends abhl {

    /* renamed from: c */
    private final abhp f57487c;

    public abhm(HelpChimeraActivity helpChimeraActivity, aasg aasg) {
        super(helpChimeraActivity, aasg);
        this.f57487c = new abhp(helpChimeraActivity, aasg);
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return this.f57487c.mo32115a(webResourceRequest.getUrl());
    }
}
