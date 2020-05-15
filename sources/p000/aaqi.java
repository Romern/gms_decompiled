package p000;

/* renamed from: aaqi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aaqi implements bxvp {
    REASON_UNKNOWN(0),
    TTL_EXPIRED(1),
    CLIENT_QUEUE_EXCEEDED_MAX_RETRIES(2),
    CLIENT_QUEUE_EXCEEDED_STORAGE_LIMIT(3),
    CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES(4),
    CLIENT_QUEUE_APP_UNINSTALLED(5),
    DOZE_QUEUE_COLLAPSED(6),
    DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING(7),
    DOZE_QUEUE_CONVERTED_TO_DIRTY_PING(8),
    TTL_ZERO(9),
    APP_RESTRICTED(10);
    

    /* renamed from: l */
    public final int f28902l;

    private aaqi(int i) {
        this.f28902l = i;
    }

    /* renamed from: a */
    public static aaqi m21817a(int i) {
        switch (i) {
            case 0:
                return REASON_UNKNOWN;
            case 1:
                return TTL_EXPIRED;
            case 2:
                return CLIENT_QUEUE_EXCEEDED_MAX_RETRIES;
            case 3:
                return CLIENT_QUEUE_EXCEEDED_STORAGE_LIMIT;
            case 4:
                return CLIENT_QUEUE_APP_DOES_NOT_SUPPORT_RETRIES;
            case 5:
                return CLIENT_QUEUE_APP_UNINSTALLED;
            case 6:
                return DOZE_QUEUE_COLLAPSED;
            case 7:
                return DOZE_QUEUE_DROPPED_DUE_TO_DIRTY_PING;
            case 8:
                return DOZE_QUEUE_CONVERTED_TO_DIRTY_PING;
            case 9:
                return TTL_ZERO;
            case 10:
                return APP_RESTRICTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m21818b() {
        return aaqh.f28889a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f28902l;
    }

    public final String toString() {
        return Integer.toString(this.f28902l);
    }
}
