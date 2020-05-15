package p000;

/* renamed from: bqmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bqmb implements bxvp {
    KEY_TYPE_UNSPECIFIED(0),
    RAW128(1),
    RAW256(2),
    CURVE25519(3),
    P256(4),
    CUSTOM(127),
    UNRECOGNIZED(-1);
    

    /* renamed from: h */
    private final int f141195h;

    private bqmb(int i) {
        this.f141195h = i;
    }

    /* renamed from: a */
    public static bqmb m112990a(int i) {
        if (i == 0) {
            return KEY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return RAW128;
        }
        if (i == 2) {
            return RAW256;
        }
        if (i == 3) {
            return CURVE25519;
        }
        if (i == 4) {
            return P256;
        }
        if (i != 127) {
            return null;
        }
        return CUSTOM;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f141195h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
