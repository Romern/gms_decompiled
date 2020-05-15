package p000;

/* renamed from: bwww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwww extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bwww f161292d;

    /* renamed from: e */
    private static volatile bxxk f161293e;

    /* renamed from: a */
    public int f161294a;

    /* renamed from: b */
    public int f161295b;

    /* renamed from: c */
    public int f161296c;

    static {
        bwww bwww = new bwww();
        f161292d = bwww;
        bxvk.m124024a(bwww.class, bwww);
    }

    private bwww() {
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
            return bxvk.m124022a(f161292d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", bwwu.f161291a, "c"});
        } else if (i2 == 3) {
            return new bwww();
        } else {
            if (i2 == 4) {
                return new bxvd(f161292d);
            }
            if (i2 == 5) {
                return f161292d;
            }
            bxxk bxxk = f161293e;
            if (bxxk == null) {
                synchronized (bwww.class) {
                    bxxk = f161293e;
                    if (bxxk == null) {
                        bxxk = new bxve(f161292d);
                        f161293e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
