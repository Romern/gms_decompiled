package p000;

/* renamed from: byan */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum byan implements bxvp {
    NONE(0),
    CALL(1),
    CAPTURE(2),
    HOTWORD(3),
    PREEMPT(4);
    

    /* renamed from: f */
    public final int f165294f;

    private byan(int i) {
        this.f165294f = i;
    }

    /* renamed from: a */
    public static byan m124603a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return CALL;
        }
        if (i == 2) {
            return CAPTURE;
        }
        if (i == 3) {
            return HOTWORD;
        }
        if (i != 4) {
            return null;
        }
        return PREEMPT;
    }

    /* renamed from: b */
    public static bxvr m124605b() {
        return byam.f165287a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f165294f;
    }

    public final String toString() {
        return Integer.toString(this.f165294f);
    }
}
