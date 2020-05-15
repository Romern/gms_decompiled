package p000;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bfbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfbo {

    /* renamed from: a */
    public final Map f113326a;

    /* renamed from: b */
    public final bfar f113327b;

    public bfbo(bfar bfar) {
        this.f113326a = new LinkedHashMap();
        this.f113327b = bfar;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [java.util.Collection, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    /* renamed from: a */
    public final List mo61364a() {
        return bngx.m109355a(bnjd.m109586b((Iterable) this.f113326a.values(), bfbl.f113323a));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bfbo(String str) {
        this(r2 == null ? bfau.f113261a : r2);
        bfar bfar = (bfar) bfau.f113262b.get(str);
    }
}
