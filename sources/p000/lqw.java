package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: lqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lqw implements Executor {

    /* renamed from: a */
    public final Handler f26615a;

    public lqw(Handler handler) {
        this.f26615a = handler;
    }

    public final void execute(Runnable runnable) {
        if (this.f26615a.getLooper().isCurrentThread()) {
            runnable.run();
        } else {
            this.f26615a.post(runnable);
        }
    }
}
