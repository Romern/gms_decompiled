package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwx {

    /* renamed from: a */
    private static final Map f74485a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(2, "blog");
        hashMap.put(6, "ftp");
        hashMap.put(4, "home");
        hashMap.put(1, "homePage");
        hashMap.put(7, "other");
        hashMap.put(3, "profile");
        hashMap.put(5, "work");
        hashMap.put(0, "custom");
        f74485a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62035a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62036b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74485a.containsKey(a)) {
            return (String) f74485a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Organization Type: %d", a);
        return null;
    }
}
