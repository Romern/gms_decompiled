package p000;

/* renamed from: bpry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpry implements bxvp {
    UNDEFINED(0),
    INFERRED_HOME(1),
    INFERRED_WORK(2);
    

    /* renamed from: d */
    public final int f138919d;

    private bpry(int i) {
        this.f138919d = i;
    }

    /* renamed from: a */
    public static bpry m112222a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return INFERRED_HOME;
        }
        if (i != 2) {
            return null;
        }
        return INFERRED_WORK;
    }

    /* renamed from: b */
    public static bxvr m112223b() {
        return bprx.f138914a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138919d;
    }

    public final String toString() {
        return Integer.toString(this.f138919d);
    }
}
