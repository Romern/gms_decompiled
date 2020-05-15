package p000;

/* renamed from: bubs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bubs implements bxvp {
    DISABLE(0),
    ENABLE(1),
    QUERY(2),
    FLUSH(3),
    CONFIG(4),
    CONTEXT_SIGNAL(5);
    

    /* renamed from: g */
    public final int f153274g;

    private bubs(int i) {
        this.f153274g = i;
    }

    /* renamed from: a */
    public static bubs m119302a(int i) {
        if (i == 0) {
            return DISABLE;
        }
        if (i == 1) {
            return ENABLE;
        }
        if (i == 2) {
            return QUERY;
        }
        if (i == 3) {
            return FLUSH;
        }
        if (i == 4) {
            return CONFIG;
        }
        if (i != 5) {
            return null;
        }
        return CONTEXT_SIGNAL;
    }

    /* renamed from: b */
    public static bxvr m119303b() {
        return bubr.f153266a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f153274g;
    }

    public final String toString() {
        return Integer.toString(this.f153274g);
    }
}
