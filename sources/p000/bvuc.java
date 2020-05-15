package p000;

/* renamed from: bvuc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvuc implements bxvp {
    UNKNOWN_TYPE(0),
    CONFIRMED_HOME(1),
    CONFIRMED_WORK(2),
    INFERRED_HOME(3),
    INFERRED_WORK(4);
    

    /* renamed from: f */
    public final int f157653f;

    private bvuc(int i) {
        this.f157653f = i;
    }

    /* renamed from: a */
    public static bvuc m121468a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return CONFIRMED_HOME;
        }
        if (i == 2) {
            return CONFIRMED_WORK;
        }
        if (i == 3) {
            return INFERRED_HOME;
        }
        if (i != 4) {
            return null;
        }
        return INFERRED_WORK;
    }

    /* renamed from: b */
    public static bxvr m121469b() {
        return bvub.f157646a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f157653f;
    }

    public final String toString() {
        return Integer.toString(this.f157653f);
    }
}
