package p000;

/* renamed from: bsvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsvo extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsvo f147314b;

    /* renamed from: c */
    private static volatile bxxk f147315c;

    /* renamed from: a */
    public bxwc f147316a = bxxn.f165040b;

    static {
        bsvo bsvo = new bsvo();
        f147314b = bsvo;
        bxvk.m124024a(bsvo.class, bsvo);
    }

    private bsvo() {
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
            return bxvk.m124022a(f147314b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", bsut.class});
        } else if (i2 == 3) {
            return new bsvo();
        } else {
            if (i2 == 4) {
                return new bxvd((byte[]) null, (float[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147314b;
            }
            bxxk bxxk = f147315c;
            if (bxxk == null) {
                synchronized (bsvo.class) {
                    bxxk = f147315c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147314b);
                        f147315c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
