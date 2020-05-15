package p000;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: efq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efq implements dqm {
    /* renamed from: a */
    private static final void m10328a(Set set, Set set2, String str, int i) {
        if (set2 != null && !set2.isEmpty()) {
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                bxvd da = bxjk.f163646e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxjk bxjk = (bxjk) da.f164949b;
                str.getClass();
                int i2 = bxjk.f163648a | 1;
                bxjk.f163648a = i2;
                bxjk.f163649b = str;
                bxjk.f163650c = i - 1;
                bxjk.f163648a = i2 | 2;
                bxco b = tiq.m37051b(num.intValue());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxjk bxjk2 = (bxjk) da.f164949b;
                bxjk2.f163651d = b.f162973bD;
                bxjk2.f163648a |= 4;
                set.add((bxjk) da.mo74062i());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dwt.a(doh, java.util.Set, dwu, dqb, dqx):void
     arg types: [doh, java.util.HashSet, efp, drv, dqx]
     candidates:
      dwt.a(doh, bxqt, dwu, dqb, dqx):void
      dwt.a(doh, java.util.Collection, dwu, dqb, dqx):void
      dwt.a(doh, tnj, dwu, dqb, dqx):void
      dwt.a(doh, java.util.Set, dwu, dqb, dqx):void */
    /* renamed from: a */
    public final Future mo9446a() {
        String a = dwq.m9678v().mo9975a();
        if (TextUtils.isEmpty(a)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("efq", "a", 40, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[RefreshStateOperation] No available gcm id. Cannot proceed server interest records sync.");
            dwq.m9682z().mo10071b(cdgp.m133196e());
            return dps.f13792a;
        }
        Set<doh> a2 = dwq.m9681y().mo9331a();
        dpt dpt = new dpt();
        for (doh doh : a2) {
            dwi s = dwq.m9675s();
            HashSet hashSet = new HashSet();
            m10328a(hashSet, s.mo9776a(doh, 2), a, 2);
            m10328a(hashSet, s.mo9776a(doh, 3), a, 3);
            Object[] objArr = {doh, hashSet};
            if (hashSet.size() > 0) {
                dwt w = dwq.m9679w();
                efp efp = new efp(doh);
                dpt.mo9413a(efp);
                w.mo9816a(doh, (Set) hashSet, (dwu) efp, (dqb) dwq.m9667k(), dqy.m9123a("RefreshStateOperation#writeInterestRecords"));
            }
        }
        dwq.m9682z().mo10072c(cdgp.m133210s());
        return dpt;
    }
}
