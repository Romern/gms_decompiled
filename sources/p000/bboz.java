package p000;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bboz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bboz extends bbom {

    /* renamed from: b */
    private static Reference f103031b = new WeakReference(null);

    /* renamed from: a */
    public static synchronized bboz m88304a() {
        bboz bboz;
        synchronized (bboz.class) {
            bboz = (bboz) f103031b.get();
            if (bboz == null) {
                bboz = new bboz();
                f103031b = new WeakReference(bboz);
            }
        }
        return bboz;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgj mo56279a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        bqha bqha = new bqha();
        bqha.mo69261a();
        bqha.mo69262a("LIT-UnlimitedExecutor #%d");
        bqha.mo69263a(bbox.f103029a);
        bbol bbol = new bbol(scheduledExecutorService, "UnlimitedThrExecutor", 50, 50, timeUnit, linkedBlockingDeque, bqha.m112820a(bqha));
        bbol.allowCoreThreadTimeOut(true);
        return bqgs.m112811a((ExecutorService) bbol);
    }
}
