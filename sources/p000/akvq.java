package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.identifier.C0271c;
import java.util.regex.Pattern;

/* renamed from: akvq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvq implements akww {

    /* renamed from: a */
    public static final sek f72968a = akzt.m60725a("OctarineAdvertisingIdBridge");

    /* renamed from: b */
    private final bmzi f72969b;

    public akvq(Context context) {
        this.f72969b = new akvp(context);
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocAdvertisingId", new akzu(Pattern.compile(bmxx.m108578b(cfqq.f185468a.mo6606a().mo82532b())), Pattern.compile(bmxx.m108578b(cfqq.f185468a.mo6606a().mo82531a()))), true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public String getAdvertisingId() {
        C0271c cVar = (C0271c) this.f72969b.mo6606a();
        if (cVar == null || cVar.f7986b) {
            return null;
        }
        return cVar.f7985a;
    }
}
