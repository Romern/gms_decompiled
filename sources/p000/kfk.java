package p000;

import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.autofill.data.Credential;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kfk {

    /* renamed from: a */
    private static final srn f23989a = srn.m36127a(sgj.AUTOFILL);

    /* renamed from: a */
    static bnic m17755a(kfj kfj, bmxv bmxv) {
        bnia j = bnic.m109500j();
        bnrd a = kfj.f23987a.iterator();
        while (a.hasNext()) {
            Pair pair = (Pair) a.next();
            j.mo67629b(kct.m17648a(pair.second, kfx.m17787a((qun) pair.first), bmxv));
        }
        j.mo67752b((Iterable) kfj.f23988b);
        return j.mo67751a();
    }

    /* renamed from: a */
    static bqgg m17756a(List list, kfe kfe, kfw kfw) {
        Bundle bundle = new Bundle();
        bundle.putString("where_string", kfw.mo14452a(list));
        return kfe.mo14442a(bundle);
    }

    /* renamed from: a */
    static bqgg m17757a(kfw kfw, kbj kbj) {
        ArrayList arrayList = new ArrayList();
        bnrd a = kfw.mo14450a().iterator();
        while (a.hasNext()) {
            arrayList.add(kbj.mo14347a((kcv) a.next()));
        }
        return bqga.m112774a((Iterable) arrayList);
    }

    /* renamed from: a */
    static kfj m17758a(bngx bngx, List list, kpk kpk, kfw kfw) {
        bnic a;
        bnia j = bnic.m109500j();
        bnia j2 = bnic.m109500j();
        HashMap hashMap = new HashMap();
        bnre i = bngx.listIterator();
        while (i.hasNext()) {
            qun qun = (qun) i.next();
            try {
                kcv a2 = kpk.mo14763a(qun.f42167b);
                if (qun.f42175j) {
                    j2.mo67629b(kct.m17647a(new kcp(a2), kfx.m17787a(qun)));
                }
                if ((!qun.f42170e.isEmpty() || !qun.f42172g.isEmpty()) && (a = kfw.mo14451a(list, a2)) != null) {
                    Pair create = Pair.create(a, qun.f42170e);
                    kfi kfi = (kfi) hashMap.get(create);
                    long j3 = qun.f42174i;
                    if (kfi == null || kfi.f23986c < j3) {
                        hashMap.put(create, new kfi(qun, a2, j3));
                    }
                }
            } catch (kpi e) {
                bnsl bnsl = (bnsl) f23989a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68448m();
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            kfi kfi2 = (kfi) entry.getValue();
            qun qun2 = kfi2.f23984a;
            j.mo67629b(Pair.create(qun2, new Credential(qun2.f42170e, new kdj(qun2.f42172g), kfi2.f23985b, (bnic) ((Pair) entry.getKey()).first)));
        }
        return new kfj(j.mo67751a(), j2.mo67751a());
    }
}
