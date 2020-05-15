package com.google.android.gms.westworld;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class DataAlarmOperation extends IntentOperation {
    /* renamed from: a */
    public static long m94458a(bkn bkn) {
        bkn bkn2 = bkn.UNKNOWN_PERIOD;
        int ordinal = bkn.ordinal();
        if (ordinal == 0) {
            return chpg.m149270b();
        }
        if (ordinal == 1) {
            return TimeUnit.HOURS.toMillis(24);
        }
        if (ordinal == 2) {
            return TimeUnit.HOURS.toMillis(4);
        }
        if (ordinal == 3) {
            return TimeUnit.HOURS.toMillis(1);
        }
        if (ordinal == 4) {
            return TimeUnit.MINUTES.toMillis(30);
        }
        if (ordinal != 5) {
            return chpg.m149270b();
        }
        return TimeUnit.MINUTES.toMillis(10);
    }

    public final void onHandleIntent(Intent intent) {
        rjx rjx;
        if (!aykg.m84157a()) {
            rpr b = rpr.m34216b();
            qxq f = aykk.m84185f(b);
            bymq bymq = null;
            if (choh.m149231b()) {
                rjx = avtz.m79336a(rpr.m34216b(), new avty());
            } else {
                bymq = aykk.m84163a(rpr.m34216b());
                rjx = null;
            }
            try {
                f.mo24383c("DataAlarmOperation").mo24359a();
                if (aykk.m84174a(bymq, rjx)) {
                    f.mo24383c("DataCanCollect").mo24359a();
                    FetchOperation.m94465b(b, rjx, bymq, f, intent);
                    if (chpz.f188967a.mo6606a().mo85523r()) {
                        aykk.m84166a(chpw.m149307f(), b);
                    }
                }
                bkn bkn = bkn.UNKNOWN_PERIOD;
                int i = Build.VERSION.SDK_INT;
                if (intent.hasExtra("FETCH_PERIOD_EXTRA")) {
                    bkn = bkn.m3261a(intent.getIntExtra("FETCH_PERIOD_EXTRA", 0));
                }
                m94460a(b, Long.valueOf(m94458a(bkn)), f, bkn, true);
            } finally {
                f.mo24388e();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m94459a(Context context, bkn bkn) {
        synchronized (DataAlarmOperation.class) {
            PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, DataAlarmOperation.class, new Intent("com.google.android.gms.westworld.action.ALARM"), bkn.f5001g, 134217728);
            new skc(context).mo25668a(pendingIntent);
            pendingIntent.cancel();
        }
    }

    /* renamed from: a */
    public static synchronized void m94460a(Context context, Long l, qxq qxq, bkn bkn, boolean z) {
        synchronized (DataAlarmOperation.class) {
            qxq.mo24383c("AlarmDelayOperation").mo24359a();
            int i = Build.VERSION.SDK_INT;
            int i2 = bkn.f5001g;
            int i3 = Build.VERSION.SDK_INT;
            if (z || !m94461a(context, i2)) {
                skc skc = new skc(context);
                Intent intent = new Intent("com.google.android.gms.westworld.action.ALARM");
                int i4 = Build.VERSION.SDK_INT;
                intent.putExtra("FETCH_PERIOD_EXTRA", bkn.f5001g);
                skc.mo25675a("WestworldPoll", 3, SystemClock.elapsedRealtime() + l.longValue(), IntentOperation.getPendingIntent(context, DataAlarmOperation.class, intent, i2, 134217728), "com.google.android.gms.westworld");
            }
        }
    }

    /* renamed from: a */
    private static synchronized boolean m94461a(Context context, int i) {
        boolean z;
        synchronized (DataAlarmOperation.class) {
            z = IntentOperation.getPendingIntent(context, DataAlarmOperation.class, new Intent("com.google.android.gms.westworld.action.ALARM"), i, 536870912) != null;
        }
        return z;
    }
}
