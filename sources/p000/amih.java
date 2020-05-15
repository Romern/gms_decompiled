package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: amih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amih {
    /* renamed from: a */
    public static int m62940a(Context context) {
        return context.getSharedPreferences("ppl_first_sdk", 0).getInt("com.google.android.gms.people.firstSdk", -1);
    }

    /* renamed from: a */
    public static SharedPreferences m62941a(Context context, String str) {
        return context.getSharedPreferences(str, 0);
    }
}
