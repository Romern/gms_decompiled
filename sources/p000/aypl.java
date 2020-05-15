package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* renamed from: aypl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aypl {

    /* renamed from: a */
    public static final Uri f98193a = new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("battery_status_update").build();

    static {
        Log.isLoggable("FPDeviceDetailConnUtil", 4);
    }

    /* renamed from: a */
    public static void m84458a(Context context) {
        context.getContentResolver().notifyChange(f98193a, null);
    }
}
