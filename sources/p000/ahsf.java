package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: ahsf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsf {
    /* renamed from: a */
    public static byzm m56458a(int i) {
        bxvd da = byzm.f169125d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        byzm byzm = (byzm) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            byzm.f169128b = i2;
            byzm.f169127a |= 1;
            return (byzm) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: a */
    public static List m56459a(List list, List list2) {
        Long l;
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aiab aiab = (aiab) it.next();
                byzm byzm = aiab.f68542b;
                if (byzm == null) {
                    byzm = byzm.f169125d;
                }
                if ((aiab.f68541a & 2) != 0) {
                    l = Long.valueOf(aiab.f68543c);
                } else {
                    l = null;
                }
                hashMap.put(byzm, l);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list2.size(); i++) {
            byzm byzm2 = (byzm) list2.get(i);
            bxvd da = aiab.f68539d.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            aiab aiab2 = (aiab) da.f164949b;
            byzm2.getClass();
            aiab2.f68542b = byzm2;
            aiab2.f68541a |= 1;
            arrayList.add((aiab) da.mo74062i());
            if (hashMap.get(byzm2) == null) {
                aiab aiab3 = (aiab) arrayList.get(i);
                bxvd bxvd = (bxvd) aiab3.mo74142c(5);
                bxvd.mo73625a((bxvk) aiab3);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                aiab aiab4 = (aiab) bxvd.f164949b;
                aiab4.f68541a &= -3;
                aiab4.f68543c = 0;
                arrayList.set(i, (aiab) bxvd.mo74062i());
            } else {
                aiab aiab5 = (aiab) arrayList.get(i);
                bxvd bxvd2 = (bxvd) aiab5.mo74142c(5);
                bxvd2.mo73625a((bxvk) aiab5);
                long longValue = ((Long) hashMap.get(byzm2)).longValue();
                if (bxvd2.f164950c) {
                    bxvd2.mo74035c();
                    bxvd2.f164950c = false;
                }
                aiab aiab6 = (aiab) bxvd2.f164949b;
                aiab6.f68541a |= 2;
                aiab6.f68543c = longValue;
                arrayList.set(i, (aiab) bxvd2.mo74062i());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m56460a(int... iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(m56458a(i));
        }
        return m56459a(null, arrayList);
    }
}
