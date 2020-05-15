package p000;

/* renamed from: dqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dqf implements Runnable {

    /* renamed from: a */
    private final Runnable f13812a;

    /* renamed from: b */
    private final dqx f13813b;

    public dqf(Runnable runnable, dqx dqx) {
        sdo.m34959a(runnable);
        this.f13812a = runnable;
        sdo.m34959a(dqx);
        this.f13813b = dqx;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dqf) {
            return this.f13812a.equals(((dqf) obj).f13812a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13812a.hashCode();
    }

    public final void run() {
        this.f13813b.mo9463b();
        try {
            this.f13812a.run();
            this.f13813b.mo9464c();
            egr D = dwq.m9647D();
            if (D != null) {
                D.mo10109c(this.f13813b);
            }
        } catch (Throwable th) {
            this.f13813b.mo9464c();
            egr D2 = dwq.m9647D();
            if (D2 != null) {
                D2.mo10109c(this.f13813b);
            }
            throw th;
        }
    }
}
