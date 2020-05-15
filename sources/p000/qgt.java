package p000;

/* renamed from: qgt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum qgt implements bxvp {
    NO_RESTRICTION(0),
    SW_DEVICE(1),
    LATCHSKY_DEVICE(2);
    

    /* renamed from: d */
    public final int f41219d;

    private qgt(int i) {
        this.f41219d = i;
    }

    /* renamed from: a */
    public static qgt m32149a(int i) {
        if (i == 0) {
            return NO_RESTRICTION;
        }
        if (i == 1) {
            return SW_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return LATCHSKY_DEVICE;
    }

    /* renamed from: b */
    public static bxvr m32150b() {
        return qgs.f41214a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f41219d;
    }

    public final String toString() {
        return Integer.toString(this.f41219d);
    }
}
