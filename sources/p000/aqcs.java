package p000;

/* renamed from: aqcs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqcs extends bxvk implements bxxd {

    /* renamed from: d */
    public static final aqcs f85699d;

    /* renamed from: e */
    private static volatile bxxk f85700e;

    /* renamed from: a */
    public int f85701a;

    /* renamed from: b */
    public int f85702b;

    /* renamed from: c */
    public bxtx f85703c = bxtx.f164797b;

    static {
        aqcs aqcs = new aqcs();
        f85699d = aqcs;
        bxvk.m124024a(aqcs.class, aqcs);
    }

    private aqcs() {
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
            return bxvk.m124022a(f85699d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqcs();
        } else {
            if (i2 == 4) {
                return new bxvd(f85699d);
            }
            if (i2 == 5) {
                return f85699d;
            }
            bxxk bxxk = f85700e;
            if (bxxk == null) {
                synchronized (aqcs.class) {
                    bxxk = f85700e;
                    if (bxxk == null) {
                        bxxk = new bxve(f85699d);
                        f85700e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
