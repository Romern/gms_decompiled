package p000;

/* renamed from: abqn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum abqn implements bxvp {
    VARIANT_NICKNAME(0),
    DEPRECATED_VARIANT_TRANSLIT(1),
    VARIANT_ANNOTATION(2);
    

    /* renamed from: d */
    public final int f57973d;

    private abqn(int i) {
        this.f57973d = i;
    }

    /* renamed from: a */
    public static abqn m48080a(int i) {
        if (i == 0) {
            return VARIANT_NICKNAME;
        }
        if (i == 1) {
            return DEPRECATED_VARIANT_TRANSLIT;
        }
        if (i != 2) {
            return null;
        }
        return VARIANT_ANNOTATION;
    }

    /* renamed from: b */
    public static bxvr m48081b() {
        return abqm.f57968a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f57973d;
    }

    public final String toString() {
        return Integer.toString(this.f57973d);
    }
}
