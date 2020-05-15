package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class WaitUpdateCompleteOperation extends IntentOperation {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(android.content.Intent, android.content.Intent, boolean):void
     arg types: [android.content.Intent, android.content.Intent, int]
     candidates:
      com.google.android.chimera.IntentOperation.a(android.content.Context, android.content.Intent, java.lang.String):dnb
      com.google.android.gms.chimera.container.WaitUpdateCompleteOperation.a(android.content.Intent, android.content.Intent, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final void onHandleIntent(Intent intent) {
        djk a = dkz.m8772a(intent, "liveListener");
        qoa qoa = a instanceof qoa ? (qoa) a : null;
        long longExtra = intent.getLongExtra("startTime", 0);
        if (qoa != null) {
            long max = Math.max(TimeUnit.SECONDS.toMillis(cdji.m133564e()) - (SystemClock.uptimeMillis() - longExtra), 0L);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            djk djk = qoa.f41823a;
            bmzs.m108696a(djk);
            try {
                qoa.f41824b.await(max, timeUnit);
            } catch (InterruptedException e) {
                Thread.interrupted();
            }
            dkz.m8776a(djk, qoa.f41825c);
            qoa.f41823a = null;
        } else if (intent.getIntExtra("retryCount", 2) >= 2) {
            djk a2 = dkz.m8772a(intent, "progressListener");
            if (a2 != null) {
                dkz.m8776a(a2, 1);
            }
        } else {
            Intent a3 = dgf.m8387a(this, null, null, null);
            m22413a(intent, a3, true);
            startService(a3);
        }
    }

    /* renamed from: a */
    public static final void m22413a(Intent intent, Intent intent2, boolean z) {
        dkz.m8774a(intent2, "progressListener", dkz.m8772a(intent, "progressListener"));
        intent2.putExtra("chimera.URGENTLY_REQUESTED_FEATURES", intent.getByteArrayExtra("chimera.URGENTLY_REQUESTED_FEATURES"));
        intent2.putExtra("chimera.CLIENT_SESSION_ID", intent.getStringExtra("chimera.CLIENT_SESSION_ID"));
        intent2.putExtra("startTime", intent.getLongExtra("startTime", SystemClock.uptimeMillis()));
        intent2.putExtra("retryCount", intent.getIntExtra("retryCount", 0) + (z ? 1 : 0));
    }
}
