package p000;

/* renamed from: bqrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqrw {
    /* renamed from: a */
    public static int m113299a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    /* renamed from: b */
    public static int m113300b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }

    /* renamed from: c */
    public static String m113301c(int i) {
        return Integer.toString(m113299a(i));
    }
}
