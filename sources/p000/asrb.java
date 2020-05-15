package p000;

/* renamed from: asrb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class asrb {

    /* renamed from: a */
    public final asrd f89474a;

    /* renamed from: b */
    private final byte[] f89475b;

    /* renamed from: c */
    private final int f89476c;

    /* renamed from: d */
    private final int f89477d;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public asrb(asrd asrd, byte[] bArr, int i, int i2) {
        this.f89474a = asrd;
        this.f89475b = bArr;
        this.f89476c = i;
        this.f89477d = i2;
    }

    /* renamed from: a */
    public static asrb m74509a(asrd asrd, byte[] bArr) {
        return new asrb(asrd, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] mo49400a(int i) {
        asrc asrc = (asrc) this.f89474a.f89482a.get(Integer.valueOf(i));
        if (asrc == null) {
            return new byte[0];
        }
        int i2 = asrc.f89479b;
        byte[] bArr = new byte[i2];
        int i3 = this.f89476c + asrc.f89480c;
        int i4 = this.f89477d;
        if (i3 < i4) {
            System.arraycopy(this.f89475b, i3, bArr, 0, Math.min(i2, i4 - i3));
        }
        return bArr;
    }
}
