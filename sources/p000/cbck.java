package p000;

/* renamed from: cbck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbck extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbck f176660d;

    /* renamed from: e */
    private static volatile bxxk f176661e;

    /* renamed from: a */
    public cbmo f176662a;

    /* renamed from: b */
    public int f176663b;

    /* renamed from: c */
    public String f176664c = "";

    static {
        cbck cbck = new cbck();
        f176660d = cbck;
        bxvk.m124024a(cbck.class, cbck);
    }

    private cbck() {
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
            return bxvk.m124022a(f176660d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbck();
        } else {
            if (i2 == 4) {
                return new bxvd(f176660d);
            }
            if (i2 == 5) {
                return f176660d;
            }
            bxxk bxxk = f176661e;
            if (bxxk == null) {
                synchronized (cbck.class) {
                    bxxk = f176661e;
                    if (bxxk == null) {
                        bxxk = new bxve(f176660d);
                        f176661e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
