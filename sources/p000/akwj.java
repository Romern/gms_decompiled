package p000;

import android.webkit.JavascriptInterface;

/* renamed from: akwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akwj implements akww {

    /* renamed from: a */
    private final akwi f73001a;

    public akwj(akwi akwi) {
        this.f73001a = akwi;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocConsistency", null, true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public void verifyActualAccountId(String str) {
        this.f73001a.mo39927a(str);
    }
}
