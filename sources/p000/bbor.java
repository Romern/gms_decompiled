package p000;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bbor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbor extends bbom {

    /* renamed from: b */
    private static Reference f103028b = new WeakReference(null);

    /* renamed from: a */
    public static synchronized bbor m88286a() {
        bbor bbor;
        synchronized (bbor.class) {
            bbor = (bbor) f103028b.get();
            if (bbor == null) {
                bbor = new bbor();
                f103028b = new WeakReference(bbor);
            }
        }
        return bbor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgj mo56279a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        bqha bqha = new bqha();
        bqha.mo69261a();
        bqha.mo69262a("LIT-LimitedExecutor #%d");
        bqha.mo69263a(bbop.f103026a);
        return bqgs.m112811a((ExecutorService) new bbol(scheduledExecutorService, "LimitedThrExecutor", 0, 10, timeUnit, linkedBlockingDeque, bqha.m112820a(bqha)));
    }
}
