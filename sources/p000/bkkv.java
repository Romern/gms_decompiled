package p000;

/* renamed from: bkkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final bkkv f124647e;

    /* renamed from: f */
    private static volatile bxxk f124648f;

    /* renamed from: a */
    public int f124649a;

    /* renamed from: b */
    public String f124650b = "";

    /* renamed from: c */
    public String f124651c = "";

    /* renamed from: d */
    public String f124652d = "";

    static {
        bkkv bkkv = new bkkv();
        f124647e = bkkv;
        bxvk.m124024a(bkkv.class, bkkv);
    }

    private bkkv() {
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
            return bxvk.m124022a(f124647e, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\rဈ\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bkkv();
        } else {
            if (i2 == 4) {
                return new bxvd(f124647e);
            }
            if (i2 == 5) {
                return f124647e;
            }
            bxxk bxxk = f124648f;
            if (bxxk == null) {
                synchronized (bkkv.class) {
                    bxxk = f124648f;
                    if (bxxk == null) {
                        bxxk = new bxve(f124647e);
                        f124648f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
