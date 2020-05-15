package p000;

/* renamed from: agq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agq implements C0011ai, agj {

    /* renamed from: a */
    final /* synthetic */ ags f517a;

    /* renamed from: b */
    private final C0008af f518b;

    /* renamed from: c */
    private final agp f519c;

    /* renamed from: d */
    private agj f520d;

    public agq(ags ags, C0008af afVar, agp agp) {
        this.f517a = ags;
        this.f518b = afVar;
        this.f519c = agp;
        afVar.mo557a(this);
    }

    /* renamed from: a */
    public final void mo668a() {
        this.f518b.mo558b(this);
        this.f519c.mo685b(this);
        agj agj = this.f520d;
        if (agj != null) {
            agj.mo668a();
            this.f520d = null;
        }
    }

    /* renamed from: a */
    public final void mo136a(C0013ak akVar, C0005ad adVar) {
        if (adVar == C0005ad.ON_START) {
            ags ags = this.f517a;
            agp agp = this.f519c;
            ags.f523a.add(agp);
            agr agr = new agr(ags, agp);
            agp.mo684a(agr);
            this.f520d = agr;
        } else if (adVar == C0005ad.ON_STOP) {
            agj agj = this.f520d;
            if (agj != null) {
                agj.mo668a();
            }
        } else if (adVar == C0005ad.ON_DESTROY) {
            mo668a();
        }
    }
}
