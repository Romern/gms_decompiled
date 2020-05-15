package p000;

/* renamed from: bygi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bygi extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bygi f166311g;

    /* renamed from: h */
    private static volatile bxxk f166312h;

    /* renamed from: a */
    public int f166313a;

    /* renamed from: b */
    public double f166314b;

    /* renamed from: c */
    public double f166315c;

    /* renamed from: d */
    public double f166316d;

    /* renamed from: e */
    public float f166317e;

    /* renamed from: f */
    public double f166318f = -1.0d;

    static {
        bygi bygi = new bygi();
        f166311g = bygi;
        bxvk.m124024a(bygi.class, bygi);
    }

    private bygi() {
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
            return bxvk.m124022a(f166311g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004ခ\u0003\u0005က\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bygi();
        } else {
            if (i2 == 4) {
                return new bxvd(f166311g);
            }
            if (i2 == 5) {
                return f166311g;
            }
            bxxk bxxk = f166312h;
            if (bxxk == null) {
                synchronized (bygi.class) {
                    bxxk = f166312h;
                    if (bxxk == null) {
                        bxxk = new bxve(f166311g);
                        f166312h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
