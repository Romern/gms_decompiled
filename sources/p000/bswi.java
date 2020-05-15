package p000;

/* renamed from: bswi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bswi extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bswi f147438c;

    /* renamed from: d */
    private static volatile bxxk f147439d;

    /* renamed from: a */
    public int f147440a;

    /* renamed from: b */
    public bswh f147441b;

    static {
        bswi bswi = new bswi();
        f147438c = bswi;
        GeneratedMessageLite.m124024a(bswi.class, bswi);
    }

    private bswi() {
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
            return GeneratedMessageLite.m124022a(f147438c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bswi();
        } else {
            if (i2 == 4) {
                return new bxvd(f147438c);
            }
            if (i2 == 5) {
                return f147438c;
            }
            bxxk bxxk = f147439d;
            if (bxxk == null) {
                synchronized (bswi.class) {
                    bxxk = f147439d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147438c);
                        f147439d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
