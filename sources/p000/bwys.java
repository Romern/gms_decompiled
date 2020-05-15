package p000;

/* renamed from: bwys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwys extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwys f161516c;

    /* renamed from: d */
    public static final bxvj f161517d;

    /* renamed from: e */
    private static volatile bxxk f161518e;

    /* renamed from: a */
    public int f161519a;

    /* renamed from: b */
    public int f161520b;

    static {
        bwys bwys = new bwys();
        f161516c = bwys;
        bxvk.m124024a(bwys.class, bwys);
        bwog bwog = bwog.f160437f;
        bwys bwys2 = f161516c;
        f161517d = bxvk.m124006a(bwog, bwys2, bwys2, 244241556, bxzf.MESSAGE);
    }

    private bwys() {
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
            return bxvk.m124022a(f161516c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bwys();
        } else {
            if (i2 == 4) {
                return new bxvd(f161516c);
            }
            if (i2 == 5) {
                return f161516c;
            }
            bxxk bxxk = f161518e;
            if (bxxk == null) {
                synchronized (bwys.class) {
                    bxxk = f161518e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161516c);
                        f161518e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
