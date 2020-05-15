package p000;

/* renamed from: mkg */
final /* synthetic */ class mkg implements Runnable {

    /* renamed from: a */
    private final mkh f33880a;

    /* renamed from: b */
    private final bxvd f33881b;

    public mkg(mkh mkh, bxvd bxvd) {
        this.f33880a = mkh;
        this.f33881b = bxvd;
    }

    public final void run() {
        mkh mkh = this.f33880a;
        mps mps = (mps) this.f33881b.mo74062i();
        sdo.m34970a(!mkh.f33885d);
        int i = mkh.f33882a;
        if (i == 1) {
            mkh.f33884c.mo20024a(1);
            mkh.f33885d = true;
        } else if (i == 2) {
            int a = mpu.m25496a(mps.f34218b);
            if (a != 0 && a == 4) {
                mkh.f33884c.mo20024a(3);
                mkh.f33885d = true;
            } else if (mps.f34220d) {
                mkh.f33884c.mo20024a(1);
                mkh.f33885d = true;
            }
        } else {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Invalid payload type: ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }
}
