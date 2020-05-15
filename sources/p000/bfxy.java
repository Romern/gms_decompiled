package p000;

/* renamed from: bfxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfxy extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bfxy f115636c;

    /* renamed from: d */
    private static volatile bxxk f115637d;

    /* renamed from: a */
    public int f115638a;

    /* renamed from: b */
    public int f115639b;

    static {
        bfxy bfxy = new bfxy();
        f115636c = bfxy;
        bxvk.m124024a(bfxy.class, bfxy);
    }

    private bfxy() {
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
            return bxvk.m124022a(f115636c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bfxy();
        } else {
            if (i2 == 4) {
                return new bxvd(f115636c);
            }
            if (i2 == 5) {
                return f115636c;
            }
            bxxk bxxk = f115637d;
            if (bxxk == null) {
                synchronized (bfxy.class) {
                    bxxk = f115637d;
                    if (bxxk == null) {
                        bxxk = new bxve(f115636c);
                        f115637d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
