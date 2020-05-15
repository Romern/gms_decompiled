package p000;

/* renamed from: bpfk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpfk implements bxvp {
    SEND_MESSAGE_RESULT_UNKNOWN(0),
    SEND_MESSAGE_RESULT_SUCCESS(1),
    SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST(2),
    SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL(3),
    SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE(4),
    SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR(5);
    

    /* renamed from: g */
    public final int f137412g;

    private bpfk(int i) {
        this.f137412g = i;
    }

    /* renamed from: a */
    public static bpfk m111871a(int i) {
        if (i == 0) {
            return SEND_MESSAGE_RESULT_UNKNOWN;
        }
        if (i == 1) {
            return SEND_MESSAGE_RESULT_SUCCESS;
        }
        if (i == 2) {
            return SEND_MESSAGE_RESULT_FAIL_INVALID_REQUEST;
        }
        if (i == 3) {
            return SEND_MESSAGE_RESULT_FAIL_BUFFER_TOO_FULL;
        }
        if (i == 4) {
            return SEND_MESSAGE_RESULT_FAIL_MESSAGE_TOO_LARGE;
        }
        if (i != 5) {
            return null;
        }
        return SEND_MESSAGE_RESULT_FAIL_NETWORK_ERROR;
    }

    /* renamed from: b */
    public static bxvr m111872b() {
        return bpfj.f137404a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137412g;
    }

    public final String toString() {
        return Integer.toString(this.f137412g);
    }
}
