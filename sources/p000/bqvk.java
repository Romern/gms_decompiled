package p000;

/* renamed from: bqvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqvk implements bqod {

    /* renamed from: a */
    private final byte[] f141685a;

    /* renamed from: b */
    private final byte[] f141686b;

    public bqvk(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] b = bqvg.m113467b(bArr);
            this.f141685a = b;
            this.f141686b = bqvg.m113464a(b);
            return;
        }
        throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
    }

    /* renamed from: a */
    public final byte[] mo69316a(byte[] bArr) {
        return bqvg.m113465a(bArr, this.f141686b, this.f141685a);
    }
}
