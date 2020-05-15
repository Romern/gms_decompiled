package p000;

/* renamed from: bsvw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvw extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsvw f147348b;

    /* renamed from: c */
    private static volatile bxxk f147349c;

    /* renamed from: a */
    public bxvo f147350a = bxum.f164858b;

    static {
        bsvw bsvw = new bsvw();
        f147348b = bsvw;
        bxvk.m124024a(bsvw.class, bsvw);
    }

    private bsvw() {
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
            return bxvk.m124022a(f147348b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0012", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsvw();
        } else {
            if (i2 == 4) {
                return new bxvd(f147348b);
            }
            if (i2 == 5) {
                return f147348b;
            }
            bxxk bxxk = f147349c;
            if (bxxk == null) {
                synchronized (bsvw.class) {
                    bxxk = f147349c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147348b);
                        f147349c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
