package p000;

import android.content.pm.PackageManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import java.util.Locale;

/* renamed from: akxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akxe implements akww {

    /* renamed from: a */
    public final WebView f73045a;

    /* renamed from: b */
    public boolean f73046b;

    /* renamed from: c */
    private final Activity f73047c;

    /* renamed from: d */
    private final akxd f73048d;

    /* JADX WARN: Type inference failed for: r2v0, types: [akxd, com.google.android.chimera.Activity], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akxe(Activity r2, WebView webView) {
        this.f73047c = r2;
        sdo.m34974b(true);
        this.f73048d = r2;
        this.f73045a = webView;
    }

    /* renamed from: a */
    static void m60635a(WebView webView, int i) {
        m60638a(webView, String.format(Locale.ROOT, "window.ocPlayProtectCallback(%s, %s, %s)", Integer.valueOf(i), null, true));
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
        this.f73046b = true;
    }

    /* renamed from: b */
    public final void mo39898b() {
        this.f73046b = false;
    }

    @JavascriptInterface
    public void enablePlayProtect(int i) {
        rkb rkb = apfp.m70157a(this.f73047c).f43165D;
        apgj apgj = new apgj(rkb);
        rkb.mo24787a((rle) apgj);
        sdl.m34955a(apgj, new rkj()).mo50371a(new akwz(this, i));
    }

    @JavascriptInterface
    public void getHarmfulAppsCount(int i) {
        apfp.m70157a(this.f73047c).mo24767u().mo50371a(new akxb(this, i));
    }

    @JavascriptInterface
    public void getLastScanTimeMs(int i) {
        apfp.m70157a(this.f73047c).mo24767u().mo50371a(new akxa(this, i));
    }

    @JavascriptInterface
    public void isPlayProtectEnabled(int i) {
        apfp.m70157a(this.f73047c).mo24766t().mo50371a(new akwy(this, i));
    }

    @JavascriptInterface
    public void isPlayStoreVersionValid(int i) {
        boolean z;
        try {
            if (spn.m35864b(this.f73047c, "com.android.vending") >= 80700200) {
                z = true;
            } else {
                z = false;
            }
            m60637a(this.f73045a, i, z);
        } catch (PackageManager.NameNotFoundException e) {
            m60635a(this.f73045a, i);
        }
    }

    @JavascriptInterface
    public void startPlayProtectActivity(int i) {
        this.f73048d.mo39946a(i);
    }

    /* renamed from: a */
    static void m60636a(WebView webView, int i, long j) {
        m60638a(webView, String.format(Locale.ROOT, "window.ocPlayProtectCallback(%s, %s)", Integer.valueOf(i), Long.valueOf(j)));
    }

    /* renamed from: a */
    static void m60637a(WebView webView, int i, boolean z) {
        m60638a(webView, String.format(Locale.ROOT, "window.ocPlayProtectCallback(%s, %s)", Integer.valueOf(i), Boolean.valueOf(z)));
    }

    /* renamed from: a */
    static void m60638a(WebView webView, String str) {
        if (webView != null) {
            webView.post(new akxc(webView, str));
        }
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocPlayProtect", null, cfrc.f185484a.mo6606a().mo82546d());
    }
}
