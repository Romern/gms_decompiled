package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: bicv */
public final /* synthetic */ class bicv implements Executor {

    /* renamed from: a */
    private final Handler f120251a;

    public bicv(Handler handler) {
        this.f120251a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f120251a.post(runnable);
    }
}
