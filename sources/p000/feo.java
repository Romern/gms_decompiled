package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: feo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class feo {

    /* renamed from: a */
    public final fcg f16401a;

    /* renamed from: b */
    public final fdp f16402b;

    /* renamed from: c */
    public final ArrayList f16403c;

    /* renamed from: d */
    public final C0034at f16404d;

    public feo(fcg fcg, fdp fdp, bsxn bsxn, List list) {
        C0034at atVar = new C0034at();
        this.f16404d = atVar;
        this.f16401a = fcg;
        this.f16402b = fdp;
        atVar.mo2450b(new fel(bsxn, null, false, false));
        this.f16403c = new ArrayList(list);
    }

    /* renamed from: a */
    public final int mo10753a() {
        return this.f16403c.size() - 1;
    }

    /* renamed from: b */
    public final bsxn mo10756b() {
        return ((fel) this.f16404d.mo2448b()).f16388a;
    }

    /* renamed from: c */
    public final void mo10757c() {
        fdp fdp = this.f16402b;
        int i = ((fel) this.f16404d.mo2448b()).f16388a.f147589b;
        ffv a = fdp.mo10739a();
        a.mo10789b();
        a.f16480c.add(new fft(a, i));
        a.f16480c.add(new ffu(a, i));
        for (int i2 = 0; i2 < a.f16480c.size(); i2++) {
            a.f16479b.postDelayed((Runnable) a.f16480c.get(i2), (long) (((Integer) ffv.f16478a.get(i2)).intValue() * 1000));
        }
    }

    /* renamed from: a */
    public final fen mo10754a(bsxn bsxn, fek fek) {
        bsxn bsxn2;
        bsul b = this.f16401a.mo10686d(bsxn).mo10395b();
        bsxn g = epr.m10935g(b);
        bsxn h = epr.m10936h(b);
        bsxn i = epr.m10937i(b);
        if (h != null && i == null) {
            bsxk bsxk = this.f16401a.mo10686d(h).f15491a;
            if (bsxk.f147581b == 7) {
                bxwc bxwc = ((bsva) bsxk.f147582c).f147221a;
                int size = bxwc.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    bsuv bsuv = (bsuv) bxwc.get(i2);
                    i2++;
                    if (bsuv.f147199b == 2) {
                        bsxn2 = (bsxn) bsuv.f147200c;
                        break;
                    }
                }
            }
            bsxn2 = null;
        } else {
            bsxn2 = i;
        }
        return new fen(bsxn, g, h, bsxn2, fek);
    }

    /* renamed from: a */
    public final boolean mo10755a(fen fen, bsxn bsxn) {
        bsxn h = epr.m10936h(this.f16401a.mo10686d(bsxn).mo10395b());
        return h != null && !h.equals(fen.f16398c);
    }
}
