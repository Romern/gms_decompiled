package p000;

/* renamed from: bsuh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuh extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsuh f147125b;

    /* renamed from: c */
    private static volatile bxxk f147126c;

    /* renamed from: a */
    public bxtx f147127a = bxtx.f164797b;

    static {
        bsuh bsuh = new bsuh();
        f147125b = bsuh;
        bxvk.m124024a(bsuh.class, bsuh);
    }

    private bsuh() {
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
            return bxvk.m124022a(f147125b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsuh();
        } else {
            if (i2 == 4) {
                return new bxvd(f147125b);
            }
            if (i2 == 5) {
                return f147125b;
            }
            bxxk bxxk = f147126c;
            if (bxxk == null) {
                synchronized (bsuh.class) {
                    bxxk = f147126c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147125b);
                        f147126c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
