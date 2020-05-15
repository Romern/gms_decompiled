package p000;

/* renamed from: bszs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszs extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bszs f147883b;

    /* renamed from: c */
    private static volatile bxxk f147884c;

    /* renamed from: a */
    public bxww f147885a = bxww.f165013b;

    static {
        bszs bszs = new bszs();
        f147883b = bszs;
        GeneratedMessageLite.m124024a(bszs.class, bszs);
    }

    private bszs() {
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
            return GeneratedMessageLite.m124022a(f147883b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bszr.f147882a});
        } else if (i2 == 3) {
            return new bszs();
        } else {
            if (i2 == 4) {
                return new bszq();
            }
            if (i2 == 5) {
                return f147883b;
            }
            bxxk bxxk = f147884c;
            if (bxxk == null) {
                synchronized (bszs.class) {
                    bxxk = f147884c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147883b);
                        f147884c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
