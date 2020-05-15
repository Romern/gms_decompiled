package p000;

/* renamed from: bavo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bavo extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bavo f101902c;

    /* renamed from: e */
    private static volatile bxxk f101903e;

    /* renamed from: a */
    public String f101904a = "";

    /* renamed from: b */
    public String f101905b = "";

    /* renamed from: d */
    private int f101906d;

    static {
        bavo bavo = new bavo();
        f101902c = bavo;
        bxvk.m124024a(bavo.class, bavo);
    }

    private bavo() {
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
            return bxvk.m124022a(f101902c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bavo();
        } else {
            if (i2 == 4) {
                return new bxvd(f101902c);
            }
            if (i2 == 5) {
                return f101902c;
            }
            bxxk bxxk = f101903e;
            if (bxxk == null) {
                synchronized (bavo.class) {
                    bxxk = f101903e;
                    if (bxxk == null) {
                        bxxk = new bxve(f101902c);
                        f101903e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
