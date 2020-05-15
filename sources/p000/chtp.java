package p000;

/* renamed from: chtp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chtp extends chtn {

    /* renamed from: c */
    private final chtq f189132c;

    /* renamed from: a */
    public final Object mo85635a(byte[] bArr) {
        return this.f189132c.mo85644a(bArr);
    }

    public chtp(String str, boolean z, chtq chtq) {
        super(str, z);
        bmxy.m108597a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        bmxy.m108582a(chtq, "marshaller");
        this.f189132c = chtq;
    }

    /* renamed from: a */
    public final byte[] mo85636a(Object obj) {
        return this.f189132c.mo85645a(obj);
    }
}
