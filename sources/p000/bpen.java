package p000;

/* renamed from: bpen */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpen implements bxvp {
    RESULT_UNKNOWN(0),
    DECODE_SUCCESS(1),
    REQUEST_TIMED_OUT(2),
    USER_CANCELLED(3),
    USER_INTERRUPTED_AUDIO_PARING(4);
    

    /* renamed from: f */
    public final int f137304f;

    private bpen(int i) {
        this.f137304f = i;
    }

    /* renamed from: a */
    public static bpen m111834a(int i) {
        if (i == 0) {
            return RESULT_UNKNOWN;
        }
        if (i == 1) {
            return DECODE_SUCCESS;
        }
        if (i == 2) {
            return REQUEST_TIMED_OUT;
        }
        if (i == 3) {
            return USER_CANCELLED;
        }
        if (i != 4) {
            return null;
        }
        return USER_INTERRUPTED_AUDIO_PARING;
    }

    /* renamed from: b */
    public static bxvr m111835b() {
        return bpem.f137297a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137304f;
    }

    public final String toString() {
        return Integer.toString(this.f137304f);
    }
}
