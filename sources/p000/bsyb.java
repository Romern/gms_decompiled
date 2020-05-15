package p000;

/* renamed from: bsyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyb extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsyb f147649b;

    /* renamed from: c */
    private static volatile bxxk f147650c;

    /* renamed from: a */
    public bxwc f147651a = bxxn.f165040b;

    static {
        bsyb bsyb = new bsyb();
        f147649b = bsyb;
        bxvk.m124024a(bsyb.class, bsyb);
    }

    private bsyb() {
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
            return bxvk.m124022a(f147649b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsyb();
        } else {
            if (i2 == 4) {
                return new bxvd(f147649b);
            }
            if (i2 == 5) {
                return f147649b;
            }
            bxxk bxxk = f147650c;
            if (bxxk == null) {
                synchronized (bsyb.class) {
                    bxxk = f147650c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147649b);
                        f147650c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
