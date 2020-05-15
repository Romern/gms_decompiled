package p000;

import java.util.List;

/* renamed from: yph */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yph extends ykx {

    /* renamed from: h */
    public final ypj f54331h;

    /* renamed from: i */
    private final yph f54332i;

    public yph(ypg ypg) {
        super(ypg);
        ypj ypj = ypg.f54329m;
        bmxy.m108581a(ypj);
        this.f54331h = ypj;
        this.f54332i = ypg.f54330n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Iterable mo30591a(Iterable iterable) {
        return this.f54331h.mo30649a(iterable);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, ypf]
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
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final bngx mo30592d(List list, yhg yhg, yhy yhy) {
        bngs j = bngx.m109377j();
        yph yph = this.f54332i;
        if (yph != null) {
            j.mo67668c(yph.mo30565b(list, yhg, yhy).mo30473a());
        }
        j.mo67666b(bnjd.m109575a((Iterable) list, (bmxj) new ypf(this)));
        return j.mo67664a();
    }
}
