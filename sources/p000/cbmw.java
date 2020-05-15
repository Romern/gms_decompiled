package p000;

/* renamed from: cbmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbmw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cbmw f177688c;

    /* renamed from: d */
    private static volatile bxxk f177689d;

    /* renamed from: a */
    public cbma f177690a;

    /* renamed from: b */
    public cbmx f177691b;

    static {
        cbmw cbmw = new cbmw();
        f177688c = cbmw;
        bxvk.m124024a(cbmw.class, cbmw);
    }

    private cbmw() {
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
            return bxvk.m124022a(f177688c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cbmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f177688c);
            }
            if (i2 == 5) {
                return f177688c;
            }
            bxxk bxxk = f177689d;
            if (bxxk == null) {
                synchronized (cbmw.class) {
                    bxxk = f177689d;
                    if (bxxk == null) {
                        bxxk = new bxve(f177688c);
                        f177689d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
