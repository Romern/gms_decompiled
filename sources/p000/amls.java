package p000;

/* renamed from: amls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amls implements bxvp {
    UNKNOWN(0),
    CP2(1),
    OFFLINE(2),
    WEB(3);
    

    /* renamed from: e */
    public final int f75216e;

    private amls(int i) {
        this.f75216e = i;
    }

    /* renamed from: a */
    public static amls m63043a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CP2;
        }
        if (i == 2) {
            return OFFLINE;
        }
        if (i != 3) {
            return null;
        }
        return WEB;
    }

    /* renamed from: b */
    public static bxvr m63044b() {
        return amlr.f75210a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f75216e;
    }

    public final String toString() {
        return Integer.toString(this.f75216e);
    }
}
