package p000;

/* renamed from: uqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uqc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f48510a;

    /* renamed from: b */
    final /* synthetic */ uqe f48511b;

    public uqc(uqe uqe, long j) {
        this.f48511b = uqe;
        this.f48510a = j;
    }

    public final void run() {
        umd h = this.f48511b.f48520g.mo27448h(this.f48510a);
        if (h == null) {
            uqe.f48514a.mo25377c("EventDistributor", "New persisted event is missing in the database.");
            return;
        }
        this.f48511b.mo27860a(h);
        this.f48511b.mo27856a();
    }
}
