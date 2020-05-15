package p000;

/* renamed from: bvvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvvk implements bxvp {
    UNKNOWN(0),
    UNSUPPORTED_OS(1),
    DEFERRING_TO_GMM(2),
    UNSUPPORTED_GEO(3),
    LOCATION_DISABLED_FOR_GOOGLE_APPS(4),
    INVALID_ACCOUNT(5),
    REPORTING_NOT_ENABLED(6),
    ACCOUNT_RESTRICTION(7),
    AUTH_ERROR(10),
    RESTRICTED_PROFILE(11),
    LOCATION_DISABLED(12),
    INDETERMINATE(99);
    

    /* renamed from: m */
    public final int f157807m;

    private bvvk(int i) {
        this.f157807m = i;
    }

    /* renamed from: a */
    public static bvvk m121505a(int i) {
        if (i == 99) {
            return INDETERMINATE;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return UNSUPPORTED_OS;
            case 2:
                return DEFERRING_TO_GMM;
            case 3:
                return UNSUPPORTED_GEO;
            case 4:
                return LOCATION_DISABLED_FOR_GOOGLE_APPS;
            case 5:
                return INVALID_ACCOUNT;
            case 6:
                return REPORTING_NOT_ENABLED;
            case 7:
                return ACCOUNT_RESTRICTION;
            default:
                switch (i) {
                    case 10:
                        return AUTH_ERROR;
                    case 11:
                        return RESTRICTED_PROFILE;
                    case 12:
                        return LOCATION_DISABLED;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static bxvr m121506b() {
        return bvvj.f157793a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f157807m;
    }

    public final String toString() {
        return Integer.toString(this.f157807m);
    }
}
