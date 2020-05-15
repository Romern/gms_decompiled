package p000;

import android.content.Context;
import android.content.IntentFilter;

/* renamed from: abyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abyk {
    /* renamed from: a */
    public static boolean m48545a(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) != null;
    }
}
