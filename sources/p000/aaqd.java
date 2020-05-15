package p000;

/* renamed from: aaqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aaqd implements bxvp {
    AA_BUCKETING_EVENT_UNKNOWN(0),
    REDUCED_MESSAGE_PRIORITY(1),
    APP_WAS_IN_HIGH_USAGE_BUCKET(2),
    APP_WAS_WITHIN_QUOTA(3),
    SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED(4);
    

    /* renamed from: f */
    public final int f28880f;

    private aaqd(int i) {
        this.f28880f = i;
    }

    /* renamed from: a */
    public static aaqd m21808a(int i) {
        if (i == 0) {
            return AA_BUCKETING_EVENT_UNKNOWN;
        }
        if (i == 1) {
            return REDUCED_MESSAGE_PRIORITY;
        }
        if (i == 2) {
            return APP_WAS_IN_HIGH_USAGE_BUCKET;
        }
        if (i == 3) {
            return APP_WAS_WITHIN_QUOTA;
        }
        if (i != 4) {
            return null;
        }
        return SENT_PRIORITY_REDUCED_MESSAGE_ON_NEW_MESSAGE_RECEIVED;
    }

    /* renamed from: b */
    public static bxvr m21809b() {
        return aaqc.f28873a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f28880f;
    }

    public final String toString() {
        return Integer.toString(this.f28880f);
    }
}
