package p000;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bkpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkpl implements bkpi {

    /* renamed from: a */
    private final ScheduledExecutorService f125072a;

    public bkpl(ScheduledExecutorService scheduledExecutorService) {
        this.f125072a = scheduledExecutorService;
    }

    /* renamed from: a */
    public final bkpj mo28477a(bkpn bkpn) {
        return new bkpm(bkpn, this.f125072a);
    }
}
