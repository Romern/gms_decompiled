package p000;

/* renamed from: bykp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bykp implements bxvp {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_RESCHEDULE(2),
    RESULT_FAILURE(3),
    RESULT_RETHROW(4);
    

    /* renamed from: f */
    public static final bxvq f166776f = new bykn();

    /* renamed from: g */
    public final int f166778g;

    private bykp(int i) {
        this.f166778g = i;
    }

    /* renamed from: a */
    public static bykp m124908a(int i) {
        if (i == 0) {
            return RESULT_UNKNOWN;
        }
        if (i == 1) {
            return RESULT_SUCCESS;
        }
        if (i == 2) {
            return RESULT_RESCHEDULE;
        }
        if (i == 3) {
            return RESULT_FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return RESULT_RETHROW;
    }

    /* renamed from: b */
    public static bxvr m124909b() {
        return byko.f166770a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166778g;
    }

    public final String toString() {
        return Integer.toString(this.f166778g);
    }
}
