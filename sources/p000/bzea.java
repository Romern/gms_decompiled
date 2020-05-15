package p000;

/* renamed from: bzea */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzea extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bzea f169626c;

    /* renamed from: d */
    private static volatile bxxk f169627d;

    /* renamed from: a */
    public int f169628a;

    /* renamed from: b */
    public int f169629b;

    static {
        bzea bzea = new bzea();
        f169626c = bzea;
        bxvk.m124024a(bzea.class, bzea);
    }

    private bzea() {
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
            return bxvk.m124022a(f169626c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bzea();
        } else {
            if (i2 == 4) {
                return new bxvd(f169626c);
            }
            if (i2 == 5) {
                return f169626c;
            }
            bxxk bxxk = f169627d;
            if (bxxk == null) {
                synchronized (bzea.class) {
                    bxxk = f169627d;
                    if (bxxk == null) {
                        bxxk = new bxve(f169626c);
                        f169627d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
