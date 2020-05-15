package p000;

/* renamed from: bsst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsst extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bsst f146912c;

    /* renamed from: d */
    private static volatile bxxk f146913d;

    /* renamed from: a */
    public int f146914a = 0;

    /* renamed from: b */
    public Object f146915b;

    static {
        bsst bsst = new bsst();
        f146912c = bsst;
        GeneratedMessageLite.m124024a(bsst.class, bsst);
    }

    private bsst() {
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
            return GeneratedMessageLite.m124022a(f146912c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bssp.class, bssr.class, bsss.class, bssq.class});
        } else if (i2 == 3) {
            return new bsst();
        } else {
            if (i2 == 4) {
                return new bxvd(f146912c);
            }
            if (i2 == 5) {
                return f146912c;
            }
            bxxk bxxk = f146913d;
            if (bxxk == null) {
                synchronized (bsst.class) {
                    bxxk = f146913d;
                    if (bxxk == null) {
                        bxxk = new bxve(f146912c);
                        f146913d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
