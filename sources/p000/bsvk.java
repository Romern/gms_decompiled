package p000;

/* renamed from: bsvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvk extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsvk f147289b;

    /* renamed from: c */
    private static volatile bxxk f147290c;

    /* renamed from: a */
    public bxvt f147291a = bxvm.f164965b;

    static {
        bsvk bsvk = new bsvk();
        f147289b = bsvk;
        bxvk.m124024a(bsvk.class, bsvk);
    }

    private bsvk() {
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
            return bxvk.m124022a(f147289b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsvk();
        } else {
            if (i2 == 4) {
                return new bxvd(f147289b);
            }
            if (i2 == 5) {
                return f147289b;
            }
            bxxk bxxk = f147290c;
            if (bxxk == null) {
                synchronized (bsvk.class) {
                    bxxk = f147290c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147289b);
                        f147290c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
