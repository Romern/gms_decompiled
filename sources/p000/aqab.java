package p000;

/* renamed from: aqab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqab extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aqab f85345d;

    /* renamed from: e */
    private static volatile bxxk f85346e;

    /* renamed from: a */
    public int f85347a;

    /* renamed from: b */
    public int f85348b;

    /* renamed from: c */
    public int f85349c = -1;

    static {
        aqab aqab = new aqab();
        f85345d = aqab;
        bxvk.m124024a(aqab.class, aqab);
    }

    private aqab() {
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
            return bxvk.m124022a(f85345d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", aqaa.f85344a, "c"});
        } else if (i2 == 3) {
            return new aqab();
        } else {
            if (i2 == 4) {
                return new bxvd(f85345d);
            }
            if (i2 == 5) {
                return f85345d;
            }
            bxxk bxxk = f85346e;
            if (bxxk == null) {
                synchronized (aqab.class) {
                    bxxk = f85346e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85345d);
                        f85346e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
