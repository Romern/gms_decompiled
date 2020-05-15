package p000;

/* renamed from: almb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum almb implements bxvp {
    UNKNOWN(0),
    NONE(1),
    EXACT(2),
    SUBSTRING(3),
    HEURISTIC(4),
    SHEEPDOG_ELIGIBLE(5);
    

    /* renamed from: g */
    public final int f73673g;

    private almb(int i) {
        this.f73673g = i;
    }

    /* renamed from: a */
    public static almb m61249a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return EXACT;
        }
        if (i == 3) {
            return SUBSTRING;
        }
        if (i == 4) {
            return HEURISTIC;
        }
        if (i != 5) {
            return null;
        }
        return SHEEPDOG_ELIGIBLE;
    }

    /* renamed from: b */
    public static bxvr m61250b() {
        return alma.f73665a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f73673g;
    }

    public final String toString() {
        return Integer.toString(this.f73673g);
    }
}
