package p000;

/* renamed from: bsus */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsus extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsus f147182c;

    /* renamed from: e */
    private static volatile bxxk f147183e;

    /* renamed from: a */
    public int f147184a;

    /* renamed from: b */
    public int f147185b;

    /* renamed from: d */
    private int f147186d;

    static {
        bsus bsus = new bsus();
        f147182c = bsus;
        bxvk.m124024a(bsus.class, bsus);
    }

    private bsus() {
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
            return bxvk.m124022a(f147182c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new bsus();
        } else {
            if (i2 == 4) {
                return new bxvd(f147182c);
            }
            if (i2 == 5) {
                return f147182c;
            }
            bxxk bxxk = f147183e;
            if (bxxk == null) {
                synchronized (bsus.class) {
                    bxxk = f147183e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147182c);
                        f147183e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
