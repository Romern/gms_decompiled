package p000;

/* renamed from: btra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btra {
    /* renamed from: a */
    public static int m117056a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m117057b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }
}
