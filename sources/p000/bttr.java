package p000;

/* renamed from: bttr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum bttr implements bxvp {
    UNKNOWN_SUPPORTED_FEATURE(0),
    STORE_VALUE_CREATION(1),
    CALL_ERROR_HTML(2);
    

    /* renamed from: d */
    public final int f150389d;

    private bttr(int i) {
        this.f150389d = i;
    }

    /* renamed from: a */
    public static bttr m117131a(int i) {
        if (i == 0) {
            return UNKNOWN_SUPPORTED_FEATURE;
        }
        if (i == 1) {
            return STORE_VALUE_CREATION;
        }
        if (i != 2) {
            return null;
        }
        return CALL_ERROR_HTML;
    }

    /* renamed from: b */
    public static bxvr m117132b() {
        return bttq.f150384a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f150389d;
    }

    public final String toString() {
        return Integer.toString(this.f150389d);
    }
}
