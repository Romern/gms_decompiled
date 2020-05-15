package p000;

/* renamed from: cany */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cany {
    /* renamed from: a */
    public static int m126850a(canw canw, boolean z) {
        int i = !z ? canw.f175423b : canw.f175424c;
        int i2 = !z ? canw.f175424c : canw.f175423b;
        byte[][] bArr = canw.f175422a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = !z ? bArr[i6][i4] : bArr[i4][i6];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    b = b2;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }
}
