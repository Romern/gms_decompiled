package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;

/* renamed from: atht */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atht {
    /* renamed from: a */
    public static PendingIntent m75912a(Context context, String str) {
        return IntentOperation.getPendingIntent(context, "com.google.android.gms.tapandpay.selfdestruct.ScheduleSelfDestructOperation", new Intent(str), 1, 134217728);
    }
}
