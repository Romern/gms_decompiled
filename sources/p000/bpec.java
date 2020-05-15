package p000;

/* renamed from: bpec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpec implements bxvp {
    ERROR_UNSPECIFIED(0),
    CAR_API_OUT_OF_CAR_LIFECYCLE_EXCEPTION(1),
    CAR_API_CAR_SERVICE_GONE_EXCEPTION(2),
    PACKAGE_FAILED_ALL_CHECKS(10),
    PACKAGE_NOT_FOUND(11),
    PACKAGE_NOT_WHITELISTED_ON_HU(12),
    PACKAGE_BLACKLISTED(13),
    PACKAGE_NULL(14),
    SERVICE_DISABLED(15),
    ACTIVITY_DISABLED(16),
    ACTIVITY_NOT_REPARENTABLE(17),
    PACKAGE_DOES_NOT_DECLARE_USES(18),
    SLOW_CALLS_NOT_ALLOWED(19);
    

    /* renamed from: n */
    public final int f137236n;

    private bpec(int i) {
        this.f137236n = i;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137236n;
    }

    public final String toString() {
        return Integer.toString(this.f137236n);
    }
}
