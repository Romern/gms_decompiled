package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: lpa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class lpa implements Executor {

    /* renamed from: a */
    private final adzt f26524a = new adzt(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f26524a.post(runnable);
    }
}
