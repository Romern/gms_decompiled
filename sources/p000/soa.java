package p000;

import com.google.android.gms.common.threads.internal.GlobalExecutorsImpl;
import java.lang.Thread;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: soa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class soa extends Thread {

    /* renamed from: a */
    private final ThreadPoolExecutor f44833a;

    /* renamed from: b */
    private final Runnable f44834b;

    /* renamed from: c */
    private boolean f44835c;

    /* renamed from: e */
    public volatile Thread f44836e;

    /* renamed from: f */
    public boolean f44837f;

    /* renamed from: g */
    public bliy f44838g;

    public soa(int i) {
        this(i, null);
    }

    public final long getId() {
        throw new UnsupportedOperationException();
    }

    public final StackTraceElement[] getStackTrace() {
        try {
            return this.f44836e.getStackTrace();
        } catch (NullPointerException e) {
            return new StackTraceElement[0];
        }
    }

    public final Thread.State getState() {
        try {
            return this.f44836e.getState();
        } catch (NullPointerException e) {
            if (!this.f44835c) {
                return Thread.State.NEW;
            }
            if (!this.f44837f) {
                return Thread.State.RUNNABLE;
            }
            return Thread.State.TERMINATED;
        }
    }

    public final Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        throw new UnsupportedOperationException();
    }

    public final void interrupt() {
        try {
            this.f44836e.interrupt();
        } catch (NullPointerException e) {
        }
    }

    public final boolean isInterrupted() {
        try {
            return this.f44836e.isInterrupted();
        } catch (NullPointerException e) {
            return false;
        }
    }

    public final void setContextClassLoader(ClassLoader classLoader) {
        throw new UnsupportedOperationException();
    }

    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        throw new UnsupportedOperationException();
    }

    public final synchronized void start() {
        if (!this.f44835c) {
            this.f44838g = snc.m35689a();
            this.f44833a.execute(new snz(this));
            this.f44835c = true;
        } else {
            throw new IllegalThreadStateException("Thread already started");
        }
    }

    public final String toString() {
        Runnable runnable = this.f44834b;
        if (runnable != null) {
            return runnable.toString();
        }
        return super.toString();
    }

    public soa(int i, Runnable runnable) {
        super(runnable);
        this.f44835c = false;
        this.f44836e = null;
        this.f44837f = false;
        this.f44833a = GlobalExecutorsImpl.getPool(i);
        this.f44834b = runnable;
        if (!snd.f44791a.f44793c) {
            setPriority(i);
        }
    }
}
