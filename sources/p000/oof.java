package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: oof */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oof implements Executor {

    /* renamed from: a */
    private final Handler f38063a;

    public oof(Handler handler) {
        this.f38063a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f38063a.post(runnable);
    }
}
