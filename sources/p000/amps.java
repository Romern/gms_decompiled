package p000;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: amps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amps {
    /* renamed from: a */
    public static Object m63150a(ArrayDeque arrayDeque, Callable callable, String str, long j) {
        ampr ampr = new ampr(callable, arrayDeque);
        FutureTask futureTask = new FutureTask(ampr);
        ampr.f75690a = futureTask;
        synchronized (arrayDeque) {
            arrayDeque.addLast(futureTask);
            int size = arrayDeque.size();
            StringBuilder sb = new StringBuilder(36);
            sb.append("Currently running tasks: ");
            sb.append(size);
            sb.toString();
            while (((long) arrayDeque.size()) > cfyo.f186156a.mo6606a().mo83136m()) {
                Log.w("GalProviderExecutor", "Too many tasks, canceling one");
                ((FutureTask) arrayDeque.removeFirst()).cancel(true);
            }
        }
        if (str.length() == 0) {
            new String("Starting task ");
        } else {
            "Starting task ".concat(str);
        }
        new Thread(futureTask, str).start();
        try {
            if (str.length() == 0) {
                new String("Getting future ");
            } else {
                "Getting future ".concat(str);
            }
            return futureTask.get(j, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.w("GalProviderExecutor", str.length() == 0 ? new String("Gal task was interrupted: ") : "Gal task was interrupted: ".concat(str));
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e2) {
            Log.w("GalProviderExecutor", str.length() == 0 ? new String("Gal task threw an exception: ") : "Gal task threw an exception: ".concat(str), e2);
            return null;
        } catch (TimeoutException e3) {
            Log.w("GalProviderExecutor", str.length() == 0 ? new String("Gal task timed out: ") : "Gal task timed out: ".concat(str));
            futureTask.cancel(true);
            return null;
        } catch (CancellationException e4) {
            Log.w("GalProviderExecutor", str.length() == 0 ? new String("Gal task was cancelled: ") : "Gal task was cancelled: ".concat(str));
            return null;
        }
    }
}
