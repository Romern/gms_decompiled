package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: acta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class acta {
    /* renamed from: a */
    public static caef m49828a(cixm cixm) {
        HashMap hashMap = new HashMap();
        bxwc bxwc = cixm.f191690c;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            cixk cixk = (cixk) bxwc.get(i);
            List list = (List) hashMap.get(cixk.f191684b);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(cixk.f191684b, list);
            }
            list.add(cixk);
        }
        caee caee = (caee) caef.f172809f.mo74144da();
        for (Map.Entry entry : hashMap.entrySet()) {
            List<cixk> list2 = (List) entry.getValue();
            caec caec = (caec) caed.f172799i.mo74144da();
            String str = (String) entry.getKey();
            if (caec.f164950c) {
                caec.mo74035c();
                caec.f164950c = false;
            }
            caed caed = (caed) caec.f164949b;
            str.getClass();
            caed.f172801a |= 1;
            caed.f172802b = str;
            cixn cixn = ((cixk) list2.get(0)).f191685c;
            if (cixn == null) {
                cixn = cixn.f191691g;
            }
            int i2 = cixn.f191693a;
            if ((i2 & 1) != 0) {
                for (cixk cixk2 : list2) {
                    cixn cixn2 = cixk2.f191685c;
                    if (cixn2 == null) {
                        cixn2 = cixn.f191691g;
                    }
                    boolean z = cixn2.f191694b;
                    if (caec.f164950c) {
                        caec.mo74035c();
                        caec.f164950c = false;
                    }
                    caed caed2 = (caed) caec.f164949b;
                    caed2.mo74627c();
                    caed2.f172803c.mo73729a(z);
                }
            } else if ((i2 & 2) != 0) {
                for (cixk cixk3 : list2) {
                    cixn cixn3 = cixk3.f191685c;
                    if (cixn3 == null) {
                        cixn3 = cixn.f191691g;
                    }
                    caec.mo74626a(cixn3.f191695c);
                }
            } else if ((i2 & 4) != 0) {
                for (cixk cixk4 : list2) {
                    cixn cixn4 = cixk4.f191685c;
                    if (cixn4 == null) {
                        cixn4 = cixn.f191691g;
                    }
                    caec.mo74624a(cixn4.f191696d);
                }
            } else if ((i2 & 8) != 0) {
                for (cixk cixk5 : list2) {
                    cixn cixn5 = cixk5.f191685c;
                    if (cixn5 == null) {
                        cixn5 = cixn.f191691g;
                    }
                    double d = cixn5.f191697e;
                    if (caec.f164950c) {
                        caec.mo74035c();
                        caec.f164950c = false;
                    }
                    caed caed3 = (caed) caec.f164949b;
                    caed3.mo74630g();
                    caed3.f172808h.mo73894a(d);
                }
            } else if ((i2 & 16) != 0) {
                for (cixk cixk6 : list2) {
                    cixn cixn6 = cixk6.f191685c;
                    if (cixn6 == null) {
                        cixn6 = cixn.f191691g;
                    }
                    cixm cixm2 = cixn6.f191698f;
                    if (cixm2 == null) {
                        cixm2 = cixm.f191686d;
                    }
                    caec.mo74625a(m49828a(cixm2));
                }
            }
            caee.mo74631a(caec);
        }
        return (caef) caee.mo74062i();
    }
}
