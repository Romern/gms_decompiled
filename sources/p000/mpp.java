package p000;

/* renamed from: mpp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mpp implements bxvp {
    SMART_DEVICE_PAYLOAD_TYPE_UNSPECIFIED(0),
    INITIALIZED(1),
    PAYLOAD(2),
    ERROR(3),
    COMPLETE(4),
    ABORT_AND_RESTART(5);
    

    /* renamed from: g */
    public final int f34202g;

    private mpp(int i) {
        this.f34202g = i;
    }

    /* renamed from: a */
    public static mpp m25489a(int i) {
        if (i == 0) {
            return SMART_DEVICE_PAYLOAD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return INITIALIZED;
        }
        if (i == 2) {
            return PAYLOAD;
        }
        if (i == 3) {
            return ERROR;
        }
        if (i == 4) {
            return COMPLETE;
        }
        if (i != 5) {
            return null;
        }
        return ABORT_AND_RESTART;
    }

    /* renamed from: b */
    public static bxvr m25490b() {
        return mpo.f34194a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34202g;
    }

    public final String toString() {
        return Integer.toString(this.f34202g);
    }
}
