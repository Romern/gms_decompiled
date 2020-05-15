package p000;

/* renamed from: bxly */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bxly implements bxvp {
    UNKNOWN_STATE(0),
    DISCONNECTED(1),
    ON_WIFI(2),
    ON_CELLULAR(3);
    

    /* renamed from: e */
    public final int f163912e;

    private bxly(int i) {
        this.f163912e = i;
    }

    /* renamed from: a */
    public static bxly m122852a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return ON_WIFI;
        }
        if (i != 3) {
            return null;
        }
        return ON_CELLULAR;
    }

    /* renamed from: b */
    public static bxvr m122853b() {
        return bxlx.f163906a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f163912e;
    }

    public final String toString() {
        return Integer.toString(this.f163912e);
    }
}
