package p000;

/* renamed from: ar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0032ar extends C0033as implements C0011ai {

    /* renamed from: a */
    final C0013ak f2044a;

    /* renamed from: b */
    final /* synthetic */ C0034at f2045b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0032ar(C0034at atVar, C0013ak akVar, C0038ax axVar) {
        super(atVar, axVar);
        this.f2045b = atVar;
        this.f2044a = akVar;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        if (this.f2044a.getLifecycle().mo556a() == C0007ae.DESTROYED) {
            this.f2045b.mo2449b(this.f2101c);
        } else {
            mo2370a(mo2290a());
        }
    }

    /* renamed from: a */
    public final boolean mo2309a(C0013ak akVar) {
        return this.f2044a == akVar;
    }

    /* renamed from: b */
    public final void mo2310b() {
        this.f2044a.getLifecycle().mo558b(this);
    }

    /* renamed from: a */
    public final boolean mo2290a() {
        return this.f2044a.getLifecycle().mo556a().mo482a(C0007ae.STARTED);
    }
}
