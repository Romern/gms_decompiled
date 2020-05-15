package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: afkw */
public final /* synthetic */ class afkw implements Executor {

    /* renamed from: a */
    private final Handler f64316a;

    public afkw(Handler handler) {
        this.f64316a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f64316a.post(runnable);
    }
}
