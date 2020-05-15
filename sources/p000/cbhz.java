package p000;

/* renamed from: cbhz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbhz extends bxvk implements bxxd {

    /* renamed from: d */
    public static final cbhz f177219d;

    /* renamed from: e */
    private static volatile bxxk f177220e;

    /* renamed from: a */
    public String f177221a = "";

    /* renamed from: b */
    public cbhj f177222b;

    /* renamed from: c */
    public long f177223c;

    static {
        cbhz cbhz = new cbhz();
        f177219d = cbhz;
        bxvk.m124024a(cbhz.class, cbhz);
    }

    private cbhz() {
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
            return bxvk.m124022a(f177219d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new cbhz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177219d);
            }
            if (i2 == 5) {
                return f177219d;
            }
            bxxk bxxk = f177220e;
            if (bxxk == null) {
                synchronized (cbhz.class) {
                    bxxk = f177220e;
                    if (bxxk == null) {
                        bxxk = new bxve(f177219d);
                        f177220e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
