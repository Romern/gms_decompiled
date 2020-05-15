package p000;

/* renamed from: advw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum advw implements bxvp {
    UNKNOWN(0),
    PERIODIC_TASK(1),
    API_CALL(2),
    PUSH_NOTIFICATION(3);
    

    /* renamed from: e */
    public static final bxvq f62828e = new advv();

    /* renamed from: f */
    private final int f62830f;

    private advw(int i) {
        this.f62830f = i;
    }

    /* renamed from: a */
    public static advw m51255a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PERIODIC_TASK;
        }
        if (i == 2) {
            return API_CALL;
        }
        if (i != 3) {
            return null;
        }
        return PUSH_NOTIFICATION;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f62830f;
    }

    public final String toString() {
        return Integer.toString(this.f62830f);
    }
}
