package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bkpm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpm implements bkpj {

    /* renamed from: a */
    private final Logger f125073a = Logger.getLogger(bkpm.class.getName());

    /* renamed from: b */
    private final ScheduledExecutorService f125074b;

    /* renamed from: c */
    private final bkpn f125075c;

    public bkpm(bkpn bkpn, ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService != null) {
            this.f125075c = bkpn;
            this.f125074b = scheduledExecutorService;
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.scalb(double, int):double}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.Math.scalb(float, int):float}
      ClspMth{java.lang.Math.scalb(double, int):double} */
    /* renamed from: a */
    public final void mo28476a(bkpk bkpk, Runnable runnable) {
        double d;
        double millis = (double) TimeUnit.SECONDS.toMillis(1);
        bkpn bkpn = this.f125075c;
        if (bkpk != bkpk.SUCCESS) {
            double scalb = Math.scalb(1.0d, bkpn.f125076a);
            bkpn.f125076a++;
            if (scalb > 15.0d) {
                scalb = 15.0d;
            }
            d = scalb + (Math.random() * scalb);
        } else {
            bkpn.f125076a = 0;
            d = 0.0d;
        }
        Double.isNaN(millis);
        long j = (long) (millis * d);
        if (j > 0) {
            Logger logger = this.f125073a;
            Level level = Level.INFO;
            StringBuilder sb = new StringBuilder(75);
            sb.append("Waiting ");
            sb.append(j);
            sb.append(" ms before sending request (failure backoff)...");
            logger.logp(level, "com.google.apps.brix.api.client.net.browserchannel.util.ExecutorServiceBackoffScheduler", "scheduleTask", sb.toString());
        }
        this.f125074b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
