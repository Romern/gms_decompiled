package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;
import java.util.List;

/* renamed from: abkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abkr extends bece {

    /* renamed from: a */
    private static final srn f57633a = srn.m36127a(sgj.GROWTH);

    /* renamed from: b */
    private final Activity f57634b;

    /* renamed from: c */
    private boolean f57635c;

    /* JADX WARNING: Illegal instructions before constructor call */
    public abkr(Activity activity, List list) {
        super(r0, r0);
        beca beca = new beca(list);
        this.f57634b = activity;
    }

    /* renamed from: a */
    private final boolean m47819a(Uri uri) {
        bnsl bnsl = (bnsl) f57633a.mo68388c();
        bnsl.mo68432a("abkr", "a", 46, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68420a("Not whitelisted url: %s", uri);
        if (URLUtil.isNetworkUrl(uri.toString())) {
            try {
                this.f57634b.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            } catch (ActivityNotFoundException e) {
                bnsl bnsl2 = (bnsl) f57633a.mo68387b();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("abkr", "a", 54, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("Can't launch url '%s' externally", uri);
                return false;
            }
        } else {
            bnsl bnsl3 = (bnsl) f57633a.mo68388c();
            bnsl3.mo68432a("abkr", "a", 57, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68420a("Not a network url: %s", uri);
            return false;
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.f57635c) {
            webView.setVisibility(0);
            this.f57634b.findViewById(C0126R.C0129id.webview_loading).setVisibility(8);
        }
        this.f57635c = true;
    }

    /* renamed from: a */
    public final boolean mo29311a(WebResourceRequest webResourceRequest) {
        return m47819a(webResourceRequest.getUrl());
    }

    /* renamed from: a */
    public final boolean mo29312a(String str) {
        return m47819a(Uri.parse(str));
    }
}
