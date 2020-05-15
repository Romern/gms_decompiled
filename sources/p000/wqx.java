package p000;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: wqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wqx extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ wrd f51155a;

    public wqx(wrd wrd) {
        this.f51155a = wrd;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f51155a.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).setFlags(268435456));
        return true;
    }
}
