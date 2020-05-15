package p000;

/* renamed from: bvkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bvkz implements bxvp {
    HOME(0),
    WORK(1),
    NICKNAME(2),
    INFERRED_HOME(3),
    INFERRED_WORK(4);
    

    /* renamed from: f */
    public final int f156498f;

    private bvkz(int i) {
        this.f156498f = i;
    }

    /* renamed from: a */
    public static bvkz m121221a(int i) {
        if (i == 0) {
            return HOME;
        }
        if (i == 1) {
            return WORK;
        }
        if (i == 2) {
            return NICKNAME;
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
    public static bxvr m121222b() {
        return bvky.f156491a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f156498f;
    }

    public final String toString() {
        return Integer.toString(this.f156498f);
    }
}
