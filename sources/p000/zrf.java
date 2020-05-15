package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zrf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zrf {
    /* renamed from: a */
    public static SharedPreferences m46035a(Context context, String str) {
        String valueOf = String.valueOf(str);
        return context.getSharedPreferences(valueOf.length() == 0 ? new String("fitness_store_account_") : "fitness_store_account_".concat(valueOf), 0);
    }
}
