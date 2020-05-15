package p000;

/* renamed from: piq */
final /* synthetic */ class piq implements Runnable {

    /* renamed from: a */
    private final pjc f39246a;

    /* renamed from: b */
    private final byte[] f39247b;

    /* renamed from: c */
    private final String f39248c;

    /* renamed from: d */
    private final String f39249d;

    /* renamed from: e */
    private final long f39250e;

    public piq(pjc pjc, byte[] bArr, String str, String str2, long j) {
        this.f39246a = pjc;
        this.f39247b = bArr;
        this.f39248c = str;
        this.f39249d = str2;
        this.f39250e = j;
    }

    public final void run() {
        pjc pjc = this.f39246a;
        byte[] bArr = this.f39247b;
        String str = this.f39248c;
        String str2 = this.f39249d;
        long j = this.f39250e;
        if (!pjc.f39277F.mo23272a(bArr, str, str2, j)) {
            pim pim = pjc.f39336y;
            if (pim != null) {
                pim.f39236e.mo23188a(str, j, 2007);
            }
            pjc.mo23239a(bpfk.SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL, blsw.CASTV2_1_0, bArr.length);
        }
        pjc.mo23257k();
    }
}
