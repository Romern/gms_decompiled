package p000;

/* renamed from: amjd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum amjd implements bxvp {
    UNSPECIFIED(0),
    CP2(1),
    SERVER(2);
    

    /* renamed from: d */
    public final int f74984d;

    private amjd(int i) {
        this.f74984d = i;
    }

    /* renamed from: a */
    public static amjd m62961a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CP2;
        }
        if (i != 2) {
            return null;
        }
        return SERVER;
    }

    /* renamed from: b */
    public static bxvr m62962b() {
        return amjc.f74979a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f74984d;
    }

    public final String toString() {
        return Integer.toString(this.f74984d);
    }
}
