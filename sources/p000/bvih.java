package p000;

/* renamed from: bvih */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvih implements bxvp {
    UNKNOWN_PAYLOAD_STATUS(0),
    SUCCESS(1),
    LOCAL_ERROR(2),
    REMOTE_ERROR(3),
    ENDPOINT_IO_ERROR(4),
    MOVED_TO_NEW_MEDIUM(5),
    CONNECTION_CLOSED(6),
    LOCAL_CANCELLATION(7),
    REMOTE_CANCELLATION(8);
    

    /* renamed from: j */
    public final int f156153j;

    private bvih(int i) {
        this.f156153j = i;
    }

    /* renamed from: a */
    public static bvih m121140a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_PAYLOAD_STATUS;
            case 1:
                return SUCCESS;
            case 2:
                return LOCAL_ERROR;
            case 3:
                return REMOTE_ERROR;
            case 4:
                return ENDPOINT_IO_ERROR;
            case 5:
                return MOVED_TO_NEW_MEDIUM;
            case 6:
                return CONNECTION_CLOSED;
            case 7:
                return LOCAL_CANCELLATION;
            case 8:
                return REMOTE_CANCELLATION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m121141b() {
        return bvig.f156142a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156153j;
    }

    public final String toString() {
        return Integer.toString(this.f156153j);
    }
}
