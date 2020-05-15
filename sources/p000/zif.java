package p000;

/* renamed from: zif */
final /* synthetic */ class zif implements bmxj {

    /* renamed from: a */
    private final zil f55129a;

    /* renamed from: b */
    private final zgg f55130b;

    public zif(zil zil, zgg zgg) {
        this.f55129a = zil;
        this.f55130b = zgg;
    }

    public final Object apply(Object obj) {
        zil zil = this.f55129a;
        zgg zgg = this.f55130b;
        if (((zij) obj) != zij.REGISTERED) {
            return zij.UNREGISTERED;
        }
        return zil.f55149a.mo19160a(zgg) ? zij.UNREGISTERED : zij.ERROR;
    }
}
