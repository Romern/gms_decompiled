package p000;

/* renamed from: bsuz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuz extends GeneratedMessageLite implements bxxd {

    /* renamed from: e */
    public static final bsuz f147213e;

    /* renamed from: f */
    private static volatile bxxk f147214f;

    /* renamed from: a */
    public int f147215a;

    /* renamed from: b */
    public bsxn f147216b;

    /* renamed from: c */
    public String f147217c = "";

    /* renamed from: d */
    public bswh f147218d;

    static {
        bsuz bsuz = new bsuz();
        f147213e = bsuz;
        GeneratedMessageLite.m124024a(bsuz.class, bsuz);
    }

    private bsuz() {
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
            return GeneratedMessageLite.m124022a(f147213e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new bsuz();
        } else {
            if (i2 == 4) {
                return new bxvd(f147213e);
            }
            if (i2 == 5) {
                return f147213e;
            }
            bxxk bxxk = f147214f;
            if (bxxk == null) {
                synchronized (bsuz.class) {
                    bxxk = f147214f;
                    if (bxxk == null) {
                        bxxk = new bxve(f147213e);
                        f147214f = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
