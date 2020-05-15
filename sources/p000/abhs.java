package p000;

/* renamed from: abhs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhs {
    /* renamed from: a */
    public static int m47721a(String str) {
        int parseInt = Integer.parseInt(str);
        int[] iArr = {1, 2, 3, 4, 5, 6, 52};
        int i = 0;
        while (i < 7) {
            int i2 = iArr[i];
            int i3 = i2 - 2;
            if (i2 == 0) {
                throw null;
            } else if (i3 == parseInt) {
                return i2;
            } else {
                i++;
            }
        }
        return 1;
    }
}
