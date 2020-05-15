package p000;

/* renamed from: bsyg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyg extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsyg f147671c;

    /* renamed from: d */
    private static volatile bxxk f147672d;

    /* renamed from: a */
    public int f147673a;

    /* renamed from: b */
    public int f147674b;

    static {
        bsyg bsyg = new bsyg();
        f147671c = bsyg;
        bxvk.m124024a(bsyg.class, bsyg);
    }

    private bsyg() {
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
            return bxvk.m124022a(f147671c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsyg();
        } else {
            if (i2 == 4) {
                return new bxvd(f147671c);
            }
            if (i2 == 5) {
                return f147671c;
            }
            bxxk bxxk = f147672d;
            if (bxxk == null) {
                synchronized (bsyg.class) {
                    bxxk = f147672d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147671c);
                        f147672d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
