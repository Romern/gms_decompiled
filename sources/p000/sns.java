package p000;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: sns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sns extends HandlerThread implements RejectedExecutionHandler {

    /* renamed from: a */
    public final soc f44811a;

    /* renamed from: b */
    private boolean f44812b = false;

    public sns(int i) {
        super("PooledHandlerThread", i);
        soc soc = new soc(1, i);
        this.f44811a = soc;
        soc.setRejectedExecutionHandler(this);
    }

    public final Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    public final boolean quit() {
        this.f44811a.shutdownNow();
        return this.f44812b;
    }

    public final boolean quitSafely() {
        this.f44811a.shutdown();
        return this.f44812b;
    }

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
    }

    public final synchronized void start() {
        this.f44812b = true;
    }

    public sns(String str, int i) {
        super(str, i);
        snm snm = new snm(str, i);
        this.f44811a = snm;
        snm.setRejectedExecutionHandler(this);
    }
}
