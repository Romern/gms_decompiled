package p000;

/* renamed from: bojz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojz extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bojz f133375c;

    /* renamed from: d */
    private static volatile bxxk f133376d;

    /* renamed from: a */
    public int f133377a;

    /* renamed from: b */
    public int f133378b;

    static {
        bojz bojz = new bojz();
        f133375c = bojz;
        bxvk.m124024a(bojz.class, bojz);
    }

    private bojz() {
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
            return bxvk.m124022a(f133375c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bojz();
        } else {
            if (i2 == 4) {
                return new bxvd(f133375c);
            }
            if (i2 == 5) {
                return f133375c;
            }
            bxxk bxxk = f133376d;
            if (bxxk == null) {
                synchronized (bojz.class) {
                    bxxk = f133376d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133375c);
                        f133376d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
