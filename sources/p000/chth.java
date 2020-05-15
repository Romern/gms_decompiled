package p000;

/* renamed from: chth */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chth extends chtn {

    /* renamed from: c */
    private final chti f189120c;

    /* renamed from: a */
    public final Object mo85635a(byte[] bArr) {
        return this.f189120c.mo85633a(new String(bArr, bmwy.f131156a));
    }

    public chth(String str, chti chti) {
        super(str, false);
        bmxy.m108597a(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        bmxy.m108582a(chti, "marshaller");
        this.f189120c = chti;
    }

    /* renamed from: a */
    public final byte[] mo85636a(Object obj) {
        return this.f189120c.mo85634a(obj).getBytes(bmwy.f131156a);
    }
}
