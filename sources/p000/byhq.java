package p000;

/* renamed from: byhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byhq implements bxvp {
    UNKNOWN(0),
    UPDATE(1),
    RESET(2);
    

    /* renamed from: d */
    public final int f166493d;

    private byhq(int i) {
        this.f166493d = i;
    }

    /* renamed from: a */
    public static byhq m124822a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UPDATE;
        }
        if (i != 2) {
            return null;
        }
        return RESET;
    }

    /* renamed from: b */
    public static bxvr m124823b() {
        return byhp.f166488a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f166493d;
    }

    public final String toString() {
        return Integer.toString(this.f166493d);
    }
}
