package p000;

/* renamed from: asub */
final /* synthetic */ class asub implements asud {

    /* renamed from: a */
    private final asuc f89737a;

    /* renamed from: b */
    private final long f89738b;

    /* renamed from: c */
    private final asud f89739c;

    public asub(asuc asuc, long j, asud asud) {
        this.f89737a = asuc;
        this.f89738b = j;
        this.f89739c = asud;
    }

    public final void sendResponseApdu(byte[] bArr) {
        asuc asuc = this.f89737a;
        long j = this.f89738b;
        asud asud = this.f89739c;
        if (asuc.f89743b <= j) {
            asud.sendResponseApdu(bArr);
        }
    }
}
