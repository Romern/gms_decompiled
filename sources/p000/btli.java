package p000;

/* renamed from: btli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btli extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btli f149372c;

    /* renamed from: d */
    private static volatile bxxk f149373d;

    /* renamed from: a */
    public int f149374a = 0;

    /* renamed from: b */
    public Object f149375b;

    static {
        btli btli = new btli();
        f149372c = btli;
        bxvk.m124024a(btli.class, btli);
    }

    private btli() {
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
            return bxvk.m124022a(f149372c, "\u0000\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000", new Object[]{"b", "a", btjy.class, btmx.class});
        } else if (i2 == 3) {
            return new btli();
        } else {
            if (i2 == 4) {
                return new bxvd(f149372c);
            }
            if (i2 == 5) {
                return f149372c;
            }
            bxxk bxxk = f149373d;
            if (bxxk == null) {
                synchronized (btli.class) {
                    bxxk = f149373d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149372c);
                        f149373d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
