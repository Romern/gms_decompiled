package p000;

/* renamed from: bsvd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsvd f147230c;

    /* renamed from: d */
    private static volatile bxxk f147231d;

    /* renamed from: a */
    public int f147232a = 0;

    /* renamed from: b */
    public Object f147233b;

    static {
        bsvd bsvd = new bsvd();
        f147230c = bsvd;
        bxvk.m124024a(bsvd.class, bsvd);
    }

    private bsvd() {
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
            return bxvk.m124022a(f147230c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", bsye.class, bsxf.class, bsvo.class, bsxw.class});
        } else if (i2 == 3) {
            return new bsvd();
        } else {
            if (i2 == 4) {
                return new bxvd(f147230c);
            }
            if (i2 == 5) {
                return f147230c;
            }
            bxxk bxxk = f147231d;
            if (bxxk == null) {
                synchronized (bsvd.class) {
                    bxxk = f147231d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147230c);
                        f147231d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
