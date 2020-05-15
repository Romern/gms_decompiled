package p000;

/* renamed from: bmab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bmab extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bmab f128425d;

    /* renamed from: e */
    private static volatile bxxk f128426e;

    /* renamed from: a */
    public int f128427a;

    /* renamed from: b */
    public int f128428b;

    /* renamed from: c */
    public bxwc f128429c = bxxn.f165040b;

    static {
        bmab bmab = new bmab();
        f128425d = bmab;
        GeneratedMessageLite.m124024a(bmab.class, bmab);
    }

    private bmab() {
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
            return GeneratedMessageLite.m124022a(f128425d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", blzz.f128424a, "c", blzy.class});
        } else if (i2 == 3) {
            return new bmab();
        } else {
            if (i2 == 4) {
                return new bxvd((int[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return f128425d;
            }
            bxxk bxxk = f128426e;
            if (bxxk == null) {
                synchronized (bmab.class) {
                    bxxk = f128426e;
                    if (bxxk == null) {
                        bxxk = new bxve(f128425d);
                        f128426e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
