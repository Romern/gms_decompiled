package p000;

/* renamed from: buum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buum implements bxvp {
    UNKNOWN_EVENT_TYPE(0),
    PAYLOAD_ERROR(1),
    PAYLOAD_CANCELED(2);
    

    /* renamed from: d */
    public final int f154960d;

    private buum(int i) {
        this.f154960d = i;
    }

    /* renamed from: a */
    public static buum m120464a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i == 1) {
            return PAYLOAD_ERROR;
        }
        if (i != 2) {
            return null;
        }
        return PAYLOAD_CANCELED;
    }

    /* renamed from: b */
    public static bxvr m120465b() {
        return buul.f154955a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f154960d;
    }

    public final String toString() {
        return Integer.toString(this.f154960d);
    }
}
