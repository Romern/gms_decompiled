package p000;

/* renamed from: cakq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cakq implements bxvp {
    UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f175041e;

    private cakq(int i) {
        this.f175041e = i;
    }

    /* renamed from: a */
    public static cakq m126732a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return FAILURE;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f175041e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
