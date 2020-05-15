package p000;

/* renamed from: auuy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auuy implements bqfp {

    /* renamed from: a */
    final /* synthetic */ boolean f92564a;

    /* renamed from: b */
    final /* synthetic */ auva f92565b;

    public auuy(auva auva, boolean z) {
        this.f92565b = auva;
        this.f92564a = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo6480a(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            auva.f92566a.mo50711a("Failed to read shouldEnable()", new Object[0]).mo50709d();
        } else if (!this.f92564a && bool.booleanValue()) {
            auva.f92566a.mo50711a("enable onbody suggestion", new Object[0]);
            this.f92565b.mo50963a(true);
        } else if (this.f92564a && !bool.booleanValue()) {
            auva.f92566a.mo50711a("disable onbody suggestion", new Object[0]);
            this.f92565b.mo50963a(false);
        }
    }

    /* renamed from: a */
    public final void mo6481a(Throwable th) {
        auva.f92566a.mo50710a("Failed to read shouldEnable()", th, new Object[0]).mo50709d();
    }
}
