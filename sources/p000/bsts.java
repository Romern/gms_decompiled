package p000;

/* renamed from: bsts */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsts extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bsts f147051b;

    /* renamed from: c */
    private static volatile bxxk f147052c;

    /* renamed from: a */
    public String f147053a = "";

    static {
        bsts bsts = new bsts();
        f147051b = bsts;
        bxvk.m124024a(bsts.class, bsts);
    }

    private bsts() {
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
            return bxvk.m124022a(f147051b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bsts();
        } else {
            if (i2 == 4) {
                return new bxvd(f147051b);
            }
            if (i2 == 5) {
                return f147051b;
            }
            bxxk bxxk = f147052c;
            if (bxxk == null) {
                synchronized (bsts.class) {
                    bxxk = f147052c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147051b);
                        f147052c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
