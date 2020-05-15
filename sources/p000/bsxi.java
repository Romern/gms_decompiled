package p000;

/* renamed from: bsxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxi extends bxvk implements bxxd {

    /* renamed from: f */
    public static final bsxi f147559f;

    /* renamed from: g */
    private static volatile bxxk f147560g;

    /* renamed from: a */
    public int f147561a;

    /* renamed from: b */
    public float f147562b;

    /* renamed from: c */
    public bzrt f147563c;

    /* renamed from: d */
    public String f147564d = "";

    /* renamed from: e */
    public String f147565e = "";

    static {
        bsxi bsxi = new bsxi();
        f147559f = bsxi;
        bxvk.m124024a(bsxi.class, bsxi);
    }

    private bsxi() {
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
            return bxvk.m124022a(f147559f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဉ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new bsxi();
        } else {
            if (i2 == 4) {
                return new bxvd(f147559f);
            }
            if (i2 == 5) {
                return f147559f;
            }
            bxxk bxxk = f147560g;
            if (bxxk == null) {
                synchronized (bsxi.class) {
                    bxxk = f147560g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147559f);
                        f147560g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
