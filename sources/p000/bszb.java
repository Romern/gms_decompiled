package p000;

/* renamed from: bszb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bszb f147785d;

    /* renamed from: e */
    private static volatile bxxk f147786e;

    /* renamed from: a */
    public int f147787a;

    /* renamed from: b */
    public bxwc f147788b = bxxn.f165040b;

    /* renamed from: c */
    public bszc f147789c;

    static {
        bszb bszb = new bszb();
        f147785d = bszb;
        bxvk.m124024a(bszb.class, bszb);
    }

    private bszb() {
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
            return bxvk.m124022a(f147785d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", bsza.class, "c"});
        } else if (i2 == 3) {
            return new bszb();
        } else {
            if (i2 == 4) {
                return new bxvd(f147785d);
            }
            if (i2 == 5) {
                return f147785d;
            }
            bxxk bxxk = f147786e;
            if (bxxk == null) {
                synchronized (bszb.class) {
                    bxxk = f147786e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147785d);
                        f147786e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
