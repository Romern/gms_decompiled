package p000;

/* renamed from: btdh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum btdh implements bxvp {
    UNKNOWN_GROUP_EXTENSION(0),
    GDATA_COMPATIBILITY(1),
    IMPORT_DATA(2),
    PREFERRED_EMAIL(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f148399f;

    private btdh(int i) {
        this.f148399f = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f148399f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
