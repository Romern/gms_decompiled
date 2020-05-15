package p000;

/* renamed from: bxzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxzu implements bxvp {
    EVENT_UNKNOWN(0),
    EVENT_MODULE_INITIALIZED(1),
    EVENT_NEW_SIM_ACTIVE(2),
    EVENT_LOCALE_CHANGED(3),
    EVENT_CELLULAR_NETWORK_AVAILABLE(4),
    EVENT_REFRESH_CPID_TTL_DUE(5),
    EVENT_REFRESH_GCORE_REGISTER_DUE(6),
    EVENT_REFRESH_CONSENT_TEXT_DUE(7),
    EVENT_ENDPOINTS_FETCHED(8),
    EVENT_CPID_CHANGED(9),
    EVENT_GCORE_REGISTER_PERFORMED(10),
    EVENT_CONSENT_TEXT_FETCHED(11),
    EVENT_CONSENT_STATUS_CHANGED(12),
    EVENT_CONSENT_STATUS_PROPAGATED(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f165182p;

    private bxzu(int i) {
        this.f165182p = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f165182p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }
}
