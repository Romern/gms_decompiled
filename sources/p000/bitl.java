package p000;

/* renamed from: bitl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bitl implements bxvp {
    UNKNOWN(0),
    IN_CALL(1),
    ON_HOLD(2),
    INACTIVE(3),
    INCOMING(4),
    CONFERENCED(5),
    MUTED(6);
    

    /* renamed from: h */
    public final int f121673h;

    private bitl(int i) {
        this.f121673h = i;
    }

    /* renamed from: a */
    public static bitl m102818a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return IN_CALL;
            case 2:
                return ON_HOLD;
            case 3:
                return INACTIVE;
            case 4:
                return INCOMING;
            case 5:
                return CONFERENCED;
            case 6:
                return MUTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static bxvr m102819b() {
        return bitk.f121664a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f121673h;
    }

    public final String toString() {
        return Integer.toString(this.f121673h);
    }
}
