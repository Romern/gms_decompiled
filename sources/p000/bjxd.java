package p000;

/* renamed from: bjxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjxd {

    /* renamed from: a */
    public final byte[] f123561a;

    public bjxd(byte b, byte b2, byte b3, byte b4, byte[] bArr, byte b5, boolean z, boolean z2) {
        int i;
        int i2;
        if (z) {
            i = bArr.length;
        } else {
            i = 0;
        }
        if (z) {
            i2 = i + 5;
        } else {
            i2 = 4;
        }
        i2 = z2 ? i2 + 1 : i2;
        byte[] bArr2 = new byte[i2];
        this.f123561a = bArr2;
        bArr2[0] = b;
        bArr2[1] = b2;
        bArr2[2] = b3;
        bArr2[3] = b4;
        if (z) {
            bArr2[4] = (byte) i;
            System.arraycopy(bArr, 0, bArr2, 5, bArr.length);
        }
        if (z2) {
            this.f123561a[i2 - 1] = b5;
        }
    }
}
