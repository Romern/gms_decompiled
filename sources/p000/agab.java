package p000;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* renamed from: agab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agab {
    /* renamed from: a */
    public static boolean m53789a(Context context) {
        int i = Build.VERSION.SDK_INT;
        return Settings.Secure.getInt(context.getContentResolver(), "location_mode", 0) != 0;
    }
}
