package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aopi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aopi {

    /* renamed from: a */
    public static aopi f78645a;

    /* renamed from: b */
    private final qws f78646b = new qws(rpr.m34216b(), "REACHABILITY_GCORE", null);

    public aopi() {
        aopg.m66269a("ReachabilityLogger");
    }

    /* renamed from: b */
    public static List m66271b(btbq[] btbqArr) {
        ArrayList arrayList = new ArrayList();
        for (btbq btbq : btbqArr) {
            arrayList.add(Integer.valueOf(btbq.f148202b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo43146a(bpch bpch) {
        if (cghu.f186966a.mo6606a().mo83814b()) {
            this.f78646b.mo24333a(bpch).mo24327b();
        }
    }

    /* renamed from: a */
    public final void mo43147a(btbq[] btbqArr) {
        bxvd da = bpch.f135725c.mo74144da();
        bpcf bpcf = (bpcf) bpcg.f135720d.mo74144da();
        if (bpcf.f164950c) {
            bpcf.mo74035c();
            bpcf.f164950c = false;
        }
        bpcg bpcg = (bpcg) bpcf.f164949b;
        bpcg.f135723b = 2;
        bpcg.f135722a |= 1;
        bpcf.mo68936a(m66271b(btbqArr));
        bpcg bpcg2 = (bpcg) bpcf.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpch bpch = (bpch) da.f164949b;
        bpcg2.getClass();
        bpch.f135728b = bpcg2;
        bpch.f135727a |= 1;
        mo43146a((bpch) da.mo74062i());
    }
}
