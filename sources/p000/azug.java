package p000;

import android.webkit.JavascriptInterface;

/* renamed from: azug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class azug {

    /* renamed from: a */
    private final azqr f100046a;

    /* renamed from: e */
    protected final String f100047e;

    public azug(String str, azqr azqr) {
        this.f100047e = str;
        this.f100046a = azqr;
        new Object[1][0] = str;
    }

    @JavascriptInterface
    public String callNativeMethod(String str) {
        new Object[1][0] = str;
        return this.f100046a.mo55246a(this.f100047e, str);
    }
}
