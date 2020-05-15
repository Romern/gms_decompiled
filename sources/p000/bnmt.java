package p000;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnmt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnmt {
    /* renamed from: a */
    static bmxj m109788a(bnmk bnmk) {
        bmxy.m108581a(bnmk);
        return new bnma(bnmk);
    }

    /* renamed from: b */
    static int m109801b(int i) {
        if (i < 3) {
            bndz.m109113a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: c */
    static Object m109806c(Map map, Object obj) {
        bmxy.m108581a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* renamed from: d */
    public static TreeMap m109810d() {
        return new TreeMap();
    }

    /* renamed from: e */
    public static IdentityHashMap m109812e() {
        return new IdentityHashMap();
    }

    /* renamed from: a */
    static bmxj m109789a(bnmk bnmk, Object obj) {
        bmxy.m108581a(bnmk);
        return new bnlx(bnmk, obj);
    }

    /* renamed from: b */
    static Object m109802b(Map.Entry entry) {
        if (entry != null) {
            return entry.getKey();
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m109811d(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: a */
    public static bnhe m109790a(Iterable iterable, bmxj bmxj) {
        bmxy.m108581a(bmxj);
        bnha h = bnhe.m109414h();
        for (Object obj : iterable) {
            h.mo67695b(bmxj.apply(obj), obj);
        }
        try {
            return h.mo67618b();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(String.valueOf(e.getMessage()).concat(". To index multiple values under a key, use Multimaps.index."));
        }
    }

    /* renamed from: b */
    public static HashMap m109803b(Map map) {
        return new HashMap(map);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* renamed from: c */
    public static String m109807c(Map map) {
        int size = map.size();
        bndz.m109113a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: b */
    public static LinkedHashMap m109804b() {
        return new LinkedHashMap();
    }

    /* renamed from: b */
    static boolean m109805b(Map map, Object obj) {
        bmxy.m108581a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* renamed from: a */
    public static bnhe m109791a(Map map) {
        if (map instanceof bngp) {
            return (bngp) map;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return bnoj.f131912b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum enumR = (Enum) entry.getKey();
        Object value = entry.getValue();
        bndz.m109114a(enumR, value);
        EnumMap enumMap = new EnumMap(enumR.getDeclaringClass());
        enumMap.put(enumR, value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum enumR2 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            bndz.m109114a(enumR2, value2);
            enumMap.put(enumR2, value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return bnoj.f131912b;
        }
        if (size != 1) {
            return new bngp(enumMap);
        }
        Map.Entry entry3 = (Map.Entry) bnjd.m109587b(enumMap.entrySet());
        return bnhe.m109408a((Enum) entry3.getKey(), entry3.getValue());
    }

    /* renamed from: c */
    public static LinkedHashMap m109808c(int i) {
        return new LinkedHashMap(m109801b(i));
    }

    /* renamed from: c */
    public static ConcurrentMap m109809c() {
        return new ConcurrentHashMap();
    }

    /* renamed from: a */
    public static bnmk m109792a(bmxj bmxj) {
        bmxy.m108581a(bmxj);
        return new bnmg(bmxj);
    }

    /* renamed from: a */
    public static Object m109793a(Map map, Object obj) {
        bmxy.m108581a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static HashMap getNewHashMap() {
        return new HashMap();
    }

    /* renamed from: a */
    public static HashMap m109795a(int i) {
        return new HashMap(m109801b(i));
    }

    /* renamed from: a */
    static Iterator m109796a(Set set, bmxj bmxj) {
        return new bnmd(set.iterator(), bmxj);
    }

    /* renamed from: a */
    public static Map.Entry m109797a(Object obj, Object obj2) {
        return new bngn(obj, obj2);
    }

    /* renamed from: a */
    static Map.Entry m109798a(Map.Entry entry) {
        bmxy.m108581a(entry);
        return new bnme(entry);
    }

    /* renamed from: a */
    public static Map m109799a(Map map, bmxj bmxj) {
        return m109800a(map, m109792a(bmxj));
    }

    /* renamed from: a */
    public static Map m109800a(Map map, bnmk bnmk) {
        return new bnmq(map, bnmk);
    }
}
