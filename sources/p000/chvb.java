package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: chvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class chvb {

    /* renamed from: a */
    private final chva f189247a;

    /* renamed from: b */
    private final ScheduledFuture f189248b;

    public chvb(chva chva, ScheduledFuture scheduledFuture) {
        bmxy.m108582a(chva, "runnable");
        this.f189247a = chva;
        bmxy.m108582a(scheduledFuture, "future");
        this.f189248b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo85700a() {
        this.f189247a.f189245b = true;
        this.f189248b.cancel(false);
    }

    /* renamed from: b */
    public final boolean mo85701b() {
        chva chva = this.f189247a;
        return !chva.f189246c && !chva.f189245b;
    }
}
