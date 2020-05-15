package p000;

/* renamed from: bmqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bmqh implements bxvp {
    UNKNOWN(0),
    CHECKED(1),
    UNCHECKED(2),
    UNDETERMINED(3);
    

    /* renamed from: e */
    public final int f130395e;

    private bmqh(int i) {
        this.f130395e = i;
    }

    /* renamed from: a */
    public static bmqh m108281a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CHECKED;
        }
        if (i == 2) {
            return UNCHECKED;
        }
        if (i != 3) {
            return null;
        }
        return UNDETERMINED;
    }

    /* renamed from: b */
    public static bxvr m108282b() {
        return bmqg.f130389a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f130395e;
    }

    public final String toString() {
        return Integer.toString(this.f130395e);
    }
}
