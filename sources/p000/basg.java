package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: basg */
final /* synthetic */ class basg implements Executor {

    /* renamed from: a */
    private final Handler f101658a;

    public basg(Handler handler) {
        this.f101658a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f101658a.post(runnable);
    }
}
