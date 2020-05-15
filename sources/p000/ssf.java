package p000;

import java.util.HashMap;

/* renamed from: ssf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ssf {
    /* renamed from: a */
    public static void m36208a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
                z = false;
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
                z = false;
            }
        }
        sb.append("}");
    }
}
