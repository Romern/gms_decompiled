package p000;

/* renamed from: bswz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswz extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bswz f147514a;

    /* renamed from: b */
    private static volatile bxxk f147515b;

    static {
        bswz bswz = new bswz();
        f147514a = bswz;
        bxvk.m124024a(bswz.class, bswz);
    }

    private bswz() {
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
            return bxvk.m124022a(f147514a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bswz();
        }
        if (i2 == 4) {
            return new bxvd(f147514a);
        }
        if (i2 == 5) {
            return f147514a;
        }
        bxxk bxxk = f147515b;
        if (bxxk == null) {
            synchronized (bswz.class) {
                bxxk = f147515b;
                if (bxxk == null) {
                    bxxk = new bxve(f147514a);
                    f147515b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
