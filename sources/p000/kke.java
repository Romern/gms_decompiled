package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class kke implements kkc {

    /* renamed from: a */
    private final kkg f24300a;

    public kke(kkg kkg) {
        this.f24300a = kkg;
    }

    /* renamed from: a */
    private final Map m17974a(List list, int i) {
        int i2;
        int i3;
        bnzb bnzb;
        bnkd a = bnnc.m109833b().mo68102b().mo68101a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kom kom = (kom) it.next();
            kkg kkg = this.f24300a;
            kkd kkd = new kkd(kom, i);
            bnzd a2 = kkg.f24301a.mo68732a();
            if (!kkd.hasNext()) {
                bnzb = a2.mo68729a();
            } else {
                kom a3 = kkd.next();
                kkg.m17979a(a2, koo.m18260a(a3));
                kkg.mo14572a(a2, a3);
                while (kkd.hasNext()) {
                    kkg.mo14572a(a2, kkd.next());
                }
                bnzb = a2.mo68729a();
            }
            a.mo67268a(bnzb, kom);
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = a.mo67316o().iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            bnzb bnzb2 = (bnzb) it2.next();
            List<kom> a4 = a.mo67124a(bnzb2);
            if (a4.size() == 1) {
                m17975a(bnzb2, (kom) a4.get(0), linkedHashMap);
            } else {
                ArrayList arrayList2 = new ArrayList(a4.size());
                for (kom kom2 : a4) {
                    int i4 = i + 1;
                    bmxv bmxv = kom2.f24625x;
                    int i5 = 1;
                    while (true) {
                        if (i5 > i4) {
                            arrayList2.add(kom2);
                            break;
                        } else if (!bmxv.mo66813a() || ((kom) bmxv.mo66814b()).mo14754a() != 1) {
                            m17975a(bnzb2, kom2, linkedHashMap);
                        } else {
                            bmxv = ((kom) bmxv.mo66814b()).f24625x;
                            i5++;
                        }
                    }
                }
                arrayList.add(m17974a(arrayList2, i + 1));
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Iterator it3 = ((Map) arrayList.get(i2)).entrySet().iterator();
            while (true) {
                i3 = i2 + 1;
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it3.next();
                m17975a((bnzb) entry.getKey(), (kom) entry.getValue(), linkedHashMap);
            }
            i2 = i3;
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public int mo14567a() {
        return 2;
    }

    /* renamed from: a */
    private static void m17975a(bnzb bnzb, kom kom, Map map) {
        int i = 0;
        bnzb bnzb2 = bnzb;
        while (map.containsKey(bnzb2)) {
            bnzb2 = bnzb.m110869a(bnzb.mo68742d() + ((long) i));
            i++;
        }
        map.put(bnzb2, kom);
    }

    /* renamed from: a */
    public final kkb mo14568a(bnic bnic, bnic bnic2) {
        if (bnic.isEmpty()) {
            return new kkb(bnzb.m110869a(0L), bnoj.f131912b);
        }
        bnha a = bnhe.m109406a(bnic.size());
        Map a2 = m17974a(bnic.mo67639g(), 0);
        for (bnzb bnzb : a2.keySet()) {
            a.mo67695b((kom) a2.get(bnzb), bnzb);
        }
        bnhe b = a.mo67618b();
        bnha a3 = bnhe.m109406a(bnic2.size());
        Map a4 = m17974a(bnic2.mo67639g(), 0);
        for (bnzb bnzb2 : a4.keySet()) {
            a3.mo67695b((kom) a4.get(bnzb2), bnzb2);
        }
        bnhe b2 = a3.mo67618b();
        bnzb a5 = bnzi.m110895a(b.values());
        bnha h = bnhe.m109414h();
        h.mo67694a(b);
        h.mo67694a(b2);
        return new kkb(a5, h.mo67618b());
    }
}
