package p000;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: biak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biak {

    /* renamed from: a */
    public final Handler f120051a;

    /* renamed from: b */
    public final ExecutorService f120052b;

    public biak(Handler handler, ExecutorService executorService) {
        this.f120051a = handler;
        this.f120052b = executorService;
    }

    /* renamed from: a */
    public final void mo64490a(Callable callable, bial bial) {
        this.f120052b.execute(new biaj(this, callable, bial));
    }
}
