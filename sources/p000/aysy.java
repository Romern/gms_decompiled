package p000;

import com.google.android.libraries.bluetooth.BluetoothException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aysy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aysy implements Future {

    /* renamed from: a */
    final /* synthetic */ aytb f98431a;

    /* renamed from: b */
    private final Object f98432b = new Object();

    /* renamed from: c */
    private final BlockingQueue f98433c;

    /* renamed from: d */
    private final aysz f98434d;

    /* renamed from: e */
    private final boolean f98435e;

    /* renamed from: f */
    private boolean f98436f = false;

    /* renamed from: g */
    private boolean f98437g = false;

    public aysy(aytb aytb, BlockingQueue blockingQueue, aysz aysz, boolean z) {
        this.f98431a = aytb;
        this.f98433c = blockingQueue;
        this.f98434d = aysz;
        this.f98435e = z;
    }

    public final boolean cancel(boolean z) {
        synchronized (this.f98432b) {
            if (this.f98437g) {
                return false;
            }
            if (this.f98436f) {
                return true;
            }
            this.f98434d.mo54319c();
            this.f98436f = true;
            this.f98431a.mo54413a(this.f98434d, new BluetoothException("Operation cancelled."));
            return true;
        }
    }

    public final Object get() {
        try {
            return m84757a(-1, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean isCancelled() {
        boolean z;
        synchronized (this.f98432b) {
            z = this.f98436f;
        }
        return z;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this.f98432b) {
            z = this.f98437g;
        }
        return z;
    }

    /* renamed from: a */
    private final Object m84757a(long j, TimeUnit timeUnit) {
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            synchronized (this.f98432b) {
                if (this.f98437g) {
                    throw new ExecutionException(new BluetoothException("get() called twice..."));
                }
            }
            if (!this.f98435e) {
                if (j == -1) {
                    this.f98431a.f98442c.acquire();
                } else if (!this.f98431a.f98442c.tryAcquire(j - (System.currentTimeMillis() - currentTimeMillis), timeUnit)) {
                    throw new TimeoutException(String.format("A timeout occured when processing %s after %s %s.", this.f98434d, Long.valueOf(j), timeUnit));
                }
                this.f98434d.mo54405a(this.f98431a);
            }
            if (j == -1) {
                obj = this.f98433c.take();
            } else {
                obj = this.f98433c.poll(j - (System.currentTimeMillis() - currentTimeMillis), timeUnit);
            }
            if (obj != null) {
                synchronized (this.f98432b) {
                    this.f98437g = true;
                }
                if (obj instanceof BluetoothException) {
                    throw new ExecutionException((BluetoothException) obj);
                } else if (obj == aytb.f98439a) {
                    obj = null;
                }
            } else {
                throw new TimeoutException(String.format("A timeout occured when processing %s after %s ms.", this.f98434d, Long.valueOf(j)));
            }
        }
        return obj;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    public final Object get(long j, TimeUnit timeUnit) {
        return m84757a(Math.max(0L, j), timeUnit);
    }
}
