package p000;

/* renamed from: cfu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cfu {

    /* renamed from: a */
    public final cgf f6728a;

    /* renamed from: b */
    public final cfr f6729b;

    /* renamed from: c */
    public final cgn f6730c;

    /* renamed from: d */
    public final cfp f6731d;

    /* renamed from: e */
    public final cev f6732e;

    /* renamed from: f */
    public final chr f6733f;

    /* renamed from: g */
    private final cfs f6734g;

    public cfu(chr chr, cho cho, cid cid, cid cid2, cid cid3, cid cid4) {
        this.f6733f = chr;
        this.f6734g = new cfs(cho);
        cev cev = new cev();
        this.f6732e = cev;
        synchronized (this) {
            synchronized (cev) {
            }
        }
        this.f6728a = new cgf();
        this.f6729b = new cfr(cid, cid2, cid4, this, this);
        this.f6731d = new cfp(this.f6734g);
        this.f6730c = new cgn();
        chr.f6877a = this;
    }

    /* renamed from: a */
    public static final void m4147a(cgj cgj) {
        if (cgj instanceof cgb) {
            ((cgb) cgj).mo3846f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public final synchronized void mo3822a(cfz cfz, cdg cdg) {
        this.f6728a.mo3859a(cdg, cfz);
    }

    /* renamed from: a */
    public final synchronized void mo3823a(cfz cfz, cdg cdg, cgb cgb) {
        if (cgb != null) {
            if (cgb.f6772a) {
                this.f6732e.mo3785a(cdg, cgb);
            }
        }
        this.f6728a.mo3859a(cdg, cfz);
    }
}
