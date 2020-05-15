package p000;

/* renamed from: abjf */
public final /* synthetic */ class abjf implements bmxj {

    /* renamed from: a */
    private final byte[] f57573a;

    public abjf(byte[] bArr) {
        this.f57573a = bArr;
    }

    public final Object apply(Object obj) {
        byte[] bArr = this.f57573a;
        bsmi bsmi = (bsmi) obj;
        bxvd bxvd = (bxvd) bsmi.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) bsmi);
        ByteString a = ByteString.m123261a(bArr);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bsmi bsmi2 = (bsmi) bxvd.f164949b;
        bsmi bsmi3 = bsmi.f145031c;
        a.getClass();
        bsmi2.f145033a |= 1;
        bsmi2.f145034b = a;
        return (bsmi) bxvd.mo74062i();
    }
}
