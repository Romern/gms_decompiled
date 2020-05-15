package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* renamed from: bgzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzp {

    /* renamed from: a */
    public static final String[] f118165a = {"disabled", "sensorOnly", "batterySaving", "highAccuracy"};

    /* renamed from: a */
    public static Boolean m100479a() {
        return Boolean.valueOf(sse.m36206b());
    }

    /* renamed from: b */
    public static int m100482b(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "low_power_trigger_level", 0);
    }

    /* renamed from: a */
    public static Boolean m100480a(ContentResolver contentResolver) {
        boolean z = false;
        if (Settings.Global.getInt(contentResolver, "low_power", 0) != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public static Boolean m100481a(Context context) {
        return Boolean.valueOf(sse.m36207b(context));
    }
}
