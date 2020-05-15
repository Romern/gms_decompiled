package p000;

/* renamed from: bswd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bswd f147378c;

    /* renamed from: e */
    private static volatile bxxk f147379e;

    /* renamed from: a */
    public String f147380a = "";

    /* renamed from: b */
    public String f147381b = "";

    /* renamed from: d */
    private int f147382d;

    static {
        bswd bswd = new bswd();
        f147378c = bswd;
        bxvk.m124024a(bswd.class, bswd);
    }

    private bswd() {
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
            return bxvk.m124022a(f147378c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bswd();
        } else {
            if (i2 == 4) {
                return new bxvd(f147378c);
            }
            if (i2 == 5) {
                return f147378c;
            }
            bxxk bxxk = f147379e;
            if (bxxk == null) {
                synchronized (bswd.class) {
                    bxxk = f147379e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147378c);
                        f147379e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
