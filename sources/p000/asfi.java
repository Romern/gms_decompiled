package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: asfi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asfi {

    /* renamed from: a */
    private static Future f88836a = null;

    /* renamed from: a */
    public static void m73948a() {
        Future future = f88836a;
        if (future != null && !future.isDone() && !f88836a.isCancelled()) {
            f88836a.cancel(true);
        }
    }

    /* renamed from: a */
    public static boolean m73949a(long j) {
        return m73950a(new asfe(j), j);
    }

    /* renamed from: a */
    public static boolean m73950a(Callable callable, long j) {
        if (j <= 0) {
            asfj.m73952a("ControlledEventsWakelockFailureInvalidDuration");
            return false;
        } else if (f88836a == null) {
            asfb asfb = new asfb(rpr.m34216b(), "Controlled_Events_Wakelock", "Acquired ControlledEvents Wakelock.");
            bqgj b = snp.m35704b(9);
            f88836a = b.mo25819b(callable);
            try {
                asfb.mo49113a("Controlled_Events_Wakelock");
                f88836a.get(j, TimeUnit.MILLISECONDS);
                return true;
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
                if (!f88836a.isCancelled()) {
                    m73948a();
                }
                if (e instanceof TimeoutException) {
                    return true;
                }
                asfj.m73952a("ControlledEventsWakelockFailureInterrupted");
                return false;
            } finally {
                asfb.mo49122c("Controlled_Events_Wakelock");
                f88836a = null;
                b.shutdownNow();
            }
        } else {
            asfj.m73952a("ControlledEventsWakelockFailureAlreadyHeld");
            return false;
        }
    }
}
