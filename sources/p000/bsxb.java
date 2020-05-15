package p000;

/* renamed from: bsxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxb extends GeneratedMessageLite implements bxxd {

    /* renamed from: g */
    public static final bsxb f147517g;

    /* renamed from: h */
    private static volatile bxxk f147518h;

    /* renamed from: a */
    public int f147519a;

    /* renamed from: b */
    public String f147520b = "";

    /* renamed from: c */
    public String f147521c = "";

    /* renamed from: d */
    public String f147522d = "";

    /* renamed from: e */
    public bsxn f147523e;

    /* renamed from: f */
    public bxwc f147524f = bxxn.f165040b;

    static {
        bsxb bsxb = new bsxb();
        f147517g = bsxb;
        GeneratedMessageLite.m124024a(bsxb.class, bsxb);
    }

    private bsxb() {
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
            return GeneratedMessageLite.m124022a(f147517g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", bsyc.class});
        } else if (i2 == 3) {
            return new bsxb();
        } else {
            if (i2 == 4) {
                return new bxvd(f147517g);
            }
            if (i2 == 5) {
                return f147517g;
            }
            bxxk bxxk = f147518h;
            if (bxxk == null) {
                synchronized (bsxb.class) {
                    bxxk = f147518h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147517g);
                        f147518h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
