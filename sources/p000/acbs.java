package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: acbs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acbs implements Executor {

    /* renamed from: a */
    final /* synthetic */ bqgj f59451a;

    public acbs(bqgj bqgj) {
        this.f59451a = bqgj;
    }

    /* renamed from: a */
    public final bqgg mo32622a(Callable callable) {
        return this.f59451a.mo25819b(callable);
    }

    public final void execute(Runnable runnable) {
        this.f59451a.execute(runnable);
    }
}
