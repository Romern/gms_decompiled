package p000;

/* renamed from: bsys */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsys extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsys f147709h;

    /* renamed from: i */
    private static volatile bxxk f147710i;

    /* renamed from: a */
    public int f147711a;

    /* renamed from: b */
    public String f147712b = "";

    /* renamed from: c */
    public bsxn f147713c;

    /* renamed from: d */
    public String f147714d = "";

    /* renamed from: e */
    public bsui f147715e;

    /* renamed from: f */
    public boolean f147716f = true;

    /* renamed from: g */
    public String f147717g = "";

    static {
        bsys bsys = new bsys();
        f147709h = bsys;
        bxvk.m124024a(bsys.class, bsys);
    }

    private bsys() {
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
            return bxvk.m124022a(f147709h, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsys();
        } else {
            if (i2 == 4) {
                return new bxvd(f147709h);
            }
            if (i2 == 5) {
                return f147709h;
            }
            bxxk bxxk = f147710i;
            if (bxxk == null) {
                synchronized (bsys.class) {
                    bxxk = f147710i;
                    if (bxxk == null) {
                        bxxk = new bxve(f147709h);
                        f147710i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
