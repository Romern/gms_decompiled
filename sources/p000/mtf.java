package p000;

/* renamed from: mtf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum mtf implements bxvp {
    CONNECTION_TYPE_UNSPECIFIED(0),
    USB(1),
    WIFI(2);
    

    /* renamed from: d */
    public final int f34662d;

    private mtf(int i) {
        this.f34662d = i;
    }

    /* renamed from: a */
    public static mtf m25601a(int i) {
        if (i == 0) {
            return CONNECTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return USB;
        }
        if (i != 2) {
            return null;
        }
        return WIFI;
    }

    /* renamed from: b */
    public static bxvr m25602b() {
        return mte.f34657a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f34662d;
    }

    public final String toString() {
        return Integer.toString(this.f34662d);
    }
}
