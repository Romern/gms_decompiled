package p000;

/* renamed from: bsuw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsuw extends GeneratedMessageLite implements bxxd {

    /* renamed from: b */
    public static final bsuw f147204b;

    /* renamed from: c */
    private static volatile bxxk f147205c;

    /* renamed from: a */
    public bxwc f147206a = bxxn.f165040b;

    static {
        bsuw bsuw = new bsuw();
        f147204b = bsuw;
        GeneratedMessageLite.m124024a(bsuw.class, bsuw);
    }

    private bsuw() {
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
            return GeneratedMessageLite.m124022a(f147204b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsux.class});
        } else if (i2 == 3) {
            return new bsuw();
        } else {
            if (i2 == 4) {
                return new bxvd(f147204b);
            }
            if (i2 == 5) {
                return f147204b;
            }
            bxxk bxxk = f147205c;
            if (bxxk == null) {
                synchronized (bsuw.class) {
                    bxxk = f147205c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147204b);
                        f147205c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
