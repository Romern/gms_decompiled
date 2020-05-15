package p000;

/* renamed from: bszc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszc extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bszc f147790c;

    /* renamed from: d */
    private static volatile bxxk f147791d;

    /* renamed from: a */
    public int f147792a;

    /* renamed from: b */
    public int f147793b;

    static {
        bszc bszc = new bszc();
        f147790c = bszc;
        bxvk.m124024a(bszc.class, bszc);
    }

    private bszc() {
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
            return bxvk.m124022a(f147790c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bszc();
        } else {
            if (i2 == 4) {
                return new bxvd(f147790c);
            }
            if (i2 == 5) {
                return f147790c;
            }
            bxxk bxxk = f147791d;
            if (bxxk == null) {
                synchronized (bszc.class) {
                    bxxk = f147791d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147790c);
                        f147791d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
