package p000;

/* renamed from: bsug */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsug extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsug f147121c;

    /* renamed from: d */
    private static volatile bxxk f147122d;

    /* renamed from: a */
    public bxtx f147123a = bxtx.f164797b;

    /* renamed from: b */
    public bxtx f147124b = bxtx.f164797b;

    static {
        bsug bsug = new bsug();
        f147121c = bsug;
        bxvk.m124024a(bsug.class, bsug);
    }

    private bsug() {
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
            return bxvk.m124022a(f147121c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bsug();
        } else {
            if (i2 == 4) {
                return new bxvd(f147121c);
            }
            if (i2 == 5) {
                return f147121c;
            }
            bxxk bxxk = f147122d;
            if (bxxk == null) {
                synchronized (bsug.class) {
                    bxxk = f147122d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147121c);
                        f147122d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
