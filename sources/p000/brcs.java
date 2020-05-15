package p000;

/* renamed from: brcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brcs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final brcs f142426a;

    /* renamed from: b */
    private static volatile bxxk f142427b;

    static {
        brcs brcs = new brcs();
        f142426a = brcs;
        bxvk.m124024a(brcs.class, brcs);
    }

    private brcs() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return bxvk.m124022a(f142426a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new brcs();
        }
        if (i2 == 4) {
            return new bxvd(f142426a);
        }
        if (i2 == 5) {
            return f142426a;
        }
        bxxk bxxk = f142427b;
        if (bxxk == null) {
            synchronized (brcs.class) {
                bxxk = f142427b;
                if (bxxk == null) {
                    bxxk = new bxve(f142426a);
                    f142427b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
