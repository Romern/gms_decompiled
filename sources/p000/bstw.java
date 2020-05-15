package p000;

/* renamed from: bstw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bstw extends bxvk implements bxxd {

    /* renamed from: c */
    public static final bstw f147068c;

    /* renamed from: d */
    private static volatile bxxk f147069d;

    /* renamed from: a */
    public bxwc f147070a = bxxn.f165040b;

    /* renamed from: b */
    public bxtx f147071b = bxtx.f164797b;

    static {
        bstw bstw = new bstw();
        f147068c = bstw;
        bxvk.m124024a(bstw.class, bstw);
    }

    private bstw() {
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
            return bxvk.m124022a(f147068c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\n", new Object[]{"a", bsud.class, "b"});
        } else if (i2 == 3) {
            return new bstw();
        } else {
            if (i2 == 4) {
                return new bxvd(f147068c);
            }
            if (i2 == 5) {
                return f147068c;
            }
            bxxk bxxk = f147069d;
            if (bxxk == null) {
                synchronized (bstw.class) {
                    bxxk = f147069d;
                    if (bxxk == null) {
                        bxxk = new bxve(f147068c);
                        f147069d = bxxk;
                    }
                }
            }
            return bxxk;
        }
    }
}
