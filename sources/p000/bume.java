package p000;

/* renamed from: bume */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bume {

    /* renamed from: a */
    public static final byte[] f154231a = new byte[5];

    /* renamed from: a */
    public static final int m119967a(byte[] bArr, int i) {
        loop0:
        while (i >= 0) {
            int i2 = (i * 11) + 17;
            for (int i3 = 0; i3 < f154231a.length; i3++) {
                if (bArr[i2 + i3] != 0) {
                    break loop0;
                }
            }
            i--;
        }
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException("First MAC entry cannot be virtual.");
    }
}
