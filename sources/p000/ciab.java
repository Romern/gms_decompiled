package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ciab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ciab implements ciew {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo85859a() {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, ciag.m149918c("grpc-timer-%d"));
        try {
            newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, true);
        } catch (NoSuchMethodException e) {
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
        return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo85860a(Object obj) {
        ((ScheduledExecutorService) obj).shutdown();
    }
}
