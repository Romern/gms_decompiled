package p000;

/* renamed from: dwb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dwb implements dvw {

    /* renamed from: a */
    private final dsd f14249a;

    /* renamed from: b */
    private final dwc f14250b;

    /* renamed from: c */
    private final boolean f14251c;

    public dwb() {
        boolean O = cdgp.f180782a.mo6606a().mo77523O();
        this.f14251c = O;
        if (!O) {
            this.f14250b = new dwc();
            this.f14249a = null;
            return;
        }
        this.f14249a = new dsd();
        this.f14250b = null;
    }

    /* renamed from: a */
    public final void mo9389a(doh doh, bxco bxco) {
    }

    /* renamed from: b */
    public final void mo9394b(doh doh, bxco bxco) {
    }

    /* renamed from: a */
    public final void mo9390a(doh doh, dwa dwa) {
        if (this.f14251c) {
            this.f14249a.mo9528a(dwa);
        } else {
            this.f14250b.mo9763a(dwa);
        }
    }

    /* renamed from: a */
    public final void mo9391a(doh doh, dwa dwa, dwa dwa2) {
        if (this.f14251c) {
            dsd dsd = this.f14249a;
            new Object[1][0] = dwa;
            if (dwa.m9591b(dwa)) {
                dsd.f13926c.add(dwa);
                dsd.mo9516a(dqy.m9123a("ExpirationOperation"));
            }
            if (dwa2 != null) {
                this.f14249a.mo9528a(dwa2);
                return;
            }
            return;
        }
        dwc dwc = this.f14250b;
        new Object[1][0] = dwa;
        if (dwa.m9591b(dwa)) {
            new Object[1][0] = dwa;
            dwc.f14252c.add(dwa);
            dwc.mo9516a(dqy.m9123a("InterestRecordExpirationOperation"));
        }
        if (dwa2 != null) {
            this.f14250b.mo9763a(dwa2);
        }
    }
}
