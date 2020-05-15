package p000;

import android.webkit.WebView;
import com.google.android.gms.constellation.p038ui.ApiConsentChimeraActivity;

/* renamed from: szu */
final /* synthetic */ class szu implements Runnable {

    /* renamed from: a */
    private final szv f45532a;

    public szu(szv szv) {
        this.f45532a = szv;
    }

    public final void run() {
        WebView webView;
        ApiConsentChimeraActivity apiConsentChimeraActivity = this.f45532a.f45533a;
        sek sek = ApiConsentChimeraActivity.f30509a;
        apiConsentChimeraActivity.f30523o = false;
        if (apiConsentChimeraActivity.f30515g != null && apiConsentChimeraActivity.f30517i != null && (webView = apiConsentChimeraActivity.f30516h) != null && apiConsentChimeraActivity.f30522n && webView.getVisibility() == 4) {
            apiConsentChimeraActivity.f30515g.setVisibility(8);
            apiConsentChimeraActivity.f30517i.setVisibility(0);
            apiConsentChimeraActivity.f30516h.setVisibility(0);
        }
    }
}
