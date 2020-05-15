package p000;

/* renamed from: biqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqv extends bxvk implements bxxd {

    /* renamed from: e */
    public static final biqv f121353e;

    /* renamed from: f */
    private static volatile bxxk f121354f;

    /* renamed from: a */
    public int f121355a;

    /* renamed from: b */
    public int f121356b;

    /* renamed from: c */
    public int f121357c;

    /* renamed from: d */
    public int f121358d;

    static {
        biqv biqv = new biqv();
        f121353e = biqv;
        bxvk.m124024a(biqv.class, biqv);
    }

    private biqv() {
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
            return bxvk.m124022a(f121353e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new biqv();
        } else {
            if (i2 == 4) {
                return new bxvd(f121353e);
            }
            if (i2 == 5) {
                return f121353e;
            }
            bxxk bxxk = f121354f;
            if (bxxk == null) {
                synchronized (biqv.class) {
                    bxxk = f121354f;
                    if (bxxk == null) {
                        bxxk = new bxve(f121353e);
                        f121354f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
