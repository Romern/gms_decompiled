package p000;

/* renamed from: bwqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwqw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bwqw f160727b;

    /* renamed from: c */
    public static final bxvj f160728c;

    /* renamed from: e */
    private static volatile bxxk f160729e;

    /* renamed from: a */
    public int f160730a;

    /* renamed from: d */
    private int f160731d;

    static {
        bwqw bwqw = new bwqw();
        f160727b = bwqw;
        bxvk.m124024a(bwqw.class, bwqw);
        bwou bwou = bwou.f160492e;
        bwqw bwqw2 = f160727b;
        f160728c = bxvk.m124006a(bwou, bwqw2, bwqw2, 235102461, bxzf.MESSAGE);
    }

    private bwqw() {
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
            return bxvk.m124022a(f160727b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "a", bwqu.f160726a});
        } else if (i2 == 3) {
            return new bwqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f160727b);
            }
            if (i2 == 5) {
                return f160727b;
            }
            bxxk bxxk = f160729e;
            if (bxxk == null) {
                synchronized (bwqw.class) {
                    bxxk = f160729e;
                    if (bxxk == null) {
                        bxxk = new bxve(f160727b);
                        f160729e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
