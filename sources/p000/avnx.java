package p000;

/* renamed from: avnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnx extends avnv {
    public avnx() {
        super("exponential-backoff-delay-execution");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51445a() {
        super.mo51445a();
        sdo.m34975b(this.f93564a.mo51596a(avny.f93574i), "The initial delay needs to be set.");
        sdo.m34975b(this.f93564a.mo51596a(avny.f93573h), "The retry count needs to be set.");
    }

    /* renamed from: a */
    public final void mo51449a(double d) {
        this.f93564a.mo51594a(avny.f93576k, Double.valueOf(d));
    }

    /* renamed from: a */
    public final void mo51450a(int i) {
        this.f93564a.mo51594a(avny.f93573h, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo51451a(long j, long j2) {
        this.f93564a.mo51594a(avny.f93574i, Long.valueOf(j));
        this.f93564a.mo51594a(avny.f93575j, Long.valueOf(j2));
    }
}
