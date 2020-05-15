package p000;

import android.content.Context;
import android.webkit.JavascriptInterface;
import java.util.regex.Pattern;

/* renamed from: akvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akvr implements akww {

    /* renamed from: a */
    private final Context f72970a;

    public akvr(Context context) {
        this.f72970a = context;
    }

    /* renamed from: a */
    public final akwv mo39896a() {
        return new akwv("ocAndroidId", new akzu(Pattern.compile(bmxx.m108578b(cfqt.f185472a.mo6606a().mo82535b())), Pattern.compile(bmxx.m108578b(cfqt.f185472a.mo6606a().mo82534a()))), true);
    }

    /* renamed from: a */
    public final void mo39897a(String str) {
    }

    /* renamed from: b */
    public final void mo39898b() {
    }

    @JavascriptInterface
    public String getAndroidId() {
        long a = spn.m35843a(this.f72970a);
        if (a != 0) {
            return Long.toHexString(a);
        }
        return null;
    }
}
