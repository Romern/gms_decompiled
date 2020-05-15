package p000;

/* renamed from: bszf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszf extends GeneratedMessageLite implements bxxd {

    /* renamed from: c */
    public static final bszf f147810c;

    /* renamed from: d */
    private static volatile bxxk f147811d;

    /* renamed from: a */
    public int f147812a;

    /* renamed from: b */
    public bszk f147813b;

    static {
        bszf bszf = new bszf();
        f147810c = bszf;
        GeneratedMessageLite.m124024a(bszf.class, bszf);
    }

    private bszf() {
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
            return GeneratedMessageLite.m124022a(f147810c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new bszf();
        } else {
            if (i2 == 4) {
                return new bxvd(f147810c);
            }
            if (i2 == 5) {
                return f147810c;
            }
            bxxk bxxk = f147811d;
            if (bxxk == null) {
                synchronized (bszf.class) {
                    bxxk = f147811d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147810c);
                        f147811d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
