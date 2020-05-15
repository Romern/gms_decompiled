package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: afkx */
public final /* synthetic */ class afkx implements Executor {

    /* renamed from: a */
    private final Handler f64317a;

    public afkx(Handler handler) {
        this.f64317a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f64317a.post(runnable);
    }
}
