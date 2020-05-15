package p000;

/* renamed from: cblb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cblb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cblb f177468b;

    /* renamed from: c */
    private static volatile bxxk f177469c;

    /* renamed from: a */
    public cblx f177470a;

    static {
        cblb cblb = new cblb();
        f177468b = cblb;
        bxvk.m124024a(cblb.class, cblb);
    }

    private cblb() {
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
            return bxvk.m124022a(f177468b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cblb();
        } else {
            if (i2 == 4) {
                return new bxvd(f177468b);
            }
            if (i2 == 5) {
                return f177468b;
            }
            bxxk bxxk = f177469c;
            if (bxxk == null) {
                synchronized (cblb.class) {
                    bxxk = f177469c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177468b);
                        f177469c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
