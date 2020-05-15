package p000;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: ku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C1146ku extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray f25064a = new SparseArray();

    /* renamed from: b */
    private static int f25065b = 1;

    /* renamed from: a */
    public static ComponentName m18578a(Context context, Intent intent) {
        synchronized (f25064a) {
            int i = f25065b;
            int i2 = f25065b + 1;
            f25065b = i2;
            if (i2 <= 0) {
                f25065b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f25064a.put(i, newWakeLock);
            return startService;
        }
    }

    /* renamed from: a */
    public static void m18579a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra != 0 || (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) != 0) {
            synchronized (f25064a) {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) f25064a.get(intExtra);
                if (wakeLock == null) {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                    return;
                }
                wakeLock.release();
                f25064a.remove(intExtra);
            }
        }
    }
}
