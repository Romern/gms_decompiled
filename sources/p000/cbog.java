package p000;

/* renamed from: cbog */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbog {
    /* renamed from: a */
    public static int m128043a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m128044b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 6;
        }
        return 5;
    }
}
