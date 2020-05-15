package p000;

/* renamed from: bsux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsux extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsux f147207c;

    /* renamed from: d */
    private static volatile bxxk f147208d;

    /* renamed from: a */
    public int f147209a = 0;

    /* renamed from: b */
    public Object f147210b;

    static {
        bsux bsux = new bsux();
        f147207c = bsux;
        bxvk.m124024a(bsux.class, bsux);
    }

    private bsux() {
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
            return bxvk.m124022a(f147207c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", bsuz.class, bsuy.class});
        } else if (i2 == 3) {
            return new bsux();
        } else {
            if (i2 == 4) {
                return new bxvd(f147207c);
            }
            if (i2 == 5) {
                return f147207c;
            }
            bxxk bxxk = f147208d;
            if (bxxk == null) {
                synchronized (bsux.class) {
                    bxxk = f147208d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147207c);
                        f147208d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
