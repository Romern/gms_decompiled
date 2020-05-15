package p000;

/* renamed from: bwls */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bwls implements bxvp {
    UNKNOWN_AUTH_TYPE(0),
    FINGERPRINT(2),
    PIN_PASSWORD_OR_PATTERN(3),
    BIOMETRIC(4),
    FACE_ID(5);
    

    /* renamed from: f */
    public final int f160177f;

    private bwls(int i) {
        this.f160177f = i;
    }

    /* renamed from: a */
    public static bwls m122079a(int i) {
        if (i == 0) {
            return UNKNOWN_AUTH_TYPE;
        }
        if (i == 2) {
            return FINGERPRINT;
        }
        if (i == 3) {
            return PIN_PASSWORD_OR_PATTERN;
        }
        if (i == 4) {
            return BIOMETRIC;
        }
        if (i != 5) {
            return null;
        }
        return FACE_ID;
    }

    /* renamed from: b */
    public static bxvr m122080b() {
        return bwlr.f160170a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f160177f;
    }

    public final String toString() {
        return Integer.toString(this.f160177f);
    }
}
