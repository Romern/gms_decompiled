package p000;

/* renamed from: bppf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bppf extends GeneratedMessageLite implements bxxd {

    /* renamed from: d */
    public static final bppf f138610d;

    /* renamed from: e */
    private static volatile bxxk f138611e;

    /* renamed from: a */
    public int f138612a;

    /* renamed from: b */
    public int f138613b;

    /* renamed from: c */
    public int f138614c;

    static {
        bppf bppf = new bppf();
        f138610d = bppf;
        GeneratedMessageLite.m124024a(bppf.class, bppf);
    }

    private bppf() {
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
            return GeneratedMessageLite.m124022a(f138610d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bppf();
        } else {
            if (i2 == 4) {
                return new bxvd(f138610d);
            }
            if (i2 == 5) {
                return f138610d;
            }
            bxxk bxxk = f138611e;
            if (bxxk == null) {
                synchronized (bppf.class) {
                    bxxk = f138611e;
                    if (bxxk == null) {
                        bxxk = new bxve(f138610d);
                        f138611e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
