package p000;

/* renamed from: vwx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vwx {

    /* renamed from: a */
    public final int[] f50167a = new int[16];

    /* renamed from: b */
    public final byte[] f50168b;

    /* renamed from: c */
    public final byte[] f50169c;

    public vwx(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (bArr2.length == 16) {
            this.f50168b = bArr;
            this.f50169c = bArr2;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static int m41505a(int i) {
        return i + 1;
    }

    /* renamed from: a */
    public static int m41506a(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    /* renamed from: a */
    public static int m41507a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }
}
