package p000;

/* renamed from: bsvb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvb extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsvb f147222d;

    /* renamed from: e */
    private static volatile bxxk f147223e;

    /* renamed from: a */
    public int f147224a;

    /* renamed from: b */
    public String f147225b = "";

    /* renamed from: c */
    public boolean f147226c;

    static {
        bsvb bsvb = new bsvb();
        f147222d = bsvb;
        bxvk.m124024a(bsvb.class, bsvb);
    }

    private bsvb() {
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
            return bxvk.m124022a(f147222d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsvb();
        } else {
            if (i2 == 4) {
                return new bxvd(f147222d);
            }
            if (i2 == 5) {
                return f147222d;
            }
            bxxk bxxk = f147223e;
            if (bxxk == null) {
                synchronized (bsvb.class) {
                    bxxk = f147223e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147222d);
                        f147223e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
