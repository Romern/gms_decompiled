package p000;

/* renamed from: bsuu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuu extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsuu f147193b;

    /* renamed from: c */
    private static volatile bxxk f147194c;

    /* renamed from: a */
    public bxvn f147195a = bxtk.f164779b;

    static {
        bsuu bsuu = new bsuu();
        f147193b = bsuu;
        GeneratedMessageLite.m124024a(bsuu.class, bsuu);
    }

    private bsuu() {
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
            return GeneratedMessageLite.m124022a(f147193b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0019", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsuu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147193b);
            }
            if (i2 == 5) {
                return f147193b;
            }
            bxxk bxxk = f147194c;
            if (bxxk == null) {
                synchronized (bsuu.class) {
                    bxxk = f147194c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147193b);
                        f147194c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
