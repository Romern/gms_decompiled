package p000;

/* renamed from: aiqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiqn implements buqc {
    /* renamed from: a */
    public final int[] mo37862a(byte[] bArr) {
        int[] iArr = new int[5];
        long d = bnzi.m110900b().mo68722a(bArr).mo68742d();
        int i = (int) d;
        int i2 = (int) (d >>> 32);
        for (int i3 = 1; i3 <= 5; i3++) {
            int i4 = (i3 * i2) + i;
            if (i4 < 0) {
                i4 ^= -1;
            }
            iArr[i3 - 1] = i4;
        }
        return iArr;
    }
}
