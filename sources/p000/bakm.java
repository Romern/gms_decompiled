package p000;

import android.accounts.Account;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: bakm */
final /* synthetic */ class bakm implements Callable {

    /* renamed from: a */
    private final bakn f101132a;

    /* renamed from: b */
    private final bngx f101133b;

    /* renamed from: c */
    private final Set f101134c;

    public bakm(bakn bakn, bngx bngx, Set set) {
        this.f101132a = bakn;
        this.f101133b = bngx;
        this.f101134c = set;
    }

    public final Object call() {
        boolean z;
        bakn bakn = this.f101132a;
        bngx bngx = this.f101133b;
        Set set = this.f101134c;
        bndu r = bndu.m109109r();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            bakg bakg = (bakg) ((bqgg) i.next()).get();
            Account c = bakg.mo55720c();
            bygz b = bakg.mo55719b();
            if (c == null) {
                achw achw = (achw) bakn.f101135a.mo16713a();
                new Object[1][0] = b;
                z = false;
            } else if (set.contains(babm.m86492a(c, b))) {
                achw achw2 = (achw) bakn.f101135a.mo16713a();
                Object[] objArr = {c, b};
                bakn.f101137c.mo55873a(b, c, bakg.mo55721d(), bakg.mo55722e());
                z = true;
            } else {
                achw achw3 = (achw) bakn.f101135a.mo16713a();
                Object[] objArr2 = {c, b};
                bakn.f101138d.mo55730b(c);
                z = false;
            }
            byie a = bakg.mo55718a();
            bxvd da = bpyc.f139824d.mo74144da();
            bpxz a2 = baqz.m87422a(b);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bpyc bpyc = (bpyc) da.f164949b;
            a2.getClass();
            bpyc.f139827b = a2;
            int i2 = bpyc.f139826a | 1;
            bpyc.f139826a = i2;
            bpyc.f139826a = i2 | 2;
            bpyc.f139828c = !z;
            r.mo67268a(a, (bpyc) da.mo74062i());
        }
        bxvd da2 = bpye.f139832b.mo74144da();
        for (Collection collection : r.mo67318q().values()) {
            bxvd da3 = bpyd.f139829b.mo74144da();
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpyd bpyd = (bpyd) da3.f164949b;
            if (!bpyd.f139831a.mo73666a()) {
                bpyd.f139831a = bxvk.m124021a(bpyd.f139831a);
            }
            bxsy.m123078a(collection, bpyd.f139831a);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bpye bpye = (bpye) da2.f164949b;
            bpyd bpyd2 = (bpyd) da3.mo74062i();
            bpyd2.getClass();
            if (!bpye.f139834a.mo73666a()) {
                bpye.f139834a = bxvk.m124021a(bpye.f139834a);
            }
            bpye.f139834a.add(bpyd2);
        }
        ((bads) bakn.f101136b.mo16713a()).mo32748a((bpye) da2.mo74062i());
        return null;
    }
}
