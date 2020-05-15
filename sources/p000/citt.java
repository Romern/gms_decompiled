package p000;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: citt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class citt implements Executor {

    /* renamed from: a */
    private final BlockingQueue f191452a = new LinkedBlockingQueue();

    /* renamed from: b */
    private boolean f191453b;

    /* renamed from: c */
    private boolean f191454c;

    /* renamed from: d */
    private InterruptedIOException f191455d;

    /* renamed from: e */
    private RuntimeException f191456e;

    /* renamed from: a */
    private final Runnable m151005a(boolean z, long j) {
        Runnable runnable;
        if (z) {
            try {
                runnable = (Runnable) this.f191452a.poll(j, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } else {
            runnable = (Runnable) this.f191452a.take();
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }

    /* renamed from: b */
    public final void mo86559b() {
        this.f191453b = false;
    }

    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f191452a.put(runnable);
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo86557a() {
        mo86558a(0);
    }

    /* renamed from: a */
    public final void mo86558a(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
        if (this.f191454c) {
            InterruptedIOException interruptedIOException = this.f191455d;
            if (interruptedIOException == null) {
                throw this.f191456e;
            }
            throw interruptedIOException;
        } else if (!this.f191453b) {
            this.f191453b = true;
            while (this.f191453b) {
                if (i != 0) {
                    try {
                        m151005a(true, (convert - System.nanoTime()) + nanoTime).run();
                    } catch (InterruptedIOException e) {
                        this.f191453b = false;
                        this.f191454c = true;
                        this.f191455d = e;
                        throw e;
                    } catch (RuntimeException e2) {
                        this.f191453b = false;
                        this.f191454c = true;
                        this.f191456e = e2;
                        throw e2;
                    }
                } else {
                    m151005a(false, 0).run();
                }
            }
        } else {
            throw new IllegalStateException("Cannot run loop when it is already running.");
        }
    }
}
