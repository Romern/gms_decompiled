package p000;

/* renamed from: bkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bkp f5011c;

    /* renamed from: e */
    private static volatile bxxk f5012e;

    /* renamed from: a */
    public long f5013a;

    /* renamed from: b */
    public bxwc f5014b = bxxn.f165040b;

    /* renamed from: d */
    private int f5015d;

    static {
        bkp bkp = new bkp();
        f5011c = bkp;
        bxvk.m124024a(bkp.class, bkp);
    }

    private bkp() {
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
            return bxvk.m124022a(f5011c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"d", "a", "b", bkk.class});
        } else if (i2 == 3) {
            return new bkp();
        } else {
            if (i2 == 4) {
                return new bxvd(f5011c);
            }
            if (i2 == 5) {
                return f5011c;
            }
            bxxk bxxk = f5012e;
            if (bxxk == null) {
                synchronized (bkp.class) {
                    bxxk = f5012e;
                    if (bxxk == null) {
                        bxxk = new bxve(f5011c);
                        f5012e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
