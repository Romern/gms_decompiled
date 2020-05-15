package p000;

/* renamed from: cejc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum cejc {
    START_ACTIVITY,
    START_SERVICE,
    SEND_BROADCAST,
    OPERATION_NOT_SET;

    /* renamed from: a */
    public static cejc m136975a(int i) {
        if (i == 0) {
            return OPERATION_NOT_SET;
        }
        if (i == 1) {
            return START_ACTIVITY;
        }
        if (i == 2) {
            return START_SERVICE;
        }
        if (i != 3) {
            return null;
        }
        return SEND_BROADCAST;
    }
}
