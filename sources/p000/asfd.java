package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;

/* renamed from: asfd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class asfd extends WakefulBroadcastReceiver {
    /* renamed from: a */
    public static void m73946a(Context context, Intent intent) {
        if (intent != null) {
            slw.f44710a.mo25722a(context, intent);
            WakefulBroadcastReceiver.completeWakefulIntent(intent);
        }
    }

    /* renamed from: b */
    public static void m73947b(Context context, Intent intent) {
        intent.putExtra("WAKE_LOCK_KEY", slp.m35591a(context, intent));
        ComponentName startWakefulService = WakefulBroadcastReceiver.startWakefulService(context, intent);
        if (startWakefulService != null) {
            slw slw = slw.f44710a;
            String valueOf = String.valueOf(startWakefulService.flattenToShortString());
            slw.mo25723a(context, intent, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf), intent.getAction(), "com.google.android.gms");
        }
    }
}
