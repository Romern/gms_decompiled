package p000;

/* renamed from: casl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class casl {

    /* renamed from: a */
    public final byte[] f175768a;

    private casl(byte[] bArr) {
        if (bArr.length == 8) {
            this.f175768a = bArr;
            return;
        }
        throw new capk("Invalid Terminal Risk Management Data");
    }

    /* renamed from: a */
    public static casl m127098a(byte[] bArr) {
        if (bArr != null) {
            return new casl(bArr);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo74822a() {
        return (this.f175768a[0] & 4) == 4;
    }
}
