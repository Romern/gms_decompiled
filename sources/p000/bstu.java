package p000;

/* renamed from: bstu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstu extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstu f147059c;

    /* renamed from: d */
    private static volatile bxxk f147060d;

    /* renamed from: a */
    public bxwc f147061a = bxxn.f165040b;

    /* renamed from: b */
    public bxtx f147062b = bxtx.f164797b;

    static {
        bstu bstu = new bstu();
        f147059c = bstu;
        bxvk.m124024a(bstu.class, bstu);
    }

    private bstu() {
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
            return bxvk.m124022a(f147059c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\n", new Object[]{"a", bsua.class, "b"});
        } else if (i2 == 3) {
            return new bstu();
        } else {
            if (i2 == 4) {
                return new bxvd(f147059c);
            }
            if (i2 == 5) {
                return f147059c;
            }
            bxxk bxxk = f147060d;
            if (bxxk == null) {
                synchronized (bstu.class) {
                    bxxk = f147060d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147059c);
                        f147060d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
