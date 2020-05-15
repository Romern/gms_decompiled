package p000;

/* renamed from: itj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class itj {
    /* renamed from: a */
    public static bqlq m16102a(int i) {
        switch (i) {
            case 1:
                return bqlq.INITIALIZATION;
            case 2:
                return bqlq.PERIODIC;
            case 3:
                return bqlq.SLOW_PERIODIC;
            case 4:
                return bqlq.FAST_PERIODIC;
            case 5:
                return bqlq.EXPIRATION;
            case 6:
                return bqlq.FAILURE_RECOVERY;
            case 7:
                return bqlq.NEW_ACCOUNT;
            case 8:
                return bqlq.CHANGED_ACCOUNT;
            case 9:
                return bqlq.FEATURE_TOGGLED;
            case 10:
                return bqlq.SERVER_INITIATED;
            case 11:
                return bqlq.ADDRESS_CHANGE;
            case 12:
                return bqlq.SOFTWARE_UPDATE;
            case 13:
                return bqlq.MANUAL;
            case 14:
                return bqlq.CUSTOM_KEY_INVALIDATION;
            case 15:
                return bqlq.PROXIMITY_PERIODIC;
            default:
                return bqlq.INVOCATION_REASON_UNSPECIFIED;
        }
    }
}
