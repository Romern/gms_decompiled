package p000;

/* renamed from: bsvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvc extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsvc f147227b;

    /* renamed from: c */
    private static volatile bxxk f147228c;

    /* renamed from: a */
    public bxvt f147229a = bxvm.f164965b;

    static {
        bsvc bsvc = new bsvc();
        f147227b = bsvc;
        GeneratedMessageLite.m124024a(bsvc.class, bsvc);
    }

    private bsvc() {
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
            return GeneratedMessageLite.m124022a(f147227b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsvc();
        } else {
            if (i2 == 4) {
                return new bxvd(f147227b);
            }
            if (i2 == 5) {
                return f147227b;
            }
            bxxk bxxk = f147228c;
            if (bxxk == null) {
                synchronized (bsvc.class) {
                    bxxk = f147228c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147227b);
                        f147228c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
