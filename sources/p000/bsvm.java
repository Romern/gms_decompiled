package p000;

/* renamed from: bsvm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvm extends GeneratedMessageLite implements bxxd {

    /* renamed from: k */
    public static final bsvm f147292k;

    /* renamed from: l */
    private static volatile bxxk f147293l;

    /* renamed from: a */
    public int f147294a;

    /* renamed from: b */
    public bxwc f147295b = bxxn.f165040b;

    /* renamed from: c */
    public bxwc f147296c = bxxn.f165040b;

    /* renamed from: d */
    public bxwc f147297d = bxxn.f165040b;

    /* renamed from: e */
    public bsyr f147298e;

    /* renamed from: f */
    public bsve f147299f;

    /* renamed from: g */
    public boolean f147300g;

    /* renamed from: h */
    public bsuq f147301h;

    /* renamed from: i */
    public bsws f147302i;

    /* renamed from: j */
    public boolean f147303j;

    static {
        bsvm bsvm = new bsvm();
        f147292k = bsvm;
        GeneratedMessageLite.m124024a(bsvm.class, bsvm);
    }

    private bsvm() {
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
            return GeneratedMessageLite.m124022a(f147292k, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0004\u001b\u0007ဉ\u0000\nဉ\u0003\u000bဇ\u0004\fဉ\u0005\rဉ\u0006\u000eဇ\u0007", new Object[]{"a", "b", bsyi.class, "c", bsyh.class, "d", bsyg.class, "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bsvm();
        } else {
            if (i2 == 4) {
                return new bsvl();
            }
            if (i2 == 5) {
                return f147292k;
            }
            bxxk bxxk = f147293l;
            if (bxxk == null) {
                synchronized (bsvm.class) {
                    bxxk = f147293l;
                    if (bxxk == null) {
                        bxxk = new bxve(f147292k);
                        f147293l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
