package p000;

/* renamed from: blwq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum blwq implements bxvp {
    UNKNOWN_AUTH_TYPE(0),
    FINGERPRINT(2),
    PIN_PASSWORD_OR_PATTERN(3),
    BIOMETRIC(4);
    

    /* renamed from: e */
    public final int f127969e;

    private blwq(int i) {
        this.f127969e = i;
    }

    /* renamed from: a */
    public static blwq m107723a(int i) {
        if (i == 0) {
            return UNKNOWN_AUTH_TYPE;
        }
        if (i == 2) {
            return FINGERPRINT;
        }
        if (i == 3) {
            return PIN_PASSWORD_OR_PATTERN;
        }
        if (i != 4) {
            return null;
        }
        return BIOMETRIC;
    }

    /* renamed from: b */
    public static bxvr m107724b() {
        return blwp.f127963a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f127969e;
    }

    public final String toString() {
        return Integer.toString(this.f127969e);
    }
}
