package p000;

/* renamed from: bwuf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwuf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bwuf f161026c;

    /* renamed from: d */
    private static volatile bxxk f161027d;

    /* renamed from: a */
    public int f161028a = 0;

    /* renamed from: b */
    public Object f161029b;

    static {
        bwuf bwuf = new bwuf();
        f161026c = bwuf;
        bxvk.m124024a(bwuf.class, bwuf);
    }

    private bwuf() {
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
            return bxvk.m124022a(f161026c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bwug.class, bwuk.class, bwuh.class, bwum.class});
        } else if (i2 == 3) {
            return new bwuf();
        } else {
            if (i2 == 4) {
                return new bxvd(f161026c);
            }
            if (i2 == 5) {
                return f161026c;
            }
            bxxk bxxk = f161027d;
            if (bxxk == null) {
                synchronized (bwuf.class) {
                    bxxk = f161027d;
                    if (bxxk == null) {
                        bxxk = new bxve(f161026c);
                        f161027d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
