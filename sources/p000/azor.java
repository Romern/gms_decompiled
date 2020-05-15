package p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* renamed from: azor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azor {
    /* renamed from: a */
    public static void m85956a(Context context, int i, Intent intent) {
        PendingIntent service = PendingIntent.getService(context.getApplicationContext(), i, intent, 536870912);
        if (service != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(service);
            service.cancel();
        }
    }
}
