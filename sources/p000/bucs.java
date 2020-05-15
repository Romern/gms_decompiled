package p000;

/* renamed from: bucs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bucs implements bxvp {
    INVALID_TRANSITION(0),
    ENTER(1),
    EXIT(2);
    

    /* renamed from: d */
    public final int f153408d;

    private bucs(int i) {
        this.f153408d = i;
    }

    /* renamed from: a */
    public static bucs m119336a(int i) {
        if (i == 0) {
            return INVALID_TRANSITION;
        }
        if (i == 1) {
            return ENTER;
        }
        if (i != 2) {
            return null;
        }
        return EXIT;
    }

    /* renamed from: b */
    public static bxvr m119337b() {
        return bucr.f153403a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153408d;
    }

    public final String toString() {
        return Integer.toString(this.f153408d);
    }
}
