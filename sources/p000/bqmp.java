package p000;

/* renamed from: bqmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqmp extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bqmp f141246b;

    /* renamed from: c */
    private static volatile bxxk f141247c;

    /* renamed from: a */
    public bxwc f141248a = bxxn.f165040b;

    static {
        bqmp bqmp = new bqmp();
        f141246b = bqmp;
        GeneratedMessageLite.m124024a(bqmp.class, bqmp);
    }

    private bqmp() {
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
            return GeneratedMessageLite.m124022a(f141246b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bqmx.class});
        } else if (i2 == 3) {
            return new bqmp();
        } else {
            if (i2 == 4) {
                return new bxvd((short[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f141246b;
            }
            bxxk bxxk = f141247c;
            if (bxxk == null) {
                synchronized (bqmp.class) {
                    bxxk = f141247c;
                    if (bxxk == null) {
                        bxxk = new bxve(f141246b);
                        f141247c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
