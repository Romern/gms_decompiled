package p000;

/* renamed from: bsye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsye extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsye f147660e;

    /* renamed from: f */
    private static volatile bxxk f147661f;

    /* renamed from: a */
    public int f147662a;

    /* renamed from: b */
    public bsxn f147663b;

    /* renamed from: c */
    public bxwc f147664c = bxxn.f165040b;

    /* renamed from: d */
    public boolean f147665d;

    static {
        bsye bsye = new bsye();
        f147660e = bsye;
        GeneratedMessageLite.m124024a(bsye.class, bsye);
    }

    private bsye() {
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
            return GeneratedMessageLite.m124022a(f147660e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဉ\u0000\u0003\u001b\u0004ဇ\u0001", new Object[]{"a", "b", "c", bsut.class, "d"});
        } else if (i2 == 3) {
            return new bsye();
        } else {
            if (i2 == 4) {
                return new bsyd();
            }
            if (i2 == 5) {
                return f147660e;
            }
            bxxk bxxk = f147661f;
            if (bxxk == null) {
                synchronized (bsye.class) {
                    bxxk = f147661f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147660e);
                        f147661f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
