package p000;

/* renamed from: aahp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aahp extends bxvk implements bxxd {

    /* renamed from: c */
    public static final aahp f28142c;

    /* renamed from: d */
    private static volatile bxxk f28143d;

    /* renamed from: a */
    public int f28144a;

    /* renamed from: b */
    public aahq f28145b;

    static {
        aahp aahp = new aahp();
        f28142c = aahp;
        bxvk.m124024a(aahp.class, aahp);
    }

    private aahp() {
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
            return bxvk.m124022a(f28142c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aahp();
        } else {
            if (i2 == 4) {
                return new bxvd(f28142c);
            }
            if (i2 == 5) {
                return f28142c;
            }
            bxxk bxxk = f28143d;
            if (bxxk == null) {
                synchronized (aahp.class) {
                    bxxk = f28143d;
                    if (bxxk == null) {
                        bxxk = new bxve(f28142c);
                        f28143d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
