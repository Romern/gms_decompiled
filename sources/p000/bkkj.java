package p000;

/* renamed from: bkkj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkkj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bkkj f124558c;

    /* renamed from: d */
    private static volatile bxxk f124559d;

    /* renamed from: a */
    public int f124560a;

    /* renamed from: b */
    public String f124561b = "";

    static {
        bkkj bkkj = new bkkj();
        f124558c = bkkj;
        bxvk.m124024a(bkkj.class, bkkj);
    }

    private bkkj() {
        bxxn bxxn = bxxn.f165040b;
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
            return bxvk.m124022a(f124558c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bkkj();
        } else {
            if (i2 == 4) {
                return new bxvd(f124558c);
            }
            if (i2 == 5) {
                return f124558c;
            }
            bxxk bxxk = f124559d;
            if (bxxk == null) {
                synchronized (bkkj.class) {
                    bxxk = f124559d;
                    if (bxxk == null) {
                        bxxk = new bxve(f124558c);
                        f124559d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
