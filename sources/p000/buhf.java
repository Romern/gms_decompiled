package p000;

import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: buhf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class buhf implements Runnable, bugq {

    /* renamed from: a */
    protected final buhj f153836a;

    /* renamed from: b */
    private final CountDownLatch f153837b = new CountDownLatch(1);

    /* renamed from: c */
    private volatile Handler f153838c;

    /* renamed from: d */
    private volatile Object f153839d;

    /* renamed from: e */
    private volatile Object f153840e;

    protected buhf(buhj buhj, String str) {
        if (str != null) {
            this.f153836a = buhj;
            return;
        }
        throw new IllegalArgumentException("'tag' cannot be null.");
    }

    /* renamed from: a */
    static boolean m119523a(int i) {
        return i < 0;
    }

    /* renamed from: b */
    private final Object m119524b() {
        Object obj;
        synchronized (this.f153837b) {
            if (isCancelled()) {
                throw new CancellationException("Transfer was cancelled");
            } else if (isDone()) {
                obj = this.f153840e;
            } else {
                throw new IllegalStateException("Unable to query result before operation is completed.");
            }
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r4.f153836a.f153852d.execute(mo72662a(r1, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r1 == null) goto L_?;
     */
    /* renamed from: c */
    private final void m119525c() {
        synchronized (this.f153837b) {
            if (isCancelled()) {
                return;
            }
            if (isDone()) {
                Object obj = this.f153839d;
                Object obj2 = this.f153840e;
                this.f153839d = null;
                this.f153838c = null;
            } else {
                throw new IllegalStateException("Attempted to trigger operation before it was done.");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract buhe mo72662a(Object obj, Object obj2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo72663a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo72664b(Object obj);

    public final boolean cancel(boolean z) {
        buhj buhj = this.f153836a;
        if (!buhj.f153850b.remove(this) && !buhj.f153851c.remove(this)) {
            return false;
        }
        mo72665c(mo72663a());
        return isCancelled();
    }

    public final Object get() {
        this.f153837b.await();
        return m119524b();
    }

    public final boolean isCancelled() {
        boolean b;
        synchronized (this.f153837b) {
            b = mo72664b(this.f153840e);
        }
        return b;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this.f153837b) {
            z = this.f153840e != null;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo72638a(Object obj) {
        synchronized (this.f153837b) {
            this.f153839d = obj;
            this.f153838c = null;
            if (isDone()) {
                m119525c();
            }
        }
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.f153837b.await(j, timeUnit)) {
            return m119524b();
        }
        throw new TimeoutException("Timeout awaiting for transfer's result.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72665c(Object obj) {
        if (obj != null) {
            synchronized (this.f153837b) {
                if (!isDone()) {
                    this.f153840e = obj;
                    this.f153837b.countDown();
                    m119525c();
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Result cannot be set to null.");
    }
}
