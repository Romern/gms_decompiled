package p000;

/* renamed from: bsvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvr extends bxvk implements bxxd {

    /* renamed from: a */
    public static final bsvr f147326a;

    /* renamed from: b */
    private static volatile bxxk f147327b;

    static {
        bsvr bsvr = new bsvr();
        f147326a = bsvr;
        bxvk.m124024a(bsvr.class, bsvr);
    }

    private bsvr() {
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
            return bxvk.m124022a(f147326a, "\u0001\u0000", (Object[]) null);
        }
        if (i2 == 3) {
            return new bsvr();
        }
        if (i2 == 4) {
            return new bxvd(f147326a);
        }
        if (i2 == 5) {
            return f147326a;
        }
        bxxk bxxk = f147327b;
        if (bxxk == null) {
            synchronized (bsvr.class) {
                bxxk = f147327b;
                if (bxxk == null) {
                    bxxk = new bxve(f147326a);
                    f147327b = bxxk;
                }
            }
        }
        return bxxk;
    }
}
