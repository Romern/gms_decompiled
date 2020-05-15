package p000;

/* renamed from: bpoz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bpoz implements bxvp {
    UNKNOWN(0),
    HOME(1),
    WORK(2),
    NICKNAME(3),
    INFERRED_HOME(4),
    INFERRED_WORK(5);
    

    /* renamed from: g */
    public final int f138594g;

    private bpoz(int i) {
        this.f138594g = i;
    }

    /* renamed from: a */
    public static bpoz m112138a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return HOME;
        }
        if (i == 2) {
            return WORK;
        }
        if (i == 3) {
            return NICKNAME;
        }
        if (i == 4) {
            return INFERRED_HOME;
        }
        if (i != 5) {
            return null;
        }
        return INFERRED_WORK;
    }

    /* renamed from: b */
    public static bxvr m112139b() {
        return bpoy.f138586a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f138594g;
    }

    public final String toString() {
        return Integer.toString(this.f138594g);
    }
}
