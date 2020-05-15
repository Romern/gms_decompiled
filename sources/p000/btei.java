package p000;

/* renamed from: btei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btei implements bxvp {
    REQUEST_MASK_CONTAINER_UNKNOWN(0),
    PROFILE(1),
    DOMAIN_PROFILE(7),
    CONTACT(2),
    ACCOUNT(5),
    AFFINITY(11),
    DOMAIN_CONTACT(8),
    PLACE(4),
    RAW_DEVICE_CONTACT(13),
    DELEGATED_CONTACT(15),
    CONTACT_ANNOTATION(14),
    CIRCLE(3),
    EXTERNAL_ACCOUNT(6),
    DEVICE_CONTACT(9),
    GOOGLE_GROUP(10),
    CALENDAR_RESOURCE(16),
    UNRECOGNIZED(-1);
    

    /* renamed from: r */
    private final int f148525r;

    private btei(int i) {
        this.f148525r = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148525r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
