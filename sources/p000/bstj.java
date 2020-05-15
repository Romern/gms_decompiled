package p000;

/* renamed from: bstj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstj extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstj f147019c;

    /* renamed from: d */
    private static volatile bxxk f147020d;

    /* renamed from: a */
    public bxwc f147021a = bxxn.f165040b;

    /* renamed from: b */
    public bxtx f147022b = bxtx.f164797b;

    static {
        bstj bstj = new bstj();
        f147019c = bstj;
        bxvk.m124024a(bstj.class, bstj);
    }

    private bstj() {
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
            return bxvk.m124022a(f147019c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\n", new Object[]{"a", bsth.class, "b"});
        } else if (i2 == 3) {
            return new bstj();
        } else {
            if (i2 == 4) {
                return new bxvd(f147019c);
            }
            if (i2 == 5) {
                return f147019c;
            }
            bxxk bxxk = f147020d;
            if (bxxk == null) {
                synchronized (bstj.class) {
                    bxxk = f147020d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147019c);
                        f147020d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
