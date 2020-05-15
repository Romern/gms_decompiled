package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: auyv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auyv implements Executor {

    /* renamed from: a */
    private final Handler f92801a = new adzt(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f92801a.post(runnable);
    }
}
