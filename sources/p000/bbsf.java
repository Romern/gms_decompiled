package p000;

import android.util.Pair;

/* renamed from: bbsf */
final /* synthetic */ class bbsf implements bmxj {

    /* renamed from: a */
    private final bmxz f103288a;

    public bbsf(bmxz bmxz) {
        this.f103288a = bmxz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable
     arg types: [bngx, bmxz]
     candidates:
      bnjd.b(java.lang.Iterable, int):java.lang.Object
      bnjd.b(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.b(java.lang.Iterable, bmxz):java.lang.Iterable */
    public final Object apply(Object obj) {
        return Pair.create(bngx.m109355a(bnjd.m109586b((Iterable) ((bngx) obj), this.f103288a)), false);
    }
}
