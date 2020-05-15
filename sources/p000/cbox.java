package p000;

/* renamed from: cbox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cbox extends bxvk implements bxxd {

    /* renamed from: g */
    public static final cbox f177875g;

    /* renamed from: h */
    private static volatile bxxk f177876h;

    /* renamed from: a */
    public bxyk f177877a;

    /* renamed from: b */
    public boolean f177878b;

    /* renamed from: c */
    public boolean f177879c;

    /* renamed from: d */
    public boolean f177880d;

    /* renamed from: e */
    public boolean f177881e;

    /* renamed from: f */
    public bxwc f177882f = bxxn.f165040b;

    static {
        cbox cbox = new cbox();
        f177875g = cbox;
        bxvk.m124024a(cbox.class, cbox);
    }

    private cbox() {
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
            return bxvk.m124022a(f177875g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001\t\u0002\u0007\u0003\u0007\u0004\u0007\u0005\u0007\u0006\u001b", new Object[]{"a", "b", "c", "d", "e", "f", cbow.class});
        } else if (i2 == 3) {
            return new cbox();
        } else {
            if (i2 == 4) {
                return new bxvd((short[]) null, (int[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f177875g;
            }
            bxxk bxxk = f177876h;
            if (bxxk == null) {
                synchronized (cbox.class) {
                    bxxk = f177876h;
                    if (bxxk == null) {
                        bxxk = new bxve(f177875g);
                        f177876h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
