package p000;

/* renamed from: aqda */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum aqda implements bxvp {
    THREAT_ENTRY_TYPE_UNSPECIFIED(0),
    URL_EXPRESSION(1),
    BINARY_DIGEST(2),
    IP_RANGE(3);
    

    /* renamed from: e */
    public final int f85740e;

    private aqda(int i) {
        this.f85740e = i;
    }

    /* renamed from: a */
    public static aqda m71369a(int i) {
        if (i == 0) {
            return THREAT_ENTRY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return URL_EXPRESSION;
        }
        if (i == 2) {
            return BINARY_DIGEST;
        }
        if (i != 3) {
            return null;
        }
        return IP_RANGE;
    }

    /* renamed from: b */
    public static bxvr m71370b() {
        return aqcz.f85734a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f85740e;
    }

    public final String toString() {
        return Integer.toString(this.f85740e);
    }
}
