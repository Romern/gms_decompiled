package p000;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: wrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wrk extends bece {

    /* renamed from: a */
    private final Activity f51181a;

    /* renamed from: b */
    private boolean f51182b;

    /* JADX WARNING: Illegal instructions before constructor call */
    public wrk(Activity activity) {
        super(r0, r0);
        if (wro.f51196a == null) {
            wro.f51196a = new wro();
        }
        wro wro = wro.f51196a;
        this.f51181a = activity;
    }

    /* renamed from: a */
    private final boolean m42178a(Uri uri) {
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("Not whitelisted url: ");
        sb.append(valueOf);
        wgn.m41925e("FamilyWebViewClient", sb.toString(), new Object[0]);
        if (URLUtil.isNetworkUrl(uri.toString())) {
            try {
                this.f51181a.startActivity(new Intent("android.intent.action.VIEW", uri));
                return true;
            } catch (ActivityNotFoundException e) {
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                sb2.append("Can't launch url '%s' externally");
                sb2.append(valueOf2);
                wgn.m41925e("FamilyWebViewClient", sb2.toString(), new Object[0]);
            }
        } else {
            String valueOf3 = String.valueOf(uri);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 19);
            sb3.append("Not a network url: ");
            sb3.append(valueOf3);
            wgn.m41925e("FamilyWebViewClient", sb3.toString(), new Object[0]);
            return false;
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.f51182b) {
            webView.setVisibility(0);
            this.f51181a.findViewById(C0126R.C0129id.fm_webview_loading_screen).setVisibility(8);
        }
        this.f51182b = true;
    }

    /* renamed from: a */
    public final boolean mo29311a(WebResourceRequest webResourceRequest) {
        return m42178a(webResourceRequest.getUrl());
    }

    /* renamed from: a */
    public final boolean mo29312a(String str) {
        return m42178a(Uri.parse(str));
    }
}
