package p000;

/* renamed from: cbgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgx extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbgx f177097c;

    /* renamed from: d */
    private static volatile bxxk f177098d;

    /* renamed from: a */
    public cbmo f177099a;

    /* renamed from: b */
    public cbhu f177100b;

    static {
        cbgx cbgx = new cbgx();
        f177097c = cbgx;
        bxvk.m124024a(cbgx.class, cbgx);
    }

    private cbgx() {
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
            return bxvk.m124022a(f177097c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbgx();
        } else {
            if (i2 == 4) {
                return new bxvd(f177097c);
            }
            if (i2 == 5) {
                return f177097c;
            }
            bxxk bxxk = f177098d;
            if (bxxk == null) {
                synchronized (cbgx.class) {
                    bxxk = f177098d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177097c);
                        f177098d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
