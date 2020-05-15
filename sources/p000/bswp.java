package p000;

/* renamed from: bswp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bswp f147472b;

    /* renamed from: c */
    private static volatile bxxk f147473c;

    /* renamed from: a */
    public bxvw f147474a = bxwq.f165002b;

    static {
        bswp bswp = new bswp();
        f147472b = bswp;
        bxvk.m124024a(bswp.class, bswp);
    }

    private bswp() {
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
            return bxvk.m124022a(f147472b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0014", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bswp();
        } else {
            if (i2 == 4) {
                return new bxvd(f147472b);
            }
            if (i2 == 5) {
                return f147472b;
            }
            bxxk bxxk = f147473c;
            if (bxxk == null) {
                synchronized (bswp.class) {
                    bxxk = f147473c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147472b);
                        f147473c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
