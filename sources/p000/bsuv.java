package p000;

/* renamed from: bsuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuv extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsuv f147196g;

    /* renamed from: h */
    private static volatile bxxk f147197h;

    /* renamed from: a */
    public int f147198a;

    /* renamed from: b */
    public int f147199b = 0;

    /* renamed from: c */
    public Object f147200c;

    /* renamed from: d */
    public String f147201d = "";

    /* renamed from: e */
    public bswh f147202e;

    /* renamed from: f */
    public bswh f147203f;

    static {
        bsuv bsuv = new bsuv();
        f147196g = bsuv;
        bxvk.m124024a(bsuv.class, bsuv);
    }

    private bsuv() {
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
            return bxvk.m124022a(f147196g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"c", "b", "a", "d", bsxn.class, bsuw.class, "e", "f"});
        } else if (i2 == 3) {
            return new bsuv();
        } else {
            if (i2 == 4) {
                return new bxvd(f147196g);
            }
            if (i2 == 5) {
                return f147196g;
            }
            bxxk bxxk = f147197h;
            if (bxxk == null) {
                synchronized (bsuv.class) {
                    bxxk = f147197h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147196g);
                        f147197h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
