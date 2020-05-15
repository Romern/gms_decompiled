package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: alpi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class alpi {
    /* renamed from: a */
    public static SharedPreferences m61467a(Context context) {
        return context.getApplicationContext().getSharedPreferences("people_contacts_restore_storage", 0);
    }

    /* renamed from: a */
    public static String m61468a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("last_restore_time:") : "last_restore_time:".concat(valueOf);
    }
}
