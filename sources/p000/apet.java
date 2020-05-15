package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: apet */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apet {
    /* renamed from: a */
    public static SharedPreferences m70117a(Context context) {
        return context.getApplicationContext().getSharedPreferences("people_contacts_restore_storage", 0);
    }

    /* renamed from: a */
    public static String m70118a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("last_restore_time:") : "last_restore_time:".concat(valueOf);
    }

    /* renamed from: a */
    static void m70119a(Context context, String str, long j) {
        if (j >= 0) {
            m70117a(context).edit().putLong(m70118a(str), j).apply();
        }
    }
}
