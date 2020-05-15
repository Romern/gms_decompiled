package p000;

/* renamed from: lah */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lah extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final lah f25539e;

    /* renamed from: f */
    private static volatile bxxk f25540f;

    /* renamed from: a */
    public kzz f25541a;

    /* renamed from: b */
    public lbf f25542b;

    /* renamed from: c */
    public lba f25543c;

    /* renamed from: d */
    public bxwc f25544d = bxxn.f165040b;

    static {
        lah lah = new lah();
        f25539e = lah;
        GeneratedMessageLite.m124024a(lah.class, lah);
    }

    private lah() {
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
            return GeneratedMessageLite.m124022a(f25539e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002\t\u0003\t\u0004\u001b", new Object[]{"a", "b", "c", "d", lbd.class});
        } else if (i2 == 3) {
            return new lah();
        } else {
            if (i2 == 4) {
                return new bxvd(f25539e);
            }
            if (i2 == 5) {
                return f25539e;
            }
            bxxk bxxk = f25540f;
            if (bxxk == null) {
                synchronized (lah.class) {
                    bxxk = f25540f;
                    if (bxxk == null) {
                        bxxk = new bxve(f25539e);
                        f25540f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
