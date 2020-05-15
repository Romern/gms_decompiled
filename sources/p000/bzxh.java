package p000;

/* renamed from: bzxh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzxh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bzxh f171749b;

    /* renamed from: d */
    private static volatile bxxk f171750d;

    /* renamed from: a */
    public int f171751a;

    /* renamed from: c */
    private int f171752c;

    static {
        bzxh bzxh = new bzxh();
        f171749b = bzxh;
        bxvk.m124024a(bzxh.class, bzxh);
    }

    private bzxh() {
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
            return bxvk.m124022a(f171749b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", bzxg.m126294b()});
        } else if (i2 == 3) {
            return new bzxh();
        } else {
            if (i2 == 4) {
                return new bxvd(f171749b);
            }
            if (i2 == 5) {
                return f171749b;
            }
            bxxk bxxk = f171750d;
            if (bxxk == null) {
                synchronized (bzxh.class) {
                    bxxk = f171750d;
                    if (bxxk == null) {
                        bxxk = new bxve(f171749b);
                        f171750d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
