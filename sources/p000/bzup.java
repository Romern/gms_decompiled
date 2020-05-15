package p000;

/* renamed from: bzup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzup implements bxvp {
    UNKNOWN_SETTING(0),
    MARKETING_SETTING(1),
    GMAIL_IMPORT_SETTING(2),
    CUSTOMER_SELECTOR_SETTING(3),
    NOTIFICATIONS_SETTING(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f171453g;

    private bzup(int i) {
        this.f171453g = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f171453g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
