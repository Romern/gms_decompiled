package p000;

import java.util.Map;

/* renamed from: shb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class shb {
    /* renamed from: a */
    public static void m35264a(Map map, String str, String str2) {
        if (str != null) {
            map.put("Authorization", str.length() == 0 ? new String("OAuth ") : "OAuth ".concat(str));
        }
        if (str2 != null) {
            map.put("X-Goog-Spatula", str2);
        }
    }
}
