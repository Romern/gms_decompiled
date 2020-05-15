package p000;

/* renamed from: aabu */
final /* synthetic */ class aabu implements blji {

    /* renamed from: a */
    private final aabx f27897a;

    /* renamed from: b */
    private final long f27898b;

    /* renamed from: c */
    private final bljb f27899c;

    public aabu(aabx aabx, long j, bljb bljb) {
        this.f27897a = aabx;
        this.f27898b = j;
        this.f27899c = bljb;
    }

    public final void close() {
        aabx aabx = this.f27897a;
        long j = this.f27898b;
        bljb bljb = this.f27899c;
        try {
            aabx.mo16705a(j);
        } finally {
            bljb.close();
        }
    }
}
