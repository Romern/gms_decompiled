package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: aqkm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqkm {
    /* renamed from: a */
    public static synchronized void m71757a(Context context, String str, String str2, boolean z) {
        synchronized (aqkm.class) {
            sdo.m34959a(context);
            sdo.m34959a((Object) str);
            sdo.m34959a((Object) str2);
            SharedPreferences.Editor edit = context.getSharedPreferences("games.sign_in_cache", 0).edit();
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 9 + String.valueOf(str).length());
            sb.append(str2);
            sb.append(",");
            sb.append(str);
            sb.append("_greeted");
            edit.putBoolean(sb.toString(), z);
            edit.apply();
        }
    }
}
