package p000;

/* renamed from: bsvg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvg extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsvg f147248b;

    /* renamed from: c */
    private static volatile bxxk f147249c;

    /* renamed from: a */
    public bxwc f147250a = bxxn.f165040b;

    static {
        bsvg bsvg = new bsvg();
        f147248b = bsvg;
        GeneratedMessageLite.m124024a(bsvg.class, bsvg);
    }

    private bsvg() {
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
            return GeneratedMessageLite.m124022a(f147248b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", bsxn.class});
        } else if (i2 == 3) {
            return new bsvg();
        } else {
            if (i2 == 4) {
                return new bsvf();
            }
            if (i2 == 5) {
                return f147248b;
            }
            bxxk bxxk = f147249c;
            if (bxxk == null) {
                synchronized (bsvg.class) {
                    bxxk = f147249c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147248b);
                        f147249c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
