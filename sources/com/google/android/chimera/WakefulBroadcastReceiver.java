package com.google.android.chimera;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.annotation.ChimeraApiVersion;

@ChimeraApiVersion(added = 0)
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: b */
    private static final SparseArray f7669b = new SparseArray();

    /* renamed from: c */
    private static int f7670c = 1;

    public static boolean completeWakefulIntent(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f7669b) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) f7669b.get(intExtra);
            if (wakeLock == null) {
                StringBuilder sb = new StringBuilder(35);
                sb.append("No active wake lock id #");
                sb.append(intExtra);
                Log.w("WakefulBroadcastReceiver", sb.toString());
                return true;
            }
            wakeLock.release();
            f7669b.remove(intExtra);
            return true;
        }
    }

    public static ComponentName startWakefulService(Context context, Intent intent) {
        synchronized (f7669b) {
            int i = f7670c;
            int i2 = f7670c + 1;
            f7670c = i2;
            if (i2 <= 0) {
                f7670c = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            String valueOf = String.valueOf(startService.flattenToShortString());
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf));
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f7669b.put(i, newWakeLock);
            return startService;
        }
    }
}
