package p000;

/* renamed from: atee */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum atee implements bxvp {
    UNKNOWN_CONDITION(0),
    TRUE(1),
    NFC_ON(2),
    NFC_OFF(3),
    PHONE_LOCKED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f90179g;

    private atee(int i) {
        this.f90179g = i;
    }

    /* renamed from: a */
    public static atee m75732a(int i) {
        if (i == 0) {
            return UNKNOWN_CONDITION;
        }
        if (i == 1) {
            return TRUE;
        }
        if (i == 2) {
            return NFC_ON;
        }
        if (i == 3) {
            return NFC_OFF;
        }
        if (i != 4) {
            return null;
        }
        return PHONE_LOCKED;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f90179g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
