package p000;

/* renamed from: ajnz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ajnz implements bxvp {
    UNKNOWN_SECURITY_TYPE(0),
    OPEN(1),
    WPA_PSK(2),
    WEP(3);
    

    /* renamed from: e */
    public final int f71042e;

    private ajnz(int i) {
        this.f71042e = i;
    }

    /* renamed from: a */
    public static ajnz m58902a(int i) {
        if (i == 0) {
            return UNKNOWN_SECURITY_TYPE;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return WPA_PSK;
        }
        if (i != 3) {
            return null;
        }
        return WEP;
    }

    /* renamed from: b */
    public static bxvr m58903b() {
        return ajny.f71036a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f71042e;
    }

    public final String toString() {
        return Integer.toString(this.f71042e);
    }
}
