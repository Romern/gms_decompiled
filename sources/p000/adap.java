package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: adap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adap implements Executor {

    /* renamed from: a */
    private final Handler f61218a;

    public adap(Handler handler) {
        this.f61218a = handler;
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f61218a.post(runnable);
        }
    }
}
