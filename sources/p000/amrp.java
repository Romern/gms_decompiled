package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: amrp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amrp extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ amrv f75816a;

    public amrp(amrv amrv) {
        this.f75816a = amrv;
    }

    public final void onPageFinished(WebView webView, String str) {
        amrv amrv = this.f75816a;
        int i = amrv.f75820e;
        amrv.f75823c.postDelayed(amrv.f75824d, 200);
    }
}
