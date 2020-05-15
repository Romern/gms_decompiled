package p000;

/* renamed from: bsxd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bsxd extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bsxd f147533c;

    /* renamed from: e */
    private static volatile bxxk f147534e;

    /* renamed from: a */
    public bxwc f147535a = bxxn.f165040b;

    /* renamed from: b */
    public bsxc f147536b;

    /* renamed from: d */
    private int f147537d;

    static {
        bsxd bsxd = new bsxd();
        f147533c = bsxd;
        bxvk.m124024a(bsxd.class, bsxd);
    }

    private bsxd() {
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
            return bxvk.m124022a(f147533c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"d", "a", bsyc.class, "b"});
        } else if (i2 == 3) {
            return new bsxd();
        } else {
            if (i2 == 4) {
                return new bxvd(f147533c);
            }
            if (i2 == 5) {
                return f147533c;
            }
            bxxk bxxk = f147534e;
            if (bxxk == null) {
                synchronized (bsxd.class) {
                    bxxk = f147534e;
                    if (bxxk == null) {
                        bxxk = new bxve(f147533c);
                        f147534e = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
