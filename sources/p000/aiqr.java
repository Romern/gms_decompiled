package p000;

/* renamed from: aiqr */
final /* synthetic */ class aiqr implements bluo {

    /* renamed from: a */
    private final aiqy f69512a;

    /* renamed from: b */
    private final byte[] f69513b;

    public aiqr(aiqy aiqy, byte[] bArr) {
        this.f69512a = aiqy;
        this.f69513b = bArr;
    }

    /* renamed from: a */
    public final void mo13812a(bluu bluu) {
        aiqy aiqy = this.f69512a;
        byte[] bArr = this.f69513b;
        if (!bluu.mo66725b()) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqy", "a", 356, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("MultiplexBleSocketV1 failed to send a disconnection packet to %s for service ID hash %s.", aiqy.f69522b, ails.m57438a(bArr));
        }
    }
}
