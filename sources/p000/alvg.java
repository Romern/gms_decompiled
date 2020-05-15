package p000;

/* renamed from: alvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alvg extends bxvk implements bxxd {

    /* renamed from: g */
    public static final alvg f74368g;

    /* renamed from: h */
    private static volatile bxxk f74369h;

    /* renamed from: a */
    public int f74370a;

    /* renamed from: b */
    public int f74371b;

    /* renamed from: c */
    public int f74372c;

    /* renamed from: d */
    public int f74373d;

    /* renamed from: e */
    public int f74374e;

    /* renamed from: f */
    public alvb f74375f;

    static {
        alvg alvg = new alvg();
        f74368g = alvg;
        bxvk.m124024a(alvg.class, alvg);
    }

    private alvg() {
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
            return bxvk.m124022a(f74368g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", alvf.m61939b(), "c", alvc.f74359a, "d", alut.m61925b(), "e", alux.f74352a, "f"});
        } else if (i2 == 3) {
            return new alvg();
        } else {
            if (i2 == 4) {
                return new bxvd(f74368g);
            }
            if (i2 == 5) {
                return f74368g;
            }
            bxxk bxxk = f74369h;
            if (bxxk == null) {
                synchronized (alvg.class) {
                    bxxk = f74369h;
                    if (bxxk == null) {
                        bxxk = new bxve(f74368g);
                        f74369h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
