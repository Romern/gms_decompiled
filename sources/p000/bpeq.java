package p000;

/* renamed from: bpeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpeq implements bxvp {
    CONSUME_CHUNK_RESULT_UNKNOWN(0),
    CONSUME_CHUNK_RESULT_SUCCESS(1),
    CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED(3),
    CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD(4),
    CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE(5);
    

    /* renamed from: f */
    public final int f137313f;

    private bpeq(int i) {
        this.f137313f = i;
    }

    /* renamed from: a */
    public static bpeq m111839a(int i) {
        if (i == 0) {
            return CONSUME_CHUNK_RESULT_UNKNOWN;
        }
        if (i == 1) {
            return CONSUME_CHUNK_RESULT_SUCCESS;
        }
        if (i == 3) {
            return CONSUME_CHUNK_RESULT_FAIL_STRING_PAYLOAD_NOT_ALLOWED;
        }
        if (i == 4) {
            return CONSUME_CHUNK_RESULT_FAIL_NO_PAYLOAD;
        }
        if (i != 5) {
            return null;
        }
        return CONSUME_CHUNK_RESULT_FAIL_MISMATCHING_CONTINUATION_PAYLOAD_TYPE;
    }

    /* renamed from: b */
    public static bxvr m111840b() {
        return bpep.f137306a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f137313f;
    }

    public final String toString() {
        return Integer.toString(this.f137313f);
    }
}
