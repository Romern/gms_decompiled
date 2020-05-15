package p000;

/* renamed from: btco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btco implements bxvp {
    CONSENT_TYPE_UNKNOWN(0),
    UDC(1),
    ASW(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f148298e;

    private btco(int i) {
        this.f148298e = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148298e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
