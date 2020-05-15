package p000;

/* renamed from: cbhu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhu extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbhu f177185d;

    /* renamed from: e */
    private static volatile bxxk f177186e;

    /* renamed from: a */
    public int f177187a = 0;

    /* renamed from: b */
    public Object f177188b;

    /* renamed from: c */
    public String f177189c = "";

    static {
        cbhu cbhu = new cbhu();
        f177185d = cbhu;
        bxvk.m124024a(cbhu.class, cbhu);
    }

    private cbhu() {
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
            return bxvk.m124022a(f177185d, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u00075\u0000", new Object[]{"b", "a", "c"});
        } else if (i2 == 3) {
            return new cbhu();
        } else {
            if (i2 == 4) {
                return new bxvd(f177185d);
            }
            if (i2 == 5) {
                return f177185d;
            }
            bxxk bxxk = f177186e;
            if (bxxk == null) {
                synchronized (cbhu.class) {
                    bxxk = f177186e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177185d);
                        f177186e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
