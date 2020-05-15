package p000;

/* renamed from: bsvs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvs extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsvs f147328c;

    /* renamed from: d */
    private static volatile bxxk f147329d;

    /* renamed from: a */
    public int f147330a;

    /* renamed from: b */
    public String f147331b = "";

    static {
        bsvs bsvs = new bsvs();
        f147328c = bsvs;
        bxvk.m124024a(bsvs.class, bsvs);
    }

    private bsvs() {
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
            return bxvk.m124022a(f147328c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsvs();
        } else {
            if (i2 == 4) {
                return new bxvd(f147328c);
            }
            if (i2 == 5) {
                return f147328c;
            }
            bxxk bxxk = f147329d;
            if (bxxk == null) {
                synchronized (bsvs.class) {
                    bxxk = f147329d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147328c);
                        f147329d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
