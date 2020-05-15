package p000;

/* renamed from: byjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class byjs extends bxvk implements bxxd {

    /* renamed from: a */
    public static final byjs f166696a;

    /* renamed from: b */
    private static volatile bxxk f166697b;

    static {
        byjs byjs = new byjs();
        f166696a = byjs;
        bxvk.m124024a(byjs.class, byjs);
    }

    private byjs() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f166696a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new byjs();
        }
        if (i2 == 4) {
            return new bxvd(f166696a);
        }
        if (i2 == 5) {
            return f166696a;
        }
        bxxk bxxk = f166697b;
        if (bxxk == null) {
            synchronized (byjs.class) {
                bxxk = f166697b;
                if (bxxk == null) {
                    bxxk = new bxve(f166696a);
                    f166697b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
