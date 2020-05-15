package p000;

/* renamed from: bquu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bquu {
    /* renamed from: a */
    static void m113452a(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            jArr[i3] = (long) (((((int) jArr2[i3]) ^ i4) & i2) ^ i4);
        }
    }
}
