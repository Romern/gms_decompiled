package p000;

/* renamed from: bswj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswj extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bswj f147442b;

    /* renamed from: c */
    private static volatile bxxk f147443c;

    /* renamed from: a */
    public bxvt f147444a = bxvm.f164965b;

    static {
        bswj bswj = new bswj();
        f147442b = bswj;
        bxvk.m124024a(bswj.class, bswj);
    }

    private bswj() {
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
            return bxvk.m124022a(f147442b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bswj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147442b);
            }
            if (i2 == 5) {
                return f147442b;
            }
            bxxk bxxk = f147443c;
            if (bxxk == null) {
                synchronized (bswj.class) {
                    bxxk = f147443c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147442b);
                        f147443c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
