package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;

/* renamed from: dqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqj implements PendingIntent.OnFinished {

    /* renamed from: a */
    public final CountDownLatch f13818a;

    /* renamed from: b */
    public final dqx f13819b;

    public dqj(boolean z) {
        dqx dqx = null;
        this.f13818a = !z ? new CountDownLatch(1) : null;
        this.f13819b = z ? dqy.m9123a("PendingIntentCompat") : dqx;
    }

    public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f13818a;
        if (countDownLatch == null) {
            drv k = dwq.m9667k();
            dqx dqx = this.f13819b;
            new Object[1][0] = dqx.f13840a;
            dqx.mo9464c();
            egr D = dwq.m9647D();
            if (D != null) {
                D.mo10108b(dqx);
            }
            drt drt = k.f13906c;
            int i2 = drt.f13896b;
            drt.mo9506a(dqx);
            return;
        }
        countDownLatch.countDown();
    }
}
