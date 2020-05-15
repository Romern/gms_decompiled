package p000;

/* renamed from: bvik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvik implements bxvp {
    UNKNOWN_SESSION_ROLE(0),
    ADVERTISER(1),
    DISCOVERER(2);
    

    /* renamed from: d */
    public final int f156160d;

    private bvik(int i) {
        this.f156160d = i;
    }

    /* renamed from: a */
    public static bvik m121145a(int i) {
        if (i == 0) {
            return UNKNOWN_SESSION_ROLE;
        }
        if (i == 1) {
            return ADVERTISER;
        }
        if (i != 2) {
            return null;
        }
        return DISCOVERER;
    }

    /* renamed from: b */
    public static bxvr m121146b() {
        return bvij.f156155a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156160d;
    }

    public final String toString() {
        return Integer.toString(this.f156160d);
    }
}
