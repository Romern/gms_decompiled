package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: aps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aps implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f1949a;

    public aps(Handler handler) {
        this.f1949a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f1949a.post(runnable);
    }
}
