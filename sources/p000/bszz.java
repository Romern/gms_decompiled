package p000;

/* renamed from: bszz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszz extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bszz f147914b;

    /* renamed from: c */
    private static volatile bxxk f147915c;

    /* renamed from: a */
    public bxww f147916a = bxww.f165013b;

    static {
        bszz bszz = new bszz();
        f147914b = bszz;
        GeneratedMessageLite.m124024a(bszz.class, bszz);
    }

    private bszz() {
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
            return GeneratedMessageLite.m124022a(f147914b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bszy.f147913a});
        } else if (i2 == 3) {
            return new bszz();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][][]) null, (float[][]) null);
            }
            if (i2 == 5) {
                return f147914b;
            }
            bxxk bxxk = f147915c;
            if (bxxk == null) {
                synchronized (bszz.class) {
                    bxxk = f147915c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147914b);
                        f147915c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
