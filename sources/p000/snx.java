package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: snx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class snx implements RunnableFuture, bqgg {

    /* renamed from: a */
    protected final ReentrantLock f44817a;

    /* renamed from: b */
    Object f44818b;

    /* renamed from: c */
    final /* synthetic */ sny f44819c;

    /* renamed from: d */
    private final Condition f44820d;

    /* renamed from: e */
    private final Callable f44821e;

    /* renamed from: f */
    private final bqfe f44822f = new bqfe();

    /* renamed from: g */
    private sog f44823g = null;

    /* renamed from: h */
    private boolean f44824h = false;

    public snx(sny sny, Callable callable) {
        this.f44819c = sny;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f44817a = reentrantLock;
        this.f44820d = reentrantLock.newCondition();
        this.f44821e = callable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25801a() {
        this.f44818b = null;
    }

    /* renamed from: b */
    public Runnable mo25803b() {
        this.f44817a.lock();
        try {
            sdo.m34970a(!this.f44824h);
            sog sog = new sog(this.f44821e, this.f44818b);
            this.f44823g = sog;
            sog.mo741a(new snv(this), bqfb.INSTANCE);
            mo25801a();
            return sog;
        } finally {
            this.f44817a.unlock();
        }
    }

    /* renamed from: c */
    public final void mo25804c() {
        this.f44822f.mo69200a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sny.a(snx, boolean):void
     arg types: [snx, int]
     candidates:
      sny.a(java.util.concurrent.ScheduledFuture, bqgg):bqgi
      sny.a(long, java.util.concurrent.TimeUnit):boolean
      sny.a(java.lang.Runnable, java.lang.Object):bqgg
      bqgj.a(java.lang.Runnable, java.lang.Object):bqgg
      sny.a(snx, boolean):void */
    public boolean cancel(boolean z) {
        boolean z2;
        this.f44817a.lock();
        try {
            boolean z3 = false;
            if (!this.f44824h) {
                this.f44824h = true;
                sog sog = this.f44823g;
                if (sog == null || sog.cancel(z)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f44824h = z2;
                synchronized (this.f44819c.f44827b) {
                    if (this.f44824h || this.f44819c.f44828c.containsKey(this)) {
                        z3 = true;
                    }
                    this.f44824h = z3;
                    if (z3) {
                        this.f44819c.mo25817a(this, true);
                    }
                }
                if (this.f44824h) {
                    mo25804c();
                    this.f44820d.signalAll();
                }
                boolean z4 = this.f44824h;
                this.f44817a.unlock();
                return z4;
            }
            this.f44817a.unlock();
            return false;
        } catch (Throwable th) {
            this.f44817a.unlock();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f A[SYNTHETIC, Splitter:B:10:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    public final Object get() {
        sog sog;
        this.f44817a.lock();
        while (true) {
            try {
                sog = this.f44823g;
                if (sog == null && !this.f44824h) {
                    this.f44820d.await();
                } else if (sog == null) {
                    this.f44817a.unlock();
                    return sog.get();
                } else {
                    throw new CancellationException();
                }
            } catch (Throwable th) {
                this.f44817a.unlock();
                throw th;
            }
        }
        if (sog == null) {
        }
    }

    public final boolean isCancelled() {
        this.f44817a.lock();
        try {
            return this.f44824h;
        } finally {
            this.f44817a.unlock();
        }
    }

    public final boolean isDone() {
        this.f44817a.lock();
        try {
            boolean z = false;
            if (!this.f44824h) {
                sog sog = this.f44823g;
                if (sog != null && sog.isDone()) {
                    z = true;
                }
            } else {
                z = true;
            }
            return z;
        } finally {
            this.f44817a.unlock();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sny.a(snx, boolean):void
     arg types: [snx, int]
     candidates:
      sny.a(java.util.concurrent.ScheduledFuture, bqgg):bqgi
      sny.a(long, java.util.concurrent.TimeUnit):boolean
      sny.a(java.lang.Runnable, java.lang.Object):bqgg
      bqgj.a(java.lang.Runnable, java.lang.Object):bqgg
      sny.a(snx, boolean):void */
    public void run() {
        ReentrantLock reentrantLock;
        sog sog = new sog(this.f44821e, this.f44818b);
        sog.mo741a(new snw(this), bqfb.INSTANCE);
        this.f44817a.lock();
        try {
            if (!this.f44824h) {
                synchronized (this.f44819c.f44827b) {
                    if (!Thread.interrupted()) {
                        this.f44823g = sog;
                        this.f44819c.f44826a.execute(sog);
                        this.f44819c.mo25817a(this, false);
                        this.f44820d.signalAll();
                        reentrantLock = this.f44817a;
                    } else {
                        reentrantLock = this.f44817a;
                    }
                }
            } else {
                reentrantLock = this.f44817a;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            this.f44817a.unlock();
            throw th;
        }
    }

    public final String toString() {
        return this.f44821e.toString();
    }

    /* renamed from: a */
    public final void mo741a(Runnable runnable, Executor executor) {
        this.f44822f.mo69201a(runnable, executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25802a(boolean z) {
        this.f44818b = z ? snc.m35691a("scheduled_t") : snc.m35689a();
    }

    /* JADX INFO: finally extract failed */
    public final Object get(long j, TimeUnit timeUnit) {
        sog sog;
        long nanos = timeUnit.toNanos(j);
        this.f44817a.lock();
        while (true) {
            try {
                sog = this.f44823g;
                if (sog == null && !this.f44824h && nanos > 0) {
                    nanos = this.f44820d.awaitNanos(nanos);
                }
            } catch (Throwable th) {
                this.f44817a.unlock();
                throw th;
            }
        }
        if (nanos <= 0) {
            throw new TimeoutException();
        } else if (sog != null) {
            this.f44817a.unlock();
            return sog.get(nanos, TimeUnit.NANOSECONDS);
        } else {
            throw new CancellationException();
        }
    }
}
