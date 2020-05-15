package p000;

import java.util.Map;

/* renamed from: yis */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class yis implements yif {

    /* renamed from: a */
    final /* synthetic */ bngs f53879a;

    /* renamed from: b */
    final /* synthetic */ Map f53880b;

    /* renamed from: c */
    final /* synthetic */ Map f53881c;

    /* renamed from: d */
    final /* synthetic */ yik f53882d;

    /* renamed from: e */
    final /* synthetic */ yiu f53883e;

    public yis(yiu yiu, bngs bngs, Map map, Map map2, yik yik) {
        this.f53883e = yiu;
        this.f53879a = bngs;
        this.f53880b = map;
        this.f53881c = map2;
        this.f53882d = yik;
    }

    /* renamed from: a */
    public final void mo30538a(yid yid) {
        cadp cadp = (cadp) this.f53881c.get(yid.f53853a);
        bmxy.m108581a(cadp);
        yhz yhz = new yhz(cadp);
        if (!yhz.f53845b.isEmpty()) {
            this.f53879a.mo67668c(yhz);
        }
    }

    /* renamed from: a */
    public final void mo30539a(yie yie) {
        this.f53879a.mo67666b((Iterable) this.f53883e.mo30549a(this.f53880b, yie, this.f53881c, this.f53882d));
    }
}
