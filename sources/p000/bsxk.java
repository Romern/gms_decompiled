package p000;

/* renamed from: bsxk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxk extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsxk f147578f;

    /* renamed from: g */
    private static volatile bxxk f147579g;

    /* renamed from: a */
    public int f147580a;

    /* renamed from: b */
    public int f147581b = 0;

    /* renamed from: c */
    public Object f147582c;

    /* renamed from: d */
    public bsxn f147583d;

    /* renamed from: e */
    public boolean f147584e;

    static {
        bsxk bsxk = new bsxk();
        f147578f = bsxk;
        bxvk.m124024a(bsxk.class, bsxk);
    }

    private bsxk() {
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
            return bxvk.m124022a(f147578f, "\u0001\u000f\u0001\u0001\u0001Ϩ\u000f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000Ϩြ\u0000", new Object[]{"c", "b", "a", "d", "e", bsxr.class, bsys.class, bsyo.class, bsvg.class, bsva.class, bsvd.class, bsxu.class, bswl.class, bswt.class, bsyu.class, bswx.class, bsyf.class, bswy.class});
        } else if (i2 == 3) {
            return new bsxk();
        } else {
            if (i2 == 4) {
                return new bxvd(f147578f);
            }
            if (i2 == 5) {
                return f147578f;
            }
            bxxk bxxk = f147579g;
            if (bxxk == null) {
                synchronized (bsxk.class) {
                    bxxk = f147579g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147578f);
                        f147579g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
