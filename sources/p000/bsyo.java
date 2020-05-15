package p000;

/* renamed from: bsyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsyo extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsyo f147690b;

    /* renamed from: c */
    private static volatile bxxk f147691c;

    /* renamed from: a */
    public bxwc f147692a = bxxn.f165040b;

    static {
        bsyo bsyo = new bsyo();
        f147690b = bsyo;
        GeneratedMessageLite.m124024a(bsyo.class, bsyo);
    }

    private bsyo() {
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
            return GeneratedMessageLite.m124022a(f147690b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsyp.class});
        } else if (i2 == 3) {
            return new bsyo();
        } else {
            if (i2 == 4) {
                return new bsyn();
            }
            if (i2 == 5) {
                return f147690b;
            }
            bxxk bxxk = f147691c;
            if (bxxk == null) {
                synchronized (bsyo.class) {
                    bxxk = f147691c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147690b);
                        f147691c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
