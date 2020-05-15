package p000;

/* renamed from: bsup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsup extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsup f147165d;

    /* renamed from: e */
    private static volatile bxxk f147166e;

    /* renamed from: a */
    public int f147167a;

    /* renamed from: b */
    public bxwc f147168b = bxxn.f165040b;

    /* renamed from: c */
    public bsuo f147169c;

    static {
        bsup bsup = new bsup();
        f147165d = bsup;
        bxvk.m124024a(bsup.class, bsup);
    }

    private bsup() {
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
            return bxvk.m124022a(f147165d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", bsur.class, "c"});
        } else if (i2 == 3) {
            return new bsup();
        } else {
            if (i2 == 4) {
                return new bxvd(f147165d);
            }
            if (i2 == 5) {
                return f147165d;
            }
            bxxk bxxk = f147166e;
            if (bxxk == null) {
                synchronized (bsup.class) {
                    bxxk = f147166e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147165d);
                        f147166e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
