package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: per */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class per extends soa {

    /* renamed from: a */
    final /* synthetic */ pes f38973a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public per(pes pes) {
        super(10);
        this.f38973a = pes;
    }

    public final void run() {
        try {
            Thread.sleep(pes.f38977d);
            synchronized (pes.class) {
                if (pes.f38974a != null) {
                    pes.f38976c.mo23861b("recovering from lame duck mode after sleep");
                    return;
                }
                pes.f38976c.mo23861b("exiting lame duck mode");
                pmh pmh = this.f38973a.f38986j;
                ScheduledFuture scheduledFuture = pmh.f39685m;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                pmh.mo23410a();
                qat qat = this.f38973a.f38981e;
                if (qat.f40830c != null && qat.f40831d) {
                    try {
                        qat.f40827a.mo23861b("Unregister wifi state receiver.");
                        qat.f40829b.unregisterReceiver(qat.f40830c);
                        qat.f40831d = false;
                    } catch (IllegalArgumentException e) {
                        qat.f40827a.mo23674b(e, "Error unregistering receiver.", new Object[0]);
                    }
                }
                this.f38973a.f38983g.mo23489b();
                pes.f38975b = null;
            }
        } catch (InterruptedException e2) {
            pes.f38976c.mo23861b("recovering from lame duck mode from sleep");
        }
    }
}
