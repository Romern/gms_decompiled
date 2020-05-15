package p000;

/* renamed from: cbqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbqh extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbqh f178021d;

    /* renamed from: e */
    private static volatile bxxk f178022e;

    /* renamed from: a */
    public cbqj f178023a;

    /* renamed from: b */
    public cbqy f178024b;

    /* renamed from: c */
    public cboe f178025c;

    static {
        cbqh cbqh = new cbqh();
        f178021d = cbqh;
        bxvk.m124024a(cbqh.class, cbqh);
    }

    private cbqh() {
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
            return bxvk.m124022a(f178021d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\t\u0003\t\u0004\t", new Object[]{"b", "c", "a"});
        } else if (i2 == 3) {
            return new cbqh();
        } else {
            if (i2 == 4) {
                return new bxvd(f178021d);
            }
            if (i2 == 5) {
                return f178021d;
            }
            bxxk bxxk = f178022e;
            if (bxxk == null) {
                synchronized (cbqh.class) {
                    bxxk = f178022e;
                    if (bxxk == null) {
                        bxxk = new bxve(f178021d);
                        f178022e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
