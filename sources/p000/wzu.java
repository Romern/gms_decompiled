package p000;

/* renamed from: wzu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public enum wzu implements bxvp {
    KEY_TYPE_UNDEFINED_DO_NOT_USE(0),
    KEY_TYPE_SOFTWARE(1),
    KEY_TYPE_KEYSTORE(2),
    KEY_TYPE_STRONGBOX(3),
    KEY_TYPE_STRONG_AUTH(4);
    

    /* renamed from: f */
    public final int f51645f;

    private wzu(int i) {
        this.f51645f = i;
    }

    /* renamed from: a */
    public static wzu m42542a(int i) {
        if (i == 0) {
            return KEY_TYPE_UNDEFINED_DO_NOT_USE;
        }
        if (i == 1) {
            return KEY_TYPE_SOFTWARE;
        }
        if (i == 2) {
            return KEY_TYPE_KEYSTORE;
        }
        if (i == 3) {
            return KEY_TYPE_STRONGBOX;
        }
        if (i != 4) {
            return null;
        }
        return KEY_TYPE_STRONG_AUTH;
    }

    /* renamed from: b */
    public static bxvr m42543b() {
        return wzt.f51638a;
    }

    /* renamed from: a */
    public final int mo3214a() {
        return this.f51645f;
    }

    public final String toString() {
        return Integer.toString(this.f51645f);
    }
}
