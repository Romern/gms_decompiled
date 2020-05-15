package p000;

/* renamed from: bsxv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxv extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsxv f147623h;

    /* renamed from: i */
    private static volatile bxxk f147624i;

    /* renamed from: a */
    public int f147625a;

    /* renamed from: b */
    public bswh f147626b;

    /* renamed from: c */
    public String f147627c = "";

    /* renamed from: d */
    public String f147628d = "";

    /* renamed from: e */
    public bswh f147629e;

    /* renamed from: f */
    public bxwc f147630f = bxxn.f165040b;

    /* renamed from: g */
    public bsxn f147631g;

    static {
        bsxv bsxv = new bsxv();
        f147623h = bsxv;
        bxvk.m124024a(bsxv.class, bsxv);
    }

    private bsxv() {
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
            return bxvk.m124022a(f147623h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005\u001a\u0006ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsxv();
        } else {
            if (i2 == 4) {
                return new bxvd(f147623h);
            }
            if (i2 == 5) {
                return f147623h;
            }
            bxxk bxxk = f147624i;
            if (bxxk == null) {
                synchronized (bsxv.class) {
                    bxxk = f147624i;
                    if (bxxk == null) {
                        bxxk = new bxve(f147623h);
                        f147624i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
