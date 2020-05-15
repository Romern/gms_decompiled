package p000;

/* renamed from: bstl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstl extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstl f147026c;

    /* renamed from: d */
    private static volatile bxxk f147027d;

    /* renamed from: a */
    public bxwc f147028a = bxxn.f165040b;

    /* renamed from: b */
    public bxwc f147029b = bxxn.f165040b;

    static {
        bstl bstl = new bstl();
        f147026c = bstl;
        bxvk.m124024a(bstl.class, bstl);
    }

    private bstl() {
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
            return bxvk.m124022a(f147026c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", bsua.class, "b", bsuc.class});
        } else if (i2 == 3) {
            return new bstl();
        } else {
            if (i2 == 4) {
                return new bxvd(f147026c);
            }
            if (i2 == 5) {
                return f147026c;
            }
            bxxk bxxk = f147027d;
            if (bxxk == null) {
                synchronized (bstl.class) {
                    bxxk = f147027d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147026c);
                        f147027d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
