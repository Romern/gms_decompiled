package p000;

import com.google.android.gms.contextmanager.ContextData;

/* renamed from: dsv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class dsv extends drx {

    /* renamed from: c */
    private final ContextData f13965c;

    /* renamed from: d */
    private final doh f13966d;

    /* renamed from: e */
    private final bnot f13967e;

    public dsv(ContextData contextData, doh doh, bnot bnot) {
        super("ControllerOperation");
        this.f13965c = contextData;
        this.f13966d = doh;
        this.f13967e = bnot;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9410a() {
        for (drb drb : this.f13967e.mo67316o()) {
            if (drb.mo9471a().equals(this.f13966d)) {
                if (!drb.mo9474b()) {
                    new Object[1][0] = drb;
                    dwq.m9674r().mo9722a(this.f13966d, drb);
                } else if (egb.m10348a(this.f13965c, this.f13967e.mo67361a(drb))) {
                    drb.mo9472a(this.f13966d, this.f13965c);
                    if (!drb.mo9474b()) {
                        new Object[1][0] = drb;
                        dwq.m9674r().mo9722a(this.f13966d, drb);
                    }
                }
            }
        }
    }
}
