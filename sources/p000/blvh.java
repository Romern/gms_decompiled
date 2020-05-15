package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: blvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blvh implements Future {

    /* renamed from: a */
    public final CountDownLatch f127854a = new CountDownLatch(1);

    /* renamed from: b */
    public volatile blun f127855b;

    /* renamed from: c */
    public volatile BluetoothGattCharacteristic f127856c;

    /* renamed from: d */
    private volatile Exception f127857d;

    /* renamed from: e */
    private aysm f127858e;

    public blvh(aysm aysm) {
        this.f127858e = aysm;
    }

    /* renamed from: a */
    private final synchronized void m107654a() {
        aysm aysm = this.f127858e;
        if (aysm != null) {
            aysm.mo54370f();
            this.f127858e = null;
        }
    }

    public final boolean cancel(boolean z) {
        if (this.f127857d != null) {
            return true;
        }
        mo66744a(new InterruptedException("connection cancelled"));
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        this.f127854a.await();
        if (this.f127857d == null) {
            return this.f127855b;
        }
        throw new ExecutionException(this.f127857d);
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return this.f127854a.getCount() == 0;
    }

    /* renamed from: a */
    public final void mo66744a(Exception exc) {
        m107654a();
        this.f127857d = exc;
        this.f127854a.countDown();
    }

    public final /* bridge */ /* synthetic */ Object get(long j, TimeUnit timeUnit) {
        if (!this.f127854a.await(j, timeUnit)) {
            m107654a();
            throw new TimeoutException();
        } else if (this.f127857d == null) {
            return this.f127855b;
        } else {
            throw new ExecutionException(this.f127857d);
        }
    }
}
