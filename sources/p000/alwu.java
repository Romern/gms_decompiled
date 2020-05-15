package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwu {

    /* renamed from: a */
    private static final Map f74482a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(2, "other");
        hashMap.put(1, "work");
        hashMap.put(0, "custom");
        f74482a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62021a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: c */
    public static final String m62023c(alwa alwa) {
        return alwa.mo40830a(3);
    }

    /* renamed from: d */
    public static final String m62024d(alwa alwa) {
        return alwa.mo40830a(4);
    }

    /* renamed from: e */
    public static final String m62025e(alwa alwa) {
        return alwa.mo40830a(5);
    }

    /* renamed from: f */
    public static final String m62026f(alwa alwa) {
        return alwa.mo40830a(6);
    }

    /* renamed from: g */
    public static final String m62027g(alwa alwa) {
        return alwa.mo40830a(7);
    }

    /* renamed from: h */
    public static final String m62028h(alwa alwa) {
        return alwa.mo40830a(8);
    }

    /* renamed from: b */
    public static String m62022b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74482a.containsKey(a)) {
            return (String) f74482a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Organization Type: %d", a);
        return null;
    }
}
