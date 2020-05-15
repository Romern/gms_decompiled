package p000;

/* renamed from: bzps */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzps implements bxvp {
    UNKNOWN_CONTACT_MODE(0),
    CHAT(1),
    PHONE(2),
    EMAIL(3),
    HANGOUTS(4),
    ENTERPRISE_SUPPORT(5),
    C2C(6),
    FEEDBACK_MODE(7);
    

    /* renamed from: i */
    public final int f170959i;

    private bzps(int i) {
        this.f170959i = i;
    }

    /* renamed from: a */
    public static bzps m126020a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CONTACT_MODE;
            case 1:
                return CHAT;
            case 2:
                return PHONE;
            case 3:
                return EMAIL;
            case 4:
                return HANGOUTS;
            case 5:
                return ENTERPRISE_SUPPORT;
            case 6:
                return C2C;
            case 7:
                return FEEDBACK_MODE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m126021b() {
        return bzpr.f170949a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170959i;
    }

    public final String toString() {
        return Integer.toString(this.f170959i);
    }
}
