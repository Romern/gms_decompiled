package p000;

/* renamed from: bpot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpot implements bxvp {
    HOME(0),
    WORK(1),
    NICKNAME(2);
    

    /* renamed from: d */
    public final int f138574d;

    private bpot(int i) {
        this.f138574d = i;
    }

    /* renamed from: a */
    public static bpot m112130a(int i) {
        if (i == 0) {
            return HOME;
        }
        if (i == 1) {
            return WORK;
        }
        if (i != 2) {
            return null;
        }
        return NICKNAME;
    }

    /* renamed from: b */
    public static bxvr m112131b() {
        return bpos.f138569a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138574d;
    }

    public final String toString() {
        return Integer.toString(this.f138574d);
    }
}
