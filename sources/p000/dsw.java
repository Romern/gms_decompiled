package p000;

import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dsw extends dwm implements eei, dvw {

    /* renamed from: a */
    public final HashMap f13968a = new HashMap();

    /* renamed from: a */
    public static long m9261a(bxco bxco) {
        if (doi.m8940d(bxco.f162973bD)) {
            return cdgp.f180782a.mo6606a().mo77546aK();
        }
        if (bxco == bxco.DAY_ATTRIBUTES || bxco == bxco.SUN_STATE) {
            return cdgp.f180782a.mo6606a().mo77543aH();
        }
        if (bxco == bxco.DND_MODE) {
            return cdgp.f180782a.mo6606a().mo77606z();
        }
        if (doi.m8936a(bxco.f162973bD)) {
            return cdgp.m133212u();
        }
        if (doi.m8938b(bxco.f162973bD)) {
            return cdgp.m133193b();
        }
        if (doi.m8941e(bxco.f162973bD)) {
            return cdgp.f180782a.mo6606a().mo77590j();
        }
        if (doi.m8939c(bxco.f162973bD)) {
            return cdgp.f180782a.mo6606a().mo77603w();
        }
        if (sqc.m35957a(doi.f13695e, bxco.f162973bD)) {
            return cdgp.f180782a.mo6606a().mo77548aM();
        }
        return cdgp.f180782a.mo6606a().mo77599s();
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
    }

    /* renamed from: a */
    public final void mo9388a(ContextData contextData, ContextManagerClientInfo contextManagerClientInfo) {
        Object[] objArr = {contextData, contextManagerClientInfo};
        dsu dsu = (dsu) this.f13968a.get(contextManagerClientInfo.mo18066a());
        if (dsu != null) {
            bnot bnot = (bnot) dsu.f13964b.get(contextData.mo18018g());
            if (bnot != null) {
                doh a = contextManagerClientInfo.mo18066a();
                bndz.m109113a(8, "expectedKeys");
                bnmv bnmv = new bnmv();
                bndz.m109113a(2, "expectedValuesPerKey");
                bnnh bnnh = new bnnh(new bnna(bnmv).f131856a.mo68100a(), new bnmy());
                for (Map.Entry entry : bnot.mo67315n()) {
                    bnnh.mo67268a(entry.getKey(), entry.getValue());
                }
                new dsv(contextData, a, bnnh).mo9516a(dqy.m9123a("DispatcherDeliver"));
            }
        }
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
        new Object[1][0] = dwa;
        dsu dsu = (dsu) this.f13968a.get(doh);
        if (dsu != null) {
            dsu.mo9534b(dwa);
            if (dsu.f13963a.mo10099a()) {
                this.f13968a.remove(doh);
            }
        }
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
        int i;
        ArrayList arrayList;
        Object[] objArr = {dwa, dwa2, doh};
        dsu dsu = (dsu) this.f13968a.get(doh);
        if (dsu == null) {
            dsu = new dsu();
            this.f13968a.put(doh, dsu);
        }
        if (dwa2 != null) {
            dsu.mo9534b(dwa2);
        }
        if (dsu.mo9533a(dwa)) {
            new Object[1][0] = Integer.valueOf(dwa.mo9747b().f162973bD);
            eel p = dwq.m9672p();
            tit tit = new tit();
            tit.mo26579a(dwa.mo9747b().f162973bD);
            eej a = p.mo10038a((ContextDataFilterImpl) tit.mo26578a(), dwq.m9652a(doh, dwa.mo9758k()), m9261a(dwa.mo9747b()));
            new Object[1][0] = Integer.valueOf(a.f14775a);
            Object[] objArr2 = new Object[1];
            ArrayList arrayList2 = a.f14776b;
            if (arrayList2 != null) {
                i = arrayList2.size();
            } else {
                i = 0;
            }
            objArr2[0] = Integer.valueOf(i);
            if (rjs.m33679e(a.f14775a) && (arrayList = a.f14776b) != null && !arrayList.isEmpty()) {
                new Object[1][0] = dwa.f14243c;
                ArrayList arrayList3 = a.f14776b;
                int size = arrayList3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bnge s = bnge.m109299s();
                    s.mo67268a(dwa.f14243c, dwa);
                    new dsv((ContextData) arrayList3.get(i2), doh, s).mo9516a(dqy.m9123a("DispatcherDeliver"));
                }
            }
        }
    }
}
