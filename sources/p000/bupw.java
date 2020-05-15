package p000;

/* renamed from: bupw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bupw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bupw f154682d;

    /* renamed from: e */
    private static volatile bxxk f154683e;

    /* renamed from: a */
    public int f154684a = 0;

    /* renamed from: b */
    public Object f154685b;

    /* renamed from: c */
    public bupx f154686c;

    static {
        bupw bupw = new bupw();
        f154682d = bupw;
        bxvk.m124024a(bupw.class, bupw);
    }

    private bupw() {
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
            return bxvk.m124022a(f154682d, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"b", "a", "c", bups.class, bupu.class, bupl.class, bupj.class});
        } else if (i2 == 3) {
            return new bupw();
        } else {
            if (i2 == 4) {
                return new bxvd(f154682d);
            }
            if (i2 == 5) {
                return f154682d;
            }
            bxxk bxxk = f154683e;
            if (bxxk == null) {
                synchronized (bupw.class) {
                    bxxk = f154683e;
                    if (bxxk == null) {
                        bxxk = new bxve(f154682d);
                        f154683e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
