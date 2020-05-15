package p000;

/* renamed from: big */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class big {

    /* renamed from: a */
    public final int f3292a;

    /* renamed from: b */
    public final int f3293b;

    /* renamed from: c */
    public final int f3294c;

    /* renamed from: d */
    public int f3295d;

    /* renamed from: e */
    public byte[] f3296e;

    /* renamed from: f */
    public int f3297f = 1;

    public big(byte[] bArr) {
        this.f3292a = bArr[0] & 255;
        byte b = bArr[1];
        this.f3293b = bArr[2] & 255;
        this.f3294c = bArr[3] & 255;
        int length = bArr.length;
        if (length > 5) {
            this.f3297f = 3;
            int i = bArr[4] & 255;
            this.f3295d = i;
            if (length == i + 5 || length == i + 6) {
                byte[] bArr2 = new byte[i];
                this.f3296e = bArr2;
                System.arraycopy(bArr, 5, bArr2, 0, i);
                if (length > this.f3295d + 5) {
                    this.f3297f = 4;
                    byte b2 = bArr[length - 1];
                    return;
                }
                return;
            }
            throw new bic((short) 26368);
        } else if (length == 5) {
            this.f3297f = 2;
            byte b3 = bArr[4];
        }
    }
}
