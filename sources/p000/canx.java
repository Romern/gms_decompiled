package p000;

/* renamed from: canx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class canx {

    /* renamed from: a */
    public static final /* synthetic */ int f175425a = 0;

    /* renamed from: b */
    private static final int[] f175426b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public static int m126848a(int i) {
        int[] iArr = f175426b;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: a */
    public static canu m126849a(int i, canq canq) {
        for (int i2 = 1; i2 <= 40; i2++) {
            canu a = canu.m126842a(i2);
            if (a.f175418b - a.mo74706a(canq).mo74705b() >= (i + 7) / 8) {
                return a;
            }
        }
        throw new cank("Data too big");
    }
}
