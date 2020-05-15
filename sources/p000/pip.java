package p000;

/* renamed from: pip */
final /* synthetic */ class pip implements Runnable {

    /* renamed from: a */
    private final pjc f39241a;

    /* renamed from: b */
    private final String f39242b;

    /* renamed from: c */
    private final String f39243c;

    /* renamed from: d */
    private final String f39244d;

    /* renamed from: e */
    private final long f39245e;

    public pip(pjc pjc, String str, String str2, String str3, long j) {
        this.f39241a = pjc;
        this.f39242b = str;
        this.f39243c = str2;
        this.f39244d = str3;
        this.f39245e = j;
    }

    public final void run() {
        pjc pjc = this.f39241a;
        String str = this.f39242b;
        String str2 = this.f39243c;
        String str3 = this.f39244d;
        long j = this.f39245e;
        if (!pjc.f39277F.mo23271a(str, str2, str3, j)) {
            pim pim = pjc.f39336y;
            if (pim != null) {
                pim.f39236e.mo23188a(str2, j, 2007);
            }
            pjc.mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL, blsw.CASTV2_1_0, str.length());
        }
        pjc.mo23257k();
    }
}
