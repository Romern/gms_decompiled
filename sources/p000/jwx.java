package p000;

import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import com.google.android.gms.auth.login.CustomWebView;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: jwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class jwx extends jxb {

    /* renamed from: a */
    public static final Logger f23423a = ght.m13171a("BrowserAuthFragment");

    /* renamed from: b */
    jym f23424b;

    /* renamed from: c */
    public CustomWebView f23425c;

    /* renamed from: b */
    static String m17431b(String str) {
        try {
            URI uri = new URI(str);
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sb = new StringBuilder(String.valueOf(host).length() + 13 + String.valueOf(path).length());
            sb.append("Host: ");
            sb.append(host);
            sb.append(" Path: ");
            sb.append(path);
            return sb.toString();
        } catch (URISyntaxException e) {
            return str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14194a(SslError sslError) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14195a(CustomWebView customWebView);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14196a(CustomWebView customWebView, String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14198a(jyl jyl);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo14199a(WebResourceRequest webResourceRequest) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo14200c(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo14201d(String str) {
        return false;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo14195a(this.f23425c);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jym a = jym.m17513a();
        this.f23424b = a;
        a.mo14229b();
        CustomWebView customWebView = new CustomWebView(new jwu(getActivity()));
        this.f23425c = customWebView;
        customWebView.setWebViewClient(new jww(this));
        this.f23425c.setWebChromeClient(new jwv(this));
        this.f23425c.mo7732a();
        this.f23425c.setFocusable(true);
        this.f23425c.setFocusableInTouchMode(true);
        this.f23425c.setMapTrackballToArrowKeys(false);
        WebSettings settings = this.f23425c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(false);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setNeedInitialFocus(false);
        settings.setUseWideViewPort(true);
        settings.setSupportZoom(false);
        settings.setUseWideViewPort(false);
        int i = Build.VERSION.SDK_INT;
        settings.setDisabledActionModeMenuItems(7);
        return this.f23425c;
    }

    public final void onDestroyView() {
        this.f23425c.destroy();
        this.f23425c = null;
        this.f23424b.mo14229b();
        super.onDestroyView();
    }

    /* renamed from: a */
    public final void mo14197a(String str) {
        jym jym = this.f23424b;
        String b = jym.mo14228b(str);
        jym.mo14227a(b, "oauth_token");
        jym.mo14227a(b, "user_id");
        jym.mo14227a(b, "GASC");
        this.f23425c.loadUrl(str);
    }
}
