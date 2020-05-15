package p000;

/* renamed from: cbob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cbob implements bxvp {
    UNKNOWN(0),
    MO_SMS(1),
    MT_SMS(2),
    CARRIER_ID(3),
    IMSI_LOOKUP(5),
    REGISTERED_SMS(7),
    FLASH_CALL(8),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f177800i;

    private cbob(int i) {
        this.f177800i = i;
    }

    /* renamed from: a */
    public static cbob m128036a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MO_SMS;
        }
        if (i == 2) {
            return MT_SMS;
        }
        if (i == 3) {
            return CARRIER_ID;
        }
        if (i == 5) {
            return IMSI_LOOKUP;
        }
        if (i == 7) {
            return REGISTERED_SMS;
        }
        if (i != 8) {
            return null;
        }
        return FLASH_CALL;
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f177800i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
