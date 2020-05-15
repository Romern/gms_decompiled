package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: sty */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sty implements Executor {

    /* renamed from: a */
    private final Handler f45156a;

    public sty(Handler handler) {
        this(handler.getLooper());
    }

    public final void execute(Runnable runnable) {
        this.f45156a.post(runnable);
    }

    public sty(Looper looper) {
        this.f45156a = new adzt(looper);
    }
}
