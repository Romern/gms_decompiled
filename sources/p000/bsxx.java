package p000;

/* renamed from: bsxx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxx extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsxx f147636b;

    /* renamed from: c */
    private static volatile bxxk f147637c;

    /* renamed from: a */
    public bxvt f147638a = bxvm.f164965b;

    static {
        bsxx bsxx = new bsxx();
        f147636b = bsxx;
        GeneratedMessageLite.m124024a(bsxx.class, bsxx);
    }

    private bsxx() {
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
            return GeneratedMessageLite.m124022a(f147636b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsxx();
        } else {
            if (i2 == 4) {
                return new bxvd(f147636b);
            }
            if (i2 == 5) {
                return f147636b;
            }
            bxxk bxxk = f147637c;
            if (bxxk == null) {
                synchronized (bsxx.class) {
                    bxxk = f147637c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147636b);
                        f147637c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
