package p000;

/* renamed from: smy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class smy extends aeah {

    /* renamed from: a */
    private final rvq f44786a;

    public smy() {
        this(new rvq());
    }

    /* renamed from: a */
    public final int mo6269a(aecc aecc) {
        if (!cdme.m134019e() || !mo17913b()) {
            return 0;
        }
        rvq rvq = this.f44786a;
        bpun bpun = bpun.SCHEDULED_IDLE;
        if (!cdme.m134019e()) {
            return 0;
        }
        if (!cdkp.m133841h()) {
            rvb.m34509a();
        }
        rvk c = rvl.m34524c();
        c.f43750b = this;
        c.f43749a = bpun;
        rvq.mo25210b(c.mo25198a());
        return 0;
    }

    /* renamed from: b */
    public abstract boolean mo17913b();

    public smy(rvq rvq) {
        this.f44786a = rvq;
    }
}
