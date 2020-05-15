package p000;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: anxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxk {

    /* renamed from: a */
    private static anxk f77842a;

    private anxk() {
    }

    /* renamed from: a */
    public static void m65496a() {
        synchronized (anxk.class) {
            if (f77842a == null) {
                f77842a = new anxk();
            }
        }
    }

    /* renamed from: a */
    public static final void m65497a(HashMap hashMap, String str, boolean z, boolean z2) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = "0";
        }
        if (z) {
            str2 = "9";
        } else {
            str2 = !z2 ? "2" : "3";
        }
        StringBuilder sb = new StringBuilder();
        String str3 = (String) hashMap.get("X-Api-Client");
        if (str3 != null && str3.length() > 0) {
            sb.append(str3);
            sb.append(';');
        }
        sb.append("device=");
        sb.append(str2);
        sb.append(";platform=2;application=");
        sb.append(str);
        hashMap.put("X-Api-Client", sb.toString());
    }
}
