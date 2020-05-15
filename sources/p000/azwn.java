package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import java.util.concurrent.ConcurrentMap;

/* renamed from: azwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azwn extends azrk {

    /* renamed from: c */
    public final bbpv f100125c;

    /* renamed from: d */
    public final aztu f100126d;

    /* renamed from: e */
    final ConcurrentMap f100127e = bnmt.m109809c();

    public azwn(Context context, bbpv bbpv, aztu aztu) {
        super(context);
        this.f100125c = bbpv;
        this.f100126d = aztu;
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "TypingIndicatorController";
    }

    @JavascriptInterface
    @azqt
    public String getTypingContacts(String str, String str2) {
        return mo55258a(str, str2, azwh.f100117a, this.f100127e, new azrj(str, str2), new azwi(this), new azwj(this, str2), new azwk(this), 1825, 1826);
    }

    @JavascriptInterface
    @azqt
    public String sendTypingIndicator(String str, String str2, int i) {
        return mo55256a(str, str2, new azwl(this, i), 1827, 1828);
    }
}
