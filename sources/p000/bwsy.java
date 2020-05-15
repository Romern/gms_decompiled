package p000;

/* renamed from: bwsy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwsy extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwsy f160927b;

    /* renamed from: c */
    public static final bxvj f160928c;

    /* renamed from: e */
    private static volatile bxxk f160929e;

    /* renamed from: a */
    public String f160930a = "";

    /* renamed from: d */
    private int f160931d;

    static {
        bwsy bwsy = new bwsy();
        f160927b = bwsy;
        bxvk.m124024a(bwsy.class, bwsy);
        bwny bwny = bwny.f160414k;
        bwsy bwsy2 = f160927b;
        f160928c = bxvk.m124006a(bwny, bwsy2, bwsy2, 301214406, bxzf.MESSAGE);
    }

    private bwsy() {
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
            return bxvk.m124022a(f160927b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new bwsy();
        } else {
            if (i2 == 4) {
                return new bxvd(f160927b);
            }
            if (i2 == 5) {
                return f160927b;
            }
            bxxk bxxk = f160929e;
            if (bxxk == null) {
                synchronized (bwsy.class) {
                    bxxk = f160929e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160927b);
                        f160929e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
