package p000;

import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;

/* renamed from: efv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class efv implements dqm {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dwt.a(doh, java.util.Set, dwu, dqb, dqx):void
     arg types: [doh, java.util.HashSet, efu, drv, dqx]
     candidates:
      dwt.a(doh, bxqt, dwu, dqb, dqx):void
      dwt.a(doh, java.util.Collection, dwu, dqb, dqx):void
      dwt.a(doh, tnj, dwu, dqb, dqx):void
      dwt.a(doh, java.util.Set, dwu, dqb, dqx):void */
    /* renamed from: a */
    public final Future mo9446a() {
        dwi s = dwq.m9675s();
        if (s.f14272a.mo9774a(0)) {
            String a = dwq.m9678v().mo9975a();
            if (!TextUtils.isEmpty(a)) {
                HashMap hashMap = null;
                for (SparseArray sparseArray : s.f14272a.f14271c.values()) {
                    for (int i = 0; i < sparseArray.size(); i++) {
                        dwg dwg = (dwg) sparseArray.valueAt(i);
                        if (dwg.mo9770a(1) || dwg.mo9770a(0)) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            SparseArray sparseArray2 = (SparseArray) hashMap.get(dwg.f14262a);
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                hashMap.put(dwg.f14262a, sparseArray2);
                            }
                            sparseArray2.put(dwg.f14263b, dwg);
                        }
                    }
                }
                if (hashMap == null || hashMap.isEmpty()) {
                    return dps.f13792a;
                }
                dpt dpt = new dpt();
                for (Map.Entry entry : hashMap.entrySet()) {
                    doh doh = (doh) entry.getKey();
                    SparseArray sparseArray3 = (SparseArray) entry.getValue();
                    for (int i2 = 0; i2 < sparseArray3.size(); i2++) {
                        ((dwg) sparseArray3.valueAt(i2)).f14266e = ((dwg) sparseArray3.valueAt(i2)).f14265d;
                    }
                    dwt w = dwq.m9679w();
                    HashSet hashSet = new HashSet();
                    int i3 = 0;
                    while (i3 < sparseArray3.size()) {
                        dwg dwg2 = (dwg) sparseArray3.valueAt(i3);
                        bxvd da = bxjk.f163646e.mo74144da();
                        bxco b = tiq.m37051b(dwg2.f14263b);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxjk bxjk = (bxjk) da.f164949b;
                        bxjk.f163651d = b.f162973bD;
                        int i4 = bxjk.f163648a | 4;
                        bxjk.f163648a = i4;
                        a.getClass();
                        int i5 = i4 | 1;
                        bxjk.f163648a = i5;
                        bxjk.f163649b = a;
                        int i6 = dwg2.f14265d;
                        int i7 = i6 - 1;
                        if (i6 != 0) {
                            bxjk.f163650c = i7;
                            bxjk.f163648a = i5 | 2;
                            hashSet.add((bxjk) da.mo74062i());
                            i3++;
                        } else {
                            throw null;
                        }
                    }
                    efu efu = new efu(doh, sparseArray3);
                    dpt.mo9413a(efu);
                    w.mo9816a(doh, (Set) hashSet, (dwu) efu, (dqb) dwq.m9667k(), dqy.m9123a("SyncServerInterestRecordsOperation#writeInterestRecords"));
                }
                return dpt;
            }
            bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
            bnsl.mo68432a("efv", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[SyncServerInterestRecordsOperation] No available gcm id.  Cannot proceed server interest records sync.");
            dwq.m9682z().mo10071b(cdgp.m133196e());
            return dps.f13792a;
        }
        if (s.f14272a.mo9774a(1)) {
            dwq.m9682z().mo10071b(cdgp.m133211t());
        }
        return dps.f13792a;
    }
}
