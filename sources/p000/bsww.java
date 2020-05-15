package p000;

/* renamed from: bsww */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsww extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bsww f147504d;

    /* renamed from: e */
    private static volatile bxxk f147505e;

    /* renamed from: a */
    public int f147506a;

    /* renamed from: b */
    public String f147507b = "";

    /* renamed from: c */
    public bsxn f147508c;

    static {
        bsww bsww = new bsww();
        f147504d = bsww;
        bxvk.m124024a(bsww.class, bsww);
    }

    private bsww() {
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
            return bxvk.m124022a(f147504d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bsww();
        } else {
            if (i2 == 4) {
                return new bxvd(f147504d);
            }
            if (i2 == 5) {
                return f147504d;
            }
            bxxk bxxk = f147505e;
            if (bxxk == null) {
                synchronized (bsww.class) {
                    bxxk = f147505e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147504d);
                        f147505e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
