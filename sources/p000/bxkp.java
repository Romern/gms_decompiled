package p000;

/* renamed from: bxkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxkp implements bxvp {
    UNKNOWN_STATE(0),
    IN_SHUSH(1),
    NOT_IN_SHUSH(2);
    

    /* renamed from: d */
    public final int f163779d;

    private bxkp(int i) {
        this.f163779d = i;
    }

    /* renamed from: a */
    public static bxkp m122811a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return IN_SHUSH;
        }
        if (i != 2) {
            return null;
        }
        return NOT_IN_SHUSH;
    }

    /* renamed from: b */
    public static bxvr m122812b() {
        return bxko.f163774a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163779d;
    }

    public final String toString() {
        return Integer.toString(this.f163779d);
    }
}
