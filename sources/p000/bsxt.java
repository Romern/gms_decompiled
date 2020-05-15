package p000;

/* renamed from: bsxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxt extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsxt f147613b;

    /* renamed from: d */
    private static volatile bxxk f147614d;

    /* renamed from: a */
    public String f147615a = "";

    /* renamed from: c */
    private int f147616c;

    static {
        bsxt bsxt = new bsxt();
        f147613b = bsxt;
        bxvk.m124024a(bsxt.class, bsxt);
    }

    private bsxt() {
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
            return bxvk.m124022a(f147613b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bsxt();
        } else {
            if (i2 == 4) {
                return new bxvd(f147613b);
            }
            if (i2 == 5) {
                return f147613b;
            }
            bxxk bxxk = f147614d;
            if (bxxk == null) {
                synchronized (bsxt.class) {
                    bxxk = f147614d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147613b);
                        f147614d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
