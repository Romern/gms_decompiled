package p000;

import java.util.concurrent.Callable;

/* renamed from: adav */
final /* synthetic */ class adav implements Callable {

    /* renamed from: a */
    private final bmxj f61225a;

    /* renamed from: b */
    private final bngx f61226b;

    public adav(bmxj bmxj, bngx bngx) {
        this.f61225a = bmxj;
        this.f61226b = bngx;
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
    public final Object call() {
        return this.f61225a.apply(bnjd.m109575a((Iterable) this.f61226b, adaw.f61227a));
    }
}
