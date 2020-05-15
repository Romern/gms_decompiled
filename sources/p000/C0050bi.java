package p000;

/* renamed from: bi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0050bi implements C0038ax {

    /* renamed from: a */
    C0034at f3267a;

    /* renamed from: b */
    final /* synthetic */ C1234o f3268b;

    /* renamed from: c */
    final /* synthetic */ C0036av f3269c;

    public C0050bi(C1234o oVar, C0036av avVar) {
        this.f3268b = oVar;
        this.f3269c = avVar;
    }

    /* renamed from: a */
    public final void mo2511a(Object obj) {
        C0034at atVar = (C0034at) this.f3268b.mo10678a(obj);
        C0034at atVar2 = this.f3267a;
        if (atVar2 != atVar) {
            if (atVar2 != null) {
                this.f3269c.mo2666a(atVar2);
            }
            this.f3267a = atVar;
            if (atVar != null) {
                this.f3269c.mo2667a(atVar, new C0049bh(this));
            }
        }
    }
}
