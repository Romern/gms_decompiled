package p000;

/* renamed from: cbli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbli extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbli f177508d;

    /* renamed from: e */
    private static volatile bxxk f177509e;

    /* renamed from: a */
    public boolean f177510a;

    /* renamed from: b */
    public cblx f177511b;

    /* renamed from: c */
    public bxtx f177512c = bxtx.f164797b;

    static {
        cbli cbli = new cbli();
        f177508d = cbli;
        bxvk.m124024a(cbli.class, cbli);
    }

    private cbli() {
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
            return bxvk.m124022a(f177508d, "\u0000\u0003\u0000\u0000\u0002\r\u0003\u0000\u0000\u0000\u0002\u0007\u0005\t\r\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbli();
        } else {
            if (i2 == 4) {
                return new bxvd(f177508d);
            }
            if (i2 == 5) {
                return f177508d;
            }
            bxxk bxxk = f177509e;
            if (bxxk == null) {
                synchronized (cbli.class) {
                    bxxk = f177509e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177508d);
                        f177509e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
