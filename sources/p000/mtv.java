package p000;

/* renamed from: mtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mtv extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final mtv f34719d;

    /* renamed from: e */
    private static volatile bxxk f34720e;

    /* renamed from: a */
    public int f34721a;

    /* renamed from: b */
    public int f34722b;

    /* renamed from: c */
    public long f34723c;

    static {
        mtv mtv = new mtv();
        f34719d = mtv;
        GeneratedMessageLite.m124024a(mtv.class, mtv);
    }

    private mtv() {
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
            return GeneratedMessageLite.m124022a(f34719d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new mtv();
        } else {
            if (i2 == 4) {
                return new bxvd(f34719d);
            }
            if (i2 == 5) {
                return f34719d;
            }
            bxxk bxxk = f34720e;
            if (bxxk == null) {
                synchronized (mtv.class) {
                    bxxk = f34720e;
                    if (bxxk == null) {
                        bxxk = new bxve(f34719d);
                        f34720e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
