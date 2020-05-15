package p000;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* renamed from: fje */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fje {

    /* renamed from: a */
    public static volatile fje f16706a;

    /* renamed from: b */
    public final Context f16707b;

    /* renamed from: c */
    public final List f16708c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final fjb f16709d = new fjb(this);

    /* renamed from: e */
    public volatile fjl f16710e;

    /* renamed from: f */
    public Thread.UncaughtExceptionHandler f16711f;

    public fje(Context context) {
        Context applicationContext = context.getApplicationContext();
        sdo.m34959a(applicationContext);
        this.f16707b = applicationContext;
        new fiu();
    }

    /* renamed from: a */
    public static void m11804a() {
        if (!(Thread.currentThread() instanceof fjd)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public final Future mo10885a(Callable callable) {
        sdo.m34959a(callable);
        if (!(Thread.currentThread() instanceof fjd)) {
            return this.f16709d.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: a */
    public final void mo10886a(Runnable runnable) {
        sdo.m34959a(runnable);
        this.f16709d.submit(runnable);
    }
}
