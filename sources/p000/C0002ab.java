package p000;

/* renamed from: ab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0002ab implements C0011ai {

    /* renamed from: a */
    private final C0001aa f91a;

    /* renamed from: b */
    private final C0011ai f92b;

    public C0002ab(C0001aa aaVar, C0011ai aiVar) {
        this.f91a = aaVar;
        this.f92b = aiVar;
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        C0005ad adVar2 = C0005ad.ON_CREATE;
        switch (adVar.ordinal()) {
            case 0:
                this.f91a.mo2a();
                break;
            case 1:
                this.f91a.mo6d();
                break;
            case 2:
                this.f91a.mo5c();
                break;
            case 3:
                this.f91a.mo4b();
                break;
            case 4:
                this.f91a.mo7e();
                break;
            case 5:
                this.f91a.mo3a(akVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0011ai aiVar = this.f92b;
        if (aiVar != null) {
            aiVar.mo136a(akVar, adVar);
        }
    }
}
