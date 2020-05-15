package p000;

/* renamed from: camh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum camh implements bxvp {
    UNKNOWN_REQUEST_TYPE(0),
    ONE_OFF_SYNC(1),
    DAILY_SYNC(2),
    FREQUENT_SYNC(3),
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC(4),
    PERIODIC_FULL_DOMAIN_FILTER_SYNC(5),
    ONE_OFF_SYNC_CHARGING_UNMETERED(6),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER(7),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN(8),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA(9),
    ONE_OFF_SYNC_AT_ACCOUNT_CHANGE(10),
    ONE_OFF_SYNC_AT_BOOT_COMPLETE(11),
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE(12),
    UNRECOGNIZED(-1);
    

    /* renamed from: o */
    private final int f175287o;

    private camh(int i) {
        this.f175287o = i;
    }

    /* renamed from: a */
    public static camh m126782a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_TYPE;
            case 1:
                return ONE_OFF_SYNC;
            case 2:
                return DAILY_SYNC;
            case 3:
                return FREQUENT_SYNC;
            case 4:
                return ONE_OFF_FULL_DOMAIN_FILTER_SYNC;
            case 5:
                return PERIODIC_FULL_DOMAIN_FILTER_SYNC;
            case 6:
                return ONE_OFF_SYNC_CHARGING_UNMETERED;
            case 7:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER;
            case 8:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN;
            case 9:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA;
            case 10:
                return ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
            case 11:
                return ONE_OFF_SYNC_AT_BOOT_COMPLETE;
            case 12:
                return ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(mo3214a());
    }

    /* renamed from: a */
    public final int mo3214a() {
        if (this != UNRECOGNIZED) {
            return this.f175287o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
