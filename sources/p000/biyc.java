package p000;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: biyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biyc {

    /* renamed from: a */
    static final Intent f122250a = new Intent().setPackage("com.google.android.setupwizard").setAction("com.google.android.setupcompat.SetupCompatService.BIND");

    /* renamed from: f */
    private static volatile biyc f122251f;

    /* renamed from: b */
    final ServiceConnection f122252b = new bixz(this);

    /* renamed from: c */
    private volatile biya f122253c = new biya(1);

    /* renamed from: d */
    private final Context f122254d;

    /* renamed from: e */
    private final AtomicReference f122255e = new AtomicReference();

    public biyc(Context context) {
        this.f122254d = context.getApplicationContext();
    }

    /* renamed from: a */
    private final bixk m102965a(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        biya b = m102968b();
        if (b.f122248a == 4) {
            return b.f122249b;
        }
        do {
            countDownLatch = (CountDownLatch) this.f122255e.get();
            if (countDownLatch != null) {
                break;
            }
            countDownLatch = new CountDownLatch(1);
        } while (!this.f122255e.compareAndSet(null, countDownLatch));
        Log.i("SucServiceProvider", "Waiting for service to get connected");
        if (countDownLatch.await(j, timeUnit)) {
            biya b2 = m102968b();
            if (Log.isLoggable("SucServiceProvider", 4)) {
                Log.i("SucServiceProvider", String.format("Finished waiting for service to get connected. Current state = %s", biyb.m102964a(b2.f122248a)));
            }
            return b2.f122249b;
        }
        m102967a();
        throw new TimeoutException(String.format("Failed to acquire connection after [%s %s]", Long.valueOf(j), timeUnit));
    }

    /* renamed from: b */
    private final synchronized biya m102968b() {
        return this.f122253c;
    }

    /* renamed from: a */
    public static bixk m102966a(Context context, long j, TimeUnit timeUnit) {
        bixv.m102956a(context, "Context object cannot be null.");
        biyc biyc = f122251f;
        if (biyc == null) {
            synchronized (biyc.class) {
                biyc = f122251f;
                if (biyc == null) {
                    biyc = new biyc(context.getApplicationContext());
                    f122251f = biyc;
                    f122251f.m102967a();
                }
            }
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            biya b = biyc.m102968b();
            int i = b.f122248a;
            int i2 = i - 1;
            if (i != 0) {
                switch (i2) {
                    case 0:
                        throw new IllegalStateException("NOT_STARTED state only possible before instance is created.");
                    case 1:
                    case 5:
                        return null;
                    case 2:
                    case 4:
                        return biyc.m102965a(j, timeUnit);
                    case 3:
                        return b.f122249b;
                    case 6:
                        biyc.m102967a();
                        return biyc.m102965a(j, timeUnit);
                    default:
                        String a = biyb.m102964a(i);
                        StringBuilder sb = new StringBuilder(a.length() + 16);
                        sb.append("Unknown state = ");
                        sb.append(a);
                        throw new IllegalStateException(sb.toString());
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalStateException("getService blocks and should not be called from the main thread.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    private final synchronized void m102967a() {
        int i = m102968b().f122248a;
        if (i == 4) {
            Log.i("SucServiceProvider", "Refusing to rebind since current state is already connected");
            return;
        }
        if (i != 1) {
            Log.i("SucServiceProvider", "Unbinding existing service connection.");
            this.f122254d.unbindService(this.f122252b);
        }
        try {
            if (this.f122254d.bindService(f122250a, this.f122252b, 1)) {
                if (this.f122253c.f122248a != 4) {
                    mo64860a(new biya(3));
                    Log.i("SucServiceProvider", "Context#bindService went through, now waiting for service connection");
                }
            }
        } catch (SecurityException e) {
            Log.e("SucServiceProvider", "Unable to bind to compat service", e);
        }
        mo64860a(new biya(2));
        Log.e("SucServiceProvider", "Context#bindService did not succeed.");
    }

    /* renamed from: a */
    public final void mo64860a(biya biya) {
        if (Log.isLoggable("SucServiceProvider", 4)) {
            Log.i("SucServiceProvider", String.format("State changed: %s -> %s", biyb.m102964a(this.f122253c.f122248a), biyb.m102964a(biya.f122248a)));
        }
        this.f122253c = biya;
        CountDownLatch countDownLatch = (CountDownLatch) this.f122255e.getAndSet(null);
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }
}
