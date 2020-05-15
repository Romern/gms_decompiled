package p000;

import com.google.android.gms.auth.api.identity.MatchPasswordResult;

/* renamed from: hkk */
final /* synthetic */ class hkk implements bmxj {

    /* renamed from: a */
    private final bngx f19945a;

    public hkk(bngx bngx) {
        this.f19945a = bngx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    public final Object apply(Object obj) {
        bngx bngx;
        bngx bngx2 = this.f19945a;
        Iterable b = bnjd.m109586b((Iterable) obj, hkm.f19948a);
        boolean z = !bnjd.m109598e(b);
        if (z) {
            bngx = bngx.m109355a(bnjd.m109575a(b, hkn.f19949a));
        } else {
            bngx = bngx.m109355a(bnjd.m109575a((Iterable) bngx2, hko.f19950a));
        }
        return new MatchPasswordResult(bngx, z);
    }
}
