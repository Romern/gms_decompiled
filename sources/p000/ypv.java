package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: ypv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ypv {

    /* renamed from: a */
    public static final bnhe f54354a = bnhe.m109409a("walking", "60,160", "running", "140,360");

    /* renamed from: c */
    private static final bnhe f54355c;

    /* renamed from: d */
    private static final bnhe f54356d = bnhe.m109409a("walking", "30,240", "running", "80,360");

    /* renamed from: b */
    public final bnhe f54357b;

    /* renamed from: e */
    private final bnic f54358e;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(25, 130);
        h.mo67695b(35, 100);
        h.mo67695b(8, 170);
        h.mo67695b(56, 170);
        h.mo67695b(57, 160);
        h.mo67695b(58, 170);
        h.mo67695b(77, 50);
        h.mo67695b(7, 100);
        h.mo67695b(93, 100);
        h.mo67695b(94, 100);
        h.mo67695b(116, 100);
        h.mo67695b(95, 100);
        f54355c = h.mo67618b();
    }

    public ypv(Map map, Set set, Map map2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        HashMap hashMap = new HashMap(f54355c);
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(Integer.valueOf(bzzh.m126347a((String) entry.getKey())), Integer.valueOf(((Integer) entry.getValue()).intValue()));
        }
        bnha h = bnhe.m109414h();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            int intValue = ((Integer) entry2.getKey()).intValue();
            int intValue2 = ((Integer) entry2.getValue()).intValue();
            if (intValue != 4) {
                String str = (String) map2.get(bzzh.m126348a(intValue));
                if (str != null) {
                    int indexOf = str.indexOf(44);
                    i5 = Integer.parseInt(str.substring(0, indexOf));
                    i4 = Integer.parseInt(str.substring(indexOf + 1));
                } else {
                    i5 = i;
                    i4 = i2;
                }
                h.mo67695b(Integer.valueOf(intValue), new ypu(i5, i4, intValue2));
            }
        }
        this.f54357b = h.mo67618b();
        HashSet hashSet = new HashSet();
        bnia j = bnic.m109500j();
        for (i3 = 0; i3 <= 122; i3++) {
            String a = bzzh.m126348a(i3);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (a.startsWith(str2)) {
                    j.mo67629b(Integer.valueOf(i3));
                    hashSet.add(str2);
                }
            }
        }
        this.f54358e = j.mo67751a();
    }

    /* renamed from: a */
    public static float m44548a(float f, TimeUnit timeUnit) {
        return f / ((float) timeUnit.convert(1, TimeUnit.MINUTES));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo30655b(int i) {
        return this.f54358e.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static Map m44549a(String str) {
        try {
            return zvr.m46578b(str);
        } catch (IllegalArgumentException e) {
            return bnoj.f131912b;
        }
    }

    /* renamed from: a */
    public static Map m44550a(String str, Map map) {
        try {
            return !str.isEmpty() ? zvr.m46577a(str) : map;
        } catch (IllegalArgumentException e) {
            return map;
        }
    }

    /* renamed from: a */
    public static ypv m44551a(ceae ceae) {
        return new ypv(m44549a(ceae.mo30619f()), zvr.m46579c(ceae.mo30627n()), m44550a((String) yno.f54212y.mo58455c(), f54356d), (int) ceae.mo30626m(), (int) ceae.mo30625l());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo30653a(int i) {
        return i >= 0 && i < 122 && this.f54357b.containsKey(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final boolean mo30654a(int i, float f, long j, TimeUnit timeUnit) {
        ypu ypu = (ypu) this.f54357b.get(Integer.valueOf(i));
        if (ypu != null) {
            float a = f / m44548a((float) j, timeUnit);
            if (a < ((float) ypu.f54351a) || a > ((float) ypu.f54352b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
