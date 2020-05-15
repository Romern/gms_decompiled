package p000;

/* renamed from: bsvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvi extends bxvk implements bxxd {

    /* renamed from: h */
    public static final bsvi f147268h;

    /* renamed from: i */
    private static volatile bxxk f147269i;

    /* renamed from: a */
    public int f147270a;

    /* renamed from: b */
    public bxwc f147271b = bxxn.f165040b;

    /* renamed from: c */
    public int f147272c;

    /* renamed from: d */
    public int f147273d;

    /* renamed from: e */
    public int f147274e;

    /* renamed from: f */
    public bsxn f147275f;

    /* renamed from: g */
    public String f147276g = "";

    static {
        bsvi bsvi = new bsvi();
        f147268h = bsvi;
        bxvk.m124024a(bsvi.class, bsvi);
    }

    private bsvi() {
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
            return bxvk.m124022a(f147268h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004င\u0002\u0005ဉ\u0003\u0006ဈ\u0004", new Object[]{"a", "b", bsvj.class, "c", "d", "e", "f", "g"});
        } else if (i2 == 3) {
            return new bsvi();
        } else {
            if (i2 == 4) {
                return new bxvd(f147268h);
            }
            if (i2 == 5) {
                return f147268h;
            }
            bxxk bxxk = f147269i;
            if (bxxk == null) {
                synchronized (bsvi.class) {
                    bxxk = f147269i;
                    if (bxxk == null) {
                        bxxk = new bxve(f147268h);
                        f147269i = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
