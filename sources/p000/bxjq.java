package p000;

/* renamed from: bxjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxjq implements bxvp {
    UNKNOWN_SYNC_TYPE(0),
    DO_NOT_SYNC(1),
    SYNCABLE_TO_BACKEND(2),
    SYNCABLE_TO_BACKEND_ANONYMOUS_ACCOUNT_ONLY(3),
    SYNCABLE_TO_BACKEND_ACCOUNT_ONLY(4);
    

    /* renamed from: f */
    public final int f163668f;

    private bxjq(int i) {
        this.f163668f = i;
    }

    /* renamed from: a */
    public static bxjq m122779a(int i) {
        if (i == 0) {
            return UNKNOWN_SYNC_TYPE;
        }
        if (i == 1) {
            return DO_NOT_SYNC;
        }
        if (i == 2) {
            return SYNCABLE_TO_BACKEND;
        }
        if (i == 3) {
            return SYNCABLE_TO_BACKEND_ANONYMOUS_ACCOUNT_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return SYNCABLE_TO_BACKEND_ACCOUNT_ONLY;
    }

    /* renamed from: b */
    public static bxvr m122780b() {
        return bxjp.f163661a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163668f;
    }

    public final String toString() {
        return Integer.toString(this.f163668f);
    }
}
