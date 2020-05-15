package p000;

import android.text.TextUtils;

/* renamed from: abfc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abfc {
    /* renamed from: a */
    public static String m47607a(String str, String str2) {
        StringBuilder sb = new StringBuilder("context:");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            sb.append(":query:");
            sb.append(str2);
        }
        return sb.toString();
    }
}
