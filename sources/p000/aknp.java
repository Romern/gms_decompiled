package p000;

import android.webkit.WebView;
import com.google.android.gms.notifications.GunsBrowserChimeraActivity;

/* renamed from: aknp */
public final /* synthetic */ class aknp implements Runnable {

    /* renamed from: a */
    private final GunsBrowserChimeraActivity f72311a;

    /* renamed from: b */
    private final String f72312b;

    public aknp(GunsBrowserChimeraActivity gunsBrowserChimeraActivity, String str) {
        this.f72311a = gunsBrowserChimeraActivity;
        this.f72312b = str;
    }

    public final void run() {
        GunsBrowserChimeraActivity gunsBrowserChimeraActivity = this.f72311a;
        String str = this.f72312b;
        WebView webView = gunsBrowserChimeraActivity.f81204c;
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() == 0 ? new String("javascript:") : "javascript:".concat(valueOf));
    }
}
