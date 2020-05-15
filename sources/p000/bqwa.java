package p000;

/* renamed from: bqwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqwa {

    /* renamed from: a */
    private final byte[] f141705a;

    private bqwa(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f141705a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    /* renamed from: a */
    public static bqwa m113509a(byte[] bArr) {
        if (bArr != null) {
            return new bqwa(bArr, bArr.length);
        }
        return null;
    }

    /* renamed from: a */
    public final byte[] mo69343a() {
        byte[] bArr = this.f141705a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
