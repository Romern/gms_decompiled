package p000;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bbnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbnm implements bbmw {

    /* renamed from: a */
    public final Object f102953a = new Object();

    /* renamed from: b */
    public final bbnu f102954b;

    /* renamed from: c */
    private final bmxj f102955c;

    /* renamed from: d */
    private final ayte f102956d;

    /* renamed from: e */
    private boolean f102957e = false;

    /* renamed from: f */
    private final long f102958f;

    /* renamed from: g */
    private long f102959g;

    /* renamed from: h */
    private final bbod f102960h;

    public bbnm(bmxj bmxj, bbod bbod, ayte ayte, bbnu bbnu) {
        this.f102955c = bmxj;
        this.f102960h = bbod;
        this.f102956d = ayte;
        this.f102954b = bbnu;
        this.f102958f = ayte.mo54417a();
    }

    /* renamed from: g */
    private final void m88213g() {
        bmxy.m108601b(this.f102957e, "Sync didn't complete yet!");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bnic, bmxj]
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
    /* renamed from: a */
    public final bnic mo56226a() {
        Iterator it = bnjd.m109575a((Iterable) bbnv.m88250a(this.f102954b), this.f102955c).iterator();
        if (!it.hasNext()) {
            return bnon.f131923a;
        }
        EnumSet of = EnumSet.of((Enum) it.next());
        bnjr.m109612a(of, it);
        return bngr.m109334a(of);
    }

    /* renamed from: b */
    public final bqgg mo56227b() {
        bbnu bbnu = this.f102954b;
        long a = this.f102956d.mo54417a();
        boolean z = true;
        if ((bbnu.f102983a & 1) != 0 && a - bbnu.f102985c < Long.MAX_VALUE && bbnv.m88250a(bbnu).isEmpty()) {
            z = false;
        }
        return bqga.m112775a(Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final bqgg mo56231c() {
        bqgg a;
        synchronized (this.f102953a) {
            mo56234f();
            a = this.f102960h.mo56271a(new bbnf(this, this.f102959g));
        }
        return a;
    }

    /* renamed from: d */
    public final bqgg mo56232d() {
        bqgg a;
        synchronized (this.f102953a) {
            mo56234f();
            a = this.f102960h.mo56271a(new bbng(this.f102959g));
        }
        return a;
    }

    /* renamed from: e */
    public final bbnq mo56233e() {
        long j;
        long j2;
        bbnq a;
        synchronized (this.f102953a) {
            bbnp e = bbnq.m88229e();
            m88213g();
            long j3 = this.f102959g;
            bnha h = bnhe.m109414h();
            Iterator it = bbnv.m88252b(this.f102954b).entrySet().iterator();
            while (true) {
                j = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Enum enumR = (Enum) this.f102955c.apply((Integer) entry.getKey());
                Long l = (Long) entry.getValue();
                if (l != null) {
                    j = j3 - l.longValue();
                }
                h.mo67695b(enumR, Long.valueOf(j));
            }
            e.mo56240a(bnmt.m109791a(h.mo67618b()));
            m88213g();
            e.mo56242c(this.f102959g - this.f102958f);
            m88213g();
            bbnu bbnu = this.f102954b;
            if ((bbnu.f102983a & 1) != 0) {
                j2 = this.f102959g - bbnu.f102985c;
            } else {
                j2 = 0;
            }
            e.mo56241b(j2);
            m88213g();
            bbnu bbnu2 = this.f102954b;
            if ((bbnu2.f102983a & 2) != 0) {
                j = this.f102959g - bbnu2.f102986d;
            }
            e.mo56239a(j);
            a = e.mo56238a();
        }
        return a;
    }

    /* renamed from: f */
    public final void mo56234f() {
        bmxy.m108601b(!this.f102957e, "Sync already completed!");
        this.f102959g = this.f102956d.mo54417a();
        this.f102957e = true;
    }
}
