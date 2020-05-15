package p000;

/* renamed from: bryv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryv implements brxe {

    /* renamed from: a */
    private static final bnsp f143694a = bnsp.m110328a("xRPC");

    /* renamed from: b */
    private final ayte f143695b;

    /* renamed from: c */
    private chtu f143696c;

    /* renamed from: d */
    private long f143697d;

    /* renamed from: e */
    private bryr f143698e;

    public bryv(ayte ayte) {
        this.f143695b = ayte;
    }

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        this.f143696c = brxa.f143555c.f189149a;
        bryr bryr = (bryr) brxa.f143554b.mo85548a(bryr.f143673b);
        bmxy.m108587a(bryr, "%s missing from CallOptions.", bryr.f143673b);
        this.f143698e = bryr;
        this.f143697d = this.f143695b.mo54418b();
        return bryh.f143647a;
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        return bryh.f143647a;
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
        boolean z2;
        try {
            if (brwz.f143552a.mo85689a()) {
                long b = this.f143695b.mo54418b() - this.f143697d;
                boolean z3 = true;
                if (!this.f143696c.equals(chtu.UNARY)) {
                    bryr bryr = this.f143698e;
                    if (b >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmxy.m108589a(z, "Cannot record negative stream duration.");
                    if (bryr.f143683l.getAndSet(b) != -1) {
                        z3 = false;
                    }
                    bmxy.m108601b(z3, "Already recorded stream duration.");
                } else if (b > 2147483647L) {
                    bnsl bnsl = (bnsl) f143694a.mo68387b();
                    bnsl.mo68432a("bryv", "a", 50, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                } else {
                    bryr bryr2 = this.f143698e;
                    int i = (int) b;
                    if (i >= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    bmxy.m108589a(z2, "Cannot record negative latency.");
                    if (bryr2.f143680i.getAndSet(i) != -1) {
                        z3 = false;
                    }
                    bmxy.m108601b(z3, "Already recorded latency.");
                }
            }
            this.f143698e.f143677f.incrementAndGet();
        } catch (Throwable th) {
            bnsl bnsl2 = (bnsl) f143694a.mo68387b();
            bnsl2.mo68437a(th);
            bnsl2.mo68432a("bryv", "a", 60, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Failed to record network latency");
        }
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
