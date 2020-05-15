package p000;

/* renamed from: abtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abtc implements bxvp {
    UNKNOWN(0),
    STARTED(1),
    ENDED(2);
    

    /* renamed from: d */
    public final int f58200d;

    private abtc(int i) {
        this.f58200d = i;
    }

    /* renamed from: a */
    public static abtc m48241a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STARTED;
        }
        if (i != 2) {
            return null;
        }
        return ENDED;
    }

    /* renamed from: b */
    public static bxvr m48242b() {
        return abtb.f58195a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f58200d;
    }

    public final String toString() {
        return Integer.toString(this.f58200d);
    }
}
