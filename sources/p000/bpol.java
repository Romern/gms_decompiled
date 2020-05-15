package p000;

/* renamed from: bpol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpol implements bxvp {
    UNKNOWN(0),
    AT_PLACE(1),
    IN_TRANSIT(2);
    

    /* renamed from: d */
    public final int f138544d;

    private bpol(int i) {
        this.f138544d = i;
    }

    /* renamed from: a */
    public static bpol m112120a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AT_PLACE;
        }
        if (i != 2) {
            return null;
        }
        return IN_TRANSIT;
    }

    /* renamed from: b */
    public static bxvr m112121b() {
        return bpok.f138539a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138544d;
    }

    public final String toString() {
        return Integer.toString(this.f138544d);
    }
}
