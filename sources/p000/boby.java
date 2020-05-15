package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: boby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class boby implements Executor {

    /* renamed from: a */
    final /* synthetic */ Executor f132521a;

    /* renamed from: b */
    final /* synthetic */ bocg f132522b;

    public boby(bocg bocg, Executor executor) {
        this.f132522b = bocg;
        this.f132521a = executor;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f132521a.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f132522b.mo69136a((Throwable) e);
        }
    }
}
