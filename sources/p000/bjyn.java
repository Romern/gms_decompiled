package p000;

import android.webkit.JavascriptInterface;

/* renamed from: bjyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjyn {

    /* renamed from: a */
    private final bjyj f123649a;

    public bjyn(bjyj bjyj) {
        this.f123649a = bjyj;
    }

    @JavascriptInterface
    public void send(String str, Object obj) {
        this.f123649a.f123641j = null;
    }

    @JavascriptInterface
    public void submit(String str, String str2) {
        this.f123649a.f123641j = new bjym(str, str2);
    }
}
