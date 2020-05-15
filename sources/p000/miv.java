package p000;

/* renamed from: miv */
final /* synthetic */ class miv implements Runnable {

    /* renamed from: a */
    private final mix f33799a;

    /* renamed from: b */
    private final byte[] f33800b;

    public miv(mix mix, byte[] bArr) {
        this.f33799a = mix;
        this.f33800b = bArr;
    }

    public final void run() {
        mix mix = this.f33799a;
        byte[] bArr = this.f33800b;
        mht mht = mix.f33805b;
        if (!mht.f33740a) {
            bxvd da = mpq.f34203d.mo74144da();
            mpp mpp = mpp.PAYLOAD;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpq mpq = (mpq) da.f164949b;
            mpq.f34206b = mpp.f34202g;
            mpq.f34205a |= 1;
            ByteString a = ByteString.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mpq mpq2 = (mpq) da.f164949b;
            a.getClass();
            mpq2.f34205a |= 2;
            mpq2.f34207c = a;
            mht.f33741b.mo20036a((mpq) da.mo74062i(), (mpn) null);
            return;
        }
        mhu.f33742a.mo25412b("Listener.SendData called after abortRequest", new Object[0]);
    }
}
