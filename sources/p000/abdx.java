package p000;

/* renamed from: abdx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abdx implements bxvp {
    UNKNOWN_TYPING_STATUS(0),
    TYPING(1),
    TEXT_ENTERED(2),
    NO_TEXT_ENTERED(3);
    

    /* renamed from: e */
    public final int f57153e;

    private abdx(int i) {
        this.f57153e = i;
    }

    /* renamed from: a */
    public static abdx m47561a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPING_STATUS;
        }
        if (i == 1) {
            return TYPING;
        }
        if (i == 2) {
            return TEXT_ENTERED;
        }
        if (i != 3) {
            return null;
        }
        return NO_TEXT_ENTERED;
    }

    /* renamed from: b */
    public static bxvr m47562b() {
        return abdw.f57147a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f57153e;
    }

    public final String toString() {
        return Integer.toString(this.f57153e);
    }
}
