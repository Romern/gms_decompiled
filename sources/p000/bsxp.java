package p000;

/* renamed from: bsxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxp extends bxvk implements bxxd {

    /* renamed from: g */
    public static final bsxp f147595g;

    /* renamed from: h */
    private static volatile bxxk f147596h;

    /* renamed from: a */
    public int f147597a;

    /* renamed from: b */
    public bswh f147598b;

    /* renamed from: c */
    public String f147599c = "";

    /* renamed from: d */
    public String f147600d = "";

    /* renamed from: e */
    public String f147601e = "";

    /* renamed from: f */
    public bsxn f147602f;

    static {
        bsxp bsxp = new bsxp();
        f147595g = bsxp;
        bxvk.m124024a(bsxp.class, bsxp);
    }

    private bsxp() {
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
            return bxvk.m124022a(f147595g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new bsxp();
        } else {
            if (i2 == 4) {
                return new bxvd(f147595g);
            }
            if (i2 == 5) {
                return f147595g;
            }
            bxxk bxxk = f147596h;
            if (bxxk == null) {
                synchronized (bsxp.class) {
                    bxxk = f147596h;
                    if (bxxk == null) {
                        bxxk = new bxve(f147595g);
                        f147596h = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
