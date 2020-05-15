package p000;

/* renamed from: bstp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstp extends bxvk implements bxxd {

    /* renamed from: b */
    public static final bstp f147041b;

    /* renamed from: c */
    private static volatile bxxk f147042c;

    /* renamed from: a */
    public String f147043a = "";

    static {
        bstp bstp = new bstp();
        f147041b = bstp;
        bxvk.m124024a(bstp.class, bstp);
    }

    private bstp() {
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
            return bxvk.m124022a(f147041b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
        } else if (i2 == 3) {
            return new bstp();
        } else {
            if (i2 == 4) {
                return new bxvd(f147041b);
            }
            if (i2 == 5) {
                return f147041b;
            }
            bxxk bxxk = f147042c;
            if (bxxk == null) {
                synchronized (bstp.class) {
                    bxxk = f147042c;
                    if (bxxk == null) {
                        bxxk = new bxve(f147041b);
                        f147042c = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
