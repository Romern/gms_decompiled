package p000;

/* renamed from: bsyf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyf extends GeneratedMessageLite implements bxxd {

    /* renamed from: a */
    public static final bsyf f147666a;

    /* renamed from: e */
    private static volatile bxxk f147667e;

    /* renamed from: b */
    private int f147668b;

    /* renamed from: c */
    private bsxn f147669c;

    /* renamed from: d */
    private bsxp f147670d;

    static {
        bsyf bsyf = new bsyf();
        f147666a = bsyf;
        GeneratedMessageLite.m124024a(bsyf.class, bsyf);
    }

    private bsyf() {
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
            return GeneratedMessageLite.m124022a(f147666a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new bsyf();
        } else {
            if (i2 == 4) {
                return new bxvd(f147666a);
            }
            if (i2 == 5) {
                return f147666a;
            }
            bxxk bxxk = f147667e;
            if (bxxk == null) {
                synchronized (bsyf.class) {
                    bxxk = f147667e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147666a);
                        f147667e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
