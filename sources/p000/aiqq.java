package p000;

/* renamed from: aiqq */
final /* synthetic */ class aiqq implements airj {

    /* renamed from: a */
    private final aiqy f69510a;

    /* renamed from: b */
    private final byte[] f69511b;

    public aiqq(aiqy aiqy, byte[] bArr) {
        this.f69510a = aiqy;
        this.f69511b = bArr;
    }

    /* renamed from: a */
    public final void mo37590a() {
        aiqy aiqy = this.f69510a;
        byte[] bArr = this.f69511b;
        byte[] bArr2 = aiqy.f69521a;
        bxvd da = bvgi.f156000e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi = (bvgi) da.f164949b;
        bvgi.f156003b = 2;
        bvgi.f156002a |= 1;
        bxvd da2 = bvge.f155990c.mo74144da();
        ByteString a = ByteString.m123261a(bArr);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvge bvge = (bvge) da2.f164949b;
        a.getClass();
        bvge.f155992a |= 1;
        bvge.f155993b = a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgi bvgi2 = (bvgi) da.f164949b;
        bvge bvge2 = (bvge) da2.mo74062i();
        bvge2.getClass();
        bvgi2.f156005d = bvge2;
        bvgi2.f156002a |= 4;
        byte[] a2 = aips.m57683a(bArr2, ((bvgi) da.mo74062i()).serializeToBytes());
        if (a2 != null) {
            aiqy.f69525e.mo66704b(a2).mo66727a(new aiqr(aiqy, bArr));
        } else {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68387b();
            bnsl.mo68432a("aiqy", "b", 341, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("MultiplexBleSocketV1 failed to create a disconnection packet for service ID hash %s.", ails.m57438a(bArr));
        }
        aiqy.mo37874a(bArr);
    }
}
