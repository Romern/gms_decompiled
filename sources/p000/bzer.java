package p000;

/* renamed from: bzer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzer implements bxvp {
    SYNC_REASON_UNKNOWN(0),
    SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT(1),
    SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT(2),
    SYNC_REASON_FACS_CACHE_UPDATED(3),
    SYNC_REASON_UDC_SETTING_CHANGED(4),
    SYNC_REASON_POWER_CONNECTED(5);
    

    /* renamed from: g */
    public static final bxvq f169709g = new bzeq();

    /* renamed from: h */
    private final int f169711h;

    private bzer(int i) {
        this.f169711h = i;
    }

    /* renamed from: a */
    public static bzer m125724a(int i) {
        if (i == 0) {
            return SYNC_REASON_UNKNOWN;
        }
        if (i == 1) {
            return SYNC_REASON_CONTACT_CHANGED_INSIGNIFICANT;
        }
        if (i == 2) {
            return SYNC_REASON_CONTACT_CHANGED_SIGNIFICANT;
        }
        if (i == 3) {
            return SYNC_REASON_FACS_CACHE_UPDATED;
        }
        if (i == 4) {
            return SYNC_REASON_UDC_SETTING_CHANGED;
        }
        if (i != 5) {
            return null;
        }
        return SYNC_REASON_POWER_CONNECTED;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169711h;
    }

    public final String toString() {
        return Integer.toString(this.f169711h);
    }
}
