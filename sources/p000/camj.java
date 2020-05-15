package p000;

/* renamed from: camj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum camj implements bxvp {
    UNSET(0),
    OPTED_IN(1),
    OPT_IN_REJECTED(2),
    OPT_IN_VIEWED(3),
    OPT_IN_SNOOZED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f175295g;

    private camj(int i) {
        this.f175295g = i;
    }

    /* renamed from: a */
    public static camj m126786a(int i) {
        if (i == 0) {
            return UNSET;
        }
        if (i == 1) {
            return OPTED_IN;
        }
        if (i == 2) {
            return OPT_IN_REJECTED;
        }
        if (i == 3) {
            return OPT_IN_VIEWED;
        }
        if (i != 4) {
            return null;
        }
        return OPT_IN_SNOOZED;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f175295g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
