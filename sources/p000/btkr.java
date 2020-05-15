package p000;

/* renamed from: btkr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btkr extends bxvk implements bxxd {

    /* renamed from: c */
    public static final btkr f149293c;

    /* renamed from: d */
    private static volatile bxxk f149294d;

    /* renamed from: a */
    public String f149295a = "";

    /* renamed from: b */
    public String f149296b = "";

    static {
        btkr btkr = new btkr();
        f149293c = btkr;
        bxvk.m124024a(btkr.class, btkr);
    }

    private btkr() {
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
            return bxvk.m124022a(f149293c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new btkr();
        } else {
            if (i2 == 4) {
                return new bxvd(f149293c);
            }
            if (i2 == 5) {
                return f149293c;
            }
            bxxk bxxk = f149294d;
            if (bxxk == null) {
                synchronized (btkr.class) {
                    bxxk = f149294d;
                    if (bxxk == null) {
                        bxxk = new bxve(f149293c);
                        f149294d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
