package p000;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* renamed from: kux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class kux {
    /* renamed from: a */
    public static String m18615a(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 3);
    }
}
