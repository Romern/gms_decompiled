package p000;

/* renamed from: bqmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqmh implements bxvp {
    KEY_ACTION_UNSPECIFIED(0),
    ACTIVATE(1),
    DEACTIVATE(2),
    DELETE(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f141214f;

    private bqmh(int i) {
        this.f141214f = i;
    }

    /* renamed from: a */
    public static bqmh m112998a(int i) {
        if (i == 0) {
            return KEY_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ACTIVATE;
        }
        if (i == 2) {
            return DEACTIVATE;
        }
        if (i != 3) {
            return null;
        }
        return DELETE;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f141214f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
