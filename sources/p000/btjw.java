package p000;

/* renamed from: btjw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btjw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btjw f149188c;

    /* renamed from: d */
    private static volatile bxxk f149189d;

    /* renamed from: a */
    public int f149190a = 0;

    /* renamed from: b */
    public Object f149191b;

    static {
        btjw btjw = new btjw();
        f149188c = btjw;
        bxvk.m124024a(btjw.class, btjw);
    }

    private btjw() {
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
            return bxvk.m124022a(f149188c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", btjv.class, btjt.class, btju.class});
        } else if (i2 == 3) {
            return new btjw();
        } else {
            if (i2 == 4) {
                return new bxvd(f149188c);
            }
            if (i2 == 5) {
                return f149188c;
            }
            bxxk bxxk = f149189d;
            if (bxxk == null) {
                synchronized (btjw.class) {
                    bxxk = f149189d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149188c);
                        f149189d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
