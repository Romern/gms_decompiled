package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.analytics.CoreAnalyticsIntentOperation;

/* renamed from: ril */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ril {

    /* renamed from: a */
    private static volatile ril f43058a = null;

    private ril() {
    }

    /* renamed from: a */
    public static void m33641a() {
        if (f43058a == null) {
            f43058a = new ril();
        }
    }

    /* renamed from: a */
    public static final void m33642a(Context context, int i, int i2, long j) {
        Intent putExtra = new Intent("com.google.android.gms.common.operation.LOG_CORE_ANALYTICS").setPackage(context.getPackageName()).putExtra("type", "system_health").putExtra("event_code", i - 1);
        if (i2 >= 0) {
            putExtra.putExtra("post_install_checkin_stage", i2);
        }
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, CoreAnalyticsIntentOperation.class, putExtra, i, 134217728);
        bmzs.m108696a(pendingIntent);
        skc skc = new skc(context);
        skc.mo25668a(pendingIntent);
        skc.mo25675a("CoreAnalyticsIntents", 3, SystemClock.elapsedRealtime() + j, pendingIntent, "com.google.android.gms");
    }

    /* renamed from: a */
    public static final void m33643a(Context context, int i, long j) {
        m33642a(context, i, -1, j);
    }
}
