package p000;

/* renamed from: aecx */
final /* synthetic */ class aecx implements bmxj {

    /* renamed from: a */
    private final aedj f63180a;

    /* renamed from: b */
    private final bbjq f63181b;

    /* renamed from: c */
    private final bbnm f63182c;

    /* renamed from: d */
    private final int f63183d;

    public aecx(aedj aedj, bbjq bbjq, bbnm bbnm, int i) {
        this.f63180a = aedj;
        this.f63181b = bbjq;
        this.f63182c = bbnm;
        this.f63183d = i;
    }

    public final Object apply(Object obj) {
        int i;
        bxvp bxvp;
        aedj aedj = this.f63180a;
        bbjq bbjq = this.f63181b;
        bbnm bbnm = this.f63182c;
        int i2 = this.f63183d;
        Void voidR = (Void) obj;
        if (aedj.f63210c != null) {
            if (!bbjq.f102774b) {
                i = 2;
            } else {
                i = 6;
            }
            if (aeev.m51767d()) {
                bbiw bbiw = aedj.f63210c;
                bbnq e = bbnm.mo56233e();
                if (aeev.m51770g()) {
                    bxvp = aedj.f63208a;
                } else {
                    bxvp = null;
                }
                bbiw.mo56159a(e, i, i2, bxvp, bbix.m88067a(bylb.SUCCESS), bbjq.f102775c);
            } else {
                aedj.f63210c.mo56160a(bbnm.mo56233e(), i, bbix.m88067a(bylb.SUCCESS));
            }
        }
        return null;
    }
}
