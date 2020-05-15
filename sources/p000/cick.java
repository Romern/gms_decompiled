package p000;

/* renamed from: cick */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cick extends chsn {

    /* renamed from: a */
    public chwx f189770a;

    /* renamed from: b */
    final /* synthetic */ cicv f189771b;

    public cick(cicv cicv) {
        this.f189771b = cicv;
    }

    /* renamed from: a */
    public final chqq mo85598a() {
        return this.f189771b.f189807E;
    }

    /* renamed from: a */
    public final void mo85599a(chrg chrg, chst chst) {
        bmxy.m108582a(chrg, "newState");
        bmxy.m108582a(chst, "newPicker");
        this.f189771b.mo85954a("updateBalancingState()");
        this.f189771b.f189837l.execute(new cicj(this, chst, chrg));
    }
}
