package p000;

import com.google.android.gms.car.CarFacet;

/* renamed from: noa */
final /* synthetic */ class noa implements Runnable {

    /* renamed from: a */
    private final noe f36129a;

    /* renamed from: b */
    private final oeq f36130b;

    public noa(noe noe, oeq oeq) {
        this.f36129a = noe;
        this.f36130b = oeq;
    }

    public final void run() {
        int i;
        noe noe = this.f36129a;
        oeq oeq = this.f36130b;
        noj noj = noe.f36144e;
        bnsn bnsn = noj.f36155b;
        noj.f36159D.mo22053c();
        nip g = noe.f36144e.mo21194g();
        if (g != null) {
            if (oeq.f37404e == 0) {
                niw niw = noe.f36144e.f36168M;
                oep[] oepArr = oeq.f37406g;
                if (!(oepArr == null || oepArr.length == 0)) {
                    nja nja = (nja) niw;
                    CarFacet carFacet = nja.f35787e;
                    if (carFacet != null) {
                        i = bpdb.m111794a(carFacet.f29318a);
                    } else {
                        i = 1;
                    }
                    bxvd da = bpdz.f136458e.mo74144da();
                    int i2 = oeq.f37406g[0].f37394e;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpdz bpdz = (bpdz) da.f164949b;
                    int i3 = 1 | bpdz.f136460a;
                    bpdz.f136460a = i3;
                    bpdz.f136461b = i2;
                    int i4 = oeq.f37406g[0].f37395f;
                    int i5 = i3 | 2;
                    bpdz.f136460a = i5;
                    bpdz.f136462c = i4;
                    int i6 = i - 1;
                    if (i != 0) {
                        bpdz.f136460a = i5 | 4;
                        bpdz.f136463d = i6;
                        bpdz bpdz2 = (bpdz) da.mo74062i();
                        bxvd c = nja.mo20870c();
                        if (c.f164950c) {
                            c.mo74035c();
                            c.f164950c = false;
                        }
                        bpcl bpcl = (bpcl) c.f164949b;
                        bpcl bpcl2 = bpcl.f135759L;
                        bpdz2.getClass();
                        bpcl.f135781i = bpdz2;
                        bpcl.f135773a |= 64;
                        nja.mo20868a(c, 22);
                    } else {
                        throw null;
                    }
                }
            }
            g.mo20805a(noe.f36140a, oeq);
        }
    }
}
