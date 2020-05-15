package p000;

import java.util.Collection;
import java.util.List;

/* renamed from: yhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhz implements ygx {

    /* renamed from: a */
    public final yfr f53844a;

    /* renamed from: b */
    public final bngx f53845b;

    /* renamed from: c */
    private cadp f53846c;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnkn.a(java.util.List, bmxj):java.util.List
     arg types: [bxwc, yhv]
     candidates:
      bnkn.a(java.util.List, int):java.util.List
      bnkn.a(java.util.List, java.lang.Object):boolean
      bnkn.a(java.util.List, bmxj):java.util.List */
    public yhz(cadp cadp) {
        bmxy.m108581a(cadp);
        this.f53846c = cadp;
        caae caae = cadp.f172713b;
        this.f53844a = new yfr(caae == null ? caae.f172323i : caae);
        this.f53845b = bngx.m109368a((Collection) bnkn.m109668a((List) cadp.f172714c, (bmxj) new yhv(this)));
    }

    /* renamed from: a */
    public final bngx mo30473a() {
        return this.f53845b;
    }

    /* renamed from: b */
    public final yfr mo30474b() {
        return this.f53844a;
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
    /* renamed from: c */
    public final cadp mo30522c() {
        if (this.f53846c == null) {
            cado b = yyl.m45033b(this.f53844a.f53734a);
            b.mo74617a(bnjd.m109575a((Iterable) this.f53845b, yhw.f53841a));
            this.f53846c = (cadp) b.mo74062i();
        }
        return this.f53846c;
    }

    public final String toString() {
        return String.format("%s{dataSource=%s, %s}", getClass().getSimpleName(), this.f53844a.mo30425e(), String.format("size=%s, data=%s", Integer.valueOf(this.f53845b.size()), bnjd.m109594d(this.f53845b, 10)));
    }

    public yhz(yfr yfr, List list) {
        bmxy.m108581a(yfr);
        this.f53844a = yfr;
        bmxy.m108581a(list);
        this.f53845b = bngx.m109368a((Collection) list);
    }
}
