package p000;

/* renamed from: bojw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bojw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bojw f133362d;

    /* renamed from: e */
    private static volatile bxxk f133363e;

    /* renamed from: a */
    public int f133364a;

    /* renamed from: b */
    public String f133365b = "";

    /* renamed from: c */
    public int f133366c;

    static {
        bojw bojw = new bojw();
        f133362d = bojw;
        bxvk.m124024a(bojw.class, bojw);
    }

    private bojw() {
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
            return bxvk.m124022a(f133362d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bojw();
        } else {
            if (i2 == 4) {
                return new bxvd(f133362d);
            }
            if (i2 == 5) {
                return f133362d;
            }
            bxxk bxxk = f133363e;
            if (bxxk == null) {
                synchronized (bojw.class) {
                    bxxk = f133363e;
                    if (bxxk == null) {
                        bxxk = new bxve(f133362d);
                        f133363e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
