package p000;

/* renamed from: cbgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final cbgk f177043b;

    /* renamed from: c */
    private static volatile bxxk f177044c;

    /* renamed from: a */
    public int f177045a;

    static {
        cbgk cbgk = new cbgk();
        f177043b = cbgk;
        bxvk.m124024a(cbgk.class, cbgk);
    }

    private cbgk() {
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
            return bxvk.m124022a(f177043b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbgk();
        } else {
            if (i2 == 4) {
                return new bxvd(f177043b);
            }
            if (i2 == 5) {
                return f177043b;
            }
            bxxk bxxk = f177044c;
            if (bxxk == null) {
                synchronized (cbgk.class) {
                    bxxk = f177044c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177043b);
                        f177044c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
