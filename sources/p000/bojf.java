package p000;

/* renamed from: bojf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojf extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bojf f133267c;

    /* renamed from: d */
    private static volatile bxxk f133268d;

    /* renamed from: a */
    public int f133269a;

    /* renamed from: b */
    public boolean f133270b;

    static {
        bojf bojf = new bojf();
        f133267c = bojf;
        bxvk.m124024a(bojf.class, bojf);
    }

    private bojf() {
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
            return bxvk.m124022a(f133267c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bojf();
        } else {
            if (i2 == 4) {
                return new bxvd(f133267c);
            }
            if (i2 == 5) {
                return f133267c;
            }
            bxxk bxxk = f133268d;
            if (bxxk == null) {
                synchronized (bojf.class) {
                    bxxk = f133268d;
                    if (bxxk == null) {
                        bxxk = new bxve(f133267c);
                        f133268d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
