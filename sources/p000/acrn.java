package p000;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: acrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrn {
    /* renamed from: a */
    static void m49772a(SharedPreferences sharedPreferences, Map map) {
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("pkg-info-")) {
                map.put(key.substring(9), (abul) acky.m49358a((String) entry.getValue(), (bxxk) abul.f58412n.mo74142c(7)));
            }
        }
    }

    /* renamed from: a */
    public static boolean m49773a(SharedPreferences.Editor editor, String str, abul abul) {
        String valueOf = String.valueOf(str);
        String str2 = valueOf.length() == 0 ? new String("pkg-info-") : "pkg-info-".concat(valueOf);
        String a = acky.m49362a(abul);
        if (a.isEmpty()) {
            editor.remove(str2);
            return false;
        }
        editor.putString(str2, a);
        return true;
    }
}
