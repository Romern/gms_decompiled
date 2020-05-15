package p000;

/* renamed from: bsxs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxs extends GeneratedMessageLite implements bxxd {

    /* renamed from: f */
    public static final bsxs f147606f;

    /* renamed from: g */
    private static volatile bxxk f147607g;

    /* renamed from: a */
    public int f147608a;

    /* renamed from: b */
    public bsxn f147609b;

    /* renamed from: c */
    public bsxn f147610c;

    /* renamed from: d */
    public bsxt f147611d;

    /* renamed from: e */
    public bsxn f147612e;

    static {
        bsxs bsxs = new bsxs();
        f147606f = bsxs;
        GeneratedMessageLite.m124024a(bsxs.class, bsxs);
    }

    private bsxs() {
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
            return GeneratedMessageLite.m124022a(f147606f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0001", new Object[]{"a", "b", "d", "e", "c"});
        } else if (i2 == 3) {
            return new bsxs();
        } else {
            if (i2 == 4) {
                return new bxvd(f147606f);
            }
            if (i2 == 5) {
                return f147606f;
            }
            bxxk bxxk = f147607g;
            if (bxxk == null) {
                synchronized (bsxs.class) {
                    bxxk = f147607g;
                    if (bxxk == null) {
                        bxxk = new bxve(f147606f);
                        f147607g = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
