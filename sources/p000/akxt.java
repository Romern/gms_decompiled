package p000;

import android.app.KeyguardManager;
import android.os.Build;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.chimera.Activity;
import java.util.ArrayList;

/* renamed from: akxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akxt implements akww {

    /* renamed from: a */
    public final WebView f73077a;

    /* renamed from: b */
    public boolean f73078b = false;

    /* renamed from: c */
    final rjx f73079c;

    /* renamed from: d */
    private final Activity f73080d;

    /* renamed from: e */
    private final akxs f73081e;

    /* JADX WARN: Type inference failed for: r2v0, types: [android.content.Context, akxs, com.google.android.chimera.Activity], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    public akxt(Activity r2, WebView webView) {
        this.f73080d = r2;
        sdo.m34974b(true);
        this.f73081e = r2;
        this.f73077a = webView;
        this.f73079c = aula.m77249a(r2);
    }

    /* renamed from: a */
    public static void m60657a(WebView webView, int i) {
        if (webView != null) {
            webView.post(new akxi(webView, i));
        }
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
        this.f73078b = true;
    }

    /* renamed from: b */
    public final void mo39898b() {
        this.f73078b = false;
    }

    @JavascriptInterface
    public void isScreenLockSet(int i) {
        boolean z;
        KeyguardManager keyguardManager = (KeyguardManager) this.f73080d.getSystemService("keyguard");
        if (keyguardManager != null) {
            int i2 = Build.VERSION.SDK_INT;
            z = keyguardManager.isDeviceSecure();
        } else {
            z = false;
        }
        m60658a(this.f73077a, i, z);
    }

    @JavascriptInterface
    public void isSmartLockSet(int i) {
        aucb A = this.f73079c.mo24669A();
        A.mo50373a(new akxh(this, i));
        A.mo50372a(new akxj(this, i));
        A.mo50370a(new akxk(this, i));
    }

    @JavascriptInterface
    public void isSmartLockSupported(int i) {
        m60658a(this.f73077a, i, rjx.m33698c(this.f73080d));
    }

    @JavascriptInterface
    public void isTrustletSet(String str, int i) {
        aucb B = this.f73079c.mo24670B();
        B.mo50373a(new akxo(this, i, str));
        B.mo50372a(new akxp(this, i));
        B.mo50370a(new akxq(this, i));
    }

    @JavascriptInterface
    public void isTrustletSupported(String str, int i) {
        aucb B = this.f73079c.mo24670B();
        B.mo50373a(new akxl(this, i, str));
        B.mo50372a(new akxm(this, i));
        B.mo50370a(new akxn(this, i));
    }

    @JavascriptInterface
    public void startScreenLockSmartLockFlow(int i) {
        this.f73081e.mo39964b(i);
    }

    /* renamed from: a */
    public static void m60658a(WebView webView, int i, boolean z) {
        if (webView != null) {
            webView.post(new akxr(webView, i, z));
        }
    }

    /* renamed from: a */
    public static final boolean m60659a(aupt aupt, String str, String str2) {
        ArrayList<String> stringArrayList;
        Bundle bundle = aupt.f92292a;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("key_trustlet_names")) == null || !stringArrayList.contains(str) || !bundle.getBundle(str).getBoolean(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        boolean z;
        if (cfrc.m142650d()) {
            int i = Build.VERSION.SDK_INT;
            z = true;
        } else {
            z = false;
        }
        return new akwv("ocTrustAgent", null, z);
    }
}
