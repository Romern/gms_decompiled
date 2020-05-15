package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: rrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rrb implements aubq {

    /* renamed from: a */
    final /* synthetic */ aucf f43539a;

    /* renamed from: b */
    final /* synthetic */ ScheduledFuture f43540b;

    public rrb(aucf aucf, ScheduledFuture scheduledFuture) {
        this.f43539a = aucf;
        this.f43540b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f43539a.mo50393b(aucb.mo50386d());
        } else {
            this.f43539a.mo50392b(aucb.mo50387e());
        }
        this.f43540b.cancel(true);
    }
}
