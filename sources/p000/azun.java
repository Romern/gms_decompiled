package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;

/* renamed from: azun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azun extends azrk {

    /* renamed from: c */
    public final bbpj f100056c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azun(Context context) {
        super(context);
        aztw aztw = new aztw(context);
        this.f100056c = aztw;
    }

    /* renamed from: a */
    public final String mo55250a() {
        return "FeatureController";
    }

    @JavascriptInterface
    @azqt
    public String isFeatureEnabled(String str, int i) {
        boolean z;
        if (i < 10000001) {
            return mo55257a(str, str, azuh.f100048a, new azui(this, i), new azuj(this), 1817, 1818);
        }
        azph.m85998a(this.f99942a).mo55125a(1817);
        if (i != 10000001) {
            z = false;
        } else {
            z = cfgs.f183989a.mo6606a().mo81193h();
        }
        azqf.m86130a(this.f99942a);
        return azqf.m86141a(z);
    }

    @JavascriptInterface
    @azqt
    public String isFeatureForConversationEnabled(String str, String str2, int i) {
        if (str2 != null) {
            return mo55257a(str, str2, azuk.f100052a, new azul(this, i), new azum(this), 1817, 1818);
        }
        return isFeatureEnabled(str, i);
    }
}
