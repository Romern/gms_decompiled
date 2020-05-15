package p000;

import android.util.Log;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.BluetoothGattException;
import com.google.android.libraries.bluetooth.util.BluetoothOperationExecutor$BluetoothOperationTimeoutException;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aytb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aytb {

    /* renamed from: a */
    public static final Object f98439a = new Object();

    /* renamed from: d */
    private static final String f98440d = aytb.class.getSimpleName();

    /* renamed from: b */
    final Map f98441b = new HashMap();

    /* renamed from: c */
    public final Semaphore f98442c;

    public aytb(int i) {
        Semaphore semaphore = new Semaphore(i, true);
        this.f98442c = semaphore;
    }

    /* renamed from: a */
    public static Object m84763a(Future future) {
        return m84765b(future, -1);
    }

    /* renamed from: b */
    private static Object m84765b(Future future, long j) {
        if (j == -1) {
            return future.get();
        }
        try {
            return future.get(j, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            if (future.cancel(true) || !future.isDone()) {
                Thread.currentThread().interrupt();
                throw new BluetoothException("Wait interrupted");
            }
            Object b = m84765b(future, -1);
            Thread.currentThread().interrupt();
            return b;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof BluetoothException) {
                throw ((BluetoothException) cause);
            }
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            if (!future.cancel(true) && future.isDone()) {
                return m84765b(future, -1);
            }
            throw new BluetoothOperationExecutor$BluetoothOperationTimeoutException(String.format("Wait timed out after %s ms.", Long.valueOf(j)), e3);
        } catch (Throwable th) {
            Thread.currentThread().interrupt();
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo54416c(aysz aysz) {
        m84763a(mo54414b(aysz));
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
    public static Object m84764a(Future future, long j) {
        return m84765b(future, Math.max(0L, j));
    }

    /* renamed from: a */
    public final Object mo54409a(aysz aysz) {
        Object a = m84763a(mo54414b(aysz));
        if (a != null) {
            return a;
        }
        throw new BluetoothException(String.format("Operation %s returned a null result.", aysz));
    }

    /* renamed from: a */
    public final Object mo54410a(aysz aysz, long j) {
        Object a = m84764a(mo54414b(aysz), j);
        if (a != null) {
            return a;
        }
        throw new BluetoothException(String.format("Operation %s returned a null result.", aysz));
    }

    /* renamed from: a */
    public final void mo54411a(aysz aysz, int i) {
        mo54412a(aysz, i, null);
    }

    /* renamed from: a */
    public final void mo54412a(aysz aysz, int i, Object obj) {
        if (i != 0) {
            mo54413a(aysz, new BluetoothGattException(String.format("Operation %s failed: %d - %s.", aysz, Integer.valueOf(i), aysx.m84754a(i)), i));
            return;
        }
        mo54413a(aysz, obj);
    }

    /* renamed from: a */
    public final void mo54413a(aysz aysz, Object obj) {
        Queue queue = (Queue) this.f98441b.get(aysz);
        if (queue == null) {
            Log.e(f98440d, String.format("Receive completion for unexpected operation: %s.", aysz));
            return;
        }
        if (obj == null) {
            obj = f98439a;
        }
        queue.add(obj);
        this.f98441b.remove(aysz);
        this.f98442c.release();
        Object[] objArr = {aysz, Integer.valueOf(this.f98442c.availablePermits())};
    }

    /* renamed from: b */
    public final Future mo54414b(aysz aysz) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f98441b.put(aysz, linkedBlockingDeque);
        boolean tryAcquire = this.f98442c.tryAcquire();
        Object[] objArr = {aysz, Integer.valueOf(this.f98442c.availablePermits()), Boolean.valueOf(tryAcquire)};
        if (tryAcquire) {
            aysz.mo54405a(this);
        }
        return new aysy(this, linkedBlockingDeque, aysz, tryAcquire);
    }

    /* renamed from: b */
    public final void mo54415b(aysz aysz, long j) {
        m84764a(mo54414b(aysz), j);
    }
}
