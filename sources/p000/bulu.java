package p000;

/* renamed from: bulu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bulu implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bujk f154189a;

    /* renamed from: b */
    final /* synthetic */ bujt f154190b;

    /* renamed from: c */
    final /* synthetic */ bukx f154191c;

    /* renamed from: d */
    final /* synthetic */ bulw f154192d;

    public bulu(bulw bulw, bujk bujk, bujt bujt, bukx bukx) {
        this.f154192d = bulw;
        this.f154189a = bujk;
        this.f154190b = bujt;
        this.f154191c = bukx;
    }

    public final void run() {
        try {
            this.f154192d.f154203n.clear();
            this.f154192d.f154202m.clear();
            bujk bujk = this.f154192d.f154199d;
            bujk bujk2 = this.f154189a;
            bujk.clear();
            if (bujk2 != null) {
                bujh a = bujk2.entrySet().iterator();
                while (a.hasNext()) {
                    a.mo72556f();
                    bujk.mo72728a(((Long) a.f153152b.mo72479b()).longValue(), a.mo72724h(), a.f154020a.f154027a[a.mo72557g()], a.f154020a.f154028b[a.mo72557g()], a.f154020a.f154029e[a.mo72557g()], a.f154020a.f154030f[a.mo72557g()]);
                }
            }
            this.f154192d.f154200e.mo72739a(this.f154190b);
            bulw bulw = this.f154192d;
            bukx bukx = bulw.f154201f;
            bukx bukx2 = this.f154191c;
            short s = bulw.f154197b;
            bukx.clear();
            if (bukx2 != null) {
                buku a2 = bukx2.entrySet().iterator();
                while (a2.hasNext()) {
                    a2.mo72556f();
                    short h = a2.mo72797h();
                    bukx.mo72802a(h, a2.f154104a.f154112b[a2.mo72557g()], a2.mo72798i(), a2.f154104a.f154114f[a2.mo72557g()], a2.mo72799j());
                    s = h;
                }
            }
            bulw.f154197b = s;
            bulw bulw2 = this.f154192d;
            bujh a3 = bulw2.f154199d.entrySet().iterator();
            while (a3.hasNext()) {
                a3.mo72556f();
                if (!bulw2.f154201f.mo72803a(a3.mo72724h())) {
                    a3.remove();
                }
            }
            bujr a4 = bulw2.f154200e.iterator();
            while (a4.hasNext()) {
                a4.mo72576c();
                if (!bulw2.f154201f.mo72803a(a4.mo72737f())) {
                    a4.remove();
                }
            }
        } catch (Exception e) {
            this.f154192d.mo61837c();
            throw e;
        }
    }
}
