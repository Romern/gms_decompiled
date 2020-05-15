package p000;

/* renamed from: bsyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyi extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsyi f147679c;

    /* renamed from: d */
    private static volatile bxxk f147680d;

    /* renamed from: a */
    public int f147681a;

    /* renamed from: b */
    public int f147682b;

    static {
        bsyi bsyi = new bsyi();
        f147679c = bsyi;
        bxvk.m124024a(bsyi.class, bsyi);
    }

    private bsyi() {
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
            return bxvk.m124022a(f147679c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsyi();
        } else {
            if (i2 == 4) {
                return new bxvd(f147679c);
            }
            if (i2 == 5) {
                return f147679c;
            }
            bxxk bxxk = f147680d;
            if (bxxk == null) {
                synchronized (bsyi.class) {
                    bxxk = f147680d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147679c);
                        f147680d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
