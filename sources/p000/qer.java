package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: qer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qer {
    /* renamed from: a */
    public static Map m32027a(Map map, String str, boolean z, String str2) {
        if (z || str2 == null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        for (String str3 : bmyx.m108640a(',').mo66918a((CharSequence) str2)) {
            String valueOf = String.valueOf(str3);
            String str4 = valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
            if (map.containsKey(str4)) {
                hashMap.put(str4, (String) map.get(str4));
            }
        }
        return hashMap;
    }
}
