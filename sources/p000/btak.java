package p000;

/* renamed from: btak */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class btak extends bxvk implements bxxd {

    /* renamed from: d */
    public static final btak f147990d;

    /* renamed from: e */
    private static volatile bxxk f147991e;

    /* renamed from: a */
    public String f147992a = "";

    /* renamed from: b */
    public bxwc f147993b = bxxn.f165040b;

    /* renamed from: c */
    public bszs f147994c;

    static {
        btak btak = new btak();
        f147990d = btak;
        bxvk.m124024a(btak.class, btak);
    }

    private btak() {
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
            return bxvk.m124022a(f147990d, "\u0000\u0003\u0000\u0000\u0001?\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț?\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new btak();
        } else {
            if (i2 == 4) {
                return new bxvd(f147990d);
            }
            if (i2 == 5) {
                return f147990d;
            }
            bxxk bxxk = f147991e;
            if (bxxk == null) {
                synchronized (btak.class) {
                    bxxk = f147991e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147990d);
                        f147991e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
