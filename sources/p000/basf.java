package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: basf */
final /* synthetic */ class basf implements Executor {

    /* renamed from: a */
    private final Handler f101657a;

    public basf(Handler handler) {
        this.f101657a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f101657a.post(runnable);
    }
}
