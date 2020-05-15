package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: alwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwt {

    /* renamed from: a */
    private static final Map f74481a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(1, "default");
        hashMap.put(5, "initials");
        hashMap.put(3, "maidenName");
        hashMap.put(2, "otherName");
        hashMap.put(4, "shortName");
        hashMap.put(0, "custom");
        f74481a = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static final String m62019a(alwa alwa) {
        return alwa.mo40830a(0);
    }

    /* renamed from: b */
    public static String m62020b(alwa alwa) {
        Integer a = alwy.m62037a(alwa, 1);
        if (a != null && f74481a.containsKey(a)) {
            return (String) f74481a.get(a);
        }
        amdk.m62658a("ContactData", "Invalid Nickname Type: %d", a);
        return null;
    }
}
