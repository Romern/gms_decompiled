package p000;

/* renamed from: bryp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryp implements brxe {

    /* renamed from: a */
    private static final bnsp f143667a = bnsp.m110328a("xRPC");

    /* renamed from: b */
    private bryr f143668b;

    /* renamed from: c */
    private chtu f143669c;

    /* renamed from: d */
    private final bryq f143670d;

    public bryp(bmzi bmzi, bruq bruq) {
        this.f143670d = new bryq(bmzi, bruq);
    }

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        boolean z;
        this.f143669c = brxa.f143555c.f189149a;
        chqo chqo = brxa.f143554b;
        boolean z2 = true;
        if (chqo.mo85548a(bryr.f143673b) == null) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108596a(z, "Unexpected option %s already set.", bryr.f143673b);
        if (chqo.mo85548a(bryo.f143666a) != null) {
            z2 = false;
        }
        bmxy.m108596a(z2, "Unexpected option %s already set.", bryo.f143666a);
        this.f143668b = new bryr((brum) chqo.mo85548a(brum.f143417a));
        return bryh.m114873a(chqo.mo85545a(bryr.f143673b, this.f143668b).mo85545a(bryo.f143666a, this.f143668b));
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        if (this.f143669c.equals(chtu.CLIENT_STREAMING) || this.f143669c.equals(chtu.BIDI_STREAMING)) {
            this.f143668b.f143679h.incrementAndGet();
        }
        return bryh.f143647a;
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        if (this.f143669c.equals(chtu.SERVER_STREAMING) || this.f143669c.equals(chtu.BIDI_STREAMING)) {
            this.f143668b.f143678g.incrementAndGet();
        }
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        boolean z;
        try {
            bryr bryr = this.f143668b;
            if (bryr.f143684m.getAndSet(brwz.f143552a.f189233s) == null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108601b(z, "Already recorded result.");
            bryq bryq = this.f143670d;
            bryr bryr2 = this.f143668b;
            if (((Boolean) bryq.f143671a.mo6606a()).booleanValue() && bryr2.f143676e.get()) {
                bdgs a = bdgs.m90764a();
                bdnd bdnd = new bdnd(bdgg.m90735a(bryr2.f143674c.mo69982a()), true);
                boolean z2 = bryr2.f143675d.get();
                bmxy.m108588a(true);
                bmxy.m108588a(true);
                bdnd.f106045q = 1;
                bdnd.f106046r = z2 ? 1 : 0;
                a.mo58026a(bdnd);
            }
            if (bryq.f143672b == null) {
                return bryi.f143654a;
            }
            throw null;
        } catch (Throwable th) {
            bnsl bnsl = (bnsl) f143667a.mo68387b();
            bnsl.mo68437a(th);
            bnsl.mo68432a("bryp", "a", 75, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to record RPC metrics");
        }
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
