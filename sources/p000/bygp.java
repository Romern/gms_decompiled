package p000;

/* renamed from: bygp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bygp implements bxvp {
    UNKNOWN(0),
    READ(1),
    READ_WRITE(2),
    READ_DRAIN(3);
    

    /* renamed from: e */
    private final int f166366e;

    private bygp(int i) {
        this.f166366e = i;
    }

    /* renamed from: a */
    public static bygp m124790a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return READ;
        }
        if (i == 2) {
            return READ_WRITE;
        }
        if (i != 3) {
            return null;
        }
        return READ_DRAIN;
    }

    /* renamed from: b */
    public static bxvr m124791b() {
        return bygo.f166360a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166366e;
    }

    public final String toString() {
        return Integer.toString(this.f166366e);
    }
}
