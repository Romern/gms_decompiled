package p000;

/* renamed from: buly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buly implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bujp f154208a;

    /* renamed from: b */
    final /* synthetic */ bujt f154209b;

    /* renamed from: c */
    final /* synthetic */ bulc f154210c;

    /* renamed from: d */
    final /* synthetic */ bukf f154211d;

    /* renamed from: e */
    final /* synthetic */ bujy f154212e;

    /* renamed from: f */
    final /* synthetic */ buma f154213f;

    public buly(buma buma, bujp bujp, bujt bujt, bulc bulc, bukf bukf, bujy bujy) {
        this.f154213f = buma;
        this.f154208a = bujp;
        this.f154209b = bujt;
        this.f154210c = bulc;
        this.f154211d = bukf;
        this.f154212e = bujy;
    }

    public final void run() {
        try {
            this.f154213f.f154226p.clear();
            this.f154213f.f154225o.clear();
            bujp bujp = this.f154213f.f154220d;
            bujp bujp2 = this.f154208a;
            bujp.clear();
            if (bujp2 != null) {
                bujm a = bujp2.entrySet().iterator();
                while (a.hasNext()) {
                    a.mo72556f();
                    bujp.mo72734a(((Long) a.f153152b.mo72479b()).longValue(), a.mo72730h(), a.f154032a.f154040a[a.mo72557g()], a.f154032a.f154041b[a.mo72557g()], a.f154032a.f154042e[a.mo72557g()], a.f154032a.f154043f[a.mo72557g()], a.f154032a.f154044g[a.mo72557g()]);
                }
            }
            this.f154213f.f154221e.mo72739a(this.f154209b);
            buma buma = this.f154213f;
            bulc bulc = buma.f154222f;
            bulc bulc2 = this.f154210c;
            short s = buma.f154218b;
            bulc.clear();
            if (bulc2 != null) {
                bukz a2 = bulc2.entrySet().iterator();
                while (a2.hasNext()) {
                    a2.mo72556f();
                    short h = a2.mo72806h();
                    bulc.mo72811a(h, a2.f154117a.f154126b[a2.mo72557g()], a2.mo72807i(), a2.f154117a.f154128f[a2.mo72557g()], a2.f154117a.f154129g[a2.mo72557g()], a2.mo72808j());
                    s = h;
                }
            }
            buma.f154218b = s;
            bukf bukf = this.f154213f.f154223m;
            bukf bukf2 = this.f154211d;
            bukf.clear();
            if (bukf2 != null) {
                bukc a3 = bukf2.entrySet().iterator();
                while (a3.hasNext()) {
                    a3.mo72556f();
                    bukf.mo72762a(a3.mo72758h(), bulm.m119874c(((Integer) a3.f153152b.mo72479b()).intValue()), a3.f154066a.mo72761a(a3.mo72557g()), a3.f154066a.f154076b[a3.mo72557g()], a3.f154066a.f154077e[a3.mo72557g()], a3.f154066a.f154078f[a3.mo72557g()], a3.f154066a.f154079g[a3.mo72557g()]);
                }
            }
            bujy bujy = this.f154213f.f154224n;
            bujy bujy2 = this.f154212e;
            bujy.clear();
            if (bujy2 != null) {
                bujv a4 = bujy2.entrySet().iterator();
                while (a4.hasNext()) {
                    a4.mo72556f();
                    bujy.mo72750a(a4.mo72747h(), bulm.m119874c(((Integer) a4.f153152b.mo72479b()).intValue()), a4.f154050a.f154055a[a4.mo72557g()], a4.f154050a.f154056b[a4.mo72557g()]);
                }
            }
            buma buma2 = this.f154213f;
            bujm a5 = buma2.f154220d.entrySet().iterator();
            while (a5.hasNext()) {
                a5.mo72556f();
                if (!buma2.f154222f.mo72812a(a5.mo72730h())) {
                    a5.remove();
                }
            }
            bujr a6 = buma2.f154221e.iterator();
            while (a6.hasNext()) {
                a6.mo72576c();
                if (!buma2.f154222f.mo72812a(a6.mo72737f())) {
                    a6.remove();
                }
            }
            bukc a7 = buma2.f154223m.entrySet().iterator();
            while (a7.hasNext()) {
                a7.mo72556f();
                if (!buma2.f154222f.mo72812a(a7.mo72758h())) {
                    a7.remove();
                }
            }
            bujv a8 = buma2.f154224n.entrySet().iterator();
            while (a8.hasNext()) {
                a8.mo72556f();
                if (!buma2.f154222f.mo72812a(a8.mo72747h())) {
                    a8.remove();
                }
            }
        } catch (Exception e) {
            this.f154213f.mo61837c();
            throw e;
        }
    }
}
