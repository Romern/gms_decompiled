package p000;

/* renamed from: vgy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vgy {
    /* renamed from: a */
    public static int m40410a(int i) {
        return i - 1;
    }

    /* renamed from: b */
    public static int m40411b(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i == m40410a(i3)) {
                return i3;
            }
        }
        return 0;
    }
}
