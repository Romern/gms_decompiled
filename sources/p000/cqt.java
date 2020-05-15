package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: cqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cqt implements Executor {

    /* renamed from: a */
    private final Handler f11863a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f11863a.post(runnable);
    }
}
