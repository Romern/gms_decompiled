package p000;

/* renamed from: hlu */
final /* synthetic */ class hlu implements bqeh {

    /* renamed from: a */
    private final hmc f19994a;

    /* renamed from: b */
    private final acyr f19995b;

    /* renamed from: c */
    private final qqa f19996c;

    public hlu(hmc hmc, acyr acyr, qqa qqa) {
        this.f19994a = hmc;
        this.f19995b = acyr;
        this.f19996c = qqa;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: hmu.a(java.lang.String, boolean):quo
     arg types: [java.lang.String, int]
     candidates:
      hmu.a(quo, boolean):boolean
      hmu.a(java.lang.String, boolean):quo */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hmc hmc = this.f19994a;
        acyr acyr = this.f19995b;
        qqa qqa = this.f19996c;
        if (!((Boolean) obj).booleanValue()) {
            return bqga.m112775a((Object) null);
        }
        return bqga.m112786c(hmc.mo12616a(acyr, hmu.m14620a("credentials_enable_sync", true)), adbb.m50100a(qqa.mo24199a(hmc.f20016b))).mo69216a(bqel.m112709a(), bqfb.INSTANCE);
    }
}
