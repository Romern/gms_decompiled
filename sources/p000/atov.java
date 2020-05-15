package p000;

import java.util.concurrent.ScheduledFuture;

/* renamed from: atov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atov implements aubq {

    /* renamed from: a */
    final /* synthetic */ aucf f90617a;

    /* renamed from: b */
    final /* synthetic */ ScheduledFuture f90618b;

    public atov(aucf aucf, ScheduledFuture scheduledFuture) {
        this.f90617a = aucf;
        this.f90618b = scheduledFuture;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (aucb.mo50384b()) {
            this.f90617a.mo50393b(aucb.mo50386d());
        } else {
            this.f90617a.mo50392b(aucb.mo50387e());
        }
        this.f90618b.cancel(true);
    }
}
