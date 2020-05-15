package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bev {
    /* renamed from: a */
    public static bia m2853a(Map map, bhz bhz) {
        return (bia) map.get(bhz);
    }

    /* renamed from: b */
    public static bhz m2859b(String str) {
        bhz bhz = new bhz();
        bhz.f3265c = str;
        return bhz;
    }

    /* renamed from: c */
    public static String m2862c(String str) {
        if (m2856a().containsKey(m2859b(str))) {
            return ((bia) m2856a().get(m2859b(str))).f3270h;
        }
        return null;
    }

    /* renamed from: a */
    public static bia m2854a(Map map, String str, String str2, boolean z) {
        bhz bhz;
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        bhz bhz2 = new bhz();
        bhz2.f3263a = str;
        bhz2.f3264b = str2;
        arrayList2.add(bhz2);
        arrayList.retainAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        if (arrayList3.size() <= 0) {
            return null;
        }
        Collections.sort(arrayList3);
        if (z) {
            bhz = (bhz) arrayList3.get(0);
        } else {
            bhz = (bhz) arrayList3.get(arrayList3.size() - 1);
        }
        return (bia) map.get(bhz);
    }

    /* renamed from: b */
    public static bhz m2860b(Map map, String str, String str2) {
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        bhz bhz = new bhz();
        bhz.f3263a = str;
        bhz.f3264b = str2;
        arrayList2.add(bhz);
        arrayList.retainAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        if (arrayList3.size() <= 0) {
            return null;
        }
        Collections.sort(arrayList3);
        return (bhz) arrayList3.get(0);
    }

    /* renamed from: b */
    public static Map m2861b() {
        return bet.m2847a().f3119a;
    }

    /* renamed from: a */
    public static List m2855a(Map map, String str, String str2) {
        ArrayList arrayList = new ArrayList(map.keySet());
        ArrayList arrayList2 = new ArrayList();
        bhz bhz = new bhz();
        bhz.f3263a = str;
        bhz.f3264b = str2;
        arrayList2.add(bhz);
        arrayList.retainAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3);
        return arrayList3;
    }

    /* renamed from: a */
    public static Map m2856a() {
        return bet.m2847a().f3120b;
    }

    /* renamed from: a */
    public static Map m2857a(String str) {
        bhx bhx;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Map map = (Map) bhf.m3034a(str);
            ArrayList arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                bhy bhy = new bhy();
                bhz a = bhz.m3068a(str2);
                bhy.f3261a = a;
                bia bia = new bia();
                bht a2 = bhu.m3064a(a.f3263a, a.f3264b);
                if (a2 == null) {
                    bia.f3270h = (String) map.get(str2);
                    bhy.f3262b = bia;
                } else if (a2 instanceof bhr) {
                    bhy.f3262b = new bhw((String) map.get(str2));
                } else if (a2 instanceof bhq) {
                    bhy.f3262b = new bhv((String) map.get(str2));
                } else if (a2 instanceof bhs) {
                    String[] split = ((String) map.get(str2)).split("-");
                    if (split.length == 2) {
                        bhx = new bhx();
                        bhx.f3260b = split[0];
                        bhx.f3259a = split[1];
                    } else {
                        bhx = null;
                    }
                    bhy.f3262b = bhx;
                }
                arrayList.add(bhy);
            }
            linkedHashMap.putAll(bhn.m3052a(arrayList));
            return linkedHashMap;
        } catch (Exception e) {
            throw new bfq(e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static void m2858a(String str, bia bia) {
        m2856a().put(m2859b(str), bia);
    }
}
