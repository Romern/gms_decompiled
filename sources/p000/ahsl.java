package p000;

/* renamed from: ahsl */
final /* synthetic */ class ahsl implements bmzi {

    /* renamed from: a */
    private final ahst f67945a;

    /* renamed from: b */
    private final ByteString f67946b;

    public ahsl(ahst ahst, ByteString bxtx) {
        this.f67945a = ahst;
        this.f67946b = bxtx;
    }

    /* renamed from: a */
    public final Object mo6606a() {
        ahst ahst = this.f67945a;
        ByteString bxtx = this.f67946b;
        for (ahyz ahyz : ahst.f67962d.mo36468d()) {
            if (bxtx.equals(ahyz.f68429c)) {
                return ahyz;
            }
        }
        return null;
    }
}
