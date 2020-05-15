package p000;

/* renamed from: cais */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cais extends bxvk implements bxxd {

    /* renamed from: c */
    public static final cais f174765c;

    /* renamed from: d */
    private static volatile bxxk f174766d;

    /* renamed from: a */
    public int f174767a;

    /* renamed from: b */
    public cajl f174768b;

    static {
        cais cais = new cais();
        f174765c = cais;
        bxvk.m124024a(cais.class, cais);
    }

    private cais() {
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
            return bxvk.m124022a(f174765c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new cais();
        } else {
            if (i2 == 4) {
                return new bxvd(f174765c);
            }
            if (i2 == 5) {
                return f174765c;
            }
            bxxk bxxk = f174766d;
            if (bxxk == null) {
                synchronized (cais.class) {
                    bxxk = f174766d;
                    if (bxxk == null) {
                        bxxk = new bxve(f174765c);
                        f174766d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
