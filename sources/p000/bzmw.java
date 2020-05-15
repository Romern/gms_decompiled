package p000;

/* renamed from: bzmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bzmw extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bzmw f170667d;

    /* renamed from: f */
    private static volatile bxxk f170668f;

    /* renamed from: a */
    public bzmm f170669a;

    /* renamed from: b */
    public bxwc f170670b = bxxn.f165040b;

    /* renamed from: c */
    public bzln f170671c;

    /* renamed from: e */
    private int f170672e;

    static {
        bzmw bzmw = new bzmw();
        f170667d = bzmw;
        bxvk.m124024a(bzmw.class, bzmw);
    }

    private bzmw() {
        bxtx bxtx = bxtx.f164797b;
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
            return bxvk.m124022a(f170667d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဉ\u0001\u0002\u001b\u0004ဉ\u0002", new Object[]{"e", "a", "b", bzlx.class, "c"});
        } else if (i2 == 3) {
            return new bzmw();
        } else {
            if (i2 == 4) {
                return new bxvd(f170667d);
            }
            if (i2 == 5) {
                return f170667d;
            }
            bxxk bxxk = f170668f;
            if (bxxk == null) {
                synchronized (bzmw.class) {
                    bxxk = f170668f;
                    if (bxxk == null) {
                        bxxk = new bxve(f170667d);
                        f170668f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
