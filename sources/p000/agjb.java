package p000;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: agjb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agjb extends agjv {

    /* renamed from: f */
    public static final AtomicLong f65664f = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a */
    public agja f65665a;

    /* renamed from: b */
    public agja f65666b;

    /* renamed from: c */
    public final Object f65667c = new Object();

    /* renamed from: d */
    public final Semaphore f65668d = new Semaphore(2);

    /* renamed from: e */
    public volatile boolean f65669e;

    /* renamed from: g */
    private final PriorityBlockingQueue f65670g = new PriorityBlockingQueue();

    /* renamed from: h */
    private final BlockingQueue f65671h = new LinkedBlockingQueue();

    /* renamed from: i */
    private final Thread.UncaughtExceptionHandler f65672i = new agiy(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: j */
    private final Thread.UncaughtExceptionHandler f65673j = new agiy(this, "Thread death: Uncaught exception on network thread");

    public agjb(agje agje) {
        super(agje);
    }

    /* renamed from: a */
    public final Future mo35490a(Callable callable) {
        mo35544k();
        sdo.m34959a(callable);
        agiz agiz = new agiz(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f65665a) {
            if (!this.f65670g.isEmpty()) {
                mo35497E().f65567f.mo35435a("Callable skipped the worker queue.");
            }
            agiz.run();
        } else {
            mo35491a(agiz);
        }
        return agiz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35371a() {
        return false;
    }

    /* renamed from: b */
    public final void mo35494b(Runnable runnable) {
        mo35544k();
        sdo.m34959a(runnable);
        agiz agiz = new agiz(this, runnable, "Task exception on network thread");
        synchronized (this.f65667c) {
            this.f65671h.add(agiz);
            agja agja = this.f65666b;
            if (agja == null) {
                agja agja2 = new agja(this, "Measurement Network", this.f65671h);
                this.f65666b = agja2;
                agja2.setUncaughtExceptionHandler(this.f65673j);
                this.f65666b.start();
            } else {
                agja.mo35488a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo35495c() {
        return Thread.currentThread() == this.f65665a;
    }

    /* renamed from: h */
    public final void mo35241h() {
        if (Thread.currentThread() != this.f65665a) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final void mo35491a(agiz agiz) {
        synchronized (this.f65667c) {
            this.f65670g.add(agiz);
            agja agja = this.f65665a;
            if (agja == null) {
                agja agja2 = new agja(this, "Measurement Worker", this.f65670g);
                this.f65665a = agja2;
                agja2.setUncaughtExceptionHandler(this.f65672i);
                this.f65665a.start();
            } else {
                agja.mo35488a();
            }
        }
    }

    /* renamed from: a */
    public final void mo35492a(Runnable runnable) {
        mo35544k();
        sdo.m34959a(runnable);
        mo35491a(new agiz(this, runnable, "Task exception on worker thread"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35493a(AtomicReference atomicReference, String str, Runnable runnable) {
        synchronized (atomicReference) {
            mo35498F().mo35492a(runnable);
            try {
                atomicReference.wait(5000);
            } catch (InterruptedException e) {
                mo35497E().f65567f.mo35435a(str.length() == 0 ? new String("Interrupted waiting for ") : "Interrupted waiting for ".concat(str));
                return;
            }
        }
        if (atomicReference.get() == null) {
            mo35497E().f65567f.mo35435a(str.length() == 0 ? new String("Timed out waiting for ") : "Timed out waiting for ".concat(str));
        }
    }
}
