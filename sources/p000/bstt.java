package p000;

/* renamed from: bstt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstt extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bstt f147054d;

    /* renamed from: e */
    private static volatile bxxk f147055e;

    /* renamed from: a */
    public String f147056a = "";

    /* renamed from: b */
    public bxtx f147057b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f147058c = bxxn.f165040b;

    static {
        bstt bstt = new bstt();
        f147054d = bstt;
        bxvk.m124024a(bstt.class, bstt);
    }

    private bstt() {
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
            return bxvk.m124022a(f147054d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0003\n\u0004Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstt();
        } else {
            if (i2 == 4) {
                return new bxvd((boolean[][]) null, (byte[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f147054d;
            }
            bxxk bxxk = f147055e;
            if (bxxk == null) {
                synchronized (bstt.class) {
                    bxxk = f147055e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147054d);
                        f147055e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
