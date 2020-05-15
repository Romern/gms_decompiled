package p000;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: rvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rvw {
    /* renamed from: a */
    public static Thread m34541a(long j, rvl rvl) {
        Thread thread = new Thread(new rvu(j, rvl));
        thread.start();
        return thread;
    }

    /* renamed from: a */
    static final /* synthetic */ void m34542a(Future future, Thread thread) {
        try {
            future.get();
        } catch (InterruptedException | CancellationException | ExecutionException e) {
            Log.e("RestartUtil", "Interrupted, cancelled, or failed", e);
        }
        Log.i("RestartUtil", "ensureRestartWhenDoneOrTimeoutMillis - future completed");
        thread.interrupt();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public static void m34543a(rvl rvl) {
        Log.i("RestartUtil", "Acquiring restart lock");
        try {
            if ((rvl.f43759a.equals(bpun.SCHEDULED_IDLE) || rvl.f43759a.equals(bpun.SCHEDULED_NOT_IDLE_DURING_WINDOW)) && cdme.m134016b()) {
                if (!sej.m35079a().f62952b.mo33943a(Math.max(300L, cdme.f181224a.mo6606a().mo77887f()), TimeUnit.SECONDS)) {
                    sqx.m36054a(rvl.f43760b, new RuntimeException("Unable to acquire periodic restart writer lock"), 67108864);
                }
            }
        } catch (InterruptedException e) {
            Log.e("RestartUtil", "Interrupted waiting for writer lock.", e);
            sqx.m36054a(rvl.f43760b, e, 67108864);
        } catch (Throwable th) {
            Log.i("RestartUtil", "Restarting.");
            Process.killProcess(Process.myPid());
            throw th;
        }
        Log.i("RestartUtil", "Restarting.");
        Process.killProcess(Process.myPid());
    }
}
