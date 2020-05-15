package p000;

/* renamed from: jig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jig extends bxvk implements bxxd {

    /* renamed from: i */
    public static final jig f22543i;

    /* renamed from: j */
    private static volatile bxxk f22544j;

    /* renamed from: a */
    public int f22545a;

    /* renamed from: b */
    public int f22546b;

    /* renamed from: c */
    public int f22547c;

    /* renamed from: d */
    public int f22548d;

    /* renamed from: e */
    public int f22549e;

    /* renamed from: f */
    public bxtx f22550f = bxtx.f164797b;

    /* renamed from: g */
    public int f22551g;

    /* renamed from: h */
    public bxtx f22552h = bxtx.f164797b;

    static {
        jig jig = new jig();
        f22543i = jig;
        bxvk.m124024a(jig.class, jig);
    }

    private jig() {
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
            return bxvk.m124022a(f22543i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ည\u0004\u0006င\u0005\u0007ည\u0006", new Object[]{"a", "b", jie.f22542a, "c", "d", "e", jic.f22541a, "f", "g", "h"});
        } else if (i2 == 3) {
            return new jig();
        } else {
            if (i2 == 4) {
                return new bxvd(f22543i);
            }
            if (i2 == 5) {
                return f22543i;
            }
            bxxk bxxk = f22544j;
            if (bxxk == null) {
                synchronized (jig.class) {
                    bxxk = f22544j;
                    if (bxxk == null) {
                        bxxk = new bxve(f22543i);
                        f22544j = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
