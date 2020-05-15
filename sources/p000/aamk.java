package p000;

import java.util.Map;

/* renamed from: aamk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aamk {

    /* renamed from: a */
    public final aanz f28463a;

    /* renamed from: b */
    public final Map f28464b = new C1223np();

    /* renamed from: c */
    public final Map f28465c = new C1223np();

    public aamk(aanz aanz) {
        this.f28463a = aanz;
        for (aajw aajw : aanz.mo17162b()) {
            aamh a = m21519a(aajw);
            if ((aajw.f28322a & 4) != 0) {
                this.f28464b.put(a, Integer.valueOf(aajw.f28325d));
            }
            int i = aajw.f28322a;
            if (!((i & 8) == 0 || (i & 16) == 0)) {
                this.f28465c.put(a, new aamj(aajw.f28326e, aajw.f28327f));
            }
        }
    }

    /* renamed from: a */
    private static aamh m21519a(aajw aajw) {
        return aamh.m21513a(aajw.f28324c, aajw.f28323b);
    }

    /* renamed from: d */
    public static int m21520d(aamh aamh) {
        return aamh.mo17017b(aakb.m21381a().f28351l, 0).versionCode;
    }

    /* renamed from: g */
    private static bxvd m21521g(aamh aamh) {
        bxvd da = aajw.f28320h.mo74144da();
        String str = aamh.f28457a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aajw aajw = (aajw) da.f164949b;
        str.getClass();
        int i = aajw.f28322a | 2;
        aajw.f28322a = i;
        aajw.f28324c = str;
        int i2 = aamh.f28458b;
        aajw.f28322a = i | 1;
        aajw.f28323b = i2;
        return da;
    }

    /* renamed from: b */
    public final aamj mo17027b(aamh aamh) {
        aamj aamj;
        synchronized (this) {
            aamj = (aamj) this.f28465c.get(aamh);
        }
        return aamj == null ? aamj.f28460a : aamj;
    }

    /* renamed from: c */
    public final synchronized void mo17028c(aamh aamh) {
        this.f28464b.remove(aamh);
        this.f28463a.mo17163b((aajw) m21521g(aamh).mo74062i());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r3 == 0) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        return 1;
     */
    /* renamed from: e */
    public final synchronized int mo17029e(aamh aamh) {
        bmxv a = this.f28463a.mo17167a(aamh);
        if (!a.mo66813a()) {
            return 1;
        }
        int a2 = aajv.m21370a(((aajw) a.mo66814b()).f28328g);
    }

    /* renamed from: f */
    public final bxvd mo17030f(aamh aamh) {
        bmxv a = this.f28463a.mo17167a(aamh);
        if (!a.mo66813a()) {
            return m21521g(aamh);
        }
        aajw aajw = (aajw) a.mo66814b();
        bxvd bxvd = (bxvd) aajw.mo74142c(5);
        bxvd.mo73625a((bxvk) aajw);
        return bxvd;
    }

    /* renamed from: a */
    public final synchronized bngx mo17023a() {
        bngs j;
        j = bngx.m109377j();
        bnre i = this.f28463a.mo17159a(aami.f28459a).listIterator();
        while (i.hasNext()) {
            j.mo67668c(m21519a((aajw) i.next()));
        }
        return j.mo67664a();
    }

    /* renamed from: a */
    public final synchronized void mo17024a(aamh aamh) {
        this.f28464b.remove(aamh);
        bmxv a = this.f28463a.mo17167a(aamh);
        if (a.mo66813a()) {
            aanz aanz = this.f28463a;
            aajw aajw = (aajw) a.mo66814b();
            bxvd bxvd = (bxvd) aajw.mo74142c(5);
            bxvd.mo73625a((bxvk) aajw);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aajw aajw2 = (aajw) bxvd.f164949b;
            aajw aajw3 = aajw.f28320h;
            aajw2.f28322a &= -5;
            aajw2.f28325d = 0;
            aanz.mo17161a((aajw) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public final synchronized void mo17025a(aamh aamh, int i) {
        bxvd f = mo17030f(aamh);
        int a = aajv.m21370a(((aajw) f.f164949b).f28328g);
        if (a == 0) {
            a = 1;
        }
        if (a != i) {
            aanz aanz = this.f28463a;
            if (f.f164950c) {
                f.mo74035c();
                f.f164950c = false;
            }
            aajw aajw = (aajw) f.f164949b;
            aajw aajw2 = aajw.f28320h;
            aajw.f28328g = i - 1;
            aajw.f28322a |= 32;
            aanz.mo17161a((aajw) f.mo74062i());
        }
    }

    /* renamed from: a */
    public final synchronized void mo17026a(aamh aamh, aamj aamj) {
        this.f28465c.put(aamh, aamj);
        aanz aanz = this.f28463a;
        bxvd f = mo17030f(aamh);
        long j = aamj.f28461b;
        if (f.f164950c) {
            f.mo74035c();
            f.f164950c = false;
        }
        aajw aajw = (aajw) f.f164949b;
        aajw aajw2 = aajw.f28320h;
        int i = aajw.f28322a | 8;
        aajw.f28322a = i;
        aajw.f28326e = j;
        int i2 = aamj.f28462c;
        aajw.f28322a = i | 16;
        aajw.f28327f = i2;
        aanz.mo17161a((aajw) f.mo74062i());
    }
}
