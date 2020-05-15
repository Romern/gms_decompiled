package p000;

/* renamed from: afyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum afyd implements bxvp {
    UNKNOWN(0),
    PROFILE_SYNC(1),
    WIPEOUT(2);
    

    /* renamed from: d */
    public final int f64959d;

    private afyd(int i) {
        this.f64959d = i;
    }

    /* renamed from: a */
    public static afyd m53664a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PROFILE_SYNC;
        }
        if (i != 2) {
            return null;
        }
        return WIPEOUT;
    }

    /* renamed from: b */
    public static bxvr m53665b() {
        return afyc.f64954a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f64959d;
    }

    public final String toString() {
        return Integer.toString(this.f64959d);
    }
}
