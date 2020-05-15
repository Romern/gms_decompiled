package p000;

/* renamed from: bzhi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzhi implements bxvp {
    UNKNOWN_CALL_LOG_TYPE(0),
    INCOMING(1),
    OUTGOING(2),
    MISSED(3),
    VOICEMAIL(4);
    

    /* renamed from: f */
    public final int f170053f;

    private bzhi(int i) {
        this.f170053f = i;
    }

    /* renamed from: a */
    public static bzhi m125794a(int i) {
        if (i == 0) {
            return UNKNOWN_CALL_LOG_TYPE;
        }
        if (i == 1) {
            return INCOMING;
        }
        if (i == 2) {
            return OUTGOING;
        }
        if (i == 3) {
            return MISSED;
        }
        if (i != 4) {
            return null;
        }
        return VOICEMAIL;
    }

    /* renamed from: b */
    public static bxvr m125795b() {
        return bzhh.f170046a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f170053f;
    }

    public final String toString() {
        return Integer.toString(this.f170053f);
    }
}
