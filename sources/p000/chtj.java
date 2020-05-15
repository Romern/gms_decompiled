package p000;

/* renamed from: chtj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chtj extends chtn {

    /* renamed from: c */
    private final chtk f189121c;

    /* renamed from: a */
    public final Object mo85635a(byte[] bArr) {
        return this.f189121c.mo26261a(bArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public chtj(String str, chtk chtk) {
        super(str, false);
        boolean z = false;
        bmxy.m108597a(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        bmxy.m108589a(str.length() > 4 ? true : z, "empty key name");
        bmxy.m108582a(chtk, "marshaller is null");
        this.f189121c = chtk;
    }

    /* renamed from: a */
    public final byte[] mo85636a(Object obj) {
        return this.f189121c.mo26262a(obj);
    }
}
