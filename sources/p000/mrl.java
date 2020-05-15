package p000;

/* renamed from: mrl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mrl implements bxvp {
    UNKNOWN_CONNECTED(0),
    TIMEOUT(1),
    EXCEPTION(2),
    CONNECTED(3);
    

    /* renamed from: e */
    public final int f34442e;

    private mrl(int i) {
        this.f34442e = i;
    }

    /* renamed from: a */
    public static mrl m25551a(int i) {
        if (i == 0) {
            return UNKNOWN_CONNECTED;
        }
        if (i == 1) {
            return TIMEOUT;
        }
        if (i == 2) {
            return EXCEPTION;
        }
        if (i != 3) {
            return null;
        }
        return CONNECTED;
    }

    /* renamed from: b */
    public static bxvr m25552b() {
        return mrk.f34436a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34442e;
    }

    public final String toString() {
        return Integer.toString(this.f34442e);
    }
}
