package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: auoj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auoj implements Executor {

    /* renamed from: a */
    private final Handler f92191a = new adzt(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f92191a.post(runnable);
    }
}
