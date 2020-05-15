package p000;

/* renamed from: bzar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bzar implements bxvp {
    DISCOVERY_ATTACHMENT_TYPE_UNKNOWN(0),
    DISCOVERY_ATTACHMENT_TYPE_NORMAL(1),
    DISCOVERY_ATTACHMENT_TYPE_DEBUG(2);
    

    /* renamed from: d */
    public final int f169225d;

    private bzar(int i) {
        this.f169225d = i;
    }

    /* renamed from: a */
    public static bzar m125589a(int i) {
        if (i == 0) {
            return DISCOVERY_ATTACHMENT_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return DISCOVERY_ATTACHMENT_TYPE_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return DISCOVERY_ATTACHMENT_TYPE_DEBUG;
    }

    /* renamed from: b */
    public static bxvr m125590b() {
        return bzaq.f169220a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f169225d;
    }

    public final String toString() {
        return Integer.toString(this.f169225d);
    }
}
