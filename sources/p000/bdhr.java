package p000;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: bdhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdhr implements cayy {

    /* renamed from: a */
    private final cijl f105670a;

    public bdhr(cijl cijl) {
        this.f105670a = cijl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        bdic bdic = (bdic) this.f105670a.mo6445a();
        bqgk a = bdic.mo57982a();
        if (a == null) {
            int e = bdic.mo57986e();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(e, new bdho("Primes", bdic.mo57986e()), new bdhm());
            scheduledThreadPoolExecutor.setMaximumPoolSize(e);
            a = bqgs.m112812a((ScheduledExecutorService) scheduledThreadPoolExecutor);
        }
        bdhx bdhx = new bdhx(a, bdhl.f105662a);
        cazf.m127593a(bdhx, "Cannot return null from a non-@Nullable @Provides method");
        return bdhx;
    }
}
