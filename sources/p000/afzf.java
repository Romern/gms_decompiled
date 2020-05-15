package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.mdm.receivers.RetryAfterAlarmChimeraReceiver;

/* renamed from: afzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afzf {
    /* renamed from: a */
    public static PendingIntent m53699a(Context context) {
        return PendingIntent.getBroadcast(context, 0, apuh.m71021a(context, RetryAfterAlarmChimeraReceiver.class), 0);
    }

    /* renamed from: a */
    public static void m53700a(Context context, long j) {
        afzd.f64995i.mo10352a(Long.valueOf(j));
        new skc(context).mo25675a("RetryAfterAlarmReceiver", 1, j, m53699a(context), "com.google.android.gms");
    }

    /* renamed from: a */
    public static void m53701a(Context context, skc skc) {
        skc.mo25668a(m53699a(context));
    }
}
