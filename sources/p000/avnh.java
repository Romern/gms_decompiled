package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: avnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnh {
    /* renamed from: a */
    public static PendingIntent m78871a(Context context, int i) {
        return PendingIntent.getService(context, i, m78872a(context), 134217728);
    }

    /* renamed from: b */
    public static PendingIntent m78873b(Context context, int i) {
        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.update.control.ReceiverIntentOperation", "com.google.android.gms.update.NOTIFICATION_ACTION");
        startIntent.putExtra("notification_action", i);
        return PendingIntent.getService(context, i, startIntent, 134217728);
    }

    /* renamed from: a */
    public static Intent m78872a(Context context) {
        return IntentOperation.getStartIntent(context, "com.google.android.gms.update.execution.InstallationIntentOperation", "com.google.android.gms.update.INSTALL_UPDATE");
    }
}
