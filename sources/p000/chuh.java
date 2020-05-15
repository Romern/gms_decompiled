package p000;

import java.net.URI;
import java.util.List;

/* renamed from: chuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chuh extends chtz {

    /* renamed from: a */
    final /* synthetic */ chuj f189181a;

    public chuh(chuj chuj) {
        this.f189181a = chuj;
    }

    /* renamed from: a */
    public final chue mo85665a(URI uri, chtx chtx) {
        for (chuf chuf : this.f189181a.mo85682b()) {
            chue a = chuf.mo85665a(uri, chtx);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo85666a() {
        List b = this.f189181a.mo85682b();
        return !b.isEmpty() ? ((chuf) b.get(0)).mo85666a() : "unknown";
    }
}
