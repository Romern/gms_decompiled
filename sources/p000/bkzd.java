package p000;

/* renamed from: bkzd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkzd extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkzd f125557e;

    /* renamed from: f */
    private static volatile bxxk f125558f;

    /* renamed from: a */
    public int f125559a;

    /* renamed from: b */
    public int f125560b;

    /* renamed from: c */
    public int f125561c;

    /* renamed from: d */
    public boolean f125562d;

    static {
        bkzd bkzd = new bkzd();
        f125557e = bkzd;
        bxvk.m124024a(bkzd.class, bkzd);
    }

    private bkzd() {
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
            return bxvk.m124022a(f125557e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", bkzv.f125703a, "c", bkyf.f125458a, "d"});
        } else if (i2 == 3) {
            return new bkzd();
        } else {
            if (i2 == 4) {
                return new bxvd(f125557e);
            }
            if (i2 == 5) {
                return f125557e;
            }
            bxxk bxxk = f125558f;
            if (bxxk == null) {
                synchronized (bkzd.class) {
                    bxxk = f125558f;
                    if (bxxk == null) {
                        bxxk = new bxve(f125557e);
                        f125558f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
