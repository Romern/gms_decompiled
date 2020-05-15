package p000;

/* renamed from: ajnv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum ajnv implements bxvp {
    UNKNOWN_FRAME_TYPE(0),
    INTRODUCTION(1),
    RESPONSE(2),
    PAIRED_KEY_ENCRYPTION(3),
    PAIRED_KEY_RESULT(4),
    CERTIFICATE_INFO(5);
    

    /* renamed from: g */
    public final int f71021g;

    private ajnv(int i) {
        this.f71021g = i;
    }

    /* renamed from: a */
    public static ajnv m58896a(int i) {
        if (i == 0) {
            return UNKNOWN_FRAME_TYPE;
        }
        if (i == 1) {
            return INTRODUCTION;
        }
        if (i == 2) {
            return RESPONSE;
        }
        if (i == 3) {
            return PAIRED_KEY_ENCRYPTION;
        }
        if (i == 4) {
            return PAIRED_KEY_RESULT;
        }
        if (i != 5) {
            return null;
        }
        return CERTIFICATE_INFO;
    }

    /* renamed from: b */
    public static bxvr m58897b() {
        return ajnu.f71013a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f71021g;
    }

    public final String toString() {
        return Integer.toString(this.f71021g);
    }
}
