package p000;

/* renamed from: aufb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aufb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final aufb f91629b;

    /* renamed from: d */
    private static volatile bxxk f91630d;

    /* renamed from: a */
    public bxyk f91631a;

    /* renamed from: c */
    private int f91632c;

    static {
        aufb aufb = new aufb();
        f91629b = aufb;
        bxvk.m124024a(aufb.class, aufb);
    }

    private aufb() {
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
            return bxvk.m124022a(f91629b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new aufb();
        } else {
            if (i2 == 4) {
                return new bxvd(f91629b);
            }
            if (i2 == 5) {
                return f91629b;
            }
            bxxk bxxk = f91630d;
            if (bxxk == null) {
                synchronized (aufb.class) {
                    bxxk = f91630d;
                    if (bxxk == null) {
                        bxxk = new bxve(f91629b);
                        f91630d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
