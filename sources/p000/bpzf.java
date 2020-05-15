package p000;

/* renamed from: bpzf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpzf implements bxvp {
    NONE(0),
    APPS(1),
    CONTACTS(2),
    PHONES(3),
    EMAILS(4),
    POSTALS(5),
    SMS(6),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f139989i;

    private bpzf(int i) {
        this.f139989i = i;
    }

    /* renamed from: a */
    public static bpzf m112423a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return APPS;
            case 2:
                return CONTACTS;
            case 3:
                return PHONES;
            case 4:
                return EMAILS;
            case 5:
                return POSTALS;
            case 6:
                return SMS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m112424b() {
        return bpze.f139979a;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f139989i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
