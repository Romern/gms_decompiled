package p000;

/* renamed from: hjv */
final /* synthetic */ class hjv implements bqeh {

    /* renamed from: a */
    private final hkh f19919a;

    /* renamed from: b */
    private final hez f19920b;

    public hjv(hkh hkh, hez hez) {
        this.f19919a = hkh;
        this.f19920b = hez;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hkh hkh = this.f19919a;
        hez hez = this.f19920b;
        hkg hkg = (hkg) obj;
        hkh.f19936a.mo25412b("Cache miss! Fetching credentials...", new Object[0]);
        bqgg a = new how(hkh.f19938b, hkh.f19939c).mo12291a(hez);
        bqgg a2 = bqdx.m112674a(a, new hjx(hkh, hez), bqfb.INSTANCE);
        bqgg a3 = bqdx.m112674a(a, new hkb(hkh, hez), bqfb.INSTANCE);
        return bqdx.m112674a(bqdx.m112673a(bqga.m112786c(a2, a3).mo69216a(new hjy(a2, a3), bqfb.INSTANCE), new hjz(hkh), bqfb.INSTANCE), hka.f19927a, bqfb.INSTANCE);
    }
}
