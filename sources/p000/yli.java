package p000;

import java.util.Comparator;
import java.util.List;

/* renamed from: yli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yli extends yll {

    /* renamed from: c */
    private static final ykz f54025c = new yky().mo30593a();

    /* renamed from: d */
    private static final Comparator f54026d = bnnt.f131877a.mo68159a(yle.f54021a).mo68163b(bnnt.f131877a.mo68159a(ylf.f54022a)).mo68163b(bnny.m109908a(f54025c).mo68159a(ylg.f54023a));

    /* renamed from: e */
    private final String f54027e;

    /* renamed from: f */
    private final yfr f54028f;

    public yli(ylh ylh) {
        super(ylh);
        String str = ylh.f54024a;
        bmxy.m108581a(str);
        this.f54027e = str;
        yfq a = yfr.m43986a();
        a.mo30416a(1);
        a.mo30421b(this.f54027e);
        a.mo30420a(yfl.f53726a);
        a.mo30419a(this.f53897b.mo30613a("merged"));
        this.f54028f = a.mo30415a();
    }

    /* renamed from: b */
    public final String mo30564b() {
        String valueOf = String.valueOf(this.f54027e);
        return valueOf.length() == 0 ? new String("SimpleDataPointMerger_") : "SimpleDataPointMerger_".concat(valueOf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final yfr mo30566c() {
        return this.f54028f;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [java.util.List, bmxj]
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
    /* renamed from: b */
    public final ygx mo30565b(List list, yhg yhg, yhy yhy) {
        Iterable<yhu> a = bnjd.m109576a(bnjd.m109575a((Iterable) list, yld.f54020a), f54026d);
        yhx a2 = yhy.m44167a(this.f54028f);
        for (yhu yhu : a) {
            yfp.m43965a(a2, yhu);
        }
        return a2.mo30520b();
    }
}
