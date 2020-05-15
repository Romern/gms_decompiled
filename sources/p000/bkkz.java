package p000;

/* renamed from: bkkz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkz extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bkkz f124674g;

    /* renamed from: h */
    private static volatile bxxk f124675h;

    /* renamed from: a */
    public int f124676a;

    /* renamed from: b */
    public int f124677b = 0;

    /* renamed from: c */
    public Object f124678c;

    /* renamed from: d */
    public int f124679d;

    /* renamed from: e */
    public String f124680e = "";

    /* renamed from: f */
    public String f124681f = "";

    static {
        bkkz bkkz = new bkkz();
        f124674g = bkkz;
        bxvk.m124024a(bkkz.class, bkkz);
    }

    private bkkz() {
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
            return bxvk.m124022a(f124674g, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", bybu.f165599a, "e", "f", bybv.class});
        } else if (i2 == 3) {
            return new bkkz();
        } else {
            if (i2 == 4) {
                return new bxvd(f124674g);
            }
            if (i2 == 5) {
                return f124674g;
            }
            bxxk bxxk = f124675h;
            if (bxxk == null) {
                synchronized (bkkz.class) {
                    bxxk = f124675h;
                    if (bxxk == null) {
                        bxxk = new bxve(f124674g);
                        f124675h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
