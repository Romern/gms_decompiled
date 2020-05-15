package p000;

import android.net.Uri;
import java.util.regex.Pattern;

/* renamed from: becd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class becd extends becg {

    /* renamed from: a */
    private final bngx f106896a;

    static {
        bnsp.m110328a("RegExUrlChecker");
    }

    public becd(bngx bngx) {
        bngs j = bngx.m109377j();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            Pattern pattern = (Pattern) i.next();
            if ((pattern.flags() & 2) == 0) {
                j.mo67668c(Pattern.compile(pattern.pattern(), pattern.flags() | 2));
            } else {
                j.mo67668c(pattern);
            }
        }
        this.f106896a = j.mo67664a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29318a(String str) {
        bnre i = this.f106896a.listIterator();
        while (i.hasNext()) {
            if (((Pattern) i.next()).matcher(str).matches()) {
                return true;
            }
        }
        becf.m91769a(Uri.parse(str));
        return false;
    }
}
