package p000;

/* renamed from: qhr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qhr extends bxvk implements bxxd {

    /* renamed from: d */
    public static final qhr f41407d;

    /* renamed from: e */
    private static volatile bxxk f41408e;

    /* renamed from: a */
    public int f41409a;

    /* renamed from: b */
    public int f41410b = 1;

    /* renamed from: c */
    public String f41411c = "";

    static {
        qhr qhr = new qhr();
        f41407d = qhr;
        bxvk.m124024a(qhr.class, qhr);
    }

    private qhr() {
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
            return bxvk.m124022a(f41407d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", qhq.m32183b(), "c"});
        } else if (i2 == 3) {
            return new qhr();
        } else {
            if (i2 == 4) {
                return new bxvd(f41407d);
            }
            if (i2 == 5) {
                return f41407d;
            }
            bxxk bxxk = f41408e;
            if (bxxk == null) {
                synchronized (qhr.class) {
                    bxxk = f41408e;
                    if (bxxk == null) {
                        bxxk = new bxve(f41407d);
                        f41408e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
