package p000;

/* renamed from: bszw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bszw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bszw f147894b;

    /* renamed from: c */
    private static volatile bxxk f147895c;

    /* renamed from: a */
    public bxww f147896a = bxww.f165013b;

    static {
        bszw bszw = new bszw();
        f147894b = bszw;
        GeneratedMessageLite.m124024a(bszw.class, bszw);
    }

    private bszw() {
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
            return GeneratedMessageLite.m124022a(f147894b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", bszv.f147893a});
        } else if (i2 == 3) {
            return new bszw();
        } else {
            if (i2 == 4) {
                return new bszu();
            }
            if (i2 == 5) {
                return f147894b;
            }
            bxxk bxxk = f147895c;
            if (bxxk == null) {
                synchronized (bszw.class) {
                    bxxk = f147895c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147894b);
                        f147895c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
