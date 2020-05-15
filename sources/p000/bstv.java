package p000;

/* renamed from: bstv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstv extends bxvk implements bxxd {

    /* renamed from: d */
    public static final bstv f147063d;

    /* renamed from: e */
    private static volatile bxxk f147064e;

    /* renamed from: a */
    public String f147065a = "";

    /* renamed from: b */
    public bxtx f147066b = bxtx.f164797b;

    /* renamed from: c */
    public bxwc f147067c = bxxn.f165040b;

    static {
        bstv bstv = new bstv();
        f147063d = bstv;
        bxvk.m124024a(bstv.class, bstv);
    }

    private bstv() {
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
            return bxvk.m124022a(f147063d, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0001\u0000\u0001Ȉ\u0004\n\u0005Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bstv();
        } else {
            if (i2 == 4) {
                return new bxvd((float[]) null, (char[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f147063d;
            }
            bxxk bxxk = f147064e;
            if (bxxk == null) {
                synchronized (bstv.class) {
                    bxxk = f147064e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147063d);
                        f147064e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
