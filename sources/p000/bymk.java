package p000;

/* renamed from: bymk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bymk implements bxvp {
    UNKNOWN(0),
    NO_WHITELIST(1),
    PLAYPASS(2);
    

    /* renamed from: d */
    public final int f167032d;

    private bymk(int i) {
        this.f167032d = i;
    }

    /* renamed from: a */
    public static bymk m124955a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_WHITELIST;
        }
        if (i != 2) {
            return null;
        }
        return PLAYPASS;
    }

    /* renamed from: b */
    public static bxvr m124956b() {
        return bymj.f167027a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f167032d;
    }

    public final String toString() {
        return Integer.toString(this.f167032d);
    }
}
