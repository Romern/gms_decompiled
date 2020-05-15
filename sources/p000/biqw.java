package p000;

/* renamed from: biqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biqw extends bxvk implements bxxd {

    /* renamed from: a */
    public static final biqw f121359a;

    /* renamed from: e */
    private static volatile bxxk f121360e;

    /* renamed from: b */
    private int f121361b;

    /* renamed from: c */
    private birr f121362c;

    /* renamed from: d */
    private byte f121363d = 2;

    static {
        biqw biqw = new biqw();
        f121359a = biqw;
        bxvk.m124024a(biqw.class, biqw);
    }

    private biqw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo3216a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f121363d);
        }
        byte b = 0;
        if (i2 == 1) {
            if (obj != null) {
                b = 1;
            }
            this.f121363d = b;
            return null;
        } else if (i2 == 2) {
            return bxvk.m124022a(f121359a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new biqw();
        } else {
            if (i2 == 4) {
                return new bxvd(f121359a);
            }
            if (i2 == 5) {
                return f121359a;
            }
            bxxk bxxk = f121360e;
            if (bxxk == null) {
                synchronized (biqw.class) {
                    bxxk = f121360e;
                    if (bxxk == null) {
                        bxxk = new bxve(f121359a);
                        f121360e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
