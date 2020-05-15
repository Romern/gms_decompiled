package p000;

/* renamed from: cbgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbgz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final cbgz f177103b;

    /* renamed from: c */
    private static volatile bxxk f177104c;

    /* renamed from: a */
    public cbmo f177105a;

    static {
        cbgz cbgz = new cbgz();
        f177103b = cbgz;
        GeneratedMessageLite.m124024a(cbgz.class, cbgz);
    }

    private cbgz() {
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
            return GeneratedMessageLite.m124022a(f177103b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
        } else if (i2 == 3) {
            return new cbgz();
        } else {
            if (i2 == 4) {
                return new bxvd(f177103b);
            }
            if (i2 == 5) {
                return f177103b;
            }
            bxxk bxxk = f177104c;
            if (bxxk == null) {
                synchronized (cbgz.class) {
                    bxxk = f177104c;
                    if (bxxk == null) {
                        bxxk = new bxve(f177103b);
                        f177104c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
