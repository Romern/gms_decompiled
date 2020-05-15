package p000;

/* renamed from: bswx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswx extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bswx f147509b;

    /* renamed from: c */
    private static volatile bxxk f147510c;

    /* renamed from: a */
    public bxwc f147511a = bxxn.f165040b;

    static {
        bswx bswx = new bswx();
        f147509b = bswx;
        bxvk.m124024a(bswx.class, bswx);
    }

    private bswx() {
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
            return bxvk.m124022a(f147509b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsww.class});
        } else if (i2 == 3) {
            return new bswx();
        } else {
            if (i2 == 4) {
                return new bswv();
            }
            if (i2 == 5) {
                return f147509b;
            }
            bxxk bxxk = f147510c;
            if (bxxk == null) {
                synchronized (bswx.class) {
                    bxxk = f147510c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147509b);
                        f147510c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
