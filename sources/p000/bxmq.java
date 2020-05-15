package p000;

/* renamed from: bxmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxmq implements bxvp {
    UNKNOWN(0),
    DISCONNECTED(1),
    CONNECTED_USB(2),
    CONNECTED_AC(3),
    CONNECTED_WIRELESS(4);
    

    /* renamed from: f */
    public final int f163976f;

    private bxmq(int i) {
        this.f163976f = i;
    }

    /* renamed from: a */
    public static bxmq m122875a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return CONNECTED_USB;
        }
        if (i == 3) {
            return CONNECTED_AC;
        }
        if (i != 4) {
            return null;
        }
        return CONNECTED_WIRELESS;
    }

    /* renamed from: b */
    public static bxvr m122876b() {
        return bxmp.f163969a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163976f;
    }

    public final String toString() {
        return Integer.toString(this.f163976f);
    }
}
