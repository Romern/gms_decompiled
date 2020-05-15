package p000;

/* renamed from: buup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum buup implements bxvp {
    UNKNOWN_PACKET_TYPE(0),
    DATA(1),
    CONTROL(2);
    

    /* renamed from: d */
    public final int f154971d;

    private buup(int i) {
        this.f154971d = i;
    }

    /* renamed from: a */
    public static buup m120469a(int i) {
        if (i == 0) {
            return UNKNOWN_PACKET_TYPE;
        }
        if (i == 1) {
            return DATA;
        }
        if (i != 2) {
            return null;
        }
        return CONTROL;
    }

    /* renamed from: b */
    public static bxvr m120470b() {
        return buuo.f154966a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f154971d;
    }

    public final String toString() {
        return Integer.toString(this.f154971d);
    }
}
