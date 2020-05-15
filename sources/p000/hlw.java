package p000;

import java.util.Set;

/* renamed from: hlw */
final /* synthetic */ class hlw implements bmxj {

    /* renamed from: a */
    private final Set f19998a;

    public hlw(Set set) {
        this.f19998a = set;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, hlr]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    public final Object apply(Object obj) {
        return bngx.m109355a(bnjd.m109586b((Iterable) ((bngx) obj), (bmxz) new hlr(this.f19998a)));
    }
}
