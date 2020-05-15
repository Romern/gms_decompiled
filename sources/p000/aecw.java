package p000;

/* renamed from: aecw */
final /* synthetic */ class aecw implements bmxj {

    /* renamed from: a */
    private final aedj f63176a;

    /* renamed from: b */
    private final bbnm f63177b;

    /* renamed from: c */
    private final Exception f63178c;

    /* renamed from: d */
    private final int f63179d;

    public aecw(aedj aedj, bbnm bbnm, Exception exc, int i) {
        this.f63176a = aedj;
        this.f63177b = bbnm;
        this.f63178c = exc;
        this.f63179d = i;
    }

    public final Object apply(Object obj) {
        int i;
        bxvp bxvp;
        aedj aedj = this.f63176a;
        bbnm bbnm = this.f63177b;
        Exception exc = this.f63178c;
        int i2 = this.f63179d;
        Void voidR = (Void) obj;
        if (aedj.f63210c != null) {
            bbnq e = bbnm.mo56233e();
            if (!(exc instanceof bbjk)) {
                i = !(exc instanceof bbjh) ? 5 : 4;
            } else {
                i = 3;
            }
            if (aeev.m51767d()) {
                bbiw bbiw = aedj.f63210c;
                if (aeev.m51770g()) {
                    bxvp = aedj.f63208a;
                } else {
                    bxvp = null;
                }
                bbiw.mo56159a(e, i, i2, bxvp, aeew.m51775a(exc), false);
            } else {
                aedj.f63210c.mo56160a(e, i, aeew.m51775a(exc));
            }
        }
        return null;
    }
}
