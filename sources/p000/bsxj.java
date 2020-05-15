package p000;

/* renamed from: bsxj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxj extends bxvk implements bxxd {

    /* renamed from: k */
    public static final bsxj f147566k;

    /* renamed from: l */
    private static volatile bxxk f147567l;

    /* renamed from: a */
    public int f147568a;

    /* renamed from: b */
    public int f147569b;

    /* renamed from: c */
    public bsvm f147570c;

    /* renamed from: d */
    public bsvn f147571d;

    /* renamed from: e */
    public String f147572e = "";

    /* renamed from: f */
    public int f147573f;

    /* renamed from: g */
    public boolean f147574g;

    /* renamed from: h */
    public boolean f147575h;

    /* renamed from: i */
    public boolean f147576i;

    /* renamed from: j */
    public String f147577j;

    static {
        bsxj bsxj = new bsxj();
        f147566k = bsxj;
        bxvk.m124024a(bsxj.class, bsxj);
    }

    private bsxj() {
        bxxn bxxn = bxxn.f165040b;
        this.f147577j = "";
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
            return bxvk.m124022a(f147566k, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0006င\u0004\u0007ဇ\u0006\tဇ\b\rဇ\n\u000eဈ\u000b", new Object[]{"a", "b", bsxa.f147516a, "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i2 == 3) {
            return new bsxj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147566k);
            }
            if (i2 == 5) {
                return f147566k;
            }
            bxxk bxxk = f147567l;
            if (bxxk == null) {
                synchronized (bsxj.class) {
                    bxxk = f147567l;
                    if (bxxk == null) {
                        bxxk = new bxve(f147566k);
                        f147567l = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
