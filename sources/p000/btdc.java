package p000;

/* renamed from: btdc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btdc implements bxvp {
    UNKNOWN_FORMAT(0),
    JPEG(1),
    PNG(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f148379e;

    private btdc(int i) {
        this.f148379e = i;
    }

    /* renamed from: a */
    public static btdc m116444a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return JPEG;
        }
        if (i != 2) {
            return null;
        }
        return PNG;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148379e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
