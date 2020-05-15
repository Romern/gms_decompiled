package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: aaks */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaks {
    /* renamed from: a */
    public static String m21407a(Context context) {
        return context.getSharedPreferences("com.google.android.gcm", 4).getString("regId", null);
    }

    /* renamed from: a */
    public static void m21408a(Context context, Intent intent) {
        if (intent != null && "1".equals(intent.getStringExtra("wake"))) {
            aseo.m73884b(context, intent);
        }
    }
}
